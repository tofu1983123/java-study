package org.wyzc.listener;

import org.wyzc.entity.Snake;
/**
 * 蛇的监听器
 * 主要监听蛇的移动
 * @author Administrator
 *
 */
public interface SankeListener {
	/**
	 * 该方法区监听蛇是否碰到了自己,食物,障碍物
	 * @param snake
	 */
	public void snakeMoved(Snake snake);
}
