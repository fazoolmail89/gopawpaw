package com.gopawpaw.erp.hibernate.s;

/**
 * SgcdDet entity. @author MyEclipse Persistence Tools
 */
public class SgcdDet extends AbstractSgcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SgcdDet() {
	}

	/** minimal constructor */
	public SgcdDet(SgcdDetId id, String sgcdCarrier, Double oidSgcdDet) {
		super(id, sgcdCarrier, oidSgcdDet);
	}

	/** full constructor */
	public SgcdDet(SgcdDetId id, String sgcdCarrier, String sgcdUser1,
			String sgcdUser2, String sgcdQadc01, Double oidSgcdDet) {
		super(id, sgcdCarrier, sgcdUser1, sgcdUser2, sgcdQadc01, oidSgcdDet);
	}

}
