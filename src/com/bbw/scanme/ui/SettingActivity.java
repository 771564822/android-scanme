package com.bbw.scanme.ui;

import java.util.ArrayList;
import java.util.List;

import com.bbw.scanme.R;
import com.bbw.scanme.R.layout;
import com.bbw.scanme.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SettingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		ListView listView = (ListView) findViewById(R.id.favorites_listView);
		listView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1, getData()));
	}

	private List<String> getData() {

		List<String> data = new ArrayList<String>();
		data.add("�ղ��ļ�1");
		data.add("�ղ��ļ�2");
		data.add("�ղ��ļ�3");
		data.add("�ղ��ļ�4");
		data.add("�ղ��ļ�5");
		data.add("�ղ��ļ�6");
		data.add("�ղ��ļ�7");
		data.add("�ղ��ļ�8");
		return data;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.setting, menu);
		return true;
	}

}
