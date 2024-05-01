import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayListの作成
        ArrayList<String> members = new ArrayList<>();
        // 内定者の名前を追加
        members.add("青木希海");
        members.add("尾ノ井理愛");
        members.add("佐々木菜穂");
        members.add("長岡輝貴");
        members.add("中島帆乃香");
        // 全員の名前と人数を出力
        System.out.println("内定者のメンバーを紹介します。");
        for (String member : members) {
            System.out.println(member);
        }
        System.out.println("人数: " + members.size());
    }
}