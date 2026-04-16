package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int applePrice = 100;
		String stationery = "鉛筆";

		int bananaPrice = applePrice;
		String writingUtensilString = stationery;

		System.out.println("リンゴ値段は" + applePrice + "です。");
		System.out.println("バナナの値段は" + bananaPrice + "です。");
		System.out.println("この筆記用具は" + writingUtensilString + "です。");

	}

}
