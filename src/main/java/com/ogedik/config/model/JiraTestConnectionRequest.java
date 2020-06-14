/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@ToString
public class JiraTestConnectionRequest {
  private String baseUrl;
  private String username;
  private String password;
}
