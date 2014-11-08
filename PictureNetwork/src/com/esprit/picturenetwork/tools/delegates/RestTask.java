package com.esprit.picturenetwork.tools.delegates;

import java.io.IOException;
import java.lang.ref.WeakReference;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class RestTask extends AsyncTask<HttpUriRequest, Void,Object> 
{
	private static final String TAG = "RestTask";
	public interface ResponseCallback
	{
		public void onRequestSuccess(String response);
		public void onRequestError(Exception error);
	}
	private AbstractHttpClient mClient;
	private WeakReference<ResponseCallback> mCallback;
	
	public RestTask() {
		this(new DefaultHttpClient());
	}
	public RestTask(AbstractHttpClient client)
	{
		mClient = client;
	}
	public void setResponseCallback(ResponseCallback callback)
	{
		mCallback = new WeakReference<ResponseCallback>(callback);
	}
	

	@Override
	protected Object doInBackground(HttpUriRequest... params) {
		// TODO Auto-generated method stub
		try
		{
			HttpUriRequest request = params[0];
			HttpResponse serverResponse = mClient.execute(request);
			BasicResponseHandler handler = new BasicResponseHandler();
			String response = handler.handleResponse(serverResponse);
			return response;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return e;
		}
	}
	@Override
	protected void onPostExecute(Object result)
	{
		if(mCallback != null && mCallback.get() != null)
		{
			final ResponseCallback callback = mCallback.get();
			if(result instanceof String)
			{
				callback.onRequestSuccess((String) result);
			}
			else if(result instanceof Exception)
			{
				callback.onRequestError((Exception) result);
			}
			else
			{
				callback.onRequestError(new IOException("Unknwon Error Contacting Host"));
			}
		}
	}

}
