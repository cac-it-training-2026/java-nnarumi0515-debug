package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 購入数
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(br.readLine()); // 購入数を取得
		}

		// 合計金額を集計
		int totalPrice = 0;
		for (int i = 0; i < itemNames.length; i++) {
			totalPrice += (prices[i] * amounts[i]); // （単価*購入数）を加算していく。
		}

		// 割引前の合計金額
		System.out.println("割引前合計" + totalPrice + "円");

		// 条件
		//合計金額を計算後、以下の条件に応じて割引処理を行う。
		//①合計金額が5,000円以上の場合、「10％」割引
		//②それ以外の場合、割引なし
		if (totalPrice >= 5000) {
			int discountRate = 10; // 割引率（10%）
			int discountAmount = totalPrice * discountRate / 100; // 10％割引
			totalPrice = totalPrice - discountAmount;
			// 割引価格
			System.out.println("割引適用（10％OFF）：" + totalPrice + "円");
		} else {
			System.out.println("割引適用無し");
		}

		// 税率10％を各商品の小計に加算して、合計金額（税込）を表示する。
		int taxIncluded = totalPrice + (totalPrice * 10 / 100);
		System.out.println("税込金額：" + taxIncluded + "円");
	}

}
