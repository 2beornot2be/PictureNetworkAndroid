package com.esprit.picturenetwork.tools.delegates;

public class PicturesDelegate 
{
	public static final String basicUrl = "http://192.168.1.2:8080/pictureNetworkWeb/pictureManagement/";
	public static String addUrl = basicUrl +"AddPicture";
	public static String updateUrl = basicUrl +"UpdatePicture";
	public static String findPictureById = basicUrl +"findPicture/"; // id picture
	public static String findAllPictures = basicUrl + "findAllPictures";
	public static String findAllPicturesOfUser = basicUrl +"findByUser/"; // id user
}
