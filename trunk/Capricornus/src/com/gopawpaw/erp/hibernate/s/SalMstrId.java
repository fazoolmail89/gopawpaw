package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SalMstrId entity. @author MyEclipse Persistence Tools
 */
public class SalMstrId extends AbstractSalMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SalMstrId() {
	}

	/** minimal constructor */
	public SalMstrId(String salDomain) {
		super(salDomain);
	}

	/** full constructor */
	public SalMstrId(String salDomain, String salFile, String salPrefix,
			String salNbr, Integer salLine, String salType, String salFisSort,
			String salCaIntType, String salFscCode, Date salStart) {
		super(salDomain, salFile, salPrefix, salNbr, salLine, salType,
				salFisSort, salCaIntType, salFscCode, salStart);
	}

}
