// given a list and a target if the target is present in the list return the target if not return the element that is greatest smallest number than the target
// works only for sorted lists
import java.util.Scanner;
public class floor_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.of elements : ");
        int n = sc.nextInt();
        int[] list = new int[n];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++) {
            list[i] = sc.nextInt();
        }
        System.out.print("Enter the element : ");
        int ele = sc.nextInt();
        int start = 0;
        int end = n-1;
        int mid = 0;
        boolean flag = false;
        while(start<=end) {
            mid = (int) (start+end)/2;
            if(ele == list[mid]) {
                System.out.print(list[mid]);
                flag = true;
                break;
            } else if (ele>list[mid]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        if(flag==false) {
            System.out.print(list[end]);
        }
    }
}
