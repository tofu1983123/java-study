package cn.wyzc.bbs.dao.base;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.wyzc.bbs.util.JdbcUtil;

public class DaoSupport<T> implements Dao<T> {
	public T findById(String id, String sql, RowMapper<T> rm) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		T t = null;
		try {
			con = JdbcUtil.getConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				t = rm.getRow(rs);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return t;
	}
	//select * from aa where ...?...? limit ?,?;
	public List<T> findByPage(int pageSize, int page, String sql,RowMapper<T> rm,
			Object... obj) {
		List<T> ts = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int begin = (page - 1) * pageSize + 1;
		try {
			con = JdbcUtil.getConn();
			pstmt  =con.prepareStatement(sql);
			int i = 0;
			for(i = 0;i < obj.length;i++){
				pstmt.setObject(i + 1, obj[i]);
			}
			pstmt.setInt(++i, begin);
			pstmt.setInt(++i, pageSize);
			rs = pstmt.executeQuery();
			while(rs.next()){
				T t = rm.getRow(rs);
				ts.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return ts;
	}
	public int saveOrUpdate(String sql, Object... obj) {
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
	public int deleteById(String id, String sql) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int n = 0;
		try {
			con = JdbcUtil.getConn();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, null);
		}
		return n;
	}
	public List<T> findAll(String sql, RowMapper<T> rm, Object... objs) {
		List<T> ts = new ArrayList<T>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtil.getConn();
			pstmt  =con.prepareStatement(sql);
			int i = 0;
			for(i = 0;i < objs.length;i++){
				pstmt.setObject(i + 1, objs[i]);
			}
			rs = pstmt.executeQuery();
			while(rs.next()){
				T t = rm.getRow(rs);
				ts.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return ts;
	}
	public List<String> findForeignId(String id, String sql) {
		List<String> ids = new ArrayList<String>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = JdbcUtil.getConn();
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()){
				ids.add(rs.getString(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			JdbcUtil.close(pstmt, rs);
		}
		return ids;
	}
	
}
