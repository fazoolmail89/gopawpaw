package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqaMstr entity. @author MyEclipse Persistence Tools
 */
public class RqaMstr extends AbstractRqaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqaMstr() {
	}

	/** minimal constructor */
	public RqaMstr(RqaMstrId id, Double oidRqaMstr) {
		super(id, oidRqaMstr);
	}

	/** full constructor */
	public RqaMstr(RqaMstrId id, String rqaSubTo, String rqaCcTo, Date rqaEnd,
			Integer rqaRvwLevel, Boolean rqaRvwReq, Integer rqaAprLevel,
			Boolean rqaAprReq, String rqaAltApr, String rqaAdminApr,
			String rqaChr01, String rqaChr02, String rqaChr03, String rqaChr04,
			String rqaQadc01, String rqaQadc02, String rqaQadc03,
			String rqaQadc04, Double oidRqaMstr) {
		super(id, rqaSubTo, rqaCcTo, rqaEnd, rqaRvwLevel, rqaRvwReq,
				rqaAprLevel, rqaAprReq, rqaAltApr, rqaAdminApr, rqaChr01,
				rqaChr02, rqaChr03, rqaChr04, rqaQadc01, rqaQadc02, rqaQadc03,
				rqaQadc04, oidRqaMstr);
	}

}
