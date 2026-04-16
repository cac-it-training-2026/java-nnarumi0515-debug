package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		int basePrice = 1200; // 通常料金
		int tickets = 3; // チケット購入枚数

		int reducedPrice = basePrice - 200; // 1,000 円 値引き後
		int reducedTickets = --tickets; // デクリメント

		int totalPrice = reducedPrice * reducedTickets; // 合計金額

		double taxRate = 1.1; // 税率
		int totalWithTax = (int) (totalPrice * taxRate);
		
		System.out.println("購入可能枚数は" + reducedTickets + "枚です。");
		System.out.println("値下げ後の1枚あたりの料金は" + reducedPrice + "円です。");
		System.out.println("合計金額（税抜）は"+ totalPrice + "円です。");
		System.out.println("合計金額（税込）は" + totalWithTax + "円です。");
		
	}
}
