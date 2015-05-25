package lesson2.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<T> {
	public T findById(Serializable id,String sql,RowMapper<T> rm);
	public List<T> find(String sql,RowMapper<T> rm,Object...obj);
	public List<T> findByPage(int page,int pageSize,String sql,RowMapper<T> rm,Object...obj);
	public int saveOrUpdateOrDelete(String sql,Object...obj);
}
