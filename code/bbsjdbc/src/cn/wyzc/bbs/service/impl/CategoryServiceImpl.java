package cn.wyzc.bbs.service.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import cn.wyzc.bbs.dao.CategoryDao;
import cn.wyzc.bbs.dao.ForumDao;
import cn.wyzc.bbs.dao.base.RowMapper;
import cn.wyzc.bbs.entity.Category;
import cn.wyzc.bbs.entity.Forum;
import cn.wyzc.bbs.entity.Topic;
import cn.wyzc.bbs.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	private CategoryDao cd;
	private ForumDao fd;
	public void setCd(CategoryDao cd) {
		this.cd = cd;
	}
	public void setFd(ForumDao fd) {
		this.fd = fd;
	}
	public int addCategory(Category c) {
		c.setId(UUID.randomUUID().toString());
		c.setOrder(cd.getMaxOrder() + 1);
		String sql = "insert into wyzc_category(id_,name_,order_) values(?,?,?)";
		int n = cd.saveOrUpdate(sql, c.getId(),c.getName(),c.getOrder());
		return n;
	}

	public Category findById(String id) {
		return cd.findById(id, "select * from wyzc_category where id_=?", new CategoryMapper());
	}
	private class CategoryMapper implements RowMapper<Category>{

		public Category getRow(ResultSet rs) throws SQLException {
			Category c = new Category();
			c.setId(rs.getString("id_"));
			c.setName(rs.getString("name_"));
			c.setOrder(rs.getInt("order_"));
			return c;
		}};
	public List<Forum> findForums(String categoryId) {
		List<String> topicIds = cd.findForeignId(categoryId, "select id_ from wyzc_topic where forumId_=?");
		List<Forum> forums = new ArrayList<Forum>();
		/*for (Forum forum : forums) {
			Topic topic  = cd.findById(id, sql, rm);
			forums.add(topic);
		}*/
		return forums;
	}

}
