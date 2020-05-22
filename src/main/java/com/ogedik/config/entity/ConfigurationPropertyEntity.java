/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ogedik.config.constants.ConfigurationConstants;

import lombok.Getter;
import lombok.Setter;

/**
 * @author orkun.gedik
 */
@Entity
@Getter
@Setter
public class ConfigurationPropertyEntity implements Serializable {

  @Id
  @Column(name = ConfigurationConstants.COLS.PROPERTY_KEY)
  private String propertyKey;

  @Column(name = ConfigurationConstants.COLS.PROPERTY_VALUE)
  private String propertyValue;

  @Column(name = ConfigurationConstants.COLS.CREATED_AT)
  private LocalDateTime createdAt;

  @Column(name = ConfigurationConstants.COLS.CREATED_BY)
  private String createdBy;

  @Column(name = ConfigurationConstants.COLS.UPDATED_AT)
  private LocalDateTime updatedAt;

  @Column(name = ConfigurationConstants.COLS.UPDATED_BY)
  private String updatedBy;

}
