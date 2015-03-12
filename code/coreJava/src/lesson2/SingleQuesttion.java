package lesson2;

public class SingleQuesttion extends Question{
	private String answer;
	public SingleQuesttion(int id, String title, String[] options,String answer) {
		super(id, title, options);
		this.answer = answer;
	}
	@Override
	public boolean check(String[] ans) {
		return false;
	}
}
