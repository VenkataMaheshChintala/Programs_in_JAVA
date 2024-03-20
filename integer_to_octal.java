// max number of digits of integer is 9.
import java.util.ArrayList;
import java.util.Scanner;

public class integer_to_octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(10);
        int a,i;
        while(true) {
            a = (n%8);
            arr.add(a);
            if(n<8) break;
            n = (int) n/8;
        }
        for(i=arr.size()-1;i>=0;i--) {
            a = arr.get(i);
            System.out.print(a);
        }
    }
}
