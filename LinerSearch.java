import java.util.*;
 class LinerSearch{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }
        System.out.println("enter no. you want to search");
        int search = scan.nextInt();
        scan.close();
        int f=0;
        System.out.println("index is ");
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == search) 
            {
                System.out.println(i+1);
                f=1;
                break;
            }
        }
        if(f==0)
        {
            System.out.println("element not found");
        }
    }

}
