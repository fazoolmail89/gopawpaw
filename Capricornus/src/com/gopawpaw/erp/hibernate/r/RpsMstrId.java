package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RpsMstrId entity. @author MyEclipse Persistence Tools
 */
public class RpsMstrId extends AbstractRpsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RpsMstrId() {
	}

	/** minimal constructor */
	public RpsMstrId(String rpsDomain) {
		super(rpsDomain);
	}

	/** full constructor */
	public RpsMstrId(String rpsDomain, String rpsPart, String rpsSite,
			String rpsLine, Date rpsDueDate) {
		super(rpsDomain, rpsPart, rpsSite, rpsLine, rpsDueDate);
	}

}
