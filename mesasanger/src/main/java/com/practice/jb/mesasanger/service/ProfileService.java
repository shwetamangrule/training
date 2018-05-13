package com.practice.jb.mesasanger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.practice.jb.mesasanger.database.Database;
import com.practice.jb.mesasanger.model.Profile;

public class ProfileService {

	private Map<String,Profile> profiles=Database.getProfile();

	public ProfileService()
	{
		profiles.put("tuhin", new Profile(1,"tuhin") );
		profiles.put("suman", new Profile(2,"suman") );

	}
	public List<Profile> getAllProfile()
	{
		return new ArrayList<>(profiles.values());
	}
	
	public Profile getProfile(String name)
	{
		return profiles.get(name);
	}
	public Profile addProfile(Profile profile)
	{
		profile.setId(profiles.size()+1);
		profiles.put(profile.getName(),profile);
		return profile;
	}
	public Profile deleteProfile(String name)
	{
		return profiles.remove(name);
		//return Profiles.get(id);
	}
	public Profile updateProfile(Profile Profile)
	{
		
			profiles.put(Profile.getName(),Profile);
			return Profile;
		
	}
}
