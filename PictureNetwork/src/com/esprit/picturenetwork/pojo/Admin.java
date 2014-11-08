package com.esprit.picturenetwork.pojo;



import java.io.Serializable;



/**
 * Entity implementation class for Entity: Admin
 *
 */

//test0
public class Admin extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public Admin(int id, String lastName, String firstName, String address,
			String tel, String password, String state, String credit) {
		super(id, lastName, firstName, address, tel, password, State.ADMIN.toString(), Credit.PICTURE_NETWORK_TEAM.toString());
		// TODO Auto-generated constructor stub
	}

	public Admin(String lastName, String firstName, String address, String tel,
			String password, String state, String credit) {
		super(lastName, firstName, address, tel, password, State.ADMIN.toString(), Credit.PICTURE_NETWORK_TEAM.toString());
		// TODO Auto-generated constructor stub
	}
	
	
   
}
