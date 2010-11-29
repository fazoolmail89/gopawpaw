package com.gopawpaw.erp.hibernate.e;

/**
 * EscCtrlId entity. @author MyEclipse Persistence Tools
 */
public class EscCtrlId extends AbstractEscCtrlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EscCtrlId() {
	}

	/** minimal constructor */
	public EscCtrlId(String escDomain) {
		super(escDomain);
	}

	/** full constructor */
	public EscCtrlId(String escDomain, Integer escIndex) {
		super(escDomain, escIndex);
	}

}
