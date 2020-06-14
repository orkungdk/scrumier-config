/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.rest;

import com.ogedik.config.constants.ConfigurationConstants;
import com.ogedik.config.model.JiraAuthRequest;
import com.ogedik.config.model.JiraAuthResponse;
import com.ogedik.config.model.JiraTestConnectionRequest;
import lombok.experimental.UtilityClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author orkun.gedik
 */
@UtilityClass
public class JiraRestHandler {

  private static final Logger logger = LogManager.getLogger(JiraRestHandler.class);

  public static HttpStatus testConnection(JiraTestConnectionRequest jiraTestConnectionRequest) {
    String url = jiraTestConnectionRequest.getBaseUrl() + ConfigurationConstants.Request.JIRA_AUTH;
    String username = jiraTestConnectionRequest.getUsername();
    String password = jiraTestConnectionRequest.getPassword();

    RestTemplate restTemplate = new RestTemplate();
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

    JiraAuthRequest jiraAuthRequest = new JiraAuthRequest(username, password);
    HttpEntity<JiraAuthRequest> request = new HttpEntity<>(jiraAuthRequest, headers);

    try {
      ResponseEntity<JiraAuthResponse> response = restTemplate.postForEntity(url, request, JiraAuthResponse.class);
      HttpStatus result = response.getStatusCode();
      logger.info("Jira authentication is {}.", result);

      return result;
    } catch (HttpClientErrorException e) {
      return HttpStatus.UNAUTHORIZED;
    }
  }
}
