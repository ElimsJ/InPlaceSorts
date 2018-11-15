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

        for (int i=1; i<list1.length; ++i)
        {
            int key = list1[i];
            int j = i-1;

            while (j>=0 && list1[j] > key)
            {
                list1[j+1] = list1[j];
                j = j-1;
            }
            list1[j+1] = key;
        }
    }
    public static void selectionSort(double[] list1)
    {
        for ( int i = 0; i < list1.length; i++)
        {
            int min = i;
            for ( int j = i+1; j < list1.length; j++)
            {
                if( list1[j] <  list1[min])
                {
                    j = min;
                }
            }
            double swap = list1[min];
            list1[min] = list1[i];
            list1[i] = swap;
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
        int [] rndDou = new int[amount];
        for ( int i = 0; i < amount;i++)
        {
            rndDou[i] = (int) Math.random()*10;
        }
    }

}
