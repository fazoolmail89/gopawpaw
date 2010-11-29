package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LcMstr entity. @author MyEclipse Persistence Tools
 */
public class LcMstr extends AbstractLcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LcMstr() {
	}

	/** full constructor */
	public LcMstr(LcMstrId id, String lcDesc, String lcElement,
			Boolean lcTaxable, String lcTaxc, String lcApportionMethod,
			Boolean lcCloseAccruals, String lcSupplier, String lcModUserid,
			Date lcModDate, String lcUser1, String lcUser2, String lcQadc01,
			String lcQadc02, Double oidLcMstr) {
		super(id, lcDesc, lcElement, lcTaxable, lcTaxc, lcApportionMethod,
				lcCloseAccruals, lcSupplier, lcModUserid, lcModDate, lcUser1,
				lcUser2, lcQadc01, lcQadc02, oidLcMstr);
	}

}
