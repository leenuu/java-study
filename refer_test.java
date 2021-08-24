public class refer_test 
{
    public String name;
    public String age;
    public String gender;

    public refer_test()
    {
        this.name = "null";
        this.age = "null";
        this.gender = "null";
    }
    public refer_test(String name)
    {
        this.name = name;
        this.age = "null";
        this.gender = "null";
    }
    public refer_test(String name, String age)
    {
        this.name = name;
        this.age = age;
        this.gender = "null";
    }
    public refer_test(String name, String age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void inform()
    {
    	System.out.println("----------------------");
        System.out.println("Hello, World! " + this.name);
        System.out.println("user inform");
        System.out.println("name: " + this.name);
        System.out.println("age: " + this.age);
        System.out.println("gender: "+ this.gender);
        System.out.println("----------------------");
    }
}
