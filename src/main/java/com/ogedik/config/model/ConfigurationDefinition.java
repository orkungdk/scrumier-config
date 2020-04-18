/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tr.com.ogedik.commons.models.BusinessObject;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Abstract class for all configuration definitions
 * 
 * @author orkun.gedik
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ConfigurationDefinition implements BusinessObject, Serializable {

  @NotNull
  private String configurationName;
  @NotNull
  private String id;

}
