package com.gopawpaw.erp.hibernate.e;

/**
 * EncdDetId entity. @author MyEclipse Persistence Tools
 */
public class EncdDetId extends AbstractEncdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EncdDetId() {
	}

	/** full constructor */
	public EncdDetId(String encdDomain, String encdConsEntity,
			String encdSubDomain, String encdSubEntity) {
		super(encdDomain, encdConsEntity, encdSubDomain, encdSubEntity);
	}

}
