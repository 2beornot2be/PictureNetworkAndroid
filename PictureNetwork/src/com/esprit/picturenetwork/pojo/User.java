package com.esprit.picturenetwork.pojo;

import java.io.Serializable;
import java.lang.String;
import java.util.List;



/**
 * Entity implementation class for Entity: User
 *
 */

public class User implements Serializable {
	
	
	
	private int id;
	
	private String firstName = null;
	
	private String address = null;
	
	private String tel = null;
	
	
	private String password = null;
	
	private String state = null;
	
	private String credit = null;
	
	
	
	private List<Event> events = null;
	
	
	private List<Profile> followedProfiles = null;
	
	
	private List<Profile> friendsProfiles = null;
	
	List<ProfileComment> profileCommentsReceived = null;
	private static final long serialVersionUID = 1L;
	
	
	
	public User(String firstName, String address, String tel, String password,
			String state, String credit, List<Event> events,
			List<Profile> followedProfiles, List<Profile> friendsProfiles,
			String lastName) {
		super();
		this.firstName = firstName;
		this.address = address;
		this.tel = tel;
		this.password = password;
		this.state = state;
		this.credit = credit;
		this.events = events;
		this.followedProfiles = followedProfiles;
		this.friendsProfiles = friendsProfiles;
		this.lastName = lastName;
	}


	public User(int id, String firstName, String address, String tel,
			String password, String state, String credit, List<Event> events,
			List<Profile> followedProfiles, List<Profile> friendsProfiles,
			String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.address = address;
		this.tel = tel;
		this.password = password;
		this.state = state;
		this.credit = credit;
		this.events = events;
		this.followedProfiles = followedProfiles;
		this.friendsProfiles = friendsProfiles;
		this.lastName = lastName;
	}

	
	public List<Event> getEvents() {
		return events;
	}


	public void setEvents(List<Event> events) {
		this.events = events;
	}


	public User(int id, String firstName, String address, String tel,
			String password, String state, String credit,
			List<Profile> followedProfiles, List<Profile> friendsProfiles,
			String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.address = address;
		this.tel = tel;
		this.password = password;
		this.state = state;
		this.credit = credit;
		this.followedProfiles = followedProfiles;
		this.friendsProfiles = friendsProfiles;
		this.lastName = lastName;
	}

	private String lastName = null;
	
	public String getLastName() {
		return lastName;
	}

	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	

	public User() {
		super();
	}   
	
	
	public User(int id, String lastName, String firstName, String address,
			String tel, String password, String state, String credit) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.tel = tel;
		this.password = password;
		this.state = state;
		this.credit = credit;
	}

	public User(String lastName, String firstName, String address, String tel,
			String password, String state, String credit) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.tel = tel;
		this.password = password;
		this.state = state;
		this.credit = credit;
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Profile> getFollowedProfiles() {
		return followedProfiles;
	}

	public void setFollowedProfiles(List<Profile> followedProfiles) {
		this.followedProfiles = followedProfiles;
	}

	public List<Profile> getFriendsProfiles() {
		return friendsProfiles;
	}

	public void setFriendsProfiles(List<Profile> friendsProfiles) {
		this.friendsProfiles = friendsProfiles;
	}   
	
	public List<ProfileComment> getProfileCommentsReceived() {
		return profileCommentsReceived;
	}


	public void setProfileCommentsReceived(
			List<ProfileComment> profileCommentsReceived) {
		this.profileCommentsReceived = profileCommentsReceived;
	}


	@Override
	public String toString()
	{
		return firstName + " " + lastName;
	}
	
   
}
