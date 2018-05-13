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

import com.practice.jb.mesasanger.model.Message;
import com.practice.jb.mesasanger.model.Profile;
import com.practice.jb.mesasanger.service.ProfileService;
@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResources {

	private ProfileService profileservice=new ProfileService();
	
	@GET
	public List<Profile> getAllMessage() {
        return profileservice.getAllProfile();
        }
	 @POST
	 public Profile postMessage(Profile profile)
	    {
	    	return profileservice.addProfile(profile);
	    }
	 @GET
	   @Path("/{profilename}")
	   	    public Profile getprofile(@PathParam("profilename") String profilename)
	    {
	    	return profileservice.getProfile(profilename);
	    }
	 @PUT
	    @Path("/{profilename}")
	    
	    public Profile updateMessage(@PathParam("profilename") String name,Profile profile)
	    {
	   
		 profile.setName(name);
		 //System.out.println(profile.getName());
	    	return profileservice.updateProfile(profile);
	    }
	    @DELETE
	    @Path("/{profilename}")
	    
	    public void deleteMessage(@PathParam("profilename") String name)
	    {
	    	profileservice.deleteProfile(name);
	    }
}
