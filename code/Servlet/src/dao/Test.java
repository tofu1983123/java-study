package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		DaoSupport<Systemprivilege> ds = new DaoSupport<Systemprivilege>();
		List<Systemprivilege> ss = ds.findAll("select * from wyzc_systemprivilege", new RowMapper<Systemprivilege>() {
			
			@Override
			public Systemprivilege getRow(ResultSet rs) throws SQLException {
				Systemprivilege s = new Systemprivilege();
				s.setId(rs.getString("id_"));
				s.setName(rs.getString("name_"));
				s.setResource(rs.getString("resource_"));
				s.setAction(rs.getString("action_"));
				return s;
			}
		});
		for (Systemprivilege systemprivilege : ss) {
			System.out.println(systemprivilege.getName());
		}
	}

}
