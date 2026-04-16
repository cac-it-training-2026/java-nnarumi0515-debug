package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stocks[] = new int[5]; // 在庫数を定義

		// 在庫数の入力処理
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "の在庫数：>");
			stocks[i] = Integer.parseInt(br.readLine()); // 入力した在庫数を代入
		}

		// 購入数の入力（在庫数チェック）
		for (int i = 0; i < itemNames.length; i++) {

			int amount = 0;
			boolean isValid = false; // 入力検証の合否（有効かどうか）

			while (!isValid) {
				System.out.println(itemNames[i] + "の購入数：>");
				amount = Integer.parseInt(br.readLine()); // 購入数を取得

				// 在庫数を超過しているか確認
				if (amount > stocks[i]) {
					System.out.println("在庫を超えています。もう一度入力してください。");
					// isInputValid は false のままなので、whileループが継続
				} else {
					// 在庫以内であればOK
					amounts[i] = amount; // 在庫確定
					isValid = true; // ループを終了
				}
			}
		}

		// 各商品の購入数、在庫数を出力
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：" + "購入" + amounts[i] + "個");
			System.out.println("在庫" + stocks[i] + "個");
		}

		// 合計金額を集計
		int totalPrice = 0;
		for (int i = 0; i < itemNames.length; i++) {
			totalPrice += (prices[i] * amounts[i]); // （単価*購入数）を加算していく。
		}

		// 購入商品の合計金額を出力
		System.out.println("合計金額：" + totalPrice + "円");

	}
}
