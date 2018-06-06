/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {  //★
	  ArrayList<Player> array = new ArrayList<>();
		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

	    try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {

	    	while (scanner.hasNext()) {
	    	   Player player = new Player(); //*Playerインスタンスの宣言
	           String line = scanner.nextLine();
	           String[] line1  = line.split(",",0);

	           player.setPosition(line1[0]);
	           player.setName(line1[1]);
	           player.setCountry(line1[2]);
	           player.setTeam(line1[3]);

	           array.add(player);
	        }

	    }catch (FileNotFoundException e) {
	         System.out.println("ファイルが見つかりません");
	     }
//////////////////////////////////////////////////////////////////////////////////////
		Collections.shuffle(array);
		int gkCount = 0;
		int dfCount = 0;
		int mfCount = 0;
		int fwCount = 0;
		for (Player player : array) {
			switch (player.getPosition()) {
				case "GK":
					if (gkCount < 1) {
						System.out.println(player);
						gkCount++;
					}
					break;

				case "DF":
					if (dfCount < 4) {
						System.out.println(player);
						dfCount++;
					}
					break;

				case "MF":
					if (mfCount < 4) {
						System.out.println(player);
						mfCount++;
					}
					break;

				case "FW":
					if (fwCount < 2) {
						System.out.println(player);
						fwCount++;
					}
					break;
			}
		}
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
	}
}
