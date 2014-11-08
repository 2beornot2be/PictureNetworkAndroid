package com.esprit.picturenetwork.pojo;



import java.io.Serializable;
import java.util.List;



/**
 * Entity implementation class for Entity: Model
 *
 */


public class Model extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String modelState_Activation = ModelState_Activation.ACTIVATED.toString();
	
	
	

	public String getModelState_Activation() {
		return modelState_Activation;
	}

	public void setModelState_Activation(String modelState_Activation) {
		this.modelState_Activation = modelState_Activation;
	}

	public Model() {
		super();
	}

	public Model(int id, String lastName, String firstName, String address,
			String tel, String password, String state, String credit) {
		super(id, lastName, firstName, address, tel, password, State.MODEL.toString(), credit);
		// TODO Auto-generated constructor stub
	}

	public Model(String lastName, String firstName, String address, String tel,
			String password, String state, String credit) {
		super(lastName, firstName, address, tel, password, State.MODEL.toString(), credit);
		
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Model(int id, String firstName, String address, String tel,
			String password, String state, String credit,
			List<Profile> followedProfiles, List<Profile> friendsProfiles,
			String lastName, String modelState_Activation) {
		super(id, firstName, address, tel, password, state, credit,
				followedProfiles, friendsProfiles, lastName);
		this.modelState_Activation = modelState_Activation;
		
	}
	public Model( String lastName, String firstName, String address, String tel,
			String password, String state, String credit, String modelState_Activation) {
		super(  lastName, firstName, address, tel,
				password, state, credit);
		this.modelState_Activation = modelState_Activation;
		
	}
	

	
	
	
   
}
