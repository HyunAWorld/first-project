import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int B = in.nextInt();
        
        //A가 B보다 큰 경우에는 '>'를 출력한다.
        if (A>B) {
            System.out.println(">");
            //A가 B보다 작은 경우에는 '<'를 출력한다.
        } else if(A<B) {
            System.out.println("<");
            //A와 B가 같은 경우에는 '=='를 출력한다.
        } else {
            System.out.println("==");
        }

    }
}