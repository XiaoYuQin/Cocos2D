package com.example.demomap1;

import org.cocos2d.config.ccMacros;
import org.cocos2d.layers.CCTMXTiledMap;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGSize;

import android.util.Log;

public class TMXIsoZorder extends TileMapBase{
    CCSprite tamara;

    
    private static void debug(String str){
    	Log.i("TileMapTest",str);
    }
    
    public TMXIsoZorder() {
        super();

//        CCTMXTiledMap map = CCTMXTiledMap.tiledMap("iso-test-zorder.tmx");
      CCTMXTiledMap map = CCTMXTiledMap.tiledMap("hexa-test.tmx");
      	debug("CCTMXTiledMap");
//        addChild(map, 0, kTagTileMap);
      	addChild(map, 0);
      	
        CCTMXTiledMap map1 = CCTMXTiledMap.tiledMap("iso-test1.tmx");
      	debug("CCTMXTiledMap");
      	addChild(map1, 0);
      	map1.setPosition(500,500);
      	
        debug("addChild(map, 0, kTagTileMap)");
//        map.setPosition(-1000,-50);
        CGSize s = map.getContentSize(); 
//        ccMacros.CCLOG(LOG_TAG, "ContentSize: " + s.width + "," + s.height);

//        tamara = CCSprite.sprite("grossinis_sister1.png");
//        int z = (map.getChildren()!=null?map.getChildren().size():0);
//        map.addChild(tamara, z);
//        int mapWidth = (int) (map.getMapSize().width * map.getTileSize().width);
//        tamara.setPosition( mapWidth/2, 0);
//        tamara.setAnchorPoint(0.5f, 0);
//
//        CCMoveBy move = CCMoveBy.action(10, CGPoint.ccp(300,250));
//        CCMoveBy back = move.reverse();
//        CCSequence seq = CCSequence.actions(move, back);
//        tamara.runAction(CCRepeatForever.action(seq));

        schedule("repositionSprite");
    }

    public void repositionSprite(float dt) {
//        CGPoint p = tamara.getPosition();
//        CCNode map = getChildByTag(kTagTileMap);
//
//        // there are only 4 layers. (grass and 3 trees layers)
//        // if tamara < 48, z=4
//        // if tamara < 96, z=3
//        // if tamara < 144,z=2
//
//        int newZ = (int) (4 - (p.y / 48));
//        newZ = (newZ > 0 ? newZ : 0);
//
//        map.reorderChild(tamara, newZ);
    }

    public String title() {
        return "TMX Iso Zorder";
    }

    public String subtitle() {
        return "Sprite should hide behind the trees";
    }

}
