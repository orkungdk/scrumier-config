/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.controller;

import com.ogedik.config.constants.ConfigurationConstants;
import com.ogedik.config.model.JiraIntegrationConfig;
import com.ogedik.config.model.MailServerConfig;
import com.ogedik.config.service.ConfigurationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.ogedik.commons.response.AbstractResponse;

/**
 * @author orkun.gedik
 */
@RestController(ConfigurationConstants.Paths.CONFIG)
@RefreshScope
public class ConfigurationController {

  private static final Logger logger = LogManager.getLogger(ConfigurationController.class);

  @Autowired
  private ConfigurationService configurationService;

//  @Value("${jira-instance}")
  private JiraIntegrationConfig jiraIntegrationConfig;
//  @Value("${mail-server}")
  private MailServerConfig mailServerConfig;

  @GetMapping(ConfigurationConstants.Paths.JIRA)
  public AbstractResponse getJiraIntegrationDefinition() {
    logger.info("The request has been received to retrieve Jira Integration Definitions.");
    return AbstractResponse.build(jiraIntegrationConfig);
  }

  @GetMapping(ConfigurationConstants.Paths.MAIL)
  public AbstractResponse getMailServerDefinition() {
    logger.info("The request has been received to retrieve Mail Server Definitions.");
    return AbstractResponse.build(this.mailServerConfig);
  }

  @GetMapping
  public AbstractResponse getOperationPermissions() {
    logger.info("The request has been received to retrieve all operations and permissions.");
    return AbstractResponse.build(this.configurationService.getOperationPermissions());
  }
}
