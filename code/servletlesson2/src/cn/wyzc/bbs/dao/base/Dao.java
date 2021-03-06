package cn.wyzc.bbs.dao.base;

import java.util.List;

public interface Dao<T> {
	T findById(String id,String sql,RowMapper<T> rm);
	List<T> findByPage(int pageSize,int page,String sql,RowMapper<T> rm,Object...obj);
	List<T> findAll(String sql,RowMapper<T> rm,Object ...objs);
	//select roleid_ from wycz_user_role where userid_=?
	int saveOrUpdate(String sql,Object...obj);
	int deleteById(String id,String sql);
}
