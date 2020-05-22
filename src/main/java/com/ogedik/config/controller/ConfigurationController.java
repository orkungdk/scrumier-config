/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogedik.config.constants.ConfigurationConstants;
import com.ogedik.config.model.ConfigurationProperty;
import com.ogedik.config.response.ConfigurationResponse;
import com.ogedik.config.service.ConfigurationService;

/**
 * @author orkun.gedik
 */
@RestController(ConfigurationConstants.Paths.CONFIG)
@RefreshScope
public class ConfigurationController {

  private static final Logger logger = LogManager.getLogger(ConfigurationController.class);

  @Autowired
  private ConfigurationService configurationService;

  /**
   * Returns the Jira instance properties. If properties are not configured, it returns default values.
   *
   * @return {@link ConfigurationResponse} that contains Jira configuration properties
   */
  @GetMapping(ConfigurationConstants.Paths.JIRA)
  public ConfigurationResponse getJiraInstanceConfig() {
    logger.info("The request has been received to retrieve JIRA instance configuration.");
    return ConfigurationResponse.build(configurationService.getJiraConfiguration());
  }

  /**
   * Returns the mail server instance properties. If properties are not configured, it returns default values.
   *
   * @return {@link ConfigurationResponse} that contains mail server configuration properties
   */
  @GetMapping(ConfigurationConstants.Paths.MAIL)
  public ConfigurationResponse getMailServerConfig() {
    logger.info("The request has been received to retrieve Mail Server configuration.");
    return ConfigurationResponse.build(configurationService.getMailServiceConfiguration());
  }

  /**
   * Inserts a property to persistence by key if it is one of the acceptable property key.
   *
   * @param property the {@link ConfigurationProperty} to be inserted
   * @return {@link ConfigurationResponse} that contains inserted property result
   */
  @PostMapping
  public ConfigurationResponse configureProperty(ConfigurationProperty property) {
    logger.info("The request has been received to configure property {}.", property.toString());
    return ConfigurationResponse.build(configurationService.configure(property));
  }
}
