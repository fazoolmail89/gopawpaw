package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EmgMsg entity. @author MyEclipse Persistence Tools
 */
public class EmgMsg extends AbstractEmgMsg implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmgMsg() {
	}

	/** minimal constructor */
	public EmgMsg(EmgMsgId id, Double oidEmgMsg) {
		super(id, oidEmgMsg);
	}

	/** full constructor */
	public EmgMsg(EmgMsgId id, String emgAppId, Boolean emgEmailSent,
			Date emgModDate, String emgModUserid, String emgReturnTxt,
			String emgSevLvl, String emgUser1, String emgUser2,
			Double emgDec01, Double emgDec02, Integer emgInt01,
			Integer emgInt02, Boolean emgLog01, Boolean emgLog02,
			Date emgDte01, Date emgDte02, String emgQadc01, String emgQadc02,
			String emgQadc03, String emgQadc04, Double emgQadd01,
			Double emgQadd02, Integer emgQadi01, Integer emgQadi02,
			Boolean emgQadl01, Boolean emgQadl02, Date emgQadt01,
			Date emgQadt02, Double oidEmgMsg) {
		super(id, emgAppId, emgEmailSent, emgModDate, emgModUserid,
				emgReturnTxt, emgSevLvl, emgUser1, emgUser2, emgDec01,
				emgDec02, emgInt01, emgInt02, emgLog01, emgLog02, emgDte01,
				emgDte02, emgQadc01, emgQadc02, emgQadc03, emgQadc04,
				emgQadd01, emgQadd02, emgQadi01, emgQadi02, emgQadl01,
				emgQadl02, emgQadt01, emgQadt02, oidEmgMsg);
	}

}
