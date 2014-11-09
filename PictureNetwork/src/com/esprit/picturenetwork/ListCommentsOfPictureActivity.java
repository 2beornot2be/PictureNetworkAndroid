
package com.esprit.picturenetwork;

import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.esprit.picturenetwork.tools.delegates.CommentsDelegate;
import com.esprit.picturenetwork.tools.delegates.PicturesDelegate;
import com.esprit.picturenetwork.tools.delegates.RestTask;
import com.esprit.picturenetwork.tools.delegates.RestTaskPOST;
import com.esprit.picturenetwork.tools.delegates.UsersDelegate;
import com.esprit.picturenetwork.tools.delegates.RestTask.ResponseCallback;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;

public class ListCommentsOfPictureActivity extends Activity implements ResponseCallback 
{
	
	private ProgressDialog mProgress;
	private ListView listViewComments;
	private boolean pictureLoaded = false;
	private boolean userLoaded = false;
	private TextView textViewpictureOwner;
	private TextView textViewpictureName;
	private TextView textViewpictureDescription;
	private JSONObject picture;
	private JSONObject commentSender;
	private TextView commentToAdd;
	String pictureId;
	String userId;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_comments_of_picture);
		// lire les donnees recus d'une autre activite
		Intent intent = getIntent();
		pictureId = intent.getStringExtra(PictureNetwork.PICTURE_ID);
		userId = intent.getStringExtra(PictureNetwork.USER_ID);
		getUserById(userId);
		getPicture(pictureId);
		getAllComments(pictureId);
	}
	
	public void sendComment(View v)
	{
		System.out.println("ok click");
		//POST COMMENT
				try
				{
					commentToAdd = (TextView) findViewById(R.id.commentToAdd);
					String commentContent = commentToAdd.getText().toString();
					String url = CommentsDelegate.addUrl;
					System.out.println("URL OF ADD COMMENT: " + url);
					HttpPost postRequest = new HttpPost(url);
					String json = "";
					JSONObject commentJSON = new JSONObject();
					/*{"content":"test2","dateCreated":null, "dateModified" : null, "sender":{ "id":1,
"lastName" : "sahbi", "firstName" : "akram", "address": "manar 2","tel":"20747198","password":"666", "state":"USER", "credit":"FREE_USER" },
 "credit":"FREE_USER", "picture":{ "id":1,"name":"p1", "description":"d1",
			"pictureSubCategory":null, "section":"s1", "pictureOwner":{ "id": 1,
"lastName" : "sahbi", "firstName" : "akram", "address": "manar 2","tel":"20747198","password":"666", "state":"USER", "credit":"FREE_USER"} ,
"dateAdded":null, "pictureComments":null, "url":null,
			"content":null, "activation":"ACTIVATED"}
}	
					 * 
					 * 
					 * 
					 */
					
					String commentSenderPost = String.format("{\"id\":%d, \"lastName\":\"%s\", \"firstName\":\"%s\", \"address\":\"%s\","
							+ "  \"tel\":\"%s\", \"password\":\"%s\", \"state\":\"%s\",\"credit\":\"%s\" }", commentSender.getInt("id"),
							commentSender.getString("lastName"), commentSender.getString("firstName") ,commentSender.getString("address")
							,commentSender.getString("tel"), commentSender.getString("password")
							,commentSender.getString("state"), commentSender.getString("credit"));
					String pictureOwnerString = String.format("{\"id\":%d, \"lastName\":\"%s\", \"firstName\":\"%s\", \"address\":\"%s\","
							+ "  \"tel\":\"%s\", \"password\":\"%s\", \"state\":\"%s\",\"credit\":\"%s\" }", picture.getJSONObject("pictureOwner").getInt("id"),
							picture.getJSONObject("pictureOwner").getString("lastName"), picture.getJSONObject("pictureOwner").getString("firstName") ,picture.getJSONObject("pictureOwner").getString("address")
							,picture.getJSONObject("pictureOwner").getString("tel"), picture.getJSONObject("pictureOwner").getString("password")
							,picture.getJSONObject("pictureOwner").getString("state"), picture.getJSONObject("pictureOwner").getString("credit"));
					String picturePost = String.format("{\"id\":%d,\"name\":\"%s\", \"description\":\"%s\", \"pictureSubCategory\":%s, \"section\":\"%s\", \"pictureOwner\":%s, \"dateAdded\":\"%s\",\"pictureComments\":%s, \"url\":\"%s\", \"content\":%s, \"activation\":\"%s\"  }", picture.getInt("id"),
							picture.getString("name"), picture.getString("description"),null, picture.getString("section"),pictureOwnerString, picture.getString("dateAdded"), null, picture.getString("url"), picture.get("content"), picture.getString("activation") );
					String year = new Date().getYear()+ 1900 + "";
					String month = new Date().getMonth()+1+"";
					String day = new Date().getDate()+"";
					String date = year+"-"+month+"-"+day;
					json = String.format("{\"content\":\"%s\", \"dateCreated\":\"%s\", \"dateModified\":\"%s\", \"sender\":%s,"
							+ "\"picture\":%s }", commentContent, date,
							date, commentSenderPost, picturePost);
					
					//commentJSON.put("conent", commentContent);
					//commentJSON.accumulate("dateCreated", date);
					//commentJSON.put("dateModified", date);
					
					
					//commentJSON.accumulate("sender", commentSender);
					//commentJSON.accumulate("credit", "FREE_USER");
					//commentJSON.accumulate("picture", picture);
					
					/*
					commentJSON.put("conent", commentContent);
					commentJSON.put("dateCreated", null);
					commentJSON.put("dateModified", null);
					commentJSON.put("sender", commentSender);
					commentJSON.put("credit", "FREE_USER");
					commentJSON.put("picture", picture);
					*/
					//json = commentJSON.toString();
					System.out.println(json);
					StringEntity se = new StringEntity(json);
					postRequest.setEntity(se);
					postRequest.setHeader("Accept", "application/json");
					postRequest.setHeader("Content-type", "application/json");
					
					
					
					RestTaskPOST task = new RestTaskPOST();
					
					task.execute(postRequest);
					getAllComments(pictureId);
					// display progress to the user
					//mProgress = ProgressDialog.show(this, "Loading Picture", "waiting for results...", true);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
	}
	private void getPicture(String idPicture)
	{
		//GET PICTURE
		try
		{
			
			String url = PicturesDelegate.findPictureById + idPicture;
			HttpGet findRequest = new HttpGet(url);
			RestTask task = new RestTask();
			task.setResponseCallback(this);
			task.execute(findRequest);
			// display progress to the user
			//mProgress = ProgressDialog.show(this, "Loading Picture", "waiting for results...", true);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private void getUserById(String userId)
	{
		//GET COMMENTS
		try
		{
			
			String url = UsersDelegate.findUser + userId;
			HttpGet findRequest = new HttpGet(url);
			RestTask task = new RestTask();
			task.setResponseCallback(this);
			task.execute(findRequest);
			// display progress to the user
			//mProgress = ProgressDialog.show(this, "Finding Comments", "waiting for results...", true);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private void getAllComments(String idPicture)
	{
		//GET COMMENTS
				try
				{
					
					String url = CommentsDelegate.findCommentsOfPictureByPictureIdUrl + idPicture;
					HttpGet findRequest = new HttpGet(url);
					RestTask task = new RestTask();
					task.setResponseCallback(this);
					task.execute(findRequest);
					// display progress to the user
					mProgress = ProgressDialog.show(this, "Finding Comments", "waiting for results...", true);
					
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_comments_of_picture, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onRequestSuccess(String response) {
		// clear progress indicator
		if(mProgress != null)
		{
			mProgress.dismiss();
		}
		if(userLoaded == true)
		{
			if(pictureLoaded  == true)
			{
				
				listViewComments = (ListView) findViewById(R.id.listViewComments);
				 
				//process the response data and display it
				try
				{
					JSONArray comments = new JSONArray(response);
					String[] values = new String[comments.length()];
					for(int i = 0; i < comments.length();i++)
					{
						JSONObject comment = (JSONObject)comments.get(i);
						JSONObject sender = (JSONObject)comment.getJSONObject("sender");
						String firstName = sender.getString("firstName");
						String lastName = sender.getString("lastName");
						String senderName = firstName + " " + lastName;
						String content = comment.getString("content");
						String dateCreated = comment.getString("dateCreated");
						String item = senderName + " @" + dateCreated+":\n" +content;
						values[i] = item;
					}
					 ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				              android.R.layout.simple_list_item_1, android.R.id.text1, values);
				    
				    
				            // Assign adapter to ListView
					 listViewComments.setAdapter(adapter);
				}
				catch(Exception jsonException)
				{
					jsonException.printStackTrace();
					
				}
			}
			else
			{
				if(mProgress != null)
				{
					mProgress.dismiss();
				}
				try {
					picture = new JSONObject(response);
					JSONObject pictureOwner = picture.getJSONObject("pictureOwner");
					String firstName = pictureOwner.getString("firstName");
					String lastName = pictureOwner.getString("lastName");
					String dateCreated = picture.getString("dateAdded");
					String pictureName = picture.getString("name");
					String pictureDescription  = picture.getString("description");
					String pictureOwnerName = firstName + " " + lastName + " @"+dateCreated;
					textViewpictureOwner = (TextView) findViewById(R.id.pictureOwner);
					textViewpictureOwner.setText(pictureOwnerName);
					textViewpictureName = (TextView) findViewById(R.id.pictureName);
					textViewpictureName.setText(pictureName);
					textViewpictureDescription = (TextView) findViewById(R.id.pictureDescription);
					textViewpictureDescription.setText(pictureDescription);
					
					
					
					pictureLoaded = true;
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}
		else
		{
			try
			{
				commentSender = new JSONObject(response);
			}
			catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			userLoaded = true;
		}
			
		
		
		
		
		
		
	}

	@Override
	public void onRequestError(Exception error) {
		// clear progress indicator
		if(mProgress != null)
		{
			mProgress.dismiss();
		}
		//process the response (Error) data and display it
		error.printStackTrace();
	}
}
