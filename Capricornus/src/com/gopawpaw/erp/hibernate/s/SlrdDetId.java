package com.gopawpaw.erp.hibernate.s;

/**
 * SlrdDetId entity. @author MyEclipse Persistence Tools
 */
public class SlrdDetId extends AbstractSlrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SlrdDetId() {
	}

	/** full constructor */
	public SlrdDetId(String slrdDomain, String slrdInventorySite,
			String slrdAttribCode) {
		super(slrdDomain, slrdInventorySite, slrdAttribCode);
	}

}
