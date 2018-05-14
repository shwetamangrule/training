package com.practice.jb.mesasanger.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.practice.jb.mesasanger.database.Database;
import com.practice.jb.mesasanger.exception.DataNotFound;
import com.practice.jb.mesasanger.model.Message;

public class MessageService {
	
	private Map<Integer,Message> messages=Database.getMessage();

	public MessageService()
	{
		messages.put(1, new Message(1,"tuhin","tuhin") );
		messages.put(2, new Message(2,"das","suman") );

	}
	public List<Message> getAllMessage()
	{
		return new ArrayList<>(messages.values());
	}
	
	public Message getMessage(Integer id)
	{
		Message message=messages.get(id);
		if(message==null)
		{
			throw new DataNotFound("data not found with message id"+id);
		}
		else 
			return message;
	}
	public Message addMessage(Message message)
	{
		message.setId(messages.size()+1);
		messages.put(message.getId(),message);
		return message;
	}
	public Message deleteMessage(Integer id)
	{
		return messages.remove(id);
		//return messages.get(id);
	}
	public Message updateMessage(Message message)
	{
		if(message.getId()<=0)
		{ return null;}
		else
		{
			messages.put(message.getId(),message);
			return message;
		
	}}
	public List<Message> getAllMessageForYear(int year)
	{
		List<Message> messageForYear=new ArrayList<>();
		Calendar cal=Calendar.getInstance();
		for(Message message:messages.values()) {
			cal.setTime(message.getDate());
			if(cal.get(Calendar.YEAR)==year) {
				messageForYear.add(message);}
		}
		return messageForYear;
	}
	
	public List<Message> getAllMessagepeginated(int start,int size)
	{
		List<Message> messagePeginated=new ArrayList<>(messages.values());
		return messagePeginated.subList(start, start+size);
	}
}
