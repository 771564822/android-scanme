/**
 * 
 */
package com.bbw.scanme.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

import com.bbw.scanme.R;
import com.bbw.scanme.pojo.FileBean;
import com.bbw.scanme.ui.dialog.DownloadDialog;
import com.bbw.scanme.utils.JsonUtils;

/**
 * @author BBW 扫描后的下载框
 */
public class DownloadActivity extends Activity {
	private DownloadDialog dialog;
	private LinearLayout layout;
	private List<FileBean> beans = new ArrayList<FileBean>();

	/**
	 * 数据初始化
	 */
	private void initData() {
		Bundle extras = getIntent().getExtras();
		String json = extras.getString("result");
		Log.v("V", json);
		this.beans = JsonUtils.convertJson2Bean(json);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.initData();
		setContentView(R.layout.download_layout);
		dialog = new DownloadDialog(this);
		layout = (LinearLayout) findViewById(R.id.download_layout);
		OnClickListener event = new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			}
		};
		layout.setOnClickListener(event);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		finish();
		return true;
	}

}
