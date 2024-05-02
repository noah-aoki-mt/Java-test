public class Main {
    public static void main(String[] args) {
        // 引数なしのコンストラクタを使用してインスタンスを作成
        Employee2 employee1 = new Employee2();
        employee1.printName();

        // 文字列を引数に持つコンストラクタを使用してインスタンスを作成
        Employee2 employee2 = new Employee2("Pepper");
        employee2.printName();
        
        //社員人数を引数に持つコンストラクタを移用してインスタンスを作成
        Employee2 employee3 = new Employee2();
        employee3.printNumber();
        
    }
}