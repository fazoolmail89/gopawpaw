package com.gopawpaw.erp.hibernate.q;

/**
 * QcdDetId entity. @author MyEclipse Persistence Tools
 */
public class QcdDetId extends AbstractQcdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QcdDetId() {
	}

	/** minimal constructor */
	public QcdDetId(String qcdDomain) {
		super(qcdDomain);
	}

	/** full constructor */
	public QcdDetId(String qcdDomain, String qcdLot, String qcdPart,
			Integer qcdOp) {
		super(qcdDomain, qcdLot, qcdPart, qcdOp);
	}

}
