package com.Controllers;


import java.util.ArrayList;

import android.R;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import com.Model.*;

public class IntroductionPageCtrl extends Activity {

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.);

		
		// Get slide data
		IntroductionPageModl introObj = new IntroductionPageModl();
		ArrayList slideData = introObj.getSlideDataFromDB("tbl_Intro_Slides");
		
		
		for (int i = 0; i < slideData.size(); i++) {
			//Render slide data page with data from database table tbl_Intro_Slides.
			
			
		}
		
		
	}

	

}
