/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.model;

import javax.validation.constraints.NotNull;

import com.ogedik.config.constants.AuthType;
import com.ogedik.config.model.auth.AuthInformation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JiraIntegrationConfig extends ConfigurationDefinition {

  @NotNull
  private String jiraURL;
  @NotNull
  private AuthType authType;
  @NotNull
  private AuthInformation authInformation;

}
