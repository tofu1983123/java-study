import java.util.Arrays;
class Demo10 
{
	public static void main(String[] args) 
	{
		SingleQuestion question1 = new SingleQuestion(1,"��õ���Ƶ��ҵ�γ�?",new String[]{"A��Ӯ����","B��������"},"A");
		SingleQuestion question3 = new SingleQuestion(2,"�����Ӱ?",new String[]{"Aʧ��33��","B������"},"A");
		//System.out.println(Arrays.equals(new int[]{1,2,3},new int[]{1,2,3}));
		MutilQuestion question2 = new MutilQuestion(3,"��Ӯ����Щ�γ�?",new String[]{"A.��ӮJAVA","B.��ӮC++"},new String[]{"A","B"});
		question3.printQuestion();
		System.out.println("=====================");
		SingleQuestion[] questions =new SingleQuestion[]{question1,question3};
		for(int i=0;i < questions.length;i++){
			questions[i].printQuestion();
		}
		System.out.println("=====================");
		//������Ҫ��������Ŀ:���е�ѡ��,���ж�ѡ��
		Question[] qs = new Question[]{question1,question3,question2};
		//qs[0] = question1 qs[1] = question3 qs[2] = question2//����������������ʵ��
		//Question�������,�ȿ�������SingleQuestion��ʵ��,Ҳ��������
		//MutilQuestion��ʵ��
		for(Question q:qs){
			q.printQuestion();
			q.check(new String[]{"A"});
			//�������SingleQuestion��,���õľ��Ǹ����check����
			//�������MutilQuestion��,���õľ��Ǹ����check����
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
		return false;//ģ��
	}
}