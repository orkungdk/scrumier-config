/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.service;

import com.ogedik.config.model.JiraIntegrationConfig;
import com.ogedik.config.model.MailServerConfig;
import com.ogedik.config.model.PermissionConfig;

/**
 * @author orkun.gedik
 */
public interface ConfigurationService {

  /**
   * Returns the integrated Jira Configuration
   * 
   * @return {@link JiraIntegrationConfig}
   */
  JiraIntegrationConfig getJiraIntegrationConfig();

  /**
   * Returns the integrated Mail Server Configuration
   *
   * @return {@link MailServerConfig}
   */
  MailServerConfig getMailServerConfig();

  /**
   * Returns the integrated Permission Configs
   *
   * @return {@link PermissionConfig}
   */
  PermissionConfig getOperationPermissions();
}