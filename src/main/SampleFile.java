/**
 *
 */
package main;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 */
public class SampleFile {

	private static final String fileRootPath = "C:\\pleiades\\sampleRootDirectory";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		trainMark();
	}

	/**
	 *
	 */
	private static void trainMark() {
		// 使用ファイル
		// abcdefgh
		String openFilePath = fileRootPath + "\\" + "sample" + "\\" + "sample.txt";

		try (BufferedReader in = new BufferedReader(new FileReader(openFilePath))) {

			for (int i = 0; i < 3; i++) {
				in.skip(i);
				System.out.print((char) in.read());
				//出力：acf
			}

			//未処理の文字から3文字まで記憶可能に現在地をマーク
			in.mark(3);
			System.out.println(in.readLine());
			//出力gh
			//マークした場所に現在地をリセット
			in.reset();
			System.out.println(in.readLine());
			//出力gh
			in.reset();
			System.out.println(in.readLine());
			//出力gh

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
