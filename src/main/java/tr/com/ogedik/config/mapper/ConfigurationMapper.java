package tr.com.ogedik.config.mapper;

import org.mapstruct.Mapper;
import tr.com.ogedik.commons.mapper.AbstractBoMapper;
import tr.com.ogedik.config.entity.ConfigurationPropertyEntity;
import tr.com.ogedik.config.model.ConfigurationProperty;

/**
 * @author orkun.gedik
 */
@Mapper(componentModel = "spring")
public abstract class ConfigurationMapper extends AbstractBoMapper<ConfigurationProperty, ConfigurationPropertyEntity> {

    public abstract ConfigurationProperty convert(ConfigurationPropertyEntity entity);

    public abstract ConfigurationPropertyEntity convert(ConfigurationProperty configurationProperty);
}
