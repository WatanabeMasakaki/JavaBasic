package practice09;

import practice09.util.Util;

/*
 * PTra09_01.java
 *   作成	LIKEIT	2017 str
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra09_01 {
	public static void main(String[] args) {
		String  str = "この文字列をゆっくり表示したい";

		// ★ 変数strを、Util内のメソッドを用いて0.5秒間隔で表示させなさい
		// ※ Utilはインポートしても良いし、完全限定名で記述しても良いです


					/* エラーが発生した場合はここにくる */
	  Util.dispMessageSlowly(str, 500) ;
	  
//↑Util.dispMess〜にカーソル合わせれば作成したパッケージの候補が出てくるからそれをクリックすれば自動的にインポート文が上の
	 // 行に追加される。
	}
}


