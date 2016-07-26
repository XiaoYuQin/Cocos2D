package qinxiaoyu.CarKlit;

import org.cocos2d.layers.CCScene;
import org.cocos2d.layers.CCTMXTiledMap;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.opengl.CCGLSurfaceView;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class DemoSimpleMap1 extends Activity {
	
	TMXIsoZorder tMXIsoZorder;
	

	
    public static final String LOG_TAG = DemoSimpleMap1.class.getSimpleName();
    CCScene scene;
    
    
 
    private CCGLSurfaceView mGLSurfaceView;

    private static void debug(String str){
    	Log.i("TileMapTest",str);
    }
    
    
    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

            debug("onCreate");
            
            mGLSurfaceView = new CCGLSurfaceView(this);
            setContentView(mGLSurfaceView);


            // attach the OpenGL view to a window
            CCDirector.sharedDirector().attachInView(mGLSurfaceView);
 
            // set landscape mode
            CCDirector.sharedDirector().setLandscape(false);

            // show FPS 
            CCDirector.sharedDirector().setDisplayFPS(true);

            // frames per second
            CCDirector.sharedDirector().setAnimationInterval(1.0f / 30);

            scene = CCScene.node();  
            
            tMXIsoZorder = new TMXIsoZorder();
            scene.addChild(tMXIsoZorder);
            
//            CCTMXTiledMap map1 = CCTMXTiledMap.tiledMap("orthogonal-test-movelayer.tmx");
//    		
//    		
//    		debug("CCTMXTiledMap");
//    		scene.addChild(map1,0);
//    		map1.setPositionScreenCenter();
            
            
            
//            SpriteManual SpriteManual = new SpriteManual();
//            scene.addChild(SpriteManual);
            
//            CCSprite grossini = CCSprite.sprite("grossini.png");
//            scene.addChild(grossini);
//            grossini.setPosition(CGPoint.make(320,240));
//            
//            CCSprite grossini2 = CCSprite.sprite("grossini.png");
//            scene.addChild(grossini2);
//            grossini2.setPosition(CGPoint.make(960,560));
//            
//            debug("addChild(tMXIsoZorder)");
            
             
            
//            CCIntervalAction actionBy1 = CCMoveBy.action(2, CGPoint.make(1000, 0));
//            tMXIsoZorder.runAction(actionBy1);

            

            // Make the Scene active
            CCDirector.sharedDirector().runWithScene(scene);
            
            
            
//          new Thread(new Runnable(){
//  			boolean flag = true;    
//  			@Override
//  			public void run() {  
//  				
//  				CGSize s = CCDirector.sharedDirector().winSize();
//  				debug("x = "+s.getHeight()/2+" y = "+s.getWidth()/2);
//  				
//  				while(flag){
//  					
//  					try {
//  						
//  						debug("x = "+tMXIsoZorder.getPosition().x+" y = "+tMXIsoZorder.getPosition().y);
//  						tMXIsoZorder.rspPostition(tMXIsoZorder.getPosition().x,tMXIsoZorder.getPosition().y);
//  						
//  						Thread.sleep(100);
//  					} catch (InterruptedException e) {
//  						// TODO Auto-generated catch block
//  						e.printStackTrace();
//  					}					
//  				}
//  			}
//  
//          }).start();
			
		}

    @Override
        public void onStart() {
            super.onStart();
        }

    @Override
        public void onPause() {
            super.onPause();

            CCDirector.sharedDirector().onPause();
        }

    @Override
        public void onResume() {
            super.onResume();

            CCDirector.sharedDirector().onResume();
        }

    @Override
        public void onDestroy() {
            super.onDestroy();

            CCDirector.sharedDirector().end();
        }


}
