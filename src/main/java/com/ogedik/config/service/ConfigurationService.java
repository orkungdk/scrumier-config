/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.service;

import java.util.List;

import com.ogedik.config.model.ConfigurationProperty;

/**
 * @author orkun.gedik
 */
public interface ConfigurationService {

  List<ConfigurationProperty> getJiraConfiguration();

  List<ConfigurationProperty> getMailServiceConfiguration();

  ConfigurationProperty configure(ConfigurationProperty property);
}
