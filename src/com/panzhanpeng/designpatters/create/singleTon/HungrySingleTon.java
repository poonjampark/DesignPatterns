package com.panzhanpeng.designpatters.create.singleTon;

/**
   *   ¶öººµ¥ÀýÄ£Ê½
 * @author panzhanpeng
 * @since 2019-8-21
 */
public class HungrySingleTon {

	private static HungrySingleTon lazySingleTon = new HungrySingleTon();
	
	private HungrySingleTon() {}
	
	public static HungrySingleTon getInstance() {
		System.out.println("get lazySingleTon success");
		return lazySingleTon;
	}
	
}