/**
 *
 */
package main;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 */
public class SampleLocalDateTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		trainIsBeforeAfter();
	}

	/**
	 * LocalDateのisBefore、isAfterメソッドの動作確認
	 */
	private static void trainIsBeforeAfter() {
		LocalDate d1 = LocalDate.of(2016, Month.APRIL, 1);
		LocalDate d2 = LocalDate.of(2017, Month.APRIL, 1);

		System.out.println(d1.toString() + "と" + d2.toString() + "では前者のほうがbeforeである。");
		System.out.println(d1.isBefore(d2));
		System.out.println(d1.toString() + "と" + d2.toString() + "では後者のほうがafterである。");
		System.out.println(d2.isAfter(d1));
	}
}
