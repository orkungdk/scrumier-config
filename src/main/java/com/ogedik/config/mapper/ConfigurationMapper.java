/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.mapper;

import org.mapstruct.Mapper;

import com.ogedik.config.entity.ConfigurationPropertyEntity;
import com.ogedik.config.model.ConfigurationProperty;

/**
 * @author orkun.gedik
 */
@Mapper(componentModel = "spring")
public abstract class ConfigurationMapper{

  public abstract ConfigurationProperty convert(ConfigurationPropertyEntity entity);

  public abstract ConfigurationPropertyEntity convert(ConfigurationProperty configurationProperty) ;
}
