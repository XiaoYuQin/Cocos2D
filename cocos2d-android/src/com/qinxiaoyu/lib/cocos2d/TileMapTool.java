package com.qinxiaoyu.lib.cocos2d;

import org.cocos2d.layers.CCTMXTiledMap;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.types.CGSize;

public class TileMapTool {

	/*
	 * 设置瓦片地图在屏幕中心
	 * */
	public static void setTileMapScreenCenter(CCTMXTiledMap map1){
		CGSize s = CCDirector.sharedDirector().winSize();
		float x = s.getWidth()/2-map1.getTileSize().getWidth()*map1.getMapSize().getWidth()/2;
		float y = s.getHeight()/2-map1.getTileSize().getHeight()*map1.getMapSize().getHeight()/2;
		map1.setPosition(x,y);		
	}
	
	
}
