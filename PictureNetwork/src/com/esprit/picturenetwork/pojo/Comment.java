package com.esprit.picturenetwork.pojo;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;



/**
 * Entity implementation class for Entity: Comment
 *
 */

public class Comment implements Serializable {

	
	private int id;
	private String content;


	private Date dateCreated;

	private Date dateModified;
	private static final long serialVersionUID = 1L;
	
	private User sender;
	private String credit;
	

	private Picture picture;
	
	



	/**
	 * @param content
	 * @param dateCreated
	 * @param dateModified
	 * @param sender
	 * @param credit
	 * @param picture
	 */
	public Comment(String content, Date dateCreated, Date dateModified,
			User sender, String credit, Picture picture) {
		super();
		this.content = content;
		this.dateCreated = new Date();
		this.dateModified = new Date();
		this.sender = sender;
		this.credit = credit;
		this.picture = picture;
	}



	//@JsonIgnore
	public Picture getPicture() {
		return picture;
	}




	public void setPicture(Picture picture) {
		this.picture = picture;
	}




	public Comment() {
		super();
	}   
	
	
	

	public Comment(String content, Date dateCreated, Date dateModified,
			User sender, String string) {
		super();
		this.content = content;
		this.dateCreated = new Date();
		this.dateModified = new Date();
		this.sender = sender;
		this.credit = string;
	}




	public Comment(int id, String content, Date dateCreated, Date dateModified,
			User sender, String credit) {
		super();
		this.id = id;
		this.content = content;
		this.dateCreated = new Date();
		this.dateModified = new Date();
		this.sender = sender;
		this.credit = credit;
	}




	public Comment(String content, Date dateCreated, Date dateModified,
			User sender) {
		super();
		this.content = content;
		this.dateCreated = new Date();
		this.dateModified = new Date();
		this.sender = sender;
	}


	public Comment(int id, String content, Date dateCreated, Date dateModified,
			User sender) {
		super();
		this.id = id;
		this.content = content;
		this.dateCreated = new Date();
		this.dateModified = new Date();
		this.sender = sender;
	}


	public Comment(String content, Date dateCreated, Date dateModified) {
		super();
		this.content = content;
		this.dateCreated = new Date();
		this.dateModified = new Date();
	}


	public Comment(int id, String content, Date dateCreated, Date dateModified) {
		super();
		this.id = id;
		this.content = content;
		this.dateCreated = new Date();
		this.dateModified = new Date();
	}
	




	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}   
	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}   
	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	//@JsonIgnore
	public User getSender() {
		return sender;
	}


	public void setSender(User sender) {
		this.sender = sender;
	}
	
	public String getCredit() {
		return credit;
	}




	public void setCredit(String credit) {
		this.credit = credit;
	}




	
   
}
