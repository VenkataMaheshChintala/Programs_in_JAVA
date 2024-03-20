import java.util.Scanner;

public class octal_to_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the octal number : ");
        long n = sc.nextLong();
        int nod = 0,sum=0;
        long temp = n,ld;
        while(n!=0) {
            nod++;
            n = (long) ( n/10);
        }
        nod = nod - 1;
        int i=0;
        while(temp!=0){
            ld = (long) temp%10;
            sum += (int) (Math.pow(8,i)*ld);
            temp/=10;
            i++;
        }
        System.out.print(sum);
    }
}
