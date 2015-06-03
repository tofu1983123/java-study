package cn.wyzc.bbs.service;

import java.util.List;

import cn.wyzc.bbs.entity.Category;
import cn.wyzc.bbs.entity.Forum;

public interface CategoryService {
	public int addCategory(Category c);
	public Category findById(String id);
	public List<Forum> findForums(String categoryId);
	public List<Category> findAll();
}
