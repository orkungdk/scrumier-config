/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.validator;

import com.ogedik.config.model.JiraTestConnectionRequest;
import org.springframework.stereotype.Component;

import com.ogedik.config.constants.JiraProperty;
import com.ogedik.config.constants.MailProperty;
import com.ogedik.config.exception.ConfigurationException;
import com.ogedik.config.exception.ErrorType;
import com.ogedik.config.model.ConfigurationProperty;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author orkun.gedik
 */
@Component
public class ConfigurationPropertyValidator {

  /**
   * Common validation for configuration insertion
   *
   * @param property {@link ConfigurationProperty}
   */
  public void validate(ConfigurationProperty property) {
    if (StringUtils.isEmpty(property.getPropertyKey()) || StringUtils.isEmpty(property.getPropertyValue())) {
      throw new ConfigurationException(ErrorType.INVALID_REQUEST, property.getPropertyKey());
    }
  }

  /**
   * Validates the absolute matching between given configuration properties and expected Jira properties
   *
   * @param jiraTestConnectionRequest {@link List<ConfigurationProperty>}
   */
  public void validateJiraConfig(JiraTestConnectionRequest jiraTestConnectionRequest) {
    if (jiraTestConnectionRequest == null) {
      throw new ConfigurationException(ErrorType.INVALID_REQUEST, "No configuration property found.");
    }
    if (StringUtils.isEmpty(jiraTestConnectionRequest.getBaseUrl())) {
      throw new ConfigurationException(ErrorType.INVALID_REQUEST, "Base URL cannot be empty.");
    }
    if (StringUtils.isEmpty(jiraTestConnectionRequest.getUsername())) {
      throw new ConfigurationException(ErrorType.INVALID_REQUEST, "Username cannot be empty.");
    }
    if (StringUtils.isEmpty(jiraTestConnectionRequest.getBaseUrl())) {
      throw new ConfigurationException(ErrorType.INVALID_REQUEST, "Password cannot be empty.");
    }
  }
}
