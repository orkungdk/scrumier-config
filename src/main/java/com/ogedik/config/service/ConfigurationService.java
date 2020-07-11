/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.service;

import java.util.List;

import com.ogedik.config.model.ConfigurationProperty;

import tr.com.ogedik.commons.request.model.JiraConfigurationProperties;

/**
 * @author orkun.gedik
 */
public interface ConfigurationService {

  JiraConfigurationProperties getJiraConfiguration();

  List<ConfigurationProperty> getMailServiceConfiguration();

  ConfigurationProperty configure(ConfigurationProperty property);

  Boolean setUp(List<ConfigurationProperty> configurationProperties);
}
