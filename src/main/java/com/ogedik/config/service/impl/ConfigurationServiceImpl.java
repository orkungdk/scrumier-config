/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.service.impl;

import com.ogedik.config.model.JiraIntegrationConfig;
import com.ogedik.config.model.MailServerConfig;
import com.ogedik.config.model.PermissionConfig;
import com.ogedik.config.service.ConfigurationService;
import org.springframework.stereotype.Service;

/**
 * @author orkun.gedik
 */
@Service
public class ConfigurationServiceImpl implements ConfigurationService {

  @Override
  public JiraIntegrationConfig getJiraIntegrationConfig() {
    return null;
  }

  @Override
  public MailServerConfig getMailServerConfig() {
    return null;
  }

  @Override
  public PermissionConfig getOperationPermissions() {
    return null;
  }
}
