package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };

		// TODO: 実装ここから
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int amounts[] = new int[5]; // 購入個数

		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(br.readLine()); // 購入個数を代入
		}
		
		// 合計金額を定義
		int totalPrice = 0;
		
		// 各商品の小計（単価*個数）、全体の合計金額を表示
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：" + (prices[i]*amounts[i])+ "円");
			totalPrice += (prices[i]*amounts[i]); // 金額を加算
		}
		
		// 合計金額の出力
		System.out.println("合計金額：" + totalPrice + "円");
		
	}
}
