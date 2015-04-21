package corelesson8;

public class AnnoDemo1 {
	public static void main(String[] args) {
		/*
		 * ��λ�ȡע��
		 * ���ע��---->Class
		 * ������ע��---->Method
		 * ��Ա��ע��---->Field
		 */
		Class c = User.class;
		//�ж�User���Ƿ���Entityע������
		System.out.println(c.isAnnotationPresent(Entity.class));
		if(c.isAnnotationPresent(Entity.class)){
			//��ȡע��ʵ��
			Entity entity = (Entity)c.getAnnotation(Entity.class);
			//����ע��ķ�����ȡע�������
			System.out.println(entity.value());
			System.out.println("======================");
			int[] a = entity.testArray();
			for (int i : a) {
				System.out.println(i);
			}
			System.out.println(entity.testEnum());
			System.out.println("======================");
			System.out.println(entity.testAnno().value());
		}
	}
}
/*
 *ע���ʵ����
 *@ע������(������=����ֵ)
 *���ע��ʵ����ʱֻ��value����Ҫʵ��ʱ,��ôvalue=����ʡ��
 *ע���з������õķ���ֵ������Щ
 *	��������
 *ע���еķ����ǿ��Է���Ĭ��ֵ��
 *Ҳ���Է���ö������
 *Ҳ���Է���ע��
 */
//@Entity(desClass="����BBS�е�User��")//ע���ʵ����
//@Entity(value = "����BBS�е�User��",testArray = 1)//ע���ʵ����
//@Entity(value = "����bbs_user��",testArray = {1,2,3,4})
//@Entity
//@Entity("world")
//@Entity(testArray={1,2,3,4},testEnum=WeekDay2.MON,value = "bbs_user")
//@Entity(testAnno=@Id("id..."))
@Entity
class User{
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_age")
	private int age;
	@MethodAnno(methoddes = "����getName����")
	public String getName() {
		return name;
	}
	@MethodAnno(methoddes = "����setName����")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}