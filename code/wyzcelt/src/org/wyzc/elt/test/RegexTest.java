package org.wyzc.elt.test;

public class RegexTest {

	public static void main(String[] args) {
		String str = "@answer=2/3,score=5,level=5";
		String regex = "[@,][a-z]+=";
		String[] ss = str.split(regex);
		for (String string : ss) {
			System.out.println(string);
		}
	}

}
