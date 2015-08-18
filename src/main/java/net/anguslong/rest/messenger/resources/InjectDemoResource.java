package net.anguslong.rest.messenger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/injectdemo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class InjectDemoResource {

	@GET
	@Path("annotations")
	public String getParamsUsingAnnotations(@HeaderParam("customHeaderValue") String headerParam) {
		return "Header param: " + headerParam;
	}
}
