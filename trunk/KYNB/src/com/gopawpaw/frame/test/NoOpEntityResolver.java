package com.gopawpaw.frame.test;

import java.io.StringBufferInputStream;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

class NoOpEntityResolver implements EntityResolver {
	@SuppressWarnings("deprecation")
	public InputSource resolveEntity(String publicId, String systemId) {
		return new InputSource(new StringBufferInputStream(
				"D:\\Eclipse_Workspace\\GERP\\conf\\hibernate.cfg.xml"));
	}
}