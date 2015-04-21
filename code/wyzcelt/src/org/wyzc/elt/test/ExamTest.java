package org.wyzc.elt.test;

import org.wyzc.elt.control.ClientContext;
import org.wyzc.elt.dao.EntityContext;
import org.wyzc.elt.service.ExamServiceImpl;
import org.wyzc.elt.view.ExamFrame;
import org.wyzc.elt.view.LoginFrame;
import org.wyzc.elt.view.MenuFrame;

public class ExamTest {

	public static void main(String[] args) {
		//��ͼ����
		LoginFrame loginFrame = new LoginFrame();
		MenuFrame menuFrame = new MenuFrame();
		ExamFrame examFrame = new ExamFrame();
		//����������
		ClientContext clientContext = new ClientContext();
		//������ͼ�������֮�������
		loginFrame.setClientContext(clientContext);
		menuFrame.setClientContext(clientContext);
		examFrame.setClientContext(clientContext);
		
		/*clientContext.setLoginFrame(loginFrame);
		clientContext.setMenuFrame(menuFrame);
		clientContext.setExamFrame(examFrame);*/
		//�������ݲ����
		EntityContext entityContext = new EntityContext();
		//����ҵ�����
		ExamServiceImpl examService = new ExamServiceImpl();
		//����ҵ������ݲ�֮�������
		examService.setEntityContext(entityContext);
		//������������ҵ��֮�������
		clientContext.setExamService(examService);
		loginFrame.setVisible(true);
	}

}
