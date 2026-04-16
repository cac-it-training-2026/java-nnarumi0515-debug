package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		int[] ageGroup = {23,33,26,21,25,22}; // 初期化して配列を作成
		
		System.out.println("4番目の人の年齢を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int temporaryAge = Integer.parseInt(br.readLine()); // 一時的に変数に格納
		
		ageGroup[3] = temporaryAge; // 4番目の要素に代入
		
		System.out.println("4番目の人の年齢は" + ageGroup[3] + "歳です。"); // 出力
		System.out.println("人数は" + ageGroup.length + "人です。"); // 要素数
		
	}

}
