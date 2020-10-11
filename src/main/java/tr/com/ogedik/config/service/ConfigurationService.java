package tr.com.ogedik.config.service;

import tr.com.ogedik.commons.rest.request.model.JiraConfigurationProperties;
import tr.com.ogedik.config.model.ConfigurationProperty;

import java.util.List;

/**
 * @author orkun.gedik
 */
public interface ConfigurationService {

  JiraConfigurationProperties getJiraConfiguration();

  List<ConfigurationProperty> getMailServiceConfiguration();

  ConfigurationProperty configure(ConfigurationProperty property);

  Boolean setUp(List<ConfigurationProperty> configurationProperties);
}
