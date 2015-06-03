package tag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;

public class IfTag extends BodyTagSupport {
	private boolean value;
	protected BodyContent bodyOut;
	protected Tag parent;
	public void setValue(boolean value) {
		this.value = value;
	}
	@Override
	public void setBodyContent(BodyContent b) {
		this.bodyOut = b;
	}
	@Override
	public void setParent(Tag t) {
		this.parent = t;
	}
	@Override
	public Tag getParent() {
		// TODO Auto-generated method stub
		return parent;
	}
	private void doIntBody() {
		System.out.println("do...init...body...");
	}
	@Override
	public int doStartTag() throws JspException {
		System.out.println("do start Tag...");
		if(value)
			return EVAL_BODY_INCLUDE;
		return SKIP_BODY; 
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("do end Tag...");
		return EVAL_PAGE;
	}
	@Override
	public int doAfterBody() throws JspException {
		System.out.println("do after body...");
		return SKIP_BODY;
	}
}
