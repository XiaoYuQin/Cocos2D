package qinxiaoyu.CarKlit;

import org.cocos2d.actions.interval.CCIntervalAction;
import org.cocos2d.actions.interval.CCMoveBy;
import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;
import org.cocos2d.types.CGPoint;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class DemoSimpleMap1 extends Activity {
	
	
	
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
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON,
                    WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

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
            
            TMXIsoZorder tMXIsoZorder = new TMXIsoZorder();
            scene.addChild(tMXIsoZorder);
            
            CCIntervalAction actionBy1 = CCMoveBy.action(2, CGPoint.make(1000, 0));
            tMXIsoZorder.runAction(actionBy1);

            

            // Make the Scene active
            CCDirector.sharedDirector().runWithScene(scene);
            
            
            
//			Handler handler = new Handler();  
//			handler.postDelayed(new Runnable() {  
//				    					 
//				public void run() {  
//					scene.addChild(new TMXIsoZorder());
//				}  
//			}, 3000);  
			
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
