package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {

		// 入力準備
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 商品名の入力
		String[] itemNames = new String[5];
		for (int i = 0; i < itemNames.length; i++) {
			System.out.print("商品" + (i+1) + "を入力してください。：> ");
			itemNames[i] = br.readLine();
		}

		System.out.println("各商品の単価を順に入力してください。");

		// 商品単価
		int[] prices = new int[5];
		for (int i = 0; i < prices.length; i++) {
			System.out.print(itemNames[i] + "の単価：> "); // 商品名を出力に使用
			prices[i] = Integer.parseInt(br.readLine());
		}

		// 登録商品一覧を出力
		System.out.println("登録商品一覧");
		for (int i = 0; i < itemNames.length; i++) {
			System.out.println(itemNames[i] + "：" + prices[i] + "円");
		}

	}

}
