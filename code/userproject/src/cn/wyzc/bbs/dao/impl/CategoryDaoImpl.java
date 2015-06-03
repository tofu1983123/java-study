package cn.wyzc.bbs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import cn.wyzc.bbs.dao.CategoryDao;
import cn.wyzc.bbs.dao.base.DaoSupport;
import cn.wyzc.bbs.entity.Category;
import cn.wyzc.bbs.util.JdbcUtil;

public class CategoryDaoImpl extends DaoSupport<Category> implements CategoryDao {

	public int getMaxOrder() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int order = 0;
		try {
			con = JdbcUtil.getConn();
			pstmt = con.prepareStatement("select max(order_) from wyzc_category");
			rs = pstmt.executeQuery();
			if(rs.next()){
				order = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return order;
	}
	
}
