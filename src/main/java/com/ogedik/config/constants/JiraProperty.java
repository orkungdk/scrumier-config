/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.constants;

import lombok.Getter;

/**
 * @author orkun.gedik
 */
@Getter
public enum JiraProperty implements GenericProperty {
  JIRA_BASE_URL("JIRA Base URL to be integrated.", null),
  JIRA_AUTH_TYPE("Authentication type for accessing JIRA.", AuthType.NO_AUTH.name()),
  JIRA_USER_KEY("The integration user key. (User should have admin or server admin permissions)", null),
  JIRA_USER_SECRET("The integration user password. (Password should be updated after it is expired)", null),
  JIRA_ACCESS_TOKEN("The access token to authenticate JIRA instance.", null),
  JIRA_REST_API_VERSION("The JIRA API version.", JiraApi.v2.getVersion());

  // ToDo: Add Mail Server Configs

  private String description;
  private String defaultValue;

  JiraProperty(String description, String defaultValue) {
    this.description = description;
    this.defaultValue = defaultValue;
  }
}
