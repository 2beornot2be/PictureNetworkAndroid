package com.esprit.picturenetwork.pojo;

import java.io.Serializable;
import java.util.Date;



/**
 * Entity implementation class for Entity: EventComment
 *
 */


public class EventComment  extends Comment implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private Event event;
	
	
	
	/**
	 * @param id
	 * @param content
	 * @param dateCreated
	 * @param dateModified
	 * @param sender
	 * @param credit
	 */
	public EventComment(int id, String content, Date dateCreated,
			Date dateModified, User sender, String credit, Event e) {
		super(id, content, dateCreated, dateModified, sender, credit);
		event = e;
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param content
	 * @param dateCreated
	 * @param dateModified
	 * @param sender
	 */
	public EventComment(int id, String content, Date dateCreated,
			Date dateModified, User sender, Event e) {
		super(id, content, dateCreated, dateModified, sender);
		// TODO Auto-generated constructor stub
		event = e;
	}

	/**
	 * @param id
	 * @param content
	 * @param dateCreated
	 * @param dateModified
	 */
	public EventComment(int id, String content, Date dateCreated,
			Date dateModified, Event e) {
		super(id, content, dateCreated, dateModified);
		// TODO Auto-generated constructor stub
		event = e;
	}

	/**
	 * @param content
	 * @param dateCreated
	 * @param dateModified
	 * @param sender
	 * @param string
	 */
	public EventComment(String content, Date dateCreated, Date dateModified,
			User sender, String string, Event e) {
		super(content, dateCreated, dateModified, sender, string);
		// TODO Auto-generated constructor stub
		event = e;
	}

	/**
	 * @param content
	 * @param dateCreated
	 * @param dateModified
	 * @param sender
	 */
	public EventComment(String content, Date dateCreated, Date dateModified,
			User sender, Event e) {
		super(content, dateCreated, dateModified, sender);
		// TODO Auto-generated constructor stub
		event = e;
	}

	/**
	 * @param content
	 * @param dateCreated
	 * @param dateModified
	 */
	public EventComment(String content, Date dateCreated, Date dateModified, Event e) {
		super(content, dateCreated, dateModified);
		// TODO Auto-generated constructor stub
		event = e;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public EventComment() {
		super();
	}
   
}
