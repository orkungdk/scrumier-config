/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.exception;

import lombok.experimental.UtilityClass;

/**
 * @author orkun.gedik
 */
@UtilityClass
public class ErrorType {

  public static final String INTERNAL_ERROR = "Internal Error";
  public static final String INVALID_OR_MISSING_CONFIGURATION = "Configuration is invalid or missing.";
  public static final String INVALID_REQUEST = "Request rejected. Jira and Main configurations can be retrieved.";
}