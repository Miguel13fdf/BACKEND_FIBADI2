package com.ista.string.BACKEND_FIBADI.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.ista.string.BACKEND_FIBADI.Model.Services.IPersonaService;
import com.ista.string.BACKEND_FIBADI.Model.Services.IUsuarioService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration{
	
	@Autowired
	private IUsuarioService personaService;
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider auth = new DaoAuthenticationProvider();
		auth.setUserDetailsService(personaService);
		auth.setPasswordEncoder(passwordEncoder());
		return auth;
	}
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
        .authorizeRequests()
            .anyRequest().permitAll()
            .and()
        .csrf().disable();
	    
	    http.headers().frameOptions().sameOrigin();
	    
	    return http.build();
	}

}
