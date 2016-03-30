package org.cocos2d.actions.interval;

import org.cocos2d.nodes.CCNode;
import org.cocos2d.types.CGPoint;

//
// MoveTo
//

/** Moves a CCNode object to the position x,y. x and y are absolute coordinates by modifying it's position attribute.
*/
public class CCMoveTo extends CCIntervalAction {
    private CGPoint endPosition;
    private CGPoint startPosition;
    protected CGPoint delta;

    /** creates the action 
     * 用持续时间和二维世界目标位置创建MoveTo动作。
     * 
     * 		参数
     * 		duration	持续时间，以秒为单位。
     * 		position	二维世界的目标位置。
     * 		返回
     * 		一个自释放的MoveTo对象。
     * */
    public static CCMoveTo action(float t, CGPoint pos) {
        return new CCMoveTo(t, pos);
    }

    /** initializes the action */
    protected CCMoveTo(float t, CGPoint pos) {
        super(t);
        startPosition = CGPoint.zero();
        endPosition = CGPoint.make(pos.x, pos.y);
        delta = CGPoint.zero();
    }
    
    /**
     * Lets extend basic functionality for reuse action.
     */
    public void setEndPosition(CGPoint pos) {
    	endPosition.set(pos);
    }

    @Override
    public CCIntervalAction copy() {
        return new CCMoveTo(duration, endPosition);
    }

    @Override
    public void start(CCNode aTarget) {
        super.start(aTarget);

        startPosition.set(target.getPositionRef());
        delta.set(endPosition.x - startPosition.x, endPosition.y - startPosition.y);
    }

    @Override
    public void update(float t) {
        target.setPosition(startPosition.x + delta.x * t,
        					startPosition.y + delta.y * t);
    }
}
