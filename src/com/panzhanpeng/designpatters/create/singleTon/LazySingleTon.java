package com.panzhanpeng.designpatters.create.singleTon;

/**
   *   ÀÁººÄ£Ê½
 * @author panzhanpeng
 * @since 2019-8-21
 */
public class LazySingleTon {

	private static LazySingleTon lazySingleTon = new LazySingleTon();
	
	private LazySingleTon() {}
	
	public static LazySingleTon getInstance() {
		return lazySingleTon;
	}
	
	public static void main(String[] args) {
		LazySingleTon lazySingleTon = new LazySingleTon();
		System.out.println(lazySingleTon.getClass());
	}

}
