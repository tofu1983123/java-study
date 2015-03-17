package corelesson1;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {

	public static void main(String[] args) {
		String s = "ab+defab+xyzab+dddab+nnn";
		//要用ab+来分割字符串
		String[] ss = s.split("ab\\+");//如果ab+表示a后面的b可以出现1次或多次
		/*正则表达式有4个特殊意义的字符,有 . ? * + 等4个
		 * 不能单独表示他们,如果非要表示就需要用转义字符\
		 * 而java中在字符串\也需要转义,用\\表示
		 * 所以要表示四个字符就应该用\\.,\\?,\\*,\\+
		 * 如果不转义,它们就有特殊意义
		 * 
		*/
		System.out.println(Arrays.toString(ss));
		System.out.println("1===============");
		
		String regex = "ab\\+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		//matches()判断一个字符串是否匹配一个正则表达式
		System.out.println(matcher.matches());
		System.out.println("2===============");
		System.out.println(s.matches(regex));
		System.out.println("3===============");
		//在一个字符串中找出匹配正则表达式的元素		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
		
	}

}
