package com.ogedik.config.controller;

import com.ogedik.config.model.ConfigurationProperty;
import com.ogedik.config.service.ConfigurationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import tr.com.ogedik.commons.constants.Headers;
import tr.com.ogedik.commons.constants.Services;
import tr.com.ogedik.commons.rest.AbstractController;
import tr.com.ogedik.commons.rest.response.AbstractResponse;
import tr.com.ogedik.commons.util.MetaUtils;

import java.util.List;

/**
 * @author orkun.gedik
 */
@RestController
public class SetupController extends AbstractController {
    private static final Logger logger = LogManager.getLogger(SetupController.class);

    @Autowired
    private ConfigurationService configurationService;

    @PostMapping(Services.Path.SETUP)
    public AbstractResponse setUp(@RequestBody List<ConfigurationProperty> configurationProperties,
                                  @RequestHeader(value = Headers.AUTH_USER,
                                          defaultValue = Headers.ANONYMOUS) String authenticatedUsername) {
        logger.info("The request has been received to test JIRA instance connection.");
        MetaUtils.fillMetaList(configurationProperties, authenticatedUsername);
        return AbstractResponse.build(configurationService.setUp(configurationProperties));
    }
}
