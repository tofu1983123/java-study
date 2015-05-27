package cn.wyzc.bbs.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Topic extends Article{
	private String type;
	private Forum forum;
	private String summary;
	private int viewCount;
	private int replyCount;
	private Date lastArticlePostTime;
	private Reply lastReply;
	private Set<Reply> replys = new HashSet<Reply>();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Forum getForum() {
		return forum;
	}
	public void setForum(Forum forum) {
		this.forum = forum;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public Date getLastArticlePostTime() {
		return lastArticlePostTime;
	}
	public void setLastArticlePostTime(Date lastArticlePostTime) {
		this.lastArticlePostTime = lastArticlePostTime;
	}
	public Reply getLastReply() {
		return lastReply;
	}
	public void setLastReply(Reply lastReply) {
		this.lastReply = lastReply;
	}
	public Set<Reply> getReplys() {
		return replys;
	}
	public void setReplys(Set<Reply> replys) {
		this.replys = replys;
	}
	
}
