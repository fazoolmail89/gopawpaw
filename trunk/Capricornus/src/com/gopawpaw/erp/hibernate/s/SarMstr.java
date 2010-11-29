package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SarMstr entity. @author MyEclipse Persistence Tools
 */
public class SarMstr extends AbstractSarMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SarMstr() {
	}

	/** minimal constructor */
	public SarMstr(SarMstrId id, Double oidSarMstr) {
		super(id, oidSarMstr);
	}

	/** full constructor */
	public SarMstr(SarMstrId id, String sarQadc01, String sarChr01,
			String sarChr02, String sarChr03, Double sarDec01, Double sarDec02,
			Date sarDte01, Date sarDte02, Boolean sarLog01, Boolean sarLog02,
			String sarPart, String sarUser1, String sarUser2, Double oidSarMstr) {
		super(id, sarQadc01, sarChr01, sarChr02, sarChr03, sarDec01, sarDec02,
				sarDte01, sarDte02, sarLog01, sarLog02, sarPart, sarUser1,
				sarUser2, oidSarMstr);
	}

}
