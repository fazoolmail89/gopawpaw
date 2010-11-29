package com.gopawpaw.erp.hibernate.r;

/**
 * RsMstr entity. @author MyEclipse Persistence Tools
 */
public class RsMstr extends AbstractRsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsMstr() {
	}

	/** minimal constructor */
	public RsMstr(RsMstrId id, Double oidRsMstr) {
		super(id, oidRsMstr);
	}

	/** full constructor */
	public RsMstr(RsMstrId id, String rsDesc, String rsUm, String rsUser1,
			String rsUser2, String rsQadc01, Double oidRsMstr) {
		super(id, rsDesc, rsUm, rsUser1, rsUser2, rsQadc01, oidRsMstr);
	}

}
