import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num =0;
        while (true) {
            System.out.println("1から100までの整数値を入力してください: ");
            Scanner test = new Scanner(System.in);
        int getNumber = test.nextInt();
            
            if (getNumber % 7 == 0) {
                System.out.println("処理を終了します。");
                break;
            }
        }
      
    }  
}
