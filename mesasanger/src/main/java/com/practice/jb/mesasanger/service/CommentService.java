package com.practice.jb.mesasanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.practice.jb.mesasanger.database.Database;
import com.practice.jb.mesasanger.model.Comment;
import com.practice.jb.mesasanger.model.Message;
import com.practice.jb.mesasanger.model.errorMessage;

public class CommentService {

	private Map<Integer,Message> messages=Database.getMessage();
	
	public List<Comment> getAllComment(Integer messageId)
	{
		Map<Integer,Comment> comments=messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());
	}
	public Comment getComment(Integer messageId,Integer commentId)
	{
		errorMessage ermsg=new errorMessage("Not found",404,"abcd");
		Response response=Response.status(Status.NOT_FOUND).entity(ermsg).build();
		Message message=messages.get(messageId);
		if(message==null)
		{
			throw new WebApplicationException(response);
		}
		Map<Integer,Comment> comments=messages.get(messageId).getComments();
		Comment comment=comments.get(commentId);
		if(comment==null)
		{
			throw new WebApplicationException(response);
		}
		return comment;
	}
	public Comment addComment(Integer messageId,Comment comment)
	{
		Map<Integer,Comment> comments=messages.get(messageId).getComments();
		comment.setId(comments.size()+1);
		comments.put(comment.getId(),comment);
		return comment;
	}
	public Comment updateComment(Integer messageId,Comment comment)
	{
		Map<Integer,Comment> comments=messages.get(messageId).getComments();
		
		comments.put(comment.getId(),comment);
		return comment;
	}
	public Comment deleteComment(Integer messageId,Integer commentId)
	{
		Map<Integer,Comment> comments=messages.get(messageId).getComments();
		return comments.remove(commentId);
	}
}
