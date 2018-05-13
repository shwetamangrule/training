package com.practice.jb.mesasanger.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/others")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class OtherResource {

	
	@GET
	@Path("annotation")
	public String getStarted(@MatrixParam("param") String prm,
								@HeaderParam("param2") String hprm,
								@CookieParam("name") String cprm)
	{
		return prm+"  Get Started1 with header param  "+hprm+"cookie "+cprm ;
	}
	@GET
	@Path("context")
	public String getContext(@Context UriInfo uri,
							@Context HttpHeaders headers)
	{
		String cookies=headers.getCookies().toString();
		String head=headers.getRequestHeaders().toString();
		String url=uri.getAbsolutePathBuilder().toString();
		return "test:"+cookies+" headers "+head+" url "+url;
	}
}
