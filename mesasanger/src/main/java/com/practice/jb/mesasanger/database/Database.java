package com.practice.jb.mesasanger.database;

import java.util.HashMap;
import java.util.Map;

import com.practice.jb.mesasanger.model.Message;
import com.practice.jb.mesasanger.model.Profile;

public class Database {

	private static Map<Integer, Message> messages=new HashMap<>();
	private static Map<String, Profile> profiles=new HashMap<>();
	
	public static Map<Integer, Message> getMessage()
	{
		return messages;
	}
	public static Map<String, Profile> getProfile()
	{
		return profiles;
	}

}
