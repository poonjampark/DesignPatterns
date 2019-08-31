package com.panzhanpeng.designpatters.create.singleTon;

/**
 * 静态内部类单例
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
