package com.bbw.scanme.ui;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bbw.scanme.R;

public class FileActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_file);
		ListView listView = (ListView)findViewById(R.id.file_listView);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked,getData())); 

	}
	private List<String> getData(){ 
        
        List<String> data = new ArrayList<String>(); 
        data.add("测试文件1"); 
        data.add("测试文件2"); 
        data.add("测试文件3"); 
        data.add("测试文件4"); 
        data.add("测试文件5"); 
        data.add("测试文件6"); 
        data.add("测试文件7"); 
        data.add("测试文件8");
        return data; 
    } 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.file, menu);
		return true;
	}

}
