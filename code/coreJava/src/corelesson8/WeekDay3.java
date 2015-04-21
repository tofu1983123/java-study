package corelesson8;
public enum WeekDay3 {
	MON{
		@Override
		public WeekDay3 nextDay() {
			// TODO 自动生成的方法存根
			return TUE;
		}
		@Override
		public String toString() {
			// TODO 自动生成的方法存根
			return "星期一";
		}
	},TUE{
		@Override
		public WeekDay3 nextDay() {
			// TODO 自动生成的方法存根
			return WED;
		}
		@Override
		public String toString() {
			// TODO 自动生成的方法存根
			return "星期二";
		}
	},WED(){
		@Override
		public WeekDay3 nextDay() {
			// TODO 自动生成的方法存根
			return THU;
		}
		@Override
		public String toString() {
			// TODO 自动生成的方法存根
			return "星期三";
		}
	},THU(){
		@Override
		public WeekDay3 nextDay() {
			// TODO 自动生成的方法存根
			return FRI;
		}
		@Override
		public String toString() {
			// TODO 自动生成的方法存根
			return "星期四";
		}
	},FRI(5){
		@Override
		public WeekDay3 nextDay() {
			// TODO 自动生成的方法存根
			return SAT;
		}
		@Override
		public String toString() {
			// TODO 自动生成的方法存根
			return "星期五";
		}
	},SAT(6){
		@Override
		public WeekDay3 nextDay() {
			// TODO 自动生成的方法存根
			return SUN;
		}
		@Override
		public String toString() {
			// TODO 自动生成的方法存根
			return "星期六";
		}
	},SUN(7){
		@Override
		public WeekDay3 nextDay() {
			// TODO 自动生成的方法存根
			return MON;
		}
		@Override
		public String toString() {
			// TODO 自动生成的方法存根
			return "星期天";
		}
	};
	WeekDay3(){}
	WeekDay3(int n){}
	public abstract WeekDay3 nextDay();
}
