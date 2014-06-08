package com.Model;

import java.io.BufferedReader;
import com.Controllers.*;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;


import android.R;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class IntroductionPageModl {

	
	
	/**
	 * This function will retrive data from remote database for slide table to render slides on splash screen
	 * @param tblName  = slide table name
	 * @return slideData = slide table information about slides
	 */
	
	public ArrayList getSlideDataFromDB (String tblName){  

		ArrayList slideData = new ArrayList();


		String result = "";
		//the year data to send
		ArrayList nameValuePairs = new ArrayList();
		//	nameValuePairs.add(new BasicNameValuePair("year","1980"));

		
		try{
			HttpClient httpclient = new DefaultHttpClient();
			HttpPost httppost = new HttpPost("http://"+Global.serverAdd+"//DBcon.php");     
			httppost.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			HttpResponse response = httpclient.execute(httppost);
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();

			//convert response to string

			BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
			is.close();

			result=sb.toString();


			if(result!=null && !result.equals("")){
				JSONArray jArray = new JSONArray(result);
				for(int i=0;i<jArray.length();i++){
					JSONObject json_data = jArray.getJSONObject(i);
					slideData.add(json_data.getString("Familia"));
				}
			}


		}catch(Exception e){
			e.printStackTrace();
			Log.e("log_tag", "Error parsing data "+e.toString());
		}

		return slideData;
	}



}
