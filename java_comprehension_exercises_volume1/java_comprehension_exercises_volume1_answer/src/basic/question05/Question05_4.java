package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */

public class Question05_4 {

	public static void main(String[] args) throws IOException {

		System.out.println("数学の試験結果の点数を入力してください。");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int math = Integer.parseInt(br.readLine()); // 数学の点数

		System.out.println("国語の試験結果の点数を入力してください。");
		int japanese = Integer.parseInt(br.readLine()); // 国語の点数

		// 条件分岐
		if (math >= 60 && japanese >= 60) {
			System.out.println("数学、国語ともに合格です。");
		} else if (math >= 60 || japanese >= 60) {
			System.out.println("数学、国語どちらかが合格です。");
		}else {
			System.out.println("どちらの教科も不合格です。");
		}

	}
}
