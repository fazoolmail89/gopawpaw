package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IrawDet entity. @author MyEclipse Persistence Tools
 */
public class IrawDet extends AbstractIrawDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IrawDet() {
	}

	/** minimal constructor */
	public IrawDet(IrawDetId id, Double oidIrawDet) {
		super(id, oidIrawDet);
	}

	/** full constructor */
	public IrawDet(IrawDetId id, Boolean irawLineCont, Date irawModDate,
			String irawModUserid, String irawData, String irawUser1,
			String irawUser2, Double irawDec01, Double irawDec02,
			Integer irawInt01, Integer irawInt02, Boolean irawLog01,
			Boolean irawLog02, Date irawDte01, Date irawDte02,
			String irawQadc01, String irawQadc02, String irawQadc03,
			String irawQadc04, Double irawQadd01, Double irawQadd02,
			Integer irawQadi01, Integer irawQadi02, Boolean irawQadl01,
			Boolean irawQadl02, Date irawQadt01, Date irawQadt02,
			Double oidIrawDet) {
		super(id, irawLineCont, irawModDate, irawModUserid, irawData,
				irawUser1, irawUser2, irawDec01, irawDec02, irawInt01,
				irawInt02, irawLog01, irawLog02, irawDte01, irawDte02,
				irawQadc01, irawQadc02, irawQadc03, irawQadc04, irawQadd01,
				irawQadd02, irawQadi01, irawQadi02, irawQadl01, irawQadl02,
				irawQadt01, irawQadt02, oidIrawDet);
	}

}
