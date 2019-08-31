package com.panzhanpeng.designpatters.create.singleTon;

/**
 * ��̬�ڲ��൥��
 * @author panzhanpeng
 * @since 2019-8-24
 */
public class StaticInnerSingle {

	private StaticInnerSingle () {}
	
	public static StaticInnerSingle getInstance() {
		return InnerSingle.staticInnerSingle;
	}
	
	static class InnerSingle {
		private static StaticInnerSingle staticInnerSingle = new StaticInnerSingle();
	}
}
