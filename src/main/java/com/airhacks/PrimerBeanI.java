package com.airhacks;

import javax.ejb.Local;

@Local
public interface PrimerBeanI {
	public String getSaludo(String nombre);
}
