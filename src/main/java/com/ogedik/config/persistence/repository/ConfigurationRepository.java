/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.persistence.repository;

import com.ogedik.config.entity.ConfigurationPropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author orkun.gedik
 */
@Repository
public interface ConfigurationRepository extends JpaRepository<ConfigurationPropertyEntity, String> {

    ConfigurationPropertyEntity findByPropertyKey(String propertyKey);
}
