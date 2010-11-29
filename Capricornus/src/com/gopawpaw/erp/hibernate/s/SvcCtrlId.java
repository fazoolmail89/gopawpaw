package com.gopawpaw.erp.hibernate.s;

/**
 * SvcCtrlId entity. @author MyEclipse Persistence Tools
 */
public class SvcCtrlId extends AbstractSvcCtrlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SvcCtrlId() {
	}

	/** minimal constructor */
	public SvcCtrlId(String svcDomain) {
		super(svcDomain);
	}

	/** full constructor */
	public SvcCtrlId(String svcDomain, String svcNode) {
		super(svcDomain, svcNode);
	}

}
