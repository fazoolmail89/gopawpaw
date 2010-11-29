package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PcMstrId entity. @author MyEclipse Persistence Tools
 */
public class PcMstrId extends AbstractPcMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcMstrId() {
	}

	/** minimal constructor */
	public PcMstrId(String pcDomain) {
		super(pcDomain);
	}

	/** full constructor */
	public PcMstrId(String pcDomain, String pcList, String pcCurr,
			String pcProdLine, String pcPart, String pcUm, Date pcStart) {
		super(pcDomain, pcList, pcCurr, pcProdLine, pcPart, pcUm, pcStart);
	}

}
