package lesson2.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import lesson2.JdbcUtil;

public class DaoSupport<T> implements Dao<T>{

	public T findById(Serializable id,String sql,RowMapper<T> rm) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		T t = null;
		try {
			con = JdbcUtil.getConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setObject(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				//提炼接口---->因为只有到具体的表才知道如何去包装
				t = rm.getRow(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return t;
	}

	public List<T> find(String sql, RowMapper<T> rm, Object... obj) {
		List<T> lists = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtil.getConn();
			pstmt = con.prepareStatement(sql);
			for(int i = 0;i < obj.length;i++){
				pstmt.setObject(i + 1, obj[i]);
			}
			rs = pstmt.executeQuery();
			while(rs.next()){
				T t = rm.getRow(rs);
				lists.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return lists;
	}

	public List<T> findByPage(int page, int pageSize, String sql,
			RowMapper<T> rm, Object... obj) {
		int begin = (page - 1) * pageSize - 1;
		int end = page * pageSize + 1;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		return null;
	}

	public int saveOrUpdateOrDelete(String sql, Object... obj) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			pstmt = con.prepareStatement(sql);
			for(int i = 0;i < obj.length;i++){
				pstmt.setObject(i + 1, obj[i]);
			}
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, null);
		}
		return n;
	}
}
