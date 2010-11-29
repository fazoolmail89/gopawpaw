package com.gopawpaw.erp.hibernate.i;

/**
 * IrawDetId entity. @author MyEclipse Persistence Tools
 */
public class IrawDetId extends AbstractIrawDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IrawDetId() {
	}

	/** minimal constructor */
	public IrawDetId(String irawDomain) {
		super(irawDomain);
	}

	/** full constructor */
	public IrawDetId(Integer irawDocId, Integer irawDocLine, String irawDomain) {
		super(irawDocId, irawDocLine, irawDomain);
	}

}
