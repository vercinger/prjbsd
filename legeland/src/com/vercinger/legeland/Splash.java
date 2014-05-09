package com.vercinger.legeland;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;

public class Splash extends Activity{
	
	MediaPlayer dsbLyd;

	@Override
	protected void onCreate(Bundle someShitAboutTravis) {
		// TODO Auto-generated method stub
		
		super.onCreate(someShitAboutTravis);
		setContentView(R.layout.splash);
		
		dsbLyd = MediaPlayer.create(Splash.this, R.raw.udkald2);
		dsbLyd.start();
		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(5000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openMain = new Intent("com.vercinger.legeland.MAINACTIVITY");
					startActivity(openMain);
				}
			}
		};
		
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		dsbLyd.release();
		finish();
	}
	

}
