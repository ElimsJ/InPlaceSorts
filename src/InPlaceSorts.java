public class InPlaceSorts
{

    public static void bubbleSort(String[] list1)
    {
        for( int i = 0; i < list1.length; i++)
        {
            if( list1[i].compareTo(list1[i+1]) > 0)
            {
                String bubble = list1[i];
                list1[i] = list1[i+1];
                list1[i+1] = bubble;
            }
        }
    }
    public static void insertionSort(int[] list1)
    {

    }
    public static void selectionSort(double[] list1)
    {
        int swap = 0;
        double min = 0;

        for ( int i =0; i< list1.length; i++)
        {
            swap = i;
            min = list1[i];

            for( int j = i ; j < list1.length ; j++)
            {
                if ( list1[j] < min)
                {
                    swap = j;
                    min = list1[j];
                }
            }
            double x = list1[i];
            list1[i] = list1 [swap];
            list1[swap] = x;
        }
    }
    public static void intArr(int amount)
    {
        int [] rndInt = new int[amount];
        for ( int i = 0; i < amount;i++)
        {
            rndInt[i] = (int) Math.random()*10;
        }
    }
    public static void douArr(int amount)
    {
        double [] rndDou = new double[amount];
        for ( int i = 0; i < amount;i++)
        {
            rndDou[i] = Math.random()*10;
        }
    }
    public static String [] randomStringArr(int num, int length)
    {
        String [] arr = new String[num];
        while(num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26) +97 );
                s = s + c ;
                i++;
            }
            num -- ;
            arr[num] = s ;
        }
        return arr;
    }
}
