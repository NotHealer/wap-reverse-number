import java.util.Scanner;

// Input:  num
// (1) Initialize sum = 0
// (2) Loop while num > 0
//      (a) Multiply sum by 10 and add remainder of num  
//           divide by 10 to sum
//                sum = sum*10 + num%10;
//      (b) Divide num by 10
// (3) Return sum

public class reverseofno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        Integer num = sc.nextInt();
        Integer sum = 0;
        while (num != 0) {
            sum = sum * 10 + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
