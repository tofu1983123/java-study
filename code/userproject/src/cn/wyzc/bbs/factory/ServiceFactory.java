package cn.wyzc.bbs.factory;

import cn.wyzc.bbs.dao.CategoryDao;
import cn.wyzc.bbs.dao.UserDao;
import cn.wyzc.bbs.service.CategoryService;
import cn.wyzc.bbs.service.UserService;
import cn.wyzc.bbs.service.impl.CategoryServiceImpl;
import cn.wyzc.bbs.service.impl.UserServiceImpl;

public class ServiceFactory {
	public static UserService getUs(){
		UserServiceImpl us = new UserServiceImpl();
		UserDao ud = DaoFactory.getUserDao();
		us.setUd(ud);
		return us;
	}
	public static CategoryService getCs(){
		CategoryServiceImpl cs = new CategoryServiceImpl();
		CategoryDao cd = DaoFactory.getCategoryDao();
		cs.setCd(cd);
		return cs;
	}
}
