package com.ogedik.config.exception;

/**
 * @author orkun.gedik
 */
public class ConfigurationException extends RuntimeException {

  public ConfigurationException(String message, String detail) {
    super(getError(message, detail));
  }

  public ConfigurationException(String message) {
    super(message);
  }

  public ConfigurationException(Throwable e) {
    super(e);
  }

  public ConfigurationException(String message, Throwable e) {
    super(getError(message, e.getMessage()));
  }

  private static String getError(String message, String detail) {
    return String.format("Message: %s \n Details: %s", message, detail);
  }
}
