package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int amountBooks = 0; // 売却した本の冊数
		int sellFlag = 0; // 売却するかどうか
		int bookPrice = 200; // 本の値段

		System.out.println("本を売却します。");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 入力準備

		do {
			amountBooks++;
			System.out.println("売却する本の冊数を1つ増やしますか？");
			System.out.println("はい：0、いいえ：1 >");
			sellFlag = Integer.parseInt(br.readLine());
		} while (sellFlag == 0);

		// 本の冊数を出力
		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + (bookPrice * amountBooks) + "円です。");

	}

}
