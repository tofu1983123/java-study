package cn.wyzc.bbs.dao;

import cn.wyzc.bbs.dao.base.Dao;
import cn.wyzc.bbs.entity.Category;

public interface CategoryDao extends Dao<Category> {
	public int getMaxOrder();
}
