package com.ogedik.config.mapper;

import org.mapstruct.Mapper;

import com.ogedik.config.entity.ConfigurationPropertyEntity;
import com.ogedik.config.model.ConfigurationProperty;
import tr.com.ogedik.commons.mapper.AbstractBoMapper;

/**
 * @author orkun.gedik
 */
@Mapper(componentModel = "spring")
public abstract class ConfigurationMapper extends AbstractBoMapper<ConfigurationProperty, ConfigurationPropertyEntity> {

    public abstract ConfigurationProperty convert(ConfigurationPropertyEntity entity);

    public abstract ConfigurationPropertyEntity convert(ConfigurationProperty configurationProperty);
}
