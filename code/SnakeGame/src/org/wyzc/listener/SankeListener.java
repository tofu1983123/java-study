package org.wyzc.listener;

import org.wyzc.entity.Snake;
/**
 * �ߵļ�����
 * ��Ҫ�����ߵ��ƶ�
 * @author Administrator
 *
 */
public interface SankeListener {
	/**
	 * �÷������������Ƿ��������Լ�,ʳ��,�ϰ���
	 * @param snake
	 */
	public void snakeMoved(Snake snake);
}
