/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.validator;

import org.springframework.stereotype.Component;

import com.ogedik.config.constants.JiraProperty;
import com.ogedik.config.constants.MailProperty;
import com.ogedik.config.exception.ConfigurationException;
import com.ogedik.config.exception.ErrorType;
import com.ogedik.config.model.ConfigurationProperty;

/**
 * @author orkun.gedik
 */
@Component
public class ConfigurationPropertyValidator {

  public void validate(ConfigurationProperty property) {
    if (JiraProperty.valueOf(property.getPropertyKey()) == null
        || MailProperty.valueOf(property.getPropertyKey()) == null) {
      throw new ConfigurationException(ErrorType.INVALID_REQUEST, property.getPropertyKey());
    }
  }
}
