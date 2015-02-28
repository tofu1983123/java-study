class DataTypeDemo4 
{
	public static void main(String[] args) 
	{
		char a = '中';
		char b = '\u4e2d';//中文的Unicode表示
		System.out.println(a);
		System.out.println(a);
		char c = 'a';
		//char 是16位无符号整数  0到2的16次方-1  任何的char都是一个整数
		//数字'0'     --->48	'1'	--->49
		//字母'a'	  --->97	'b'	--->98
		//大写字母'A' --->65	'B'	--->66
		char d = 97;
		System.out.println(d);//结果是a
		//转义字符
		char e = '\n'//换行  \t '\\'表示单\
	}
}
