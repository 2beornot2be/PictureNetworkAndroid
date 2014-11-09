package com.esprit.picturenetwork.tools.delegates;

import java.io.IOException;
import java.lang.ref.WeakReference;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class RestTaskPOST extends AsyncTask<HttpUriRequest, Void,String> 
{
	private static final String TAG = "RestTask";
	public interface ResponseCallback
	{
		public void onRequestSuccess(String response);
		public void onRequestError(Exception error);
	}
	private AbstractHttpClient mClient;
	private WeakReference<ResponseCallback> mCallback;
	
	public RestTaskPOST() {
		this(new DefaultHttpClient());
	}
	public RestTaskPOST(AbstractHttpClient client)
	{
		mClient = client;
	}
	public void setResponseCallback(ResponseCallback callback)
	{
		mCallback = new WeakReference<ResponseCallback>(callback);
	}
	

	@Override
	protected String doInBackground(HttpUriRequest... params) {
		// TODO Auto-generated method stub
		try
		{
			HttpUriRequest request = params[0];
			HttpResponse serverResponse = mClient.execute(request);
			BasicResponseHandler handler = new BasicResponseHandler();
			String response = handler.handleResponse(serverResponse);
			System.out.println("reponse post: " + response);
			return  response;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("not ok post");
			return "not ok";
		}
	}
	
	

}
