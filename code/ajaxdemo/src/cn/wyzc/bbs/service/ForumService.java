package cn.wyzc.bbs.service;

import java.util.List;

import cn.wyzc.bbs.entity.Topic;

public interface ForumService {
	public List<Topic> getTopics(String forumId);
}
