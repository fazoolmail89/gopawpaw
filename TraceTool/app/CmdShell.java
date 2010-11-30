package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CmdShell {

	static CmdShell cmdShell = new CmdShell();
	
	private static final ArrayList<String> cmdAction(String cmd) {
		ArrayList<String> al = new ArrayList<String>();
		Runtime rt = Runtime.getRuntime();
		String c5 = "cmd.exe /C " + cmd;
		try {
			Process pr = rt.exec(c5);
			BufferedReader br = new BufferedReader(new InputStreamReader(pr
					.getInputStream()));
			while (true) {
				String s = br.readLine();
				if (s == null)
					break;
				if(!s.isEmpty())
					al.add(s);
			}
			br.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return al;
	}
	
	public ArrayList<?> getActiveConnections(){
		return cmdAction("netstat -an");
	}

}
