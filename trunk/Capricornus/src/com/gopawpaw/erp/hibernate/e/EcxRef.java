package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EcxRef entity. @author MyEclipse Persistence Tools
 */
public class EcxRef extends AbstractEcxRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcxRef() {
	}

	/** full constructor */
	public EcxRef(EcxRefId id, String ecxExtRef, String ecxExtLine,
			String ecxModUserid, Date ecxModDate, String ecxUser1,
			String ecxUser2, String ecxQadc01, String ecxQadc02,
			Double oidEcxRef) {
		super(id, ecxExtRef, ecxExtLine, ecxModUserid, ecxModDate, ecxUser1,
				ecxUser2, ecxQadc01, ecxQadc02, oidEcxRef);
	}

}
