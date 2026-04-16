package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_5 {

	public static void main(String[] args) throws IOException {

		// 登録商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 120, 80, 50, 250, 100 }; 
		// 購入数（変更不可）
		int[] amounts = new int[5]; 
		
		// TODO: 実装ここから

		int taxRate = 10; // 税率10％
		int discountRate = 10; // 割引10％

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 購入数を入力
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "の購入数：>");
			amounts[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("購入内容一覧：");

		int total = 0; // 合計（税込）

		// 商品ごとの小計（税込）を計算して表示
		for (int i = 0; i < itemNames.length; i++) {
			int priceWithTax = prices[i] + (prices[i] * taxRate / 100);
			int subtotal = priceWithTax * amounts[i];
			total += subtotal;

			System.out.println(itemNames[i] + "：単価" + prices[i] + "円（税込" + priceWithTax + "円） × "
					+ amounts[i] + "個 = " + subtotal + "円");
		}

		System.out.println("合計（税込）：" + total + "円");

		// 割引適用
		int discountedTotal = total;
		if (total >= 5000) {
			discountedTotal = total - (total * discountRate / 100);
		}
		System.out.println("割引後合計（税込）：" + discountedTotal + "円");
	}

}