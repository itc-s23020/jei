// s23020
//連結して表示できるようにした 

public class d49Q6kadai {
    public static void main(String[] arguments) {
        // StringBuilder を使って引数を連結
        StringBuilder sb = new StringBuilder();
        for (String arg : arguments) {
            sb.append(arg);
        }
        
        // 結果を表示
        System.out.println(sb.toString());
    }
}
