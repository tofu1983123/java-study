package corelesson8;

import java.util.Calendar;
import static java.lang.Math.PI;
import static java.util.Calendar.getInstance;
import static java.lang.Math.*;
public class StaticImportDemo {

	public static void main(String[] args) {
		//System.out.println(Math.PI);
		System.out.println(PI);
		//Calendar c = Calendar.getInstance();
		Calendar c = getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(abs(-10));
		System.out.println(random()*100);
	}

}
