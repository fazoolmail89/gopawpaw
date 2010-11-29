package com.gopawpaw.erp.hibernate.d;

/**
 * DprtDetId entity. @author MyEclipse Persistence Tools
 */
public class DprtDetId extends AbstractDprtDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DprtDetId() {
	}

	/** full constructor */
	public DprtDetId(String dprtMethod, Integer dprtYear, Integer dprtMnth) {
		super(dprtMethod, dprtYear, dprtMnth);
	}

}
