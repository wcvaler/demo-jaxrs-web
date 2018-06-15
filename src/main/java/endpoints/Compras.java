package endpoints;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import com.airhacks.ClienteWSDemo;
import com.airhacks.PrimerBeanI;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Path("/compras")
public class Compras {
	
	@EJB
	PrimerBeanI bean;
	
	@Context
	Configuration conf;
	
	@Inject
	ClienteWSDemo bean2;
	
	@GET
	@Path("/saluda/{nombre}")
	@Operation(summary = "Metodo para saludar",
	    tags = {"saludos"},
	    responses = {
	          @ApiResponse(responseCode = "405", description = "Invalid input")
	  })
	public Response saluda(@PathParam(value="nombre") String nombre){
		System.out.println("aplicacion :"+conf.getProperty("appName"));
		System.out.println("saludos 2 "+bean2.getValue());
			return Response.ok(bean.getSaludo(nombre)).build();
	}

}
