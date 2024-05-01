import java.util.Scnner;

public class Main{
    public static void main (String[]args){
        System.out.println("1~10の整数を入力してください");
        Scanner test = nre Scanner(System.in);
        int num = test.nextInt();

        if(num < 5){
            System.out.println("5未満の整数"+ num + "が入力されました");
        }else if (num == 5){
            System.out.println("5が入力されました");
        }else if(num >= 6){
        System.out.println("6以上の整数"+ num + "が入力されました");
        }
    }
}