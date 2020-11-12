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
		System.out.println("import�� ����� ������\n");
		Import i = new Import();
		System.out.println("import�� �̿��� ��� show");
		i.show();
		System.out.println("-------------------");
		
		System.out.println("����� �̿��� ��� show\n");
		Inheritance i2 = new Inheritance();
		System.out.println("�θ� Ŭ���������� ���");
		System.out.println("Inheritance i2 = new Inheritance();");
		i2.show();
		
		System.out.println();
		Inheritance i3 = new View();
		System.out.println("�ڽ� Ŭ���������� ���");
		System.out.println("Inheritance i3 = new View();");
		i3.show();
	}
}
