package javapackage;
import javapackage.sub.*;

public class package_test
{
	public static void main(String [] args)
	{
		System.out.println("package class");
		sub test = new sub();
		test.subClassMethod();
	}
}