package com.bbw.scanme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.LinearLayout;

import com.bbw.scanme.ui.FileActivity;
import com.bbw.scanme.ui.SettingActivity;
import com.bbw.scanme.zxing.CaptureActivity;

public class MainActivity extends Activity {
	 private LinearLayout cameraRow, fileRow, settingRow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		cameraRow = (LinearLayout)findViewById(R.id.camera_row);
		cameraRow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, CaptureActivity.class);
                startActivity(i);
            }
        });
		fileRow = (LinearLayout)findViewById(R.id.file_row);
		fileRow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, FileActivity.class);
                startActivity(i);
            }
        });
		settingRow = (LinearLayout)findViewById(R.id.setting_row);
		settingRow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(i);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
