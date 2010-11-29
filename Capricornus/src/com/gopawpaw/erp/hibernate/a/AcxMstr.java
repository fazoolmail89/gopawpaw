package com.gopawpaw.erp.hibernate.a;

/**
 * AcxMstr entity. @author MyEclipse Persistence Tools
 */
public class AcxMstr extends AbstractAcxMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcxMstr() {
	}

	/** minimal constructor */
	public AcxMstr(AcxMstrId id, String acxToDomain, Double oidAcxMstr) {
		super(id, acxToDomain, oidAcxMstr);
	}

	/** full constructor */
	public AcxMstr(AcxMstrId id, Boolean acxQad01, String acxToAcc,
			String acxToCc, Boolean acxXconsCc, String acxUser1,
			String acxUser2, String acxToSub, String acxToDomain,
			Double oidAcxMstr) {
		super(id, acxQad01, acxToAcc, acxToCc, acxXconsCc, acxUser1, acxUser2,
				acxToSub, acxToDomain, oidAcxMstr);
	}

}
