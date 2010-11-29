package com.gopawpaw.erp.hibernate.h;

/**
 * HdMstr entity. @author MyEclipse Persistence Tools
 */
public class HdMstr extends AbstractHdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HdMstr() {
	}

	/** minimal constructor */
	public HdMstr(HdMstrId id, Double oidHdMstr) {
		super(id, oidHdMstr);
	}

	/** full constructor */
	public HdMstr(HdMstrId id, String hdDesc, String hdUser1, String hdUser2,
			String hdQadc01, Double oidHdMstr) {
		super(id, hdDesc, hdUser1, hdUser2, hdQadc01, oidHdMstr);
	}

}
