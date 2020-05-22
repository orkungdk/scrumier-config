/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.constants;

import lombok.Getter;

/**
 * @author orkun.gedik
 */
@Getter
public enum MailProperty implements GenericProperty {
  MAIL_SERVER("Mail Server", null);

  // ToDo: Add Mail Server Configs

  private String description;
  private String defaultValue;

  MailProperty(String description, String defaultValue) {
    this.description = description;
    this.defaultValue = defaultValue;

  }
}
