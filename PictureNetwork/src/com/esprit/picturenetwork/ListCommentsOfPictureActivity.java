package com.esprit.picturenetwork;

import org.apache.http.client.methods.HttpGet;
import org.json.JSONArray;
import org.json.JSONObject;

import com.esprit.picturenetwork.tools.delegates.CommentsDelegate;
import com.esprit.picturenetwork.tools.delegates.RestTask;
import com.esprit.picturenetwork.tools.delegates.RestTask.ResponseCallback;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.*;

public class ListCommentsOfPictureActivity extends Activity implements ResponseCallback 
{
	
	private ProgressDialog mProgress;
	private ListView listViewComments;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_comments_of_picture);
		
		
		
		Intent intent = getIntent();
		String messageId = intent.getStringExtra(PictureNetwork.EXTRA_MESSAGE);
		//GET
		try
		{
			
			String url = CommentsDelegate.findCommentsOfPictureByPictureIdUrl + messageId;
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
				String item = senderName + " " + dateCreated+": " +content;
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
