package com.example.testkeyboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends Activity {

	private MyKeyboard test_linearLayout;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		test_linearLayout=(MyKeyboard) findViewById(R.id.test_linearLayout);
		test_linearLayout.setInputOver(new MyKeyboard.InputFinishListener() {
			
			@Override
			public void inputHasOver(String text) {
				Toast.makeText(MainActivity.this, text, 3000).show();
			}
		});
		
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		
		return super.onTouchEvent(event);
	}

	
	
}
