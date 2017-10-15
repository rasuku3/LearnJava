/**
 *
 */
package main;

import java.util.ArrayList;

/**
 * @author yuki
 *
 */
public class SampleCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		trainNotThrowConcurrentModificationException();

	}

	/**
	 * removeメソッドをforeachで使用してもエラーにならないことを証明するメソッド
	 */
	private static void trainNotThrowConcurrentModificationException() {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		// ここに↓のコードを挿入すると例外発生となる。タイミングは、次の要素の処理開始時。
		//		list.add("D");
		for (String str : list) {
			System.out.println("要素" + str + "処理開始");
			if ("B".equals(str)) {
				list.remove(str);
			} else {
				System.out.println(str);
			}
			System.out.println("要素" + str + "処理終了");
		}
	}

}
