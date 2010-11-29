package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ScaMstr entity. @author MyEclipse Persistence Tools
 */
public class ScaMstr extends AbstractScaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScaMstr() {
	}

	/** minimal constructor */
	public ScaMstr(ScaMstrId id, Double oidScaMstr) {
		super(id, oidScaMstr);
	}

	/** full constructor */
	public ScaMstr(ScaMstrId id, Double scaAmount, String scaAmtType,
			String scaCycle, String scaPctType, Integer scaPriority,
			String scaDesc, Date scaStart, Date scaExpire, String scaProdline,
			String scaUser1, String scaUser2, String scaModUserid,
			Date scaModDate, String scaChr01, String scaChr02, Date scaDte01,
			Date scaDte02, String scaChr03, Double scaDec01, String scaQadc01,
			String scaQadc02, String scaQadc03, Date scaQadt01, Date scaQadt02,
			Double scaQade01, Double oidScaMstr) {
		super(id, scaAmount, scaAmtType, scaCycle, scaPctType, scaPriority,
				scaDesc, scaStart, scaExpire, scaProdline, scaUser1, scaUser2,
				scaModUserid, scaModDate, scaChr01, scaChr02, scaDte01,
				scaDte02, scaChr03, scaDec01, scaQadc01, scaQadc02, scaQadc03,
				scaQadt01, scaQadt02, scaQade01, oidScaMstr);
	}

}
