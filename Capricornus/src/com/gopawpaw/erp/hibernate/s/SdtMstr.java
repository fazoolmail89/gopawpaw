package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SdtMstr entity. @author MyEclipse Persistence Tools
 */
public class SdtMstr extends AbstractSdtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SdtMstr() {
	}

	/** minimal constructor */
	public SdtMstr(SdtMstrId id, Double oidSdtMstr) {
		super(id, oidSdtMstr);
	}

	/** full constructor */
	public SdtMstr(SdtMstrId id, String sdtDesc, String sdtModUserid,
			Date sdtModDate, String sdtUser1, String sdtUser2, String sdtChr01,
			String sdtChr02, Double sdtDec01, Double sdtDec02, Date sdtDte01,
			Date sdtDte02, Boolean sdtLog01, Boolean sdtLog02,
			String sdtQadc01, String sdtQadc02, Double sdtQadd01,
			Double sdtQadd02, Boolean sdtQadl01, Boolean sdtQadl02,
			Date sdtQadt01, Date sdtQadt02, Integer sdtQadi01,
			Integer sdtQadi02, Double oidSdtMstr) {
		super(id, sdtDesc, sdtModUserid, sdtModDate, sdtUser1, sdtUser2,
				sdtChr01, sdtChr02, sdtDec01, sdtDec02, sdtDte01, sdtDte02,
				sdtLog01, sdtLog02, sdtQadc01, sdtQadc02, sdtQadd01, sdtQadd02,
				sdtQadl01, sdtQadl02, sdtQadt01, sdtQadt02, sdtQadi01,
				sdtQadi02, oidSdtMstr);
	}

}
