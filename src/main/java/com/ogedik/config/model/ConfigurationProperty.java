/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.model;

import tr.com.ogedik.commons.annotation.NotNull;
import lombok.Getter;
import lombok.Setter;
import tr.com.ogedik.commons.model.AbstractBo;

/**
 * @author orkun.gedik
 */
@Getter
@Setter
public class ConfigurationProperty extends AbstractBo {

  @NotNull
  private String propertyKey;
  @NotNull
  private String propertyValue;

}
