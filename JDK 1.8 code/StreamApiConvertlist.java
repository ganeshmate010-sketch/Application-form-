import java.util.*;
import java.util.function.Predicate;

class EvenNumber implements Predicate<Integer>
{
    public boolean test(Integer n)
    {
        if(n % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class  StreamApiConvertlist

{
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(10,15,20,25,30);

        list.stream()
            .filter(new EvenNumber())
            .forEach(System.out::println);
    }
}