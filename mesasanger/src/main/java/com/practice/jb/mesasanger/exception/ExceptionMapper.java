package com.practice.jb.mesasanger.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import com.practice.jb.mesasanger.model.errorMessage;
@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<DataNotFound>{

	@Override
	public Response toResponse(DataNotFound exception) {
		errorMessage ermsg=new errorMessage(exception.getMessage(),404,"abcd");
		return Response.status(Status.NOT_FOUND).entity(ermsg).build();
	}

}
