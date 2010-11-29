package com.gopawpaw.erp.hibernate.e;

/**
 * EdlgHistId entity. @author MyEclipse Persistence Tools
 */
public class EdlgHistId extends AbstractEdlgHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EdlgHistId() {
	}

	/** minimal constructor */
	public EdlgHistId(String edlgDomain) {
		super(edlgDomain);
	}

	/** full constructor */
	public EdlgHistId(Integer edlgDocId, Integer edlgDocSufx, String edlgAppId,
			String edlgDomain) {
		super(edlgDocId, edlgDocSufx, edlgAppId, edlgDomain);
	}

}
