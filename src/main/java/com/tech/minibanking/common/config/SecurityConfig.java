/*
 * SecurityConfig.java
 *
 * Copyright (c) 2025 Nguyen. All rights reserved.
 * This software is the confidential and proprietary information of Nguyen.
 */

package com.tech.minibanking.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * SecurityConfig.java
 *
 * @author Nguyen
 */
@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

}
