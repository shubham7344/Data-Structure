import java.util.*;

public class ArrayIntro {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];


     for (int i=0;i<n;i++) 
     {
      array[i] = scan.nextInt();
     }

        // Prints each sequential element in array a
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
