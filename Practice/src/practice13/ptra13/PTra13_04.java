/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

import practice13.common.Hero;
import practice13.common.Slime;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
   
	Hero hero = new Hero();
    
    Slime slime = new Slime();
    

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */


		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
while (hero.this.hp > 0 && slime.this.hp > 0) {
	
	int attack1 = hero.attack();
	boolean damage1 = hero.damage(attack1);
	
	int attack2 = slime.attack();
	boolean damage2 = slime.damage(attack2);
	
	if(damage1 = true) {
	  System.out.println("スライムはヒーローとの戦闘に勝利した");
	}else {
      System.out.println("ヒーローはスライムとの戦闘に勝利した");
	
	}
}
    
	}
}
