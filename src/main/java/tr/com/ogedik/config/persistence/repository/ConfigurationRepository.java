package tr.com.ogedik.config.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.ogedik.config.entity.ConfigurationPropertyEntity;

/**
 * @author orkun.gedik
 */
@Repository
public interface ConfigurationRepository extends JpaRepository<ConfigurationPropertyEntity, String> {

    ConfigurationPropertyEntity findByPropertyKey(String propertyKey);
}
