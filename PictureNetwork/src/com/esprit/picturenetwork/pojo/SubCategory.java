package com.esprit.picturenetwork.pojo;



import java.io.Serializable;
import java.lang.String;
import java.util.List;



/**
 * Entity implementation class for Entity: SubCategory
 *
 */

public class SubCategory implements Serializable {

	
	private int id;
	private String name;
	
	private Category parentCategory;
	private static final long serialVersionUID = 1L;
	
	private List<Picture> pictures;
	public SubCategory() {
		super();
	}   
	
	
	@Override
	public String toString()
	{
		return name;
	}
	public SubCategory(String name, Category parentCategory,
			List<Picture> pictures) {
		super();
		this.name = name;
		this.parentCategory = parentCategory;
		this.pictures = pictures;
	}



	public SubCategory(int id, String name, Category parentCategory,
			List<Picture> pictures) {
		super();
		this.id = id;
		this.name = name;
		this.parentCategory = parentCategory;
		this.pictures = pictures;
	}



	public SubCategory(int id, String name, Category parentCategory) {
		super();
		this.id = id;
		this.name = name;
		this.parentCategory = parentCategory;
	}
	

	
	


	public SubCategory(String name) {
		super();
		this.name = name;
	}



	public SubCategory(String name, Category parentCategory) {
		super();
		this.name = name;
		this.parentCategory = parentCategory;
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
	public Category getParentCategory() {
		return this.parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}



	public List<Picture> getPictures() {
		return pictures;
	}



	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
   
}
