package qinxiaoyu.CarKlit;

import org.cocos2d.layers.CCTMXTiledMap;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGSize;

import android.util.Log;

public class TMXIsoZorder extends TileMapBase{
    CCSprite tamara;

    
    float x;
    float y;
    
    float scale = 3f;
    
    private static void debug(String str){
    	Log.i("TileMapTest",str);
    }
    
    public TMXIsoZorder() {
        super();

//        CCTMXTiledMap map = CCTMXTiledMap.tiledMap("iso-test-zorder.tmx");
//      CCTMXTiledMap map = CCTMXTiledMap.tiledMap("hexa-test.tmx");
//      	debug("CCTMXTiledMap");
////        addChild(map, 0, kTagTileMap);
//      	addChild(map, 0);
        
        CGSize s = CCDirector.sharedDirector().winSize();
      	

        

        
		CCTMXTiledMap map1 = CCTMXTiledMap.tiledMap("DemoMap_1.tmx");
		map1.setScale(scale);
		
		debug("CCTMXTiledMap");
		addChild(map1, 0);
		map1.setPositionScreenCenter();

		
		
		CCTMXTiledMap map2 = CCTMXTiledMap.tiledMap("DemoMap_2.tmx");
		map2.setScale(scale);
		addChild(map2, 0);
		map2.setPositionLeftBelow(map1);


		
	
		CCTMXTiledMap map3 = CCTMXTiledMap.tiledMap("DemoMap_3.tmx");
		debug("CCTMXTiledMap");
		map3.setScale(scale);
		addChild(map3);
		map3.setPositionRightBelow(map1);

		CCTMXTiledMap map4 = CCTMXTiledMap.tiledMap("DemoMap_4.tmx");
		map4.setScale(scale);
		addChild(map4);
		map4.setPositionRightAbove(map1);
      	
		CCTMXTiledMap map5 = CCTMXTiledMap.tiledMap("DemoMap_5.tmx");
		map5.setScale(scale);
		debug("CCTMXTiledMap");
		addChild(map5);
		map5.setPositionLeftAbove(map1);
      	
		//上方
		CCTMXTiledMap map6 = CCTMXTiledMap.tiledMap("DemoMap_6.tmx");
		map6.setScale(scale);
		debug("CCTMXTiledMap");
		addChild(map6);
		map6.setPositionAbove(map1);
		
		//下方
		CCTMXTiledMap map7 = CCTMXTiledMap.tiledMap("DemoMap_7.tmx");
		map7.setScale(scale);
		debug("CCTMXTiledMap");
		addChild(map7);
		map7.setPositionBelow(map1);
		
		//右方
		CCTMXTiledMap map8 = CCTMXTiledMap.tiledMap("DemoMap_8.tmx");
		map8.setScale(scale);
		debug("CCTMXTiledMap");
		addChild(map8);
		map8.setPositionLeft(map1);
		//左方
		CCTMXTiledMap map9 = CCTMXTiledMap.tiledMap("DemoMap_9.tmx");
		map9.setScale(scale);
		debug("CCTMXTiledMap");
		addChild(map9);
		map9.setPositionRight(map1);
		
		
      	
        debug("addChild(map, 0, kTagTileMap)");
//        map.setPosition(-1000,-50);
//        CGSize s = map.getContentSize(); 
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
