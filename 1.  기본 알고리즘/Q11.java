import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int integer;
        do {
            System.out.print("정수값: ");
            integer = scanner.nextInt();
        } while (integer <= 0);

        int digit = 0;
        while(integer !=0){
            integer /= 10;
            digit++;
        }

        System.out.println("그 수는 "+digit+"자리입니다.");
    }
}
