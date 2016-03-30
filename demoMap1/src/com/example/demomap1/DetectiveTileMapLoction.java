package com.example.demomap1;

import android.util.Log;

public class DetectiveTileMapLoction extends Thread{

	boolean flag = false;
	private void debug(String str){
		Log.i("DetectiveTileMapLoction",str);
	}
	public DetectiveTileMapLoction(){}
	public void init(){
		debug("init");
		flag = true;
	}
	public void run(){
		while(flag){
			
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
