package app;

import java.util.Iterator;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根
		Analyzer analyzer = new Analyzer();
		
		Iterator it = (analyzer.getTraceDatas()).iterator();
		
		while(it.hasNext()){
			TraceData trd = (TraceData) it.next();
				
			System.out.println(trd.getProto());
			System.out.print("  本地IP："+trd.getLocalAddress());
			System.out.print("  本地端口："+trd.getLocalprot());
			System.out.print("  远程IP："+trd.getForeignAddress());
			System.out.print("  远程端口"+trd.getForeignprot());
			System.out.print("  状态："+trd.getState());
			System.out.print("  物理地址："+trd.getGeographicalPosition());
		}
	}

}
