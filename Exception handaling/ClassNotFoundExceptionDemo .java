class Demo
{
    public void method1()
    {
        System.out.println("###  method 1 from class Demo...");
    }

}
public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        
        try
        {
           Class cl= Class.forName("Demo"); //ClassNotFoundException exception will occur 
           
        System.out.println("class Name ="+cl.getName());

           Demo d=(Demo)cl.newInstance(); //InstantiationException will occur
           d.method1();
             
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("----------------------------------");
            System.out.println(e.toString());
            System.out.println("----------------------------------");
        }
        catch(InstantiationException e)
        {
           System.out.println("----------------------------------");
            System.out.println(e.toString());
            System.out.println("----------------------------------");

        }
        
      System.out.println("---- end of main ----");
    }
}
