package com.gopawpaw.erp.hibernate.l;

/**
 * LngMstr entity. @author MyEclipse Persistence Tools
 */
public class LngMstr extends AbstractLngMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LngMstr() {
	}

	/** minimal constructor */
	public LngMstr(Double oidLngMstr) {
		super(oidLngMstr);
	}

	/** full constructor */
	public LngMstr(String lngDir, Integer lngNbr, String lngDesc,
			String lngUser1, String lngUser2, String lngQad01, String lngQad02,
			Double oidLngMstr) {
		super(lngDir, lngNbr, lngDesc, lngUser1, lngUser2, lngQad01, lngQad02,
				oidLngMstr);
	}

}
