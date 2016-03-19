package com.example.demomap1;

import org.cocos2d.actions.interval.CCIntervalAction;
import org.cocos2d.actions.interval.CCMoveBy;
import org.cocos2d.actions.interval.CCMoveTo;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.layers.CCScene;
import org.cocos2d.menus.CCMenu;
import org.cocos2d.menus.CCMenuItemImage;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCLabel;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.opengl.CCGLSurfaceView;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends Activity {

    private CCGLSurfaceView mGLSurfaceView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);

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

         CCScene scene = CCScene.node();
         scene.setAnchorPoint(CGPoint.make(0, 0));
         scene.addChild(new SpriteManual());
         
         //SpriteManual spriteManual = new SpriteManual();
         
//         scene.addChild(spriteManual);

         // Make the Scene active
         CCDirector.sharedDirector().runWithScene(scene);
	}
	

    static abstract class SpriteDemo extends CCLayer {

        CCSprite grossini; 
        CCSprite tamara;

        public SpriteDemo() {
            CGSize s = CCDirector.sharedDirector().winSize();

            /*状态栏是这样实现的*/
//            CCLabel label = CCLabel.makeLabel(title(), "DroidSans", 24);
//            label.setPosition(CGPoint.make(s.width / 2, s.height / 2));
//            addChild(label);

            // TODO
            // Example:
            // You can create a sprite using a Texture2D
//            Texture2D tex = new Texture2D("grossini.png");
            grossini = CCSprite.sprite("grossini.png");


            // Example:
            // Or you can create an sprite using a filename. PNG, JPEG and BMP files are supported. Probably TIFF too
            tamara = CCSprite.sprite("grossinis_sister1.png");

            addChild(grossini, 1);
            // addChild(tamara, 2);

            grossini.setPosition(CGPoint.make(60, s.height / 3));
            // tamara.setPosition(CGPoint.make(60, 2 * s.height / 3));

            /*菜单栏是这样实现的*/
//            CCMenuItemImage item1 = CCMenuItemImage.item("b1.png", "b2.png", this, "backCallback");
//            CCMenuItemImage item2 = CCMenuItemImage.item("r1.png", "r2.png", this, "restartCallback");
//            CCMenuItemImage item3 = CCMenuItemImage.item("f1.png", "f2.png", this, "nextCallback");

//            CCMenu menu = CCMenu.menu(item1, item2, item3);
//            menu.setPosition(CGPoint.make(0, 0));
//            item1.setPosition(CGPoint.make(s.width / 2 - 100, 30));
//            item2.setPosition(CGPoint.make(s.width / 2, 30));
//            item3.setPosition(CGPoint.make(s.width / 2 + 100, 30));
//            addChild(menu, 1);
        }


        protected void centerSprites() {
            CGSize s = CCDirector.sharedDirector().winSize();

            grossini.setPosition(CGPoint.make(s.width / 3, s.height / 2));
            // tamara.setPosition(CGPoint.make(2 * s.width / 3, s.height / 2));
        }
        protected abstract String title();
    }
	
    

    static class SpriteManual extends SpriteDemo {

        @Override
        public void onEnter() {
            super.onEnter();
            
            this.setAnchorPoint(CGPoint.make(0, 0));
            tamara.setScaleX(2.5f);
            tamara.setScaleY(-1.0f);
            tamara.setPosition(CGPoint.make(100, 100));

//            grossini.setContentSize(300,300);
            
            grossini.setScale(25.1f);
            //旋转
//            grossini.setRotation(120.0f);
            grossini.setOpacity(128);
            grossini.setPosition(CGPoint.make(240, 160));
            
            CCIntervalAction actionBy = CCMoveBy.action(2, CGPoint.make(80, 80));
            grossini.runAction(actionBy);
        }

        @Override
        public String title() {
            return "Manual Transformation";
        }
    }
	
	
}
