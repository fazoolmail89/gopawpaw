package com.gopawpaw.erp.hibernate.s;

/**
 * SrocCtrl entity. @author MyEclipse Persistence Tools
 */
public class SrocCtrl extends AbstractSrocCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SrocCtrl() {
	}

	/** minimal constructor */
	public SrocCtrl(Double oidSrocCtrl) {
		super(oidSrocCtrl);
	}

	/** full constructor */
	public SrocCtrl(Integer srocSro, Integer srocQad01, String srocUser1,
			String srocUser2, Integer srocQadi01, String srocSroPre,
			Double oidSrocCtrl) {
		super(srocSro, srocQad01, srocUser1, srocUser2, srocQadi01, srocSroPre,
				oidSrocCtrl);
	}

}
