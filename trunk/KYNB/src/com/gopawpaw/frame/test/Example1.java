package com.gopawpaw.frame.test;

//Copyright 2003 Sun Microsystems, Inc. All Rights Reserved.
//
//Redistribution and use in source and binary forms, with or
//without modification, are permitted provided that the following
//conditions are met:
//
//- Redistributions of source code must retain the above copyright
//notice, this list of conditions and the following disclaimer.
//
//- Redistribution in binary form must reproduce the above
//copyright notice, this list of conditions and the following
//disclaimer in the documentation and/or other materials
//provided with the distribution.
//
//Neither the name of Sun Microsystems, Inc. or the names of
//contributors may be used to endorse or promote products derived
//from this software without specific prior written permission.
//
//This software is provided "AS IS," without a warranty of any
//kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
//WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
//FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
//EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY
//DAMAGES OR LIABILITIES SUFFERED BY LICENSEE AS A RESULT OF OR
//RELATING TO USE, MODIFICATION OR DISTRIBUTION OF THIS SOFTWARE OR
//ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE
//FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT,
//SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
//CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF
//THE USE OF OR INABILITY TO USE THIS SOFTWARE, EVEN IF SUN HAS
//BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
//
//You acknowledge that this software is not designed, licensed or
//intended for use in the design, construction, operation or
//maintenance of any nuclear facility.

import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.synth.*;

public class Example1 {
	public static void main(String[] args) throws Throwable {
		String xmlFile = "example1.xml";

		if (args.length > 0) {
			xmlFile = args[0];
		}
		SynthLookAndFeel laf = new SynthLookAndFeel();
		laf.load(Example1.class.getResourceAsStream(xmlFile), Example1.class);
		UIManager.setLookAndFeel(laf);

		JFrame frame = new JFrame("Test");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new JTextField("example"));
		frame.pack();
		frame.show();
	}
}
