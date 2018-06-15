package com.airhacks;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Local;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;

@Stateless
@Local(PrimerBeanI.class)
public class PrimerBean {

	@PersistenceContext(unitName="cclDS")
	EntityManager manager;
	
	
	@Context
	Configuration conf;
	
	
	
	public String getSaludo(String nombre){
		System.out.println("#### conf is "+ conf);
		return "Hola "+nombre;
	}
	
}
