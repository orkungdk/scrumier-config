/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.service;

import java.util.List;

import com.ogedik.config.model.ConfigurationProperty;
import com.ogedik.config.model.JiraTestConnectionRequest;
import org.springframework.http.HttpStatus;

/**
 * @author orkun.gedik
 */
public interface ConfigurationService {

  List<ConfigurationProperty> getJiraConfiguration();

  List<ConfigurationProperty> getMailServiceConfiguration();

  ConfigurationProperty configure(ConfigurationProperty property);

  HttpStatus testConnection(JiraTestConnectionRequest jiraTestConnectionRequest);

  Boolean setUp(List<ConfigurationProperty> configurationProperties);
}
