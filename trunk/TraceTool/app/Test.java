package app;

import java.util.Iterator;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɷ������
		Analyzer analyzer = new Analyzer();
		
		Iterator it = (analyzer.getTraceDatas()).iterator();
		
		while(it.hasNext()){
			TraceData trd = (TraceData) it.next();
				
			System.out.println(trd.getProto());
			System.out.print("  ����IP��"+trd.getLocalAddress());
			System.out.print("  ���ض˿ڣ�"+trd.getLocalprot());
			System.out.print("  Զ��IP��"+trd.getForeignAddress());
			System.out.print("  Զ�̶˿�"+trd.getForeignprot());
			System.out.print("  ״̬��"+trd.getState());
			System.out.print("  �����ַ��"+trd.getGeographicalPosition());
		}
	}

}
