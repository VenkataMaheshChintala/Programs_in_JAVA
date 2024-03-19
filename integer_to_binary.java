import java.util.ArrayList;
import java.util.Scanner;
public class integer_to_binary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(10);
        int a,i;
        while(true) {
            a = n%2;
            arr.add(a);
            if(n==0 || n==1) break;
            n = (int) n/2;
        }
        for(i=arr.size()-1;i>=0;i--) {
            a = arr.get(i);
            System.out.print(a);
        }
    }
}