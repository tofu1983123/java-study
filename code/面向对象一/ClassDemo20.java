class ClassDemo20 
{
	public static void main(String[] args) 
	{
		String[] str = {"hello","world"};
		Arg.main(str);
		Arg.main(new String[]{"hello","world"});
	}
}
class Arg
{
	public static void main(String[] args) 
	{
		for(int i = 0;i < args.length;i++){
			System.out.println(args[i]);
		}
	}
}