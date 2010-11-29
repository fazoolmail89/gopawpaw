package com.gopawpaw.erp.hibernate.s;

/**
 * SypsDetId entity. @author MyEclipse Persistence Tools
 */
public class SypsDetId extends AbstractSypsDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SypsDetId() {
	}

	/** full constructor */
	public SypsDetId(String sypsAppId, String sypsDocStd, String sypsDocTyp,
			String sypsDocRev, String sypsTradptrId, Boolean sypsImDoc,
			String sypsProflId) {
		super(sypsAppId, sypsDocStd, sypsDocTyp, sypsDocRev, sypsTradptrId,
				sypsImDoc, sypsProflId);
	}

}
