package com.gopawpaw.erp.hibernate.l;

/**
 * LotwWkflId entity. @author MyEclipse Persistence Tools
 */
public class LotwWkflId extends AbstractLotwWkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LotwWkflId() {
	}

	/** minimal constructor */
	public LotwWkflId(String lotwDomain) {
		super(lotwDomain);
	}

	/** full constructor */
	public LotwWkflId(String lotwDomain, String lotwLotser, String lotwPart) {
		super(lotwDomain, lotwLotser, lotwPart);
	}

}
