package com.gopawpaw.erp.hibernate.e;

/**
 * EmapDetId entity. @author MyEclipse Persistence Tools
 */
public class EmapDetId extends AbstractEmapDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmapDetId() {
	}

	/** minimal constructor */
	public EmapDetId(String emapDomain) {
		super(emapDomain);
	}

	/** full constructor */
	public EmapDetId(Integer emapDocId, Integer emapDocSufx,
			Integer emapDocLine, String emapDomain) {
		super(emapDocId, emapDocSufx, emapDocLine, emapDomain);
	}

}
