package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbsdDet entity. @author MyEclipse Persistence Tools
 */
public class AbsdDet extends AbstractAbsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsdDet() {
	}

	/** minimal constructor */
	public AbsdDet(AbsdDetId id, String absdAbsFldName, String absdFldName,
			String absdFldValue, Boolean absdFldPrompt, String absdValidate,
			String absdModUserid, String absdUserc01, String absdQadc01,
			String absdQadc02, Double oidAbsdDet) {
		super(id, absdAbsFldName, absdFldName, absdFldValue, absdFldPrompt,
				absdValidate, absdModUserid, absdUserc01, absdQadc01,
				absdQadc02, oidAbsdDet);
	}

	/** full constructor */
	public AbsdDet(AbsdDetId id, String absdAbsFldName, String absdFldName,
			String absdFldValue, Boolean absdFldPrompt, String absdValidate,
			String absdModUserid, Date absdModDate, String absdUserc01,
			String absdQadc01, String absdQadc02, Double oidAbsdDet) {
		super(id, absdAbsFldName, absdFldName, absdFldValue, absdFldPrompt,
				absdValidate, absdModUserid, absdModDate, absdUserc01,
				absdQadc01, absdQadc02, oidAbsdDet);
	}

}
