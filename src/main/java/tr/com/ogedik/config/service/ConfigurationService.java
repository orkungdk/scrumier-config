package tr.com.ogedik.config.service;

import java.util.List;

import tr.com.ogedik.config.model.ConfigurationProperty;

import tr.com.ogedik.commons.rest.request.model.JiraConfigurationProperties;

/**
 * @author orkun.gedik
 */
public interface ConfigurationService {

  JiraConfigurationProperties getJiraConfiguration();

  List<ConfigurationProperty> getMailServiceConfiguration();

  ConfigurationProperty configure(ConfigurationProperty property);

  Boolean setUp(List<ConfigurationProperty> configurationProperties);
}
