package app;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JProgressBar;

public class Analyzer implements Runnable {
	CmdShell cmds = null;
	TraceData traceData = null; 
	ArrayList<TraceData> traceDatas = null;
	private JProgressBar jProgressBar = null;
	
	public ArrayList<TraceData> getTraceDatas() {
		if(traceDatas == null){
			traceDatas = new ArrayList<TraceData>();
			
			analysisTraceDataFromCMD();
		}
		return traceDatas;
	}
	
	public void setTraceDatas(ArrayList<TraceData> traceDatas){
		this.traceDatas = traceDatas;
	}

	public Analyzer(){
		cmds = new CmdShell();
	}
	
	/**
	 * 将CMD命令行返回结果解析为TraceData数据格式
	 * @return
	 */
	private boolean analysisTraceDataFromCMD(){
		ArrayList<String> arrl = (ArrayList<String>) cmds.getActiveConnections();
		Iterator<?> it = arrl.iterator();
		
		while (it.hasNext()) {
			String onerec = (String) it.next();
			
			char[] ch = new char[10];
			String tem = null;
			String[] tems = null;
			onerec.getChars(0, 9, ch, 0);
			tem = new String(ch);
			tem = tem.trim();
			
			if(tem.equals("TCP")){
				TraceData trd = new TraceData();
				
				//协议
				trd.setProto(tem);
			
				
				char[] ch2 = new char[23];
				onerec.getChars(9, 32, ch2, 0);
				tems = ((new String(ch2)).trim()).split(":", 2);
				//本地IP
				trd.setLocalAddress(tems[0]);
				//本地端口
				trd.setLocalprot(tems[1]);
			
				
				char[] ch3 = new char[23];
				onerec.getChars(32, 55, ch3, 0);
				tems = ((new String(ch3)).trim()).split(":", 2);
				//远程IP
				trd.setForeignAddress(tems[0]);
				//远程端口
				trd.setForeignprot(tems[1]);
			
				//状态
				char[] ch4 = new char[onerec.length() - 55];
				onerec.getChars(55, onerec.length(), ch4, 0);
				trd.setState((new String(ch4)).trim());
			
				traceDatas.add(trd);
			}
		}
		return true;
	}
	
	/**
	 * 获取物理位置
	 * @param ip
	 * @return
	 */
	public String getGeographicalPosition(String ip){
		String address = null;
		
		byte b[] = new byte[100];
		int n = -1;
		
		
		if(ip.equals("0.0.0.0") || ip.equals("127.0.0.1")) return "本地计算机";
		
		try {
			URL url = new URL("http://www.gopawpaw.com/tool/getGeographicalPosition.php?actionip="+ip);
			InputStream in = url.openStream();
			
			while((n=in.read(b))!=-1){
				address = new String(b,0,n);
			}
		
		} catch (MalformedURLException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}catch (IOException e) {
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		return address;
	}
	public JProgressBar getJProgressBar() {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
			
		}
		return jProgressBar;
	}
	
	/**
	 * 解析物理位置
	 */
	public void run() {
		// TODO 自动生成方法存根
		int alln = getTraceDatas().size();
		
		getJProgressBar().setMaximum(alln);
		
		Iterator it = traceDatas.iterator();
		
		int i = 0;
		while (it.hasNext()) {
			
			i++;
			TraceData trd = (TraceData) it.next();
			trd.setGeographicalPosition(getGeographicalPosition(trd.getForeignAddress()));
			
			getJProgressBar().setValue(i);
			getJProgressBar().setStringPainted(true);
			
		}
		
	}
	
	/**
	 * 截取开始与结束增加的数据
	 * @param start
	 * @param end
	 * @return
	 */
	public static Analyzer intercepting( Analyzer anstart, Analyzer anend ){
		
		ArrayList<TraceData> start = anstart.getTraceDatas();
		ArrayList<TraceData> end = anend.getTraceDatas();
		ArrayList<TraceData> traceBTs = new ArrayList<TraceData>();
		Analyzer anBT = new Analyzer();
		int sn = start.size();
		int en = end.size();
		System.out.println("Analyzer.intercepting()");
		for(int e=0;e<en;e++){
			boolean bk = true;
			for(int s=0;s<sn;s++){
				
					if(end.get(e).ifEqual(start.get(s))){
						
						bk = false;
					}else{
						
					}
				
			}
			System.out.println("------------false");
			if(bk){
				traceBTs.add(end.get(e));
				System.out.println((end.get(e)).getForeignAddress());
			}
		}
		
		anBT.setTraceDatas(traceBTs);
		
		return anBT;
	}
}
