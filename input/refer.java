package input;

import java.util.Scanner;
import java.util.HashMap;

public class refer 
{
    public HashMap<String, HashMap<String, String>> inform = new HashMap<String, HashMap<String, String>>();
    public Scanner sc = new Scanner(System.in);
    
    public void add_inform()
    {
    	String name, age, gender;  	
    	System.out.printf("name : ");
    	name = sc.next();
    	
    	System.out.printf("age : ");
    	age = sc.next();    	

    	System.out.printf("gender : ");
    	gender = sc.next();
    	
    	HashMap<String, String> temp = new HashMap<String, String>();
    	temp.put("age", age);
    	temp.put("gender", gender);
    	inform.put(name, temp);
    }

//    public void set_inform()
//    {
//    	System.out.printf("name : ");
//    	Scanner name = new Scanner(System.in);
//    	this.name = name.next();
//    	name.close();
//    	
//    	System.out.printf("age : ");
//    	Scanner age = new Scanner(System.in);
//    	this.age = age.next();    	
//    	age.close();
//
//    	System.out.printf("gender : ");
//    	Scanner gender = new Scanner(System.in);
//    	this.gender = gender.next();
//    	gender.close();
//    }
    
    public void inform()
    {
    	System.out.printf("name : ");
    	String name = sc.next();
    	
    	System.out.println("----------------------");
        System.out.println("Hello, World! " + name);
        System.out.println("user inform");
        System.out.println("name: " + name);
        System.out.println("age: " + this.inform.get(name).get("age"));
        System.out.println("gender: "+ this.inform.get(name).get("gender"));
        System.out.println("----------------------");
    }
}
