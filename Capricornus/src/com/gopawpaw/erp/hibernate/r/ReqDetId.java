package com.gopawpaw.erp.hibernate.r;

/**
 * ReqDetId entity. @author MyEclipse Persistence Tools
 */
public class ReqDetId extends AbstractReqDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ReqDetId() {
	}

	/** minimal constructor */
	public ReqDetId(String reqDomain, String reqNbr) {
		super(reqDomain, reqNbr);
	}

	/** full constructor */
	public ReqDetId(String reqDomain, String reqNbr, Integer reqLine) {
		super(reqDomain, reqNbr, reqLine);
	}

}
