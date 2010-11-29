package com.gopawpaw.erp.hibernate.c;

/**
 * CrcCtrl entity. @author MyEclipse Persistence Tools
 */
public class CrcCtrl extends AbstractCrcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CrcCtrl() {
	}

	/** minimal constructor */
	public CrcCtrl(Double oidCrcCtrl) {
		super(oidCrcCtrl);
	}

	/** full constructor */
	public CrcCtrl(Integer crcQadi01, Integer crcNbr, String crcUser1,
			String crcUser2, String crcQadc01, Double oidCrcCtrl) {
		super(crcQadi01, crcNbr, crcUser1, crcUser2, crcQadc01, oidCrcCtrl);
	}

}
