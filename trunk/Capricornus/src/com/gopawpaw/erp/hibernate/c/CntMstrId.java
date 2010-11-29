package com.gopawpaw.erp.hibernate.c;

/**
 * CntMstrId entity. @author MyEclipse Persistence Tools
 */
public class CntMstrId extends AbstractCntMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CntMstrId() {
	}

	/** minimal constructor */
	public CntMstrId(String cntUserid, String cntSid) {
		super(cntUserid, cntSid);
	}

	/** full constructor */
	public CntMstrId(String cntApplication, String cntUserid, String cntSid) {
		super(cntApplication, cntUserid, cntSid);
	}

}
