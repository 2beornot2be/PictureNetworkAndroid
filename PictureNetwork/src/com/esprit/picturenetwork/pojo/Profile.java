package com.esprit.picturenetwork.pojo;



import java.io.Serializable;
import java.util.List;



/**
 * Entity implementation class for Entity: Profile
 *
 */

public class Profile implements Serializable {

	
	private int id;
	
	private User profileOwner;
	
	
	
	private List<User> friends = null;
	
	
	
	
	private List<User> followers = null;
	// a ajouter List<ProfileComment>
	
	private List<ProfileComment> profileComments;
	
	private static final long serialVersionUID = 1L;

	public Profile(int id, User profileOwner, List<User> friends,
			List<User> followers, List<ProfileComment> profileComments) {
		super();
		this.id = id;
		this.profileOwner = profileOwner;
		this.friends = friends;
		this.followers = followers;
		this.profileComments = profileComments;
	}

	public Profile() {
		super();
	}   
	   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public User getProfileOwner() {
		return this.profileOwner;
	}

	public void setProfileOwner(User profileOwner) {
		this.profileOwner = profileOwner;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}

	public List<ProfileComment> getProfileComments() {
		return profileComments;
	}

	public void setProfileComments(List<ProfileComment> profileComments) {
		this.profileComments = profileComments;
	}
   
}
