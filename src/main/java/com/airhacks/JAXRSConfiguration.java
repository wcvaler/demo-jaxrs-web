package com.airhacks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import endpoints.Compras;
import io.swagger.v3.jaxrs2.integration.JaxrsOpenApiContextBuilder;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import io.swagger.v3.oas.integration.OpenApiConfigurationException;

/**
 * Configures a JAX-RS endpoint. Delete this class, if you are not exposing
 * JAX-RS resources in your application.
 *
 * @author airhacks.com
 */
@ApplicationPath("resources")
public class JAXRSConfiguration extends Application {
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes=new HashSet<Class<?>>();
		classes.add(Compras.class);
		classes.add(OpenApiResource.class);
		return classes;
	}

	public JAXRSConfiguration() {
		 /* try {
	            new JaxrsOpenApiContextBuilder()
	                .configLocation("/openapi-configuration.json")
	                .buildContext(true);
	            System.out.println("loading configuration ###################");
	        } catch (OpenApiConfigurationException e) {
	            throw new RuntimeException(e.getMessage(), e);
	        }
			*/
	}
	
	@Override
	public Map<String, Object> getProperties() {
		
		Map<String,Object> map=new HashMap<>();
		map.put("appName","Mi aplicacion Rest");
		
		return map;
	}
	
	
}
