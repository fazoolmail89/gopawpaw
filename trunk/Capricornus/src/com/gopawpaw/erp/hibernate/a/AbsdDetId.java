package com.gopawpaw.erp.hibernate.a;

/**
 * AbsdDetId entity. @author MyEclipse Persistence Tools
 */
public class AbsdDetId extends AbstractAbsdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsdDetId() {
	}

	/** full constructor */
	public AbsdDetId(String absdDomain, String absdAbsId, String absdShipfrom,
			Integer absdFldSeq) {
		super(absdDomain, absdAbsId, absdShipfrom, absdFldSeq);
	}

}
