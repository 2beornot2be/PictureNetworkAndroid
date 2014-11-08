package com.esprit.picturenetwork.pojo;
//ok
import java.io.Serializable;
import java.util.Date;
import java.util.List;



/**
 * Entity implementation class for Entity: Event
 *
 */

public class Event implements Serializable {
	
	
	private int id;
	private String topic;
	private String description;
	
	private Date eventDate;
	private static final long serialVersionUID = 1L;
	
	private User Owner;
	
   
	private List<User> participants;
	
	private List<EventComment> eventComment = null;
	// a faire list<Comment>
	private String modelState_Activation = ModelState_Activation.ACTIVATED.toString();
	
	/**
	 * @param topic
	 * @param description
	 * @param eventDate
	 * @param owner
	 * @param participants
	 * @param eventComment
	 * @param modelState_Activation
	 */
	public Event(String topic, String description, Date eventDate, User owner,
			List<User> participants, List<EventComment> eventComment,
			String modelState_Activation) {
		super();
		this.topic = topic;
		this.description = description;
		this.eventDate = new Date();
		Owner = owner;
		this.participants = participants;
		this.eventComment = eventComment;
		this.modelState_Activation = modelState_Activation;
	}





	/**
	 * @param id
	 * @param topic
	 * @param description
	 * @param eventDate
	 * @param owner
	 * @param participants
	 * @param eventComment
	 * @param modelState_Activation
	 */
	public Event(int id, String topic, String description, Date eventDate,
			User owner, List<User> participants,
			List<EventComment> eventComment, String modelState_Activation) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
		this.eventDate = new Date();
		Owner = owner;
		this.participants = participants;
		this.eventComment = eventComment;
		this.modelState_Activation = modelState_Activation;
	}





	public Event() {
		super();
	}
	
	
	
	
	
	public Event(String topic, String description, Date eventDate, User owner,
			List<User> participants, List<EventComment> eventComments) {
		super();
		this.topic = topic;
		this.description = description;
		this.eventDate = new Date();
		Owner = owner;
		this.participants = participants;
		this.setEventComment(eventComments);
	}





	public Event(int id, String topic, String description, Date eventDate,
			User owner, List<User> participants, List<EventComment> eventComments) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
		this.eventDate = new Date();
		Owner = owner;
		this.participants = participants;
		this.setEventComment(eventComments);
	}





	public Event(String topic, String description, Date eventDate, User owner,
			List<User> participants) {
		super();
		this.topic = topic;
		this.description = description;
		this.eventDate = new Date();
		Owner = owner;
		this.participants = participants;
	}





	public Event(int id, String topic, String description, Date eventDate,
			User owner, List<User> participants) {
		super();
		this.id = id;
		this.topic = topic;
		this.description = description;
		this.eventDate = new Date();
		Owner = owner;
		this.participants = participants;
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

	public void setTopic(String topic) {
		this.topic = topic;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Date getEventDate() {
		return this.eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = new Date();
	}



	public User getOwner() {
		return Owner;
	}



	public void setOwner(User owner) {
		Owner = owner;
	}



	public List<User> getParticipants() {
		return participants;
	}



	public void setParticipants(List<User> participants) {
		this.participants = participants;
	}





	





	public List<EventComment> getEventComment() {
		return eventComment;
	}





	public void setEventComment(List<EventComment> eventComment) {
		this.eventComment = eventComment;
	}





	public String getModelState_Activation() {
		return modelState_Activation;
	}





	public void setModelState_Activation(String modelState_Activation) {
		this.modelState_Activation = modelState_Activation;
	}
   
}
