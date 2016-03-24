package com.example.demomap1;

import org.cocos2d.events.CCTouchDispatcher;
import org.cocos2d.layers.CCLayer;
import org.cocos2d.menus.CCMenu;
import org.cocos2d.menus.CCMenuItemImage;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCLabel;
import org.cocos2d.opengl.CCTextureAtlas;
import org.cocos2d.types.CGSize;

import android.view.MotionEvent;

public class TileMapBase extends  CCLayer{

        protected CCTextureAtlas atlas;

        public TileMapBase() {
            super();

            this.setIsTouchEnabled(true);

            CGSize s = CCDirector.sharedDirector().winSize();

            CCLabel label = CCLabel.makeLabel(title(), "DroidSans", 24);
            addChild(label, 1);
            label.setPosition(s.width/2, s.height-50);

            String subtitle = subtitle();
            if (subtitle != null) {
                CCLabel l = CCLabel.makeLabel(subtitle, "DroidSerif", 14);
                addChild(l, 1);
                l.setPosition(s.width/2, s.height-80);
            }

            CCMenuItemImage item1 = CCMenuItemImage.item("b1.png", "b2.png", this, "backCallback");
            CCMenuItemImage item2 = CCMenuItemImage.item("r1.png", "r2.png", this, "restartCallback");
            CCMenuItemImage item3 = CCMenuItemImage.item("f1.png", "f2.png", this, "nextCallback");

            CCMenu menu = CCMenu.menu(item1, item2, item3);

            menu.setPosition(0, 0);
            item1.setPosition(s.width/2 - 100,30);
            item2.setPosition(s.width/2, 30);
            item3.setPosition(s.width/2 + 100,30);
            addChild(menu, 1);
        }

        public void registerWithTouchDispatcher() {
            // CCTouchDispatcher.sharedDispatcher().addTargetedDelegate(this, 0, true);
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

//        @Override
//        public boolean ccTouchesMoved(MotionEvent event) {
//        	final int N = event.getHistorySize() - 1;
//        	if (N <= 0)
//        		return true;
//            CGPoint touchLocation = CGPoint.make(event.getX(), event.getY());
//            CGPoint prevLocation = CGPoint.make(event.getHistoricalX(N), event.getHistoricalY(N));
//
//            touchLocation	= CCDirector.sharedDirector().convertToGL(touchLocation);
//            prevLocation	= CCDirector.sharedDirector().convertToGL(prevLocation);
//
//            CGPoint diff = CGPoint.ccpSub(touchLocation, prevLocation);
//
//            CCNode node = getChildByTag(kTagTileMap);
//            CGPoint currentPos = node.getPosition();
//            node.setPosition(CGPoint.ccpAdd(currentPos, diff));
//            return true;
//        }

        public String title() {
            return "No title";
        }

        public String subtitle() {
            return "drag the screen";
        }
}
