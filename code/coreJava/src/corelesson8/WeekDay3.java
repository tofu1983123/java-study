package corelesson8;
public enum WeekDay3 {
	MON{
		@Override
		public WeekDay3 nextDay() {
			// TODO �Զ����ɵķ������
			return TUE;
		}
		@Override
		public String toString() {
			// TODO �Զ����ɵķ������
			return "����һ";
		}
	},TUE{
		@Override
		public WeekDay3 nextDay() {
			// TODO �Զ����ɵķ������
			return WED;
		}
		@Override
		public String toString() {
			// TODO �Զ����ɵķ������
			return "���ڶ�";
		}
	},WED(){
		@Override
		public WeekDay3 nextDay() {
			// TODO �Զ����ɵķ������
			return THU;
		}
		@Override
		public String toString() {
			// TODO �Զ����ɵķ������
			return "������";
		}
	},THU(){
		@Override
		public WeekDay3 nextDay() {
			// TODO �Զ����ɵķ������
			return FRI;
		}
		@Override
		public String toString() {
			// TODO �Զ����ɵķ������
			return "������";
		}
	},FRI(5){
		@Override
		public WeekDay3 nextDay() {
			// TODO �Զ����ɵķ������
			return SAT;
		}
		@Override
		public String toString() {
			// TODO �Զ����ɵķ������
			return "������";
		}
	},SAT(6){
		@Override
		public WeekDay3 nextDay() {
			// TODO �Զ����ɵķ������
			return SUN;
		}
		@Override
		public String toString() {
			// TODO �Զ����ɵķ������
			return "������";
		}
	},SUN(7){
		@Override
		public WeekDay3 nextDay() {
			// TODO �Զ����ɵķ������
			return MON;
		}
		@Override
		public String toString() {
			// TODO �Զ����ɵķ������
			return "������";
		}
	};
	WeekDay3(){}
	WeekDay3(int n){}
	public abstract WeekDay3 nextDay();
}
