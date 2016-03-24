package com.example.demomap1;

import org.cocos2d.actions.interval.CCIntervalAction;
import org.cocos2d.actions.interval.CCMoveBy;
import org.cocos2d.types.CGPoint;

public class SpriteManual extends SpriteBase {
    @Override
    public void onEnter() {
        super.onEnter();
        
        this.setAnchorPoint(CGPoint.make(0, 0));
        tamara.setScaleX(2.5f);
        tamara.setScaleY(-1.0f);
        tamara.setPosition(CGPoint.make(100, 100));

//        grossini.setContentSize(300,300);
        
        grossini.setScale(1f);
        //Ðý×ª
//        grossini.setRotation(120.0f);
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
