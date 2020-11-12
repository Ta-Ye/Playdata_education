package model;

import Difference.Import;
import Difference.Inheritance;

public class View extends Inheritance{
	public String grade = "VVIP";
	
	@Override
	public void show() {
		super.show();
		System.out.println(grade);
	}
	
	public static void main(String[] args) {
		System.out.println("import와 상속의 차이점\n");
		Import i = new Import();
		System.out.println("import를 이용한 출력 show");
		i.show();
		System.out.println("-------------------");
		
		System.out.println("상속을 이용한 출력 show\n");
		Inheritance i2 = new Inheritance();
		System.out.println("부모 클래스에서의 출력");
		System.out.println("Inheritance i2 = new Inheritance();");
		i2.show();
		
		System.out.println();
		Inheritance i3 = new View();
		System.out.println("자식 클래스에서의 출력");
		System.out.println("Inheritance i3 = new View();");
		i3.show();
	}
}
