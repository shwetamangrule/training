package com.practice.jb.mesasanger.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.practice.jb.mesasanger.model.Message;
import com.practice.jb.mesasanger.model.bean.BeanforParam;
import com.practice.jb.mesasanger.service.MessageService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/messages")
public class MessageResource {

	MessageService messageservice=new MessageService();
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/XML" media type.
     *
     * @return String that will be returned as a application/XML response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getAllMessage(@BeanParam BeanforParam beanParam) {
    	if(beanParam.getYear()>0)
    	{
    		return messageservice.getAllMessageForYear(beanParam.getYear());
    	}
    	if(beanParam.getStart()>0 && beanParam.getSize()>0)
    	{
    		return messageservice.getAllMessagepeginated(beanParam.getStart(), beanParam.getSize());
    	}
        return messageservice.getAllMessage();
    }
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/XML" media type.
     *
     * @return String that will be returned as a application/XML response.
     */
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
    public Message getMessage(@PathParam("messageId") Integer messageId)
    {
    	return messageservice.getMessage(messageId);
    }
    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message updateMessage(@PathParam("messageId") Integer id,Message message)
    {
   
    	message.setId(id);
    	return messageservice.updateMessage(message);
    }
    @DELETE
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("messageId") Integer id)
    {
    	messageservice.deleteMessage(id);
    }
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postMessage(Message message, @Context UriInfo uriInfo) throws URISyntaxException
    {
       	Message newMessage= messageservice.addMessage(message);
       	String newId=String.valueOf(message.getId());
       	URI uri=uriInfo.getAbsolutePathBuilder().path(newId).build();
       	return Response.created(uri) .entity(newMessage)
       			.build();
    }
    
    @Path("/{messageId}/comments")
    public CommentResource getCommentResource()
    {
    	return new CommentResource();
    }
    
    
    
    
    
    
    
}
