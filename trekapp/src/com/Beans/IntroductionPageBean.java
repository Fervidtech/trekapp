package com.Beans;

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

public class IntroductionPageBean{

	int perSlideAnimationTime = 0;
	String slideName = "";
	String slideImgPath = "";
	
	/**
	 * @return the slideImgPath
	 */
	public String getSlideImgPath() {
		return slideImgPath;
	}
	/**
	 * @param slideImgPath the slideImgPath to set
	 */
	public void setSlideImgPath(String slideImgPath) {
		this.slideImgPath = slideImgPath;
	}
	/**
	 * @return the perSlideAnimationTime
	 */
	public int getPerSlideAnimationTime() {
		return perSlideAnimationTime;
	}
	/**
	 * @param perSlideAnimationTime the perSlideAnimationTime to set
	 */
	public void setPerSlideAnimationTime(int perSlideAnimationTime) {
		this.perSlideAnimationTime = perSlideAnimationTime;
	}
	/**
	 * @return the slideName
	 */
	public String getSlideName() {
		return slideName;
	}
	/**
	 * @param slideName the slideName to set
	 */
	public void setSlideName(String slideName) {
		this.slideName = slideName;
	}

	

}


