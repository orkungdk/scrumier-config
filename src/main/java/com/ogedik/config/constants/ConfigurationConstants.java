/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.constants;

/**
 * @author orkun.gedik
 */
public class ConfigurationConstants {

  public static class Request {
    public static final String JIRA_AUTH = "/rest/auth/1/session";
  }

  public static class Paths {
    public static final String CONFIG = "/configuration";

    public static final String SETUP = "/setup";
    public static final String TEST_JIRA_CONNECTION = "/testJiraConnection";

    public static final String JIRA = "/jira";
    public static final String MAIL = "/mail";
    public static final String IDENTIFIER = "/{key}";
  }

  public static class COLS {
    public static final String PROPERTY_KEY = "propertyKey";
    public static final String PROPERTY_VALUE = "propertyValue";
    public static final String RESOURCE_ID = "resourceId";
    public static final String CREATED_AT = "createdAt";
    public static final String UPDATED_AT = "updatedAt";
    public static final String CREATED_BY = "createdBy";
    public static final String UPDATED_BY = "updatedBy";
  }
}
