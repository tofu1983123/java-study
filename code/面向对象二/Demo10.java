import java.util.Arrays;
class Demo10 
{
	public static void main(String[] args) 
	{
		SingleQuestion question1 = new SingleQuestion(1,"最好的视频就业课程?",new String[]{"A沃赢教育","B其他教育"},"A");
		SingleQuestion question3 = new SingleQuestion(2,"爱情电影?",new String[]{"A失恋33天","B风语者"},"A");
		//System.out.println(Arrays.equals(new int[]{1,2,3},new int[]{1,2,3}));
		MutilQuestion question2 = new MutilQuestion(3,"沃赢有哪些课程?",new String[]{"A.我赢JAVA","B.我赢C++"},new String[]{"A","B"});
		question3.printQuestion();
		System.out.println("=====================");
		SingleQuestion[] questions =new SingleQuestion[]{question1,question3};
		for(int i=0;i < questions.length;i++){
			questions[i].printQuestion();
		}
		System.out.println("=====================");
		//现在我要出三个题目:既有单选题,又有多选题
		Question[] qs = new Question[]{question1,question3,question2};
		//qs[0] = question1 qs[1] = question3 qs[2] = question2//父类可以引用子类的实例
		//Question类的引用,既可以引用SingleQuestion的实例,也可以引用
		//MutilQuestion的实例
		for(Question q:qs){
			q.printQuestion();
			q.check(new String[]{"A"});
			//如果引用SingleQuestion类,调用的就是该类的check方法
			//如果引用MutilQuestion类,调用的就是该类的check方法
		}
	}
}
class MutilQuestion extends Question
{
	String[] answers;
	MutilQuestion(int id,String title,String[] options,String[] answers){
		super(id,title,options);
		this.answers = answers;
	}
	boolean check(String[] ans){
		Arrays.sort(ans);
		return Arrays.equals(this.answer,ans);
	}
}
class SingleQuestion extends Question
{
	private String answer;
	SingleQuestion(int id,String title,String[] options,String answer){
		super(id,title,options);
		this.answer = answer;
	}
	boolean check(String[] ans){
		if(ans.length != 1)
			return false;
		return ans[0].equals(answer);
	}
}
class Question
{
	int id;
	String title;
	String[] options;
	Question(int id,String title,String[] options){
		this.id = id;
		this.title = title;
		this.options = options;
	}
	void printQuestion(){
		System.out.println(id+"."+title);
		for(int i = 0;i < options.length;i++){
			System.out.println(options[i]);
		}
	}
	boolean check(String[] ans){
		return false;//模拟
	}
}