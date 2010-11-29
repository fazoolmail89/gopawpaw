package com.gopawpaw.erp.hibernate.e;

/**
 * ErsMstrId entity. @author MyEclipse Persistence Tools
 */
public class ErsMstrId extends AbstractErsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ErsMstrId() {
	}

	/** minimal constructor */
	public ErsMstrId(String ersDomain) {
		super(ersDomain);
	}

	/** full constructor */
	public ErsMstrId(String ersDomain, String ersVend, String ersSite,
			String ersPart) {
		super(ersDomain, ersVend, ersSite, ersPart);
	}

}
