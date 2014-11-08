package com.esprit.picturenetwork.pojo;



import java.io.Serializable;
import java.lang.String;
import java.util.Date;
import java.util.List;



/**
 * Entity implementation class for Entity: Picture
 *
 */

public class Picture implements Serializable {

	
	private int id;
	private String name;
	private String Description;

	private SubCategory pictureSubCategory;
	private String Section;
	
	
	private User pictureOwner;
	
	private Date dateAdded = new Date();
	private static final long serialVersionUID = 1L;
	
	private List<Comment> PictureComments = null;
	private String url;
	
	private byte[] content;
	private String activation;
	
	
	
	/**
	 * @param name
	 * @param description
	 * @param pictureSubCategory
	 * @param section
	 * @param pictureOwner
	 * @param dateAdded
	 * @param pictureComments
	 * @param url
	 * @param content
	 * @param activation
	 */
	public Picture(String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> pictureComments, String url,
			byte[] content, String activation) {
		super();
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = new Date();
		PictureComments = pictureComments;
		this.url = url;
		this.content = content;
		this.activation = activation;
	}


	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param pictureSubCategory
	 * @param section
	 * @param pictureOwner
	 * @param dateAdded
	 * @param pictureComments
	 * @param url
	 * @param content
	 * @param activation
	 */
	public Picture(int id, String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> pictureComments, String url,
			byte[] content, String activation) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = new Date();
		PictureComments = pictureComments;
		this.url = url;
		this.content = content;
		this.activation = activation;
	}


	public String getActivation() {
		return activation;
	}


	public void setActivation(String activation) {
		this.activation = activation;
	}


	/**
	 * @param name
	 * @param description
	 * @param pictureSubCategory
	 * @param section
	 * @param pictureOwner
	 * @param dateAdded
	 * @param pictureComments
	 * @param url
	 * @param content
	 */
	public Picture(String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> pictureComments, String url,
			byte[] content) {
		super();
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded =  new Date();
		PictureComments = pictureComments;
		this.url = url;
		this.content = content;
	}


	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param pictureSubCategory
	 * @param section
	 * @param pictureOwner
	 * @param dateAdded
	 * @param pictureComments
	 * @param url
	 * @param content
	 */
	public Picture(int id, String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> pictureComments, String url,
			byte[] content) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded =  new Date();
		PictureComments = pictureComments;
		this.url = url;
		this.content = content;
	}


	public byte[] getContent() {
		return content;
	}


	public void setContent(byte[] content) {
		this.content = content;
	}


	public Picture(int id, String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> pictureComments, String url) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded =  new Date();
		PictureComments = pictureComments;
		this.url = url;
	}


	public Picture(String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> pictureComments, String url) {
		super();
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded =  new Date();
		PictureComments = pictureComments;
		this.url = url; // par exemple /images/plage.jpg => url ( c'est pour acceder a l'image stocke
		// car la base de donnee n'enregistre que le chemin d'acces au fichier (url) et non pas
		// le fichier image
		// pour faire simple l'url = /images/nomimage 
		//est ce que c'est clair?
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Picture() {
		super();
	}   
	
	
	public Picture(String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> PictureComments) {
		super();
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = new Date();
		this.PictureComments = PictureComments;
	}


	public Picture(int id, String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded, List<Comment> PictureComments) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = new Date();
		this.PictureComments = PictureComments;
	}


	public Picture(String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded) {
		super();
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = new Date();
	}


	public Picture(int id, String name, String description,
			SubCategory pictureSubCategory, String section, User pictureOwner,
			Date dateAdded) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
		this.pictureSubCategory = pictureSubCategory;
		Section = section;
		this.pictureOwner = pictureOwner;
		this.dateAdded = new Date();
	}


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}   
	public SubCategory getPictureSubCategory() {
		return this.pictureSubCategory;
	}

	public void setPictureSubCategory(SubCategory pictureSubCategory) {
		this.pictureSubCategory = pictureSubCategory;
	}   
	public String getSection() {
		return this.Section;
	}

	public void setSection(String Section) {
		this.Section = Section;
	}   
	public User getPictureOwner() {
		return this.pictureOwner;
	}

	public void setPictureOwner(User pictureOwner) {
		this.pictureOwner = pictureOwner;
	}   
	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = new Date();
	}

	
	public List<Comment> getPictureComments() {
		return PictureComments;
	}


	public void setPictureComments(List<Comment> PictureComments) {
		this.PictureComments = PictureComments;
	}
   
}
