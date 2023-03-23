import java.util.Scanner;

public class convertMoney {
    public static void main(String[] args) {
        double money, vnd;
        System.out.println("Enter your USD");
        Scanner usd1= new Scanner(System.in);
        money = usd1.nextDouble();
        vnd=money*23000;
        System.out.printf("Your VND is %f",vnd);
    }
}
