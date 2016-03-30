package com.example.demomap1;

import org.cocos2d.events.CCTouchDispatcher;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCTextureAtlas;
import org.cocos2d.types.CGPoint;
import android.util.Log;
import android.view.MotionEvent;

public class TileMapBase extends  CCLayer{

		/*是否已经作为子瓦片插入到其它的层中*/
		boolean isAddAsChild = false;
		/*是否已经设置了瓦片地图位置*/
		boolean isSetPostaion = false;
					
        protected CCTextureAtlas atlas;

        
        private static void debug(String str){
        	Log.i("TileMapBase",str);
        }
        
        public TileMapBase() {
            super();
            this.setIsTouchEnabled(true);
        }

        public void registerWithTouchDispatcher() {
        	CCTouchDispatcher.sharedDispatcher().addDelegate(this, 0);
        }

        @Override
        public boolean ccTouchesBegan(MotionEvent event) {
            return true;
        }

        @Override
        public boolean ccTouchesEnded(MotionEvent event) {
		return false;
        }

        @Override
        public boolean ccTouchesCancelled(MotionEvent event) {
		return false;
        }

        @Override
        public boolean ccTouchesMoved(MotionEvent event) {
        	final int N = event.getHistorySize()-1;
        	if (N <= 1)
        		return true;
            CGPoint touchLocation = CGPoint.make(event.getX(), event.getY());
            
            CGPoint prevLocation = CGPoint.make(event.getHistoricalX(N-1), event.getHistoricalY(N-1));
//            debug("N= "+N+"  "+event.getHistoricalX(N)+"-->"+event.getX()+"   "+event.getHistoricalY(N)+"-->"+event.getY());
            touchLocation	= CCDirector.sharedDirector().convertToGL(touchLocation);
            prevLocation	= CCDirector.sharedDirector().convertToGL(prevLocation);
            CGPoint diff = CGPoint.ccpSub(touchLocation, prevLocation);
            
            CGPoint currentPos = this.getPosition();
            this.setPosition(CGPoint.ccpAdd(currentPos, diff));
            return true;
        }

        public String title() {
            return "No title";
        }

        public String subtitle() {
            return "drag the screen";
        }
        
        
        public boolean getIsAddAsChildFlag(){
        	return this.isAddAsChild;
        }
        public boolean getIsSetPostaionFlag(){
        	return this.isSetPostaion;
        }
}
