package com.gopawpaw.erp.hibernate.r;

/**
 * RmcCtrlId entity. @author MyEclipse Persistence Tools
 */
public class RmcCtrlId extends AbstractRmcCtrlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RmcCtrlId() {
	}

	/** minimal constructor */
	public RmcCtrlId(String rmcDomain) {
		super(rmcDomain);
	}

	/** full constructor */
	public RmcCtrlId(String rmcDomain, String rmcNode) {
		super(rmcDomain, rmcNode);
	}

}
