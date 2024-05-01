public class Main {

    public static void main(String[] args) {
        // 4人の社員の点数を格納する二次元配列
        int[][] seiseki = {
            {20, 50, 60},
            {30, 60, 70},
            {45, 60, 80},
            {35, 40, 50}
        };

        // それぞれの社員の1回目から3回目までの点数を出力
        for (int i = 0; i < seiseki.length; i++) {
            for (int j = 0; j < seiseki[i].length; j++) {
                System.out.println("社員" + (i + 1) + "の" + (j + 1) + "回目の点数は" + seiseki[i][j] + "点です。");
            }
        }
    }
}