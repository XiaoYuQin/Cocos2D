package com.example.demomap1;

import org.cocos2d.layers.CCTMXTiledMap;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.nodes.CCSprite;
import org.cocos2d.types.CGPoint;
import org.cocos2d.types.CGSize;

import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;

public class TMXIsoZorder extends TileMapBase{
    CCSprite tamara;

    

    private final static int maxMapWidth = 100;
    
    float scale = 1f;
    
    CCTMXTiledMap map1;
//    CCTMXTiledMap map2;
//    CCTMXTiledMap map3;
//    CCTMXTiledMap map4;
//    CCTMXTiledMap map5;
//    CCTMXTiledMap map6;
//    CCTMXTiledMap map7;
//    CCTMXTiledMap map8;
//    CCTMXTiledMap map9;
    
    
	private CCTMXTiledMap[][] maps;
    
    private static void debug(String str){
    	Log.i("TileMapTest",str);
    }
    
    public TMXIsoZorder() {
        super();
        
        CGSize s = CCDirector.sharedDirector().winSize();
        debug(s.height+"   "+s.width);

      	
//        maps = new CCTMXTiledMap[maxMapWidth][maxMapWidth];
//        debug("maps = new CCTMXTiledMap[3][3];");
//        maps[0][0] = CCTMXTiledMap.tiledMap("DemoMap_1.tmx");
//        maps[0][1] = CCTMXTiledMap.tiledMap("DemoMap_2.tmx");
//        maps[0][2] = CCTMXTiledMap.tiledMap("DemoMap_3.tmx");
//
//        maps[1][0] = CCTMXTiledMap.tiledMap("DemoMap_4.tmx");
//        maps[1][1] = CCTMXTiledMap.tiledMap("DemoMap_5.tmx");
//        maps[1][2] = CCTMXTiledMap.tiledMap("DemoMap_6.tmx");
//        
//        maps[2][0] = CCTMXTiledMap.tiledMap("DemoMap_7.tmx"); 
//        maps[2][1] = CCTMXTiledMap.tiledMap("DemoMap_8.tmx");
//        maps[2][2] = CCTMXTiledMap.tiledMap("DemoMap_9.tmx");
        
        
        
//        for(int x=0;x<maxMapWidth;x++){
//        	for(int y=0;y<maxMapWidth;y++){
//        		
//        		maps[x][y] =  CCTMXTiledMap.tiledMap("DemoMap_1.tmx");
//        		maps[x][y].setScale(scale);
//        		addChild(maps[x][y] , 0);
//        		maps[x][y].setVisible(false);
//        		
//        	}
//        }
//        debug("load all tailMaps");  
//        
//        setTileMapAround(1,1);
        
//        debug("x = "+maps[2][2].getPosition().x+" y = "+maps[2][2].getPosition().y);
//        debug("x = "+maps[1][1].get45LeftPoint().x+" y = "+maps[1][1].get45LeftPoint().y);
//        debug("x1 = "+maps[1][1].getRect().origin.x
//    		+" y1 = "+maps[1][1].getRect().origin.y
//    		+" x2 = "+maps[1][1].getRect().size.width
//    		+" y2 = "+maps[1][1].getRect().size.height);
        
        
        
//        new Thread(new Runnable(){
//			boolean flag = true;    
//			@Override
//			public void run() {  
//				 
//				CGSize s = CCDirector.sharedDirector().winSize();
//				debug("x = "+s.getHeight()/2+" y = "+s.getWidth()/2);
//				
//				while(flag){
//					
//					try {						
////						debug("x = "+maps[2][2].getPosition().x+" y = "+maps[2][2].getPosition().y);
////						tMXIsoZorder.rspPostition(tMXIsoZorder.getPosition().x,tMXIsoZorder.getPosition().y);						
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}					
//				}
//			}
//   
//        }).start();  
//          
//           
		debug("2222");  
		map1 = CCTMXTiledMap.tiledMap("orthogonal-test-movelayer.tmx");   
//		map1 = CCTMXTiledMap.tiledMap("DemoMap_1.tmx");
		
//		map1.setScale(scale); 
		
