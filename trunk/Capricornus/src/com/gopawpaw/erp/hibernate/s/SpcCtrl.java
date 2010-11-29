package com.gopawpaw.erp.hibernate.s;

/**
 * SpcCtrl entity. @author MyEclipse Persistence Tools
 */
public class SpcCtrl extends AbstractSpcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SpcCtrl() {
	}

	/** minimal constructor */
	public SpcCtrl(Double oidSpcCtrl) {
		super(oidSpcCtrl);
	}

	/** full constructor */
	public SpcCtrl(Integer spcNbr, Integer spcQad01, String spcUser1,
			String spcUser2, Integer spcQadi01, Double oidSpcCtrl) {
		super(spcNbr, spcQad01, spcUser1, spcUser2, spcQadi01, oidSpcCtrl);
	}

}
