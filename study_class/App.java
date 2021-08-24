public class App 
{   public static void main(String[] args)
    {
        refer_test user_list[] = new refer_test[3];
        user_list[0] = new refer_test("leenuu", "19", "male");
        user_list[1] = new refer_test("donas", "18");
        user_list[2] = new refer_test("white");
        
        user_list[0].inform();
        user_list[1].inform();
        user_list[2].inform();
//        System.out.println("----------------------");
//        for(int i = 0; i < user_list.length; i++)
//        {
//            System.out.println("Hello, World! " + user_list[i].name);
//            System.out.println("user inform");
//            System.out.println("name: " + user_list[i].name);
//            System.out.println("age: " + user_list[i].age);
//            System.out.println("gender: "+ user_list[i].gender);
//            System.out.println("----------------------");
//        }
    }
}
