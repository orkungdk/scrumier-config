/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.constants;

import lombok.Getter;

/**
 * @author orkun.gedik
 */
@Getter
public enum JiraApi {

  v1("1"),

  v2("2"),

  v3("3");

  String version;

  JiraApi(String version) {
    this.version = version;
  }
}
