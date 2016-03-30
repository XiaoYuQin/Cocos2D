package com.example.demomap1;

import org.cocos2d.layers.CCLayer;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

public class SpriteBase extends CCLayer {

	        CCSprite grossini; 
	        CCSprite tamara;
	 
	        public SpriteBase() {

	        	
//	            CCTMXTiledMap map = CCTMXTiledMap.tiledMap("orthogonal-test-zorder.tmx");
//	            addChild(map, 0, 12);
//	            map.setPosition(0,0);
	            
	            CGSize s = CCDirector.sharedDirector().winSize();

	            grossini = CCSprite.sprite("1.png");
	            tamara = CCSprite.sprite("grossinis_sister1.png");

	            addChild(grossini, 1);
	            grossini.setPosition(CGPoint.make(60, s.height / 3));
	        }


	        protected void centerSprites() {
	            CGSize s = CCDirector.sharedDirector().winSize();

	            grossini.setPosition(CGPoint.make(s.width / 3, s.height / 2));
	            // tamara.setPosition(CGPoint.make(2 * s.width / 3, s.height / 2));
	        }
	        protected String title() {
				return null;
			}
}
		

	  


