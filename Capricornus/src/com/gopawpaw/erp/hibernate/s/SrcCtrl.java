package com.gopawpaw.erp.hibernate.s;

/**
 * SrcCtrl entity. @author MyEclipse Persistence Tools
 */
public class SrcCtrl extends AbstractSrcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SrcCtrl() {
	}

	/** minimal constructor */
	public SrcCtrl(Double oidSrcCtrl) {
		super(oidSrcCtrl);
	}

	/** full constructor */
	public SrcCtrl(Integer srcNbr, String srcUser1, String srcUser2,
			Integer srcQadi01, String srcQadc01, Double oidSrcCtrl) {
		super(srcNbr, srcUser1, srcUser2, srcQadi01, srcQadc01, oidSrcCtrl);
	}

}
