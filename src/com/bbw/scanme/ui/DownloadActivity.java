/**
 * 
 */
package com.bbw.scanme.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import com.bbw.scanme.R;
import com.bbw.scanme.ui.dialog.DownloadDialog;

/**
 * @author BBW
 *	É¨ÃèºóµÄÏÂÔØ¿ò
 */
public class DownloadActivity extends Activity {
	private DownloadDialog dialog;
	private LinearLayout layout;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.download_layout);
		dialog=new DownloadDialog(this);
		layout=(LinearLayout)findViewById(R.id.download_layout);
		OnClickListener event=new OnClickListener(){
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}};
		layout.setOnClickListener( event);
	}
	@Override
	public boolean onTouchEvent(MotionEvent event){
		finish();
		return true;
	}

}
