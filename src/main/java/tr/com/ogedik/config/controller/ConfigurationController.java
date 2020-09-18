package tr.com.ogedik.config.controller;

import tr.com.ogedik.config.model.ConfigurationProperty;
import tr.com.ogedik.config.service.ConfigurationService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.ogedik.commons.constants.Services;
import tr.com.ogedik.commons.rest.AbstractController;
import tr.com.ogedik.commons.rest.response.AbstractResponse;

/**
 * @author orkun.gedik
 */
@RestController
public class ConfigurationController extends AbstractController {

    private static final Logger logger = LogManager.getLogger(ConfigurationController.class);

    @Autowired
    private ConfigurationService configurationService;

    /**
     * Returns the Jira instance properties. If properties are not configured, it returns default values.
     *
     * @return {@link AbstractResponse} that contains Jira configuration properties
     */
    @GetMapping(Services.Path.JIRA)
    public AbstractResponse getJiraInstanceConfig() {
        logger.info("The request has been received to retrieve JIRA instance configuration.");
        return AbstractResponse.build(configurationService.getJiraConfiguration());
    }

    /**
     * Returns the mail server instance properties. If properties are not configured, it returns default values.
     *
     * @return {@link AbstractResponse} that contains mail server configuration properties
     */
    @GetMapping(Services.Path.MAIL)
    public AbstractResponse getMailServerConfig() {
        logger.info("The request has been received to retrieve Mail Server configuration.");
        return AbstractResponse.build(configurationService.getMailServiceConfiguration());
    }

    /**
     * Inserts a property to persistence by key if it is one of the acceptable property key.
     *
     * @param property the {@link ConfigurationProperty} to be inserted
     * @return {@link AbstractResponse} that contains inserted property result
     */
    @PostMapping
    public AbstractResponse configureProperty(ConfigurationProperty property) {
        logger.info("The request has been received to configure property {}.", property.toString());
        return AbstractResponse.build(configurationService.configure(property));
    }
}
