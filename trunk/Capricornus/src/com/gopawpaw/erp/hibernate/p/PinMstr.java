package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PinMstr entity. @author MyEclipse Persistence Tools
 */
public class PinMstr extends AbstractPinMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PinMstr() {
	}

	/** minimal constructor */
	public PinMstr(String pinControl6, Integer pinInstTime,
			String pinModUserid, Integer pinAudDays, String pinAudUser,
			String pinAudPswd, Integer pinAudNbr, Double oidPinMstr) {
		super(pinControl6, pinInstTime, pinModUserid, pinAudDays, pinAudUser,
				pinAudPswd, pinAudNbr, oidPinMstr);
	}

	/** full constructor */
	public PinMstr(String pinDesc, Integer pinHwm, String pinControl1,
			String pinControl2, String pinControl3, String pinControl4,
			String pinControl5, Date pinInstDate, String pinUser1,
			String pinUser2, String pinQadc01, Integer pinQadi01,
			Double pinQadd01, Boolean pinQadl01, Date pinQadt01,
			String pinControl6, Integer pinInstTime, String pinModUserid,
			Date pinModDate, Integer pinAudDays, Date pinAudDdate,
			Date pinAudDate, String pinAudUser, String pinAudPswd,
			Integer pinAudNbr, Double oidPinMstr) {
		super(pinDesc, pinHwm, pinControl1, pinControl2, pinControl3,
				pinControl4, pinControl5, pinInstDate, pinUser1, pinUser2,
				pinQadc01, pinQadi01, pinQadd01, pinQadl01, pinQadt01,
				pinControl6, pinInstTime, pinModUserid, pinModDate, pinAudDays,
				pinAudDdate, pinAudDate, pinAudUser, pinAudPswd, pinAudNbr,
				oidPinMstr);
	}

}
