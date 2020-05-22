/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogedik.config.constants.GenericProperty;
import com.ogedik.config.constants.JiraProperty;
import com.ogedik.config.constants.MailProperty;
import com.ogedik.config.model.ConfigurationProperty;
import com.ogedik.config.persistence.manager.ConfigurationRepositoryManager;
import com.ogedik.config.service.ConfigurationService;
import com.ogedik.config.validator.ConfigurationPropertyValidator;

/**
 * @author orkun.gedik
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {

  @Autowired
  private ConfigurationRepositoryManager repositoryManager;
  @Autowired
  private ConfigurationPropertyValidator validator;

  @Override
  public List<ConfigurationProperty> getJiraConfiguration() {
    return retrieveConfig(JiraProperty.values());
  }

  @Override
  public List<ConfigurationProperty> getMailServiceConfiguration() {
    return retrieveConfig(MailProperty.values());
  }

  @Override
  public ConfigurationProperty configure(ConfigurationProperty property) {
    validator.validate(property);

    return repositoryManager.insertProperty(property);
  }

  private List<ConfigurationProperty> retrieveConfig(GenericProperty[] values) {
    List<ConfigurationProperty> properties = new ArrayList<>();

    for (GenericProperty genericProperty : values) {
      ConfigurationProperty config = repositoryManager.find(genericProperty.name());

      if (config == null) {
        ConfigurationProperty emptyProperty = new ConfigurationProperty();
        emptyProperty.setPropertyKey(genericProperty.name());
        emptyProperty.setPropertyValue(genericProperty.getDefaultValue());
        emptyProperty.setDescription(genericProperty.getDescription());
        properties.add(emptyProperty);
      } else {
        if (config.getPropertyValue() == null) {
          config.setPropertyValue(genericProperty.getDefaultValue());
        }
        config.setDescription(genericProperty.getDescription());
        properties.add(config);
      }
    }
    return properties;
  }
}