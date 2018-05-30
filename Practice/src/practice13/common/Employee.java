package practice13.common;

public class Employee extends Person {

	//* フィールド
	private String departmentNm; //*departmentNm（部署名）		:	String
	private int departmentCnt;   //*departmentCnt（部署人数）	:	int



	//* メソッド 各フィールドのアクセサ
	public String getDepartmentNm() {
		return departmentNm;
	}
	public void setDepartmentNm(String departmentNm) {
		this.departmentNm = departmentNm;
	}




	public int getDepartmentCnt() {
		return departmentCnt;
	}
	public void setDepartmentCnt(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
}
/*
 * ★ common.Personクラスを継承して、common.Employeeクラスを作成してください
 *
 * フィールド
 * 		departmentNm（部署名）		:	String
 * 		departmentCnt（部署人数）	:	int
 * メソッド
 * 		各フィールドのアクセサ
 */