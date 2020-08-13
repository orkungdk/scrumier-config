package com.ogedik.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@AllArgsConstructor
public class JiraAuthRequest {
  private String username;
  private String password;
}
