package com.gopawpaw.erp.hibernate.r;

/**
 * RqcdDet entity. @author MyEclipse Persistence Tools
 */
public class RqcdDet extends AbstractRqcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqcdDet() {
	}

	/** minimal constructor */
	public RqcdDet(RqcdDetId id, Double oidRqcdDet) {
		super(id, oidRqcdDet);
	}

	/** full constructor */
	public RqcdDet(RqcdDetId id, String rqcdAcctTo, String rqcdChr01,
			String rqcdChr02, String rqcdChr03, String rqcdChr04,
			String rqcdQadc01, String rqcdQadc02, String rqcdQadc03,
			String rqcdQadc04, String rqcdSubTo, Double oidRqcdDet) {
		super(id, rqcdAcctTo, rqcdChr01, rqcdChr02, rqcdChr03, rqcdChr04,
				rqcdQadc01, rqcdQadc02, rqcdQadc03, rqcdQadc04, rqcdSubTo,
				oidRqcdDet);
	}

}
