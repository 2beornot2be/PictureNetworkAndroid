package com.esprit.picturenetwork;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class PictureNetwork extends Activity {
	public final static String PICTURE_ID = "com.esprit.picturenetwork.picture.id";
	public final static String USER_ID = "com.esprit.picturenetwork.user.id"; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_picture_network);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.picture_network, menu);
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
	public void listComments(View view) {
	    Intent intent = new Intent(this, ListCommentsOfPictureActivity.class);
	    //id de l'image
	    String message = "1";
	    // id du user
	    String userId = "1";
	    intent.putExtra(USER_ID, userId);
	    intent.putExtra(PICTURE_ID, message);
	    startActivity(intent);
	}
}
