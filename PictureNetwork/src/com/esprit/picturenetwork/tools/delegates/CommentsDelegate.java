package com.esprit.picturenetwork.tools.delegates;

public class CommentsDelegate {
	public static final String basicUrl = "http://192.168.1.2:8080/pictureNetworkWeb/pictureCommentsLocal/";
	public static String addUrl = basicUrl +"add";
	public static String updateUrl = basicUrl +"update";
	public static String removeUrl = basicUrl +"remove";
	public static String removeByIdUrl = basicUrl +"remove/"; // /id param
	public static String findCommentOfPictureByCommentIdUrl = basicUrl +"findCommentOfPicture/"; // /id comment param
	// findCommentsOfPicture/
	public static String findCommentsOfPictureByPictureIdUrl = basicUrl +"findCommentsOfPicture/"; // /id picture param
	
	
}
