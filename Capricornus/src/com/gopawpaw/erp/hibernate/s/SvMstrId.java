package com.gopawpaw.erp.hibernate.s;

/**
 * SvMstrId entity. @author MyEclipse Persistence Tools
 */
public class SvMstrId extends AbstractSvMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SvMstrId() {
	}

	/** minimal constructor */
	public SvMstrId(String svDomain) {
		super(svDomain);
	}

	/** full constructor */
	public SvMstrId(String svDomain, String svCode, String svType) {
		super(svDomain, svCode, svType);
	}

}
