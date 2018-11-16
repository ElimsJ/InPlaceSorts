import java.util.Arrays;

public class Runner
{

    public static void main (String [] args)
    {
        InPlaceSorts list1 = new InPlaceSorts();

        String [] arrayList = list1.randomStringArr(6,6);
        System.out.println(arrayList);
        InPlaceSorts.douArr(6);
        InPlaceSorts.randomStringArr(5,6);
    }
}
