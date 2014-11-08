package com.esprit.picturenetwork.pojo;



import java.io.Serializable;
import java.util.Date;



/**
 * Entity implementation class for Entity: ProfileComment
 *
 */


public class ProfileComment extends Comment implements Serializable {

	
	
	private User reciever;
	private static final long serialVersionUID = 1L;
	
	private Profile userProfile;
	
	
	
	public ProfileComment()
	{
		super();
	}
	


	public ProfileComment(User reciever) {
		super();
		this.reciever = reciever;
	}

	public ProfileComment(String content, Date dateCreated, Date dateModified,
			User sender, String credit, User reciever) {
		super(content, dateCreated, dateModified, sender, credit);
		this.reciever = reciever;
	}





	public ProfileComment(int id, String content, Date dateCreated,
			Date dateModified, User sender,User reciever, Profile userProfile) {
		super(id, content, new Date(), new Date(), sender);
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}




	public ProfileComment(int id, String content, Date dateCreated,
			Date dateModified,User reciever, Profile userProfile) {
		super(id, content, new Date(), new Date());
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}




	public ProfileComment(String content, Date dateCreated, Date dateModified,
			User sender,User reciever, Profile userProfile) {
		super(content, new Date(), new Date(), sender);
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}
	
	public ProfileComment(String content, Date dateCreated, Date dateModified,
			User sender,User reciever) {
		super(content, dateCreated, dateModified, sender);
		this.reciever = reciever;
		
		// TODO Auto-generated constructor stub
	}





	public ProfileComment(String content, Date dateCreated, Date dateModified,User reciever, Profile userProfile) {
		super(content, dateCreated, dateModified);
		this.reciever = reciever;
		this.userProfile = userProfile;
		// TODO Auto-generated constructor stub
	}

	public User getReciever() {
		return this.reciever;
	}

	public void setReciever(User reciever) {
		this.reciever = reciever;
	}




	public Profile getUserProfile() {
		return userProfile;
	}




	public void setUserProfile(Profile userProfile) {
		this.userProfile = userProfile;
	}
   
}
