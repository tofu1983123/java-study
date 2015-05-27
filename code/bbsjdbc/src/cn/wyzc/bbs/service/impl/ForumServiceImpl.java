package cn.wyzc.bbs.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cn.wyzc.bbs.dao.ForumDao;
import cn.wyzc.bbs.entity.Topic;
import cn.wyzc.bbs.service.ForumService;

public class ForumServiceImpl implements ForumService {
	private ForumDao fd;
	public void setFd(ForumDao fd) {
		this.fd = fd;
	}
	public List<Topic> getTopics(String forumId) {
		List<String> topicIds = fd.findForeignId(forumId, "select id_ from wyzc_topic where forumId_=?");
		List<Topic> topics = new ArrayList<Topic>();
		/*for (String topicId : topicIds) {
			Topic topic = fd.findById(topicId, "", rm);
			topics.add(topic);
		}*/
		return topics;
	}

}
