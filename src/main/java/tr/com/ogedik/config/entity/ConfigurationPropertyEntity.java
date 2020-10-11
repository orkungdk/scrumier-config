package tr.com.ogedik.config.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import tr.com.ogedik.commons.entity.AbstractEntity;
import tr.com.ogedik.config.constants.ConfigurationConstants;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author orkun.gedik
 */
@Entity
@Getter
@Setter
@ToString
public class ConfigurationPropertyEntity extends AbstractEntity {

  @Id
  @Column(name = ConfigurationConstants.COLS.PROPERTY_KEY)
  private String propertyKey;

  @Column(name = ConfigurationConstants.COLS.PROPERTY_VALUE)
  private String propertyValue;

}
