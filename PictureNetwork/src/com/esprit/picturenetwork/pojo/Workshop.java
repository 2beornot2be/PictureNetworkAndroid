package com.esprit.picturenetwork.pojo;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;



/**
 * Entity implementation class for Entity: Workshop
 *
 */


public class Workshop implements Serializable {


	private int id;
	private String topic;
	private String description;

	private User owner;

	private Date workshopDate;
	public Date getWorkshopDate() {
		return workshopDate;
	}

	public void setWorkshopDate(Date workshopDate) {
		this.workshopDate = workshopDate;
	}

	private List<User> participants;
	private static final long serialVersionUID = 1L;

	
	public Workshop(String topic, String description) {
		super();
		this.topic = topic;
		this.description = description;
	}

	public Workshop(int id, String topic, String description) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
	}
	
	
	
	public Workshop(int id, String topic, String description, User owner,
			Date workshopDate, List<User> participants) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
		this.owner = owner;
		this.workshopDate = workshopDate;
		this.participants = participants;
	}

	public Workshop() {
		super();
	}   
	    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String Topic) {
		topic = Topic;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String Description) {
		this.description = Description;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public List<User> getParticipants() {
		return participants;
	}

	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}
   
}
