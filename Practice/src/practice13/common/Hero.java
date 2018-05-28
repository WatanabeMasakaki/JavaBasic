package practice13.common;

  public class Hero extends Character {
	public Hero() {     //コンストラクタを宣言
		 super(25,10,7);//Characterデフォルトコンストラクタの引数を設定
	}

}
  /*
	 * ★ common.Characterクラスを継承した、common.Heroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 */


  //*継承スライドのP9と12スライドのp１２を見よ//
 //親クラスCharacterで子クラスHeroで実行すると、Characterデフォルトコンストラクタ→Heroクラスデフォルトコンストラクタの順番
 // で出力されるから引き数を与えてあげないとエラーになる。

