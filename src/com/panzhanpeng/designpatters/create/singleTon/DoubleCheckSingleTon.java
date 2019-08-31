package com.panzhanpeng.designpatters.create.singleTon;

/**
 * ����ģʽ֮˫������鵥��ģʽ
 * @author panzhanpeng
 * @since 2019-8-21
 */
public class DoubleCheckSingleTon {
	
	private static volatile DoubleCheckSingleTon doubleCheckSingleTon = null;
	
	private DoubleCheckSingleTon() {}
	
	public static DoubleCheckSingleTon getInstance() {
		if (doubleCheckSingleTon == null) {
			synchronized (DoubleCheckSingleTon.class) {
				if (doubleCheckSingleTon == null) {
					doubleCheckSingleTon = new DoubleCheckSingleTon();
				}
			}
		}
		return doubleCheckSingleTon;
	}
	
}
