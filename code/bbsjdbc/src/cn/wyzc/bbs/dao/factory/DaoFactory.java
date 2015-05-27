package cn.wyzc.bbs.dao.factory;

import java.util.Properties;

import cn.wyzc.bbs.dao.CategoryDao;
import cn.wyzc.bbs.dao.ForumDao;
import cn.wyzc.bbs.dao.RoleDao;
import cn.wyzc.bbs.dao.UserDao;
import cn.wyzc.bbs.dao.base.DaoSupport;
import cn.wyzc.bbs.dao.impl.UserDaoImpl;

public class DaoFactory {
	private static Properties prop = new Properties();
	static{
		try {
			prop.load(DaoFactory.class.getResourceAsStream("/cn/wyzc/bbs/dao/factory/dao.properties"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static <T> DaoSupport<T> getBaseDao(){
		try {
			return (DaoSupport<T>)Class.forName(prop.getProperty("baseDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static UserDao getUserDao(){
		//return new UserDaoImpl();
		try {
			return (UserDao)Class.forName(prop.getProperty("userDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public static RoleDao getRoleDao(){
		try {
			return (RoleDao)Class.forName(prop.getProperty("roleDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public CategoryDao getCategoryDao(){
		try {
			return (CategoryDao)Class.forName(prop.getProperty("categoryDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public ForumDao getForumDao(){
		try {
			return (ForumDao)Class.forName(prop.getProperty("forumDao")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
