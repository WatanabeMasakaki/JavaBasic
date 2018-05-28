package practice13.common;

public class SuperHero extends Hero {
	//フィールド
	Item equipment; //*Item型のフィールドを宣言→（スライド12のp４）


	//メソッド
	public int attack() { //attackメソッドのオーバーライド
		return super.attack() + equipment.getAdditionalDamage();
	}


	public Item getEquipment() {
		return equipment;
	}


	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

//*アクセスの宣言→左クリック→ソース→getterおよびsettterの生成........

}
/*
 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
 *
 * フィールド
 * 		equipment	:	common.Item
 * メソッド
 * 		attackメソッドをオーバーライドし、
 * 		powerに加えて、additionalDamage分を加算した値としてください
 *
 * 		equipmentのアクセサ
 */




















