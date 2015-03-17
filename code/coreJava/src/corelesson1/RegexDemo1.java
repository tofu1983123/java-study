package corelesson1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		String s = "ab+defab+xyzab+dddab+nnn";
		//Ҫ��ab+���ָ��ַ���
		String[] ss = s.split("ab\\+");//���ab+��ʾa�����b���Գ���1�λ���
		/*������ʽ��4������������ַ�,�� . ? * + ��4��
		 * ���ܵ�����ʾ����,�����Ҫ��ʾ����Ҫ��ת���ַ�\
		 * ��java�����ַ���\Ҳ��Ҫת��,��\\��ʾ
		 * ����Ҫ��ʾ�ĸ��ַ���Ӧ����\\.,\\?,\\*,\\+
		 * �����ת��,���Ǿ�����������
		 * 
		*/
		System.out.println(Arrays.toString(ss));
		System.out.println("1===============");
		
		String regex = "ab\\+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		//matches()�ж�һ���ַ����Ƿ�ƥ��һ��������ʽ
		System.out.println(matcher.matches());
		System.out.println("2===============");
		System.out.println(s.matches(regex));
		System.out.println("3===============");
		//��һ���ַ������ҳ�ƥ��������ʽ��Ԫ��		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}

}
