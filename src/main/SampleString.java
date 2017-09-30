package main;

public class SampleString {
	public static void main(String[] args) {
		trainReplaceAll();
		trainStringBuilder();
	}

	private static void trainReplaceAll() {
		System.out.println("★String.replaceAll");
		String str = "hoge world";
		System.out.println(str.replaceAll("hoge", "hello"));
		System.out.println(str);
	}

	private static void trainStringBuilder() {
		StringBuilder sb = new StringBuilder("abcde");
		// StringBuilderには初めから16文字のバッファが存在する。
		System.out.println("★StringBuilder.capacity");
		System.out.println(sb.length());
		System.out.println(sb.capacity());

		System.out.println("★StringBuilder.append");
		// StringBuilderなので、ミュータブル
		sb.insert(0, "X");
		System.out.println(sb.toString());

		System.out.println("★StringBuilder.delete");
		sb.delete(0, 1);
		System.out.println(sb.toString());

		System.out.println("★StringBuilder.replace");
		sb.replace(0, 1, "A");
		System.out.println(sb.toString());

	}

}
