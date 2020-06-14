/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.persistence.manager;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ogedik.config.entity.ConfigurationPropertyEntity;
import com.ogedik.config.mapper.ConfigurationMapper;
import com.ogedik.config.model.ConfigurationProperty;
import com.ogedik.config.persistence.repository.ConfigurationRepository;

/**
 * @author orkun.gedik
 */
@Service
public class ConfigurationRepositoryManager {
  private static final Logger logger = LogManager.getLogger(ConfigurationRepositoryManager.class);

  @Autowired
  private ConfigurationRepository configurationRepository;
  @Autowired
  private ConfigurationMapper configurationMapper;

  @Cacheable(key = "#configKey")
  public ConfigurationProperty find(String configKey) {

    ConfigurationPropertyEntity entity = configurationRepository.findByPropertyKey(configKey);
    logger.info("Configuration property is retrieved. Values: {}", entity);

    return configurationMapper.convert(entity);
  }

  @CacheEvict(key = "#property.propertyKey")
  public ConfigurationProperty insertProperty(ConfigurationProperty property) {
    
    ConfigurationPropertyEntity retrievedEntity = configurationRepository.findByPropertyKey(property.getPropertyKey());
    ConfigurationPropertyEntity requestedEntity = configurationMapper.convert(property);

    if (Objects.isNull(retrievedEntity)) {
      logger.info("There is not such a configuration with key : {}. New configuration property will be inserted.",
          property.getPropertyKey());
    } else {
      logger.info("There is an existed configuration with key : {}. New configuration property will be updated.",
          property.getPropertyKey());
    }

    ConfigurationPropertyEntity result = configurationRepository.save(requestedEntity);
    return configurationMapper.convert(result);
  }
}
