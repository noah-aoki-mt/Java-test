public class EmployeeScores {
    public static void main(String[] args) {
       int [] scores ={20,30,45,35};
       int numberOfEmployees = scores.length;
      for(int i = 0; i<numberOfEmployees; i++){
          System.out.println((i+1)+"番目の社員の点数は"+scores[i]+"です。");
      }
       System.out.println("過去問を解いた社員の数は全部で"+ numberOfEmployees + "人です。");
    }  
}