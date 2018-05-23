package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		car1.color = "red";
		car1.gasoline = 10;

		Car car2 = new Car();
		car2.color = "green";
		car2.gasoline = 20;

		Car car3 = new Car();
		car3.color = "black";
		car3.gasoline = 15;



		// 目的地までの距離
				final int distance = 300;
				int sum1 = 0; // carクラスのrunメソッドから返された値（距離）の合計
				int count1 = 0; //目的地に行くのにかかった時間

				 while(true) {
				   int run1 = car1.run();
				   count1++;

					  if(run1 == -1) {
						System.out.println("目的地に到達できませんでした");
						break;
					}

					sum1 += run1;
					System.out.println(sum1);

					  if(sum1 >= distance) {
						System.out.println("目的地にまで" + count1 + "時間かかりました。残りのガソリンは、" + car1.gasoline + "リットルです");
						break;
					}
				}

					int sum2 = 0; // carクラスのrunメソッドから返された値（距離）の合計
					int count2= 0; //目的地に行くのにかかった時間

					 while(true) {
					   int run2 = car2.run();
					   count2++;

						  if(run2 == -1) {
							System.out.println("目的地に到達できませんでした");
							break;
						}

						sum2 += run2;
						System.out.println(sum2);

						  if(sum2 >= distance) {
							System.out.println("目的地にまで" + count2 + "時間かかりました。残りのガソリンは、" + car2.gasoline + "リットルです");
							break;
						}
					}

						int sum3 = 0; // carクラスのrunメソッドから返された値（距離）の合計
						int count3 = 0; //目的地に行くのにかかった時間

						 while(true) {
						   int run3 = car3.run();
						   count3++;

							  if(run3 == -1) {
								System.out.println("目的地に到達できませんでした");
								break;
							}

							sum3 += run3;
							System.out.println(sum3);

							  if(sum3 >= distance) {
								System.out.println("目的地にまで" + count3 + "時間かかりました。残りのガソリンは、" + car3.gasoline + "リットルです");
								break;
							}
						}



















	}
}
