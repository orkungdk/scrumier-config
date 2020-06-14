/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.controller;

import com.ogedik.config.model.ConfigurationProperty;
import com.ogedik.config.model.JiraTestConnectionRequest;
import com.ogedik.config.service.ConfigurationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ogedik.config.constants.ConfigurationConstants;
import com.ogedik.config.response.ConfigurationResponse;

import java.util.List;

/**
 * @author orkun.gedik
 */
@RestController
public class SetupController {
  private static final Logger logger = LogManager.getLogger(SetupController.class);

  @Autowired
  private ConfigurationService configurationService;

  @PostMapping(ConfigurationConstants.Paths.TEST_JIRA_CONNECTION)
  public ConfigurationResponse testSetupConnection(@RequestBody JiraTestConnectionRequest jiraTestConnectionRequest) {
    logger.info("The request has been received to test JIRA instance connection.");
    return new ConfigurationResponse(configurationService.testConnection(jiraTestConnectionRequest));
  }

  @PostMapping(ConfigurationConstants.Paths.SETUP)
  public ConfigurationResponse setUp(@RequestBody List<ConfigurationProperty> configurationProperties) {
    logger.info("The request has been received to test JIRA instance connection.");
    return ConfigurationResponse.build(configurationService.setUp(configurationProperties));
  }
}
