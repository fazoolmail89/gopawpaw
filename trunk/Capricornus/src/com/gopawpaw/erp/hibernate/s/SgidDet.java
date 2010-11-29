package com.gopawpaw.erp.hibernate.s;

/**
 * SgidDet entity. @author MyEclipse Persistence Tools
 */
public class SgidDet extends AbstractSgidDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SgidDet() {
	}

	/** minimal constructor */
	public SgidDet(SgidDetId id, String sgidPreshipNrId, String sgidShipNrId,
			String sgidFormat, Double oidSgidDet) {
		super(id, sgidPreshipNrId, sgidShipNrId, sgidFormat, oidSgidDet);
	}

	/** full constructor */
	public SgidDet(SgidDetId id, String sgidPreshipNrId, String sgidShipNrId,
			String sgidFormat, String sgidQadc02, String sgidUser1,
			String sgidUser2, String sgidQadc01, Boolean sgidDefault,
			Double oidSgidDet) {
		super(id, sgidPreshipNrId, sgidShipNrId, sgidFormat, sgidQadc02,
				sgidUser1, sgidUser2, sgidQadc01, sgidDefault, oidSgidDet);
	}

}
