public class Main {
    public static void main(String[] args) {
        // 引数なしのコンストラクタを使用してインスタンスを作成
        Employee employee1 = new Employee();
        employee1.printName();

        // 文字列を引数に持つコンストラクタを使用してインスタンスを作成
        Employee employee2 = new Employee("Pepper");
        employee2.printName();
    }
}