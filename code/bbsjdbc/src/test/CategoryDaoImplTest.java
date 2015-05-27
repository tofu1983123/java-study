package test;

import cn.wyzc.bbs.dao.impl.CategoryDaoImpl;

public class CategoryDaoImplTest {
	public static void main(String[] args) {
		CategoryDaoImpl cd = new CategoryDaoImpl();
		System.out.println(cd.getMaxOrder());
	}
}
