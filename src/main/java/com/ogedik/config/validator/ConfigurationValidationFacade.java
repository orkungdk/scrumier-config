package com.ogedik.config.validator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.ogedik.config.constants.JiraProperty;
import com.ogedik.config.exception.ConfigurationErrorType;
import com.ogedik.config.model.ConfigurationProperty;

import tr.com.ogedik.commons.expection.ErrorException;
import tr.com.ogedik.commons.model.BusinessObject;
import tr.com.ogedik.commons.validator.MandatoryFieldValidator;
import tr.com.ogedik.commons.validator.ValidationFacade;

import javax.annotation.PostConstruct;

/**
 * @author orkun.gedik
 */
@Component
public class ConfigurationValidationFacade extends ValidationFacade {
private List<String> jiraProperties;


    @PostConstruct
    public void setup() {
        jiraProperties = Arrays.stream(JiraProperty.values()).map(Enum::name).collect(Collectors.toList());
    }
  
  
  public void validateCreate(BusinessObject businessObject) {
    validate(businessObject, MandatoryFieldValidator.getInstance());
  }

  public void validateSetup(List<ConfigurationProperty> configurationProperties) {
    boolean flag;

    for (String jiraProperty : jiraProperties) {
      flag = false;
      for (ConfigurationProperty configurationProperty : configurationProperties) {
          validateCreate(configurationProperty);
        if (jiraProperty.equals(configurationProperty.getPropertyKey())) {
          flag = true;
          break;
        }
      }
      if (!flag) {
        throw new ErrorException(ConfigurationErrorType.MISSING_CONFIGURATION_VALUE, jiraProperty);
      }
    }
  }
}
