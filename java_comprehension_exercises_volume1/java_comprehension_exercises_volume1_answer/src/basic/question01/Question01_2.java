package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		int applePrice = 100; // 値段の変数
		String stationery = "鉛筆"; // 文房具の変数

		int bananaPrice = applePrice;
		String writingUtensils = stationery;

		// コンソール出力
		System.out.println("りんごの値段は" + applePrice + "円です。");
		System.out.println("バナナの値段は" + bananaPrice + "円です。");
		System.out.println("この筆記用具は" + writingUtensils + "です。");

	}

}
