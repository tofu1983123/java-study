package corelesson6;

import java.io.BufferedReader;

//��socket�ܵ��н��ж���������ӡ������̨
public class ReadThread extends Thread {
	private BufferedReader br;
	public ReadThread(BufferedReader br) {
		super();
		this.br = br;
	}
	@Override
	public void run() {
		try {
			while(true){
				String str = br.readLine();
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
