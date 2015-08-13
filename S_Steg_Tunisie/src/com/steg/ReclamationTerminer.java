package com.steg;

import com.steg.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ReclamationTerminer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reclamation_terminer);
		Button quitter = (Button) findViewById(R.id.button1);

		quitter.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(ReclamationTerminer.this,
						MainActivity.class);
				startActivity(i);
				finish();
			}
		});
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK)) {
			finish();
		}
		return super.onKeyDown(keyCode, event);
	}
}
