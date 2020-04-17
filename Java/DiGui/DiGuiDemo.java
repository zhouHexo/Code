import java.util.Random;

public class DiGuiDemo {
    public static void main(String[] args) {
        
        Random r = new Random();
        int n = r.nextInt(10)+11;
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n-1]);
/*         for (int i : arr) {
            System.out.print(i + "\t");
        } */

        System.out.println(f(n));
        System.out.println(num(n));
    }

    public static int f(int n) {
        if(n == 1 || n == 2)
        {
            return 1;
        }else{
            return f(n-1) + f(n-2);
        }

    }

    public static int num(int n)
    {
        if(n == 1)
        {
            return 1;
        }else 
        {
            return n*num(n-1);
        }
    }
}