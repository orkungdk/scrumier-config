/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.exception;

import lombok.Getter;
import tr.com.ogedik.commons.expection.constants.ErrorType;

/**
 * @author orkun.gedik
 */
@Getter
public enum ConfigurationErrorType implements ErrorType {

  INVALID_OR_MISSING_CONFIGURATION("Configuration is invalid or missing.", 400),
  MISSING_CONFIGURATION_VALUE("Missing configuration value", 400);

  private String title;
  private int status;

  ConfigurationErrorType(String title, int status) {
    this.title = title;
    this.status = status;
  }

}