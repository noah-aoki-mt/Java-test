public class Employee2 {
    private String name;
    private static int members = 0;

    // 引数なしのコンストラクタ
    public Employee2() {
        this.name = "匿名希望";
         members++;
    }

    // 文字列を引数に持つコンストラクタ
    public Employee2(String name) {
        if (name.length() > 10) {
            StringBuilder sb = new StringBuilder(name);
            sb.setLength(10);
            this.name = sb.toString();
        } else {
            this.name = name;
        }
         members++;
    }

    // 名前を標準出力するメソッド
    public void printName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + name + "です。");
    }

    // 社員の人数を出力するクラスメソッド
    public static void printNumber() {
        System.out.println("社員は全部で" + members + "です。");
    }
}