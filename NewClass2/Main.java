package seattle;

public class Main {
    public static void main(String[] args) {
        // SeattleEmployeeクラスのインスタンスを作成し、社員名をセット
        SeattleEmployee employee1 = new SeattleEmployee();
        employee1.setEmpName("森本真由");

        // SeattleSSEmployeeクラスのインスタンスを作成し、社員名をセット
        SeattleSSEmployee employee2 = new SeattleSSEmployee();
        employee2.setEmpName("pepper");

        // 社員名と所属部署を出力
        System.out.println("SeattleEmployee: " + employee1.getEmpName() + ", 所属部署: " + employee1.getDept());
        System.out.println("SeattleSSEmployee: " + employee2.getEmpName() + ", 所属部署: " + employee2.getDept());
    }
}