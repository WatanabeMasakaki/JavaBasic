package practice09;
/*
 * PTra09_01.java
 *   作成	LIKEIT	2017 str
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_01 {
	public static void main(String[] args) {
		String message = "この文字列をゆっくり表示したい";

		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです
		
					/* エラーが発生した場合はここにくる */
	   String moji = practice09.util.Util.dispMessageSlowly(message,millisecond);
         
	     System.out.println(moji);
		
		
		
	}
}
