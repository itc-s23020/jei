// s23020
// 数をソートして途中経過と最終結果を出力

public class d50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        // コマンドライン引数を整数に変換して配列に格納
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int a;
        for (int i = 1; i < num.length; i++) {
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                  a = num[j];
                num[j] = num[j + 1];
                num[j + 1] = a;
            }
            // ソート途中の配列
            System.out.print("ソート途中:");
            for (int val : num) {
                System.out.print(val + " ");
            }
            System.out.println(); //改行
        }

        // ソート結果の出力
        System.out.println("-------------------");
        System.out.print("ソート結果:");
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println(); // 改行
    }
}
