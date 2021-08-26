package inheritance.cast_test;

public class testcast 
{

	public static void main(String[] args)
	{
		testcast test = new testcast();
		test.casts();
//		test.testarray();
	}
	
	public void casts()
	{
		try
		{
		parentcast obj1 = new parentcast();
		childcast obj2 = new childcast();
		
		obj1.printname();
		obj2.printname();
		
		System.out.println("---------");
		
		parentcast obj_1 = obj2;
		childcast obj_2 = (childcast)obj1;
		
		obj_1.printname();
		obj_2.printname();
	
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			
			childcast obj1 = new childcast();
			obj1.printname();
			
			parentcast obj2 = obj1;
			obj2.printname();

			
			childcast obj3 = (childcast)obj2;
			obj3.printname();

		}
	}
	
	public void testarray()
	{
		parentcast[] parentarray = new parentcast[3];
		
		parentarray[0] = new childcast();
		parentarray[1] = new parentcast();
		parentarray[2] = new childcast();
		type_check(parentarray);
	}
	
	public void type_check(parentcast[] array)
	{
		for (parentcast temp: array)
		{
			if (temp instanceof childcast)
			{
				System.out.println("child");
			}
			else if (temp instanceof parentcast)
			{
				System.out.println("parentcast");
			}
		}
	}
}
