/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 { //★

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {
		ArrayList<Player> array = new ArrayList<Player>();
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
///////////////////////////////////////////////////////////////////////////////////////////
		for(int i = array.size()-1;i >= 0;i-- ) { //*後ろから順番に評価していかないとズレる（一回目にレアル・マドリードorバルセロナだった場合、その後ろのインスタンスは前に自動的につめていくから）
			if(array.get(i).getTeam().equals("レアル・マドリード") || array.get(i).getTeam().equals("バルセロナ") ) {
				array.remove(i);
			}
		}
		for (Player player : array) {
			System.out.println(player);
		}












	}
}














