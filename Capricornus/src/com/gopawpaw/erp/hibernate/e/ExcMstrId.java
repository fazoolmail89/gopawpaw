package com.gopawpaw.erp.hibernate.e;

/**
 * ExcMstrId entity. @author MyEclipse Persistence Tools
 */
public class ExcMstrId extends AbstractExcMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExcMstrId() {
	}

	/** minimal constructor */
	public ExcMstrId(String excDomain) {
		super(excDomain);
	}

	/** full constructor */
	public ExcMstrId(String excDomain, String excCurr, String excCurr2,
			String excAcc) {
		super(excDomain, excCurr, excCurr2, excAcc);
	}

}
