import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int year = in.nextInt();
        
        if (year % 400 == 0) {
            System.out.println("1"); // 윤년
        } else if (year % 100 == 0) {
            System.out.println("0"); // 윤년 아님
        } else if (year % 4 == 0) {
            System.out.println("1"); // 윤년
        } else {
            System.out.println("0"); // 윤년 아님
        }
        
        in.close();
    }
}
