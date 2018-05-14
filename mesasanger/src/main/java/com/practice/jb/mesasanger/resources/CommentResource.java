package com.practice.jb.mesasanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.practice.jb.mesasanger.model.Comment;
import com.practice.jb.mesasanger.service.CommentService;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CommentResource {

	private CommentService commentservice=new CommentService();
	@GET
	public List<Comment> getComment(@PathParam("messageId") Integer messageId)
	{
		return commentservice.getAllComment(messageId);
	}
	@GET
	@Path("/{commentId}")
	public Comment getCommentId(@PathParam("commentId") Integer commentId,
			@PathParam("messageId") Integer messageId)
	{
		
		return commentservice.getComment(messageId, commentId);
	}
	@POST
	public Comment addMessage(@PathParam("messageId") Integer messageId,Comment comment)
	{
		return commentservice.addComment(messageId, comment);
	}
	@DELETE
	@Path("/{commentId}")
	public void deleteComment(@PathParam("commentId") Integer commentId,
			@PathParam("messageId") Integer messageId)
	{
		
		commentservice.deleteComment(messageId, commentId);
	}
	@PUT
	public Comment updateMessage(@PathParam("messageId") Integer messageId,@PathParam("commentId") Integer commentId,Comment comment)
	{
		comment.setId(commentId);
		return commentservice.updateComment(messageId, comment);
	}
	
	
	
	
	
	
}
