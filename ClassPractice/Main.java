public class Main {
    public static void main(String[] args) {
        // MyClassのインスタンスを作成
        MyClass myClass = new MyClass();

        // 各メソッドを呼び出す
        myClass.sameName();
        myClass.sameName(0);
        myClass.sameName(0, 1);
        myClass.sameName("str1");
        myClass.sameName("str1", "str2");
    }
}

public class MyClass {
    // 引数を持たないインスタンスメソッド
    public void sameName() {
        System.out.println("引数を持たないsameNameメソッドです");
    }

    // int型の引数を1つ持つインスタンスメソッド
    public void sameName(int num) {
        System.out.println("int型の引数を1つ持つsameNameメソッドです。" + "引数：" + num);
    }

    // int型の引数を2つ持つインスタンスメソッド
    public void sameName(int num1, int num2) {
        System.out.println("int型の引数を1つ持つsameNameメソッドです。" + "引数：" + num1 + ", " + num2);
    }

    // String型の引数を1つ持つインスタンスメソッド
    public void sameName(String str) {
        System.out.println("String型の引数を1つ持つsameNameメソッドです。" + "引数：" + str);
    }

    // String型の引数を2つ持つインスタンスメソッド
    public void sameName(String str1, String str2) {
        System.out.println("String型の引数を1つ持つsameNameメソッドです。" + "引数："  + str1 + ", " + str2);
    }
}