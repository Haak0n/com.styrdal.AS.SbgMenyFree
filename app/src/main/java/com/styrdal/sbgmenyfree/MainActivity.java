package com.styrdal.sbgmenyfree;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends ActionBarActivity
{

	public final static String EXTRA_MESSAGE = "com.styrdal.SbgMeny.MESSAGE";
	public static final String PREFS_NAME = "PrefsFile";
	protected static final String TAG = "MainActivity";

	private View myFragment;

	private AdView adView;
	private String adUnitId = "ca-app-pub-6095611948758304/4308520274";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		adView = (AdView) findViewById(R.id.main_adView);

		AdRequest adRequest = new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).addTestDevice("F612D0D385B3CF6780BF9DC4CE1F0451").build();
		adView.loadAd(adRequest);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		Log.e(TAG, "Inflating menu");
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}