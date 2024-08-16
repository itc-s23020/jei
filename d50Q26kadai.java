// s23020
// 列挙型の課題
//列挙型で定義したコンディションを３つとも出力


enum Condition {
	ROAD, MUD, SNOW
}

class d50Q26kadai {
	public static void main(String[] args) {
		for (int i = 0; i < Condition.values().length; i++) {
			System.out.println("Condition " + i + ": " + Condition.values()[i]);
		}
	}
}
