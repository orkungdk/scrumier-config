/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.response;

import org.apache.commons.lang.BooleanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;

/**
 * @author orkun.gedik
 */
public class ConfigurationResponse extends ResponseEntity {

  private ConfigurationResponse(Object body, HttpStatus httpStatus) {
    super(body, httpStatus);
  }

  public ConfigurationResponse(HttpStatus httpStatus) {
    super(httpStatus);
  }

  public static ConfigurationResponse build(Object body) {
    if (ObjectUtils.isEmpty(body)) {
      return new ConfigurationResponse(null, HttpStatus.NO_CONTENT);
    } else {
      return new ConfigurationResponse(body, HttpStatus.OK);
    }
  }

  public static ConfigurationResponse build(Boolean bool) {
    if (BooleanUtils.isTrue(bool)) {
      return new ConfigurationResponse(HttpStatus.OK);
    } else {
      return new ConfigurationResponse(HttpStatus.BAD_REQUEST);
    }
  }
}
