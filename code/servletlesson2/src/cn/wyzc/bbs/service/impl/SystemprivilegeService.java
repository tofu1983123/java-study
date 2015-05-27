package cn.wyzc.bbs.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.wyzc.bbs.dao.base.DaoSupport;
import cn.wyzc.bbs.dao.base.RowMapper;
import cn.wyzc.bbs.entity.Systemprivilege;

public class SystemprivilegeService {
	DaoSupport<Systemprivilege> sd = new DaoSupport<Systemprivilege>();
	public List<Systemprivilege> findByPage(int pageSize,int page){
		List<Systemprivilege> ss = sd.findByPage(pageSize, page, "select * from wyzc_systemprivilege limit ?,?", new RowMapper<Systemprivilege>() {

			@Override
			public Systemprivilege getRow(ResultSet rs)
					throws SQLException {
				// TODO Auto-generated method stub
				Systemprivilege s = new Systemprivilege();
				s.setId(rs.getString("id_"));
				s.setName(rs.getString("name_"));
				s.setResource(rs.getString("resource_"));
				s.setAction(rs.getString("action_"));
				return s;
			}
		});
		return ss;
	}
}
