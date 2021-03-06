class Demo7 
{
	public static void main(String[] args) 
	{
		SingleQuestion question1 = new SingleQuestion(1,"最好的视频就业课程?",new String[]{"A沃赢教育","B其他"},"A");
		question1.printQuestion();
		System.out.println(question1.check(new String[]{"A"}));
		SingleQuestion question2 = new SingleQuestion(2,"爱情电影是?",new String[]{"A我们曾经是战士","B失恋33天","C风语者"},"B");
		question2.printQuestion();
		System.out.println(question2.check(new String[]{"B"}));
		System.out.println("====================");
		Question question = new Question(2,"爱情电影是?",new String[]{"A我们曾经是战士","B失恋33天","C风语者"});
		question.printQuestion();
		System.out.println(question.check(new String[]{"A","B"}));
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
