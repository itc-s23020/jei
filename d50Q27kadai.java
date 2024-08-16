// s23020
//指定された数字を出す 

public class d50Q27kadai {
    public static void main(String[] args) {
        // コマンドライン引数が指定されていない場合のエラーチェック
        if (args.length == 0) {
            System.out.println("引数を指定してください。");
            return;
        }

        int control;
        try {
            control = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("引数は整数でなければなりません。");
            return;
        }

        String a;
        switch (control) {
            case 1:
                a = "Warm";
                break;
            case 2:
                a = "Cool";
                break;
            case 3:
                a = "Wind";
                break;
            default:
                a = "Unknown"; // controlが1, 2, 3のいずれでもない場合のデフォルト値
                break;
        }
        System.out.println(a);
    }
}

