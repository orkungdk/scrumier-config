/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.model;

import tr.com.ogedik.commons.annotation.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tr.com.ogedik.commons.model.BusinessObject;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@ToString
public class JiraTestConnectionRequest implements BusinessObject {
  @NotNull
  private String baseUrl;
  @NotNull
  private String username;
  @NotNull
  private String password;
}