		debug("CCTMXTiledMap");
		addChild(map1, 0);
		map1.setPositionScreenCenter(); 
//
//		
//		
//		map2 = CCTMXTiledMap.tiledMap("DemoMap_2.tmx");
//		map2.setScale(scale);
//		addChild(map2, 0);
//		map2.setPositionLeftBelow(map1);
//
//
//		
//	
//		map3 = CCTMXTiledMap.tiledMap("DemoMap_3.tmx");
//		debug("CCTMXTiledMap");
//		map3.setScale(scale);
//		addChild(map3);
//		map3.setPositionRightBelow(map1);
//
//		map4 = CCTMXTiledMap.tiledMap("DemoMap_4.tmx");
//		map4.setScale(scale);
//		addChild(map4);
//		map4.setPositionRightAbove(map1);
//      	
//		map5 = CCTMXTiledMap.tiledMap("DemoMap_5.tmx");
//		map5.setScale(scale);
//		debug("CCTMXTiledMap");
//		addChild(map5);
//		map5.setPositionLeftAbove(map1);
//      	
//		//上方
//		map6 = CCTMXTiledMap.tiledMap("DemoMap_6.tmx");
//		map6.setScale(scale);
//		debug("CCTMXTiledMap");
//		addChild(map6);
//		map6.setPositionAbove(map1);
//		
//		//下方
//		map7 = CCTMXTiledMap.tiledMap("DemoMap_7.tmx");
//		map7.setScale(scale);
//		debug("CCTMXTiledMap");
//		addChild(map7);
//		map7.setPositionBelow(map1);
//		
//		//右方
//		map8 = CCTMXTiledMap.tiledMap("DemoMap_8.tmx");
//		map8.setScale(scale);
//		debug("CCTMXTiledMap");
//		addChild(map8);
//		map8.setPositionLeft(map1);
//		//左方
//		map9 = CCTMXTiledMap.tiledMap("DemoMap_9.tmx");
//		map9.setScale(scale);
//		debug("CCTMXTiledMap");
//		addChild(map9);
//		map9.setPositionRight(map1);
////		debug("map9 visable = "+map9.get);
		
	
		
      	
        debug("addChild(map, 0, kTagTileMap)");


        schedule("repositionSprite");
        
//        new Thread(new Runnable(){
//			boolean flag = true;    
//			public void setFlag(boolean flag){
//				this.flag = flag;
//			}
//			@Override
//			public void run() {  
//				
//				CGSize s = CCDirector.sharedDirector().winSize();
//				debug("x = "+s.getHeight()/2+" y = "+s.getWidth()/2);
//				
//				while(flag){
//					
//					try {
//						
////						debug("x = "+map1.getPosition().x+" y = "+map1.getPosition().y);
//						
//						
//						Thread.sleep(100);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}					
//				}
//			}
//
//        }).start();
        

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
    @Override
    public boolean ccTouchesMoved(MotionEvent event) {
    	final int N = event.getHistorySize()-1;
    	if (N <= 1)
    		return true;
        CGPoint touchLocation = CGPoint.make(event.getX(), event.getY());
        
        CGPoint prevLocation = CGPoint.make(event.getHistoricalX(N-1), event.getHistoricalY(N-1));
//        debug("N= "+N+"  "+event.getHistoricalX(N)+"-->"+event.getX()+"   "+event.getHistoricalY(N)+"-->"+event.getY());
        touchLocation	= CCDirector.sharedDirector().convertToGL(touchLocation);
        prevLocation	= CCDirector.sharedDirector().convertToGL(prevLocation);
        CGPoint diff = CGPoint.ccpSub(touchLocation, prevLocation);
        
        CGPoint currentPos = this.getPosition();
        this.setPosition(CGPoint.ccpAdd(currentPos, diff));
        
//        debug("x = "+map1.getPosition().x+" y = "+map1.getPosition().y);
        
        return true;
    }
    
    /**其它线程汇报当前屏幕中央位置，检测当前中心位置在哪片瓦片上，当中心在，某片瓦片地图上是，刷新该瓦片周围的8片瓦片地图*/
    public void rspPostition(float x,float y){
    	//循环查询
    	
    	
    	
    }
    /*设定一块地图及其周边的8格地图的位置
     * */
    private void setTileMapAround(int x,int y){
    	maps[x][y].setPositionScreenCenter();
    	maps[x][y].setVisible(true);
    	if(x>=1&&y>=1){
    		//设置在这块地图之下的地图
    		maps[x][y+1].setPositionBelow(maps[x][y]);
    		maps[x][y+1].setVisible(true);
    		//设置在这块地图上方的地图
    		maps[x][y-1].setPositionAbove(maps[x][y]);
    		maps[x][y-1].setVisible(true);
    		//设置在这块地图左侧的地图
    		maps[x-1][y].setPositionLeft(maps[x][y]);
    		maps[x-1][y].setVisible(true);
    		//设置在这块地图右侧的地图
    		maps[x+1][y].setPositionRight(maps[x][y]);
    		maps[x+1][y].setVisible(true);
    		//设置在这块地图右上侧的地图
    		maps[x+1][y-1].setPositionRightAbove(maps[x][y]);
    		maps[x+1][y-1].setVisible(true);
    		//设置在这块地图右下侧的地图
    		maps[x+1][y+1].setPositionRightBelow(maps[x][y]);
    		maps[x+1][y+1].setVisible(true);
    		//设置在这块地图左上侧的地图
    		maps[x-1][y-1].setPositionLeftAbove(maps[x][y]);
    		maps[x-1][y-1].setVisible(true);
    		//设置在这块地图左下侧的地图
    		maps[x-1][y+1].setPositionLeftBelow(maps[x][y]);
    		maps[x-1][y+1].setVisible(true);
    	}
    }
    
    
}
