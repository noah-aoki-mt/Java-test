public class Employee {
    private String name;

    // 引数なしのコンストラクタ
    public Employee() {
        this.name = "匿名希望";
    }

    // 文字列を引数に持つコンストラクタ
    public Employee(String name) {
        // 引数の文字列が10文字以上の場合は切り捨てる
        if (name.length() > 10) {
            StringBuilder sb = new StringBuilder(name);
            sb.setLength(10); // 10文字以降を削除
            this.name = sb.toString();
        } else {
            this.name = name;
        }
    }

    // 名前を標準出力するメソッド
    public void printName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + name + "です。");
    }
}
