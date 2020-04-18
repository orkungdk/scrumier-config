/**
 * © 2020 Copyright Amadeus Unauthorised use and disclosure strictly forbidden.
 */
package com.ogedik.config.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import tr.com.ogedik.commons.annotations.Restricted;
import tr.com.ogedik.commons.aspect.RestrictionAspect;

/**
 * Config service aspect configuration
 * 
 * @author orkun.gedik
 */
@Aspect
@Configuration
public class ConfigurationAspect {
//
//  @Around("@annotation(restricted)")
//  public void authorize(ProceedingJoinPoint point, Restricted restricted) {
//    RestrictionAspect.authorize(point, restricted);
//  }
}
