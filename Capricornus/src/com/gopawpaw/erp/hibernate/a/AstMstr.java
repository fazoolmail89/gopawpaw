package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AstMstr entity. @author MyEclipse Persistence Tools
 */
public class AstMstr extends AbstractAstMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AstMstr() {
	}

	/** minimal constructor */
	public AstMstr(Date astDate, Double oidAstMstr) {
		super(astDate, oidAstMstr);
	}

	/** full constructor */
	public AstMstr(String astDesc, String astEntity, Date astDate,
			Date astPurDate, String astSerial, String astInvNbr,
			Integer astQty, String astFaLoc, String astSpExpAcct,
			String astSpExpSub, String astCust, String astAcct, String astSub,
			String astCc, String astProj, String astAcAcct, String astAcSub,
			String astAcCc, String astAcProj, String astExpAcct,
			String astExpSub, String astExpCc, String astExpProj,
			String astPoNbr, String astVend, Double astAtRisk,
			Date astWarranty, String astClass, String astRetire,
			Double astRtPrice, Date astRtDate, String astRtReason,
			Boolean astReport, String astSpAcAcct, String astSpAcSub,
			String astSpAcCc, String astSpAcProj, String astInsNbr,
			String astInsCo, Date astInsDate, Double astInsValue,
			Date astUdate1, Date astUdate2, Date astUdate3, Date astUdate4,
			String astUchar1, String astUchar2, String astUchar3,
			String astUchar4, Integer astUint1, Integer astUint2,
			Integer astUint3, Integer astUint4, Double astUdec1,
			Double astUdec2, String astUserid, Date astModDate, Date astSusBeg,
			Date astSusEnd, String astSpExpCc, String astSpExpProj,
			String astPrevMethod, Boolean astQad01, String astQad02,
			String astQad03, String astUser1, String astUser2, Double oidAstMstr) {
		super(astDesc, astEntity, astDate, astPurDate, astSerial, astInvNbr,
				astQty, astFaLoc, astSpExpAcct, astSpExpSub, astCust, astAcct,
				astSub, astCc, astProj, astAcAcct, astAcSub, astAcCc,
				astAcProj, astExpAcct, astExpSub, astExpCc, astExpProj,
				astPoNbr, astVend, astAtRisk, astWarranty, astClass, astRetire,
				astRtPrice, astRtDate, astRtReason, astReport, astSpAcAcct,
				astSpAcSub, astSpAcCc, astSpAcProj, astInsNbr, astInsCo,
				astInsDate, astInsValue, astUdate1, astUdate2, astUdate3,
				astUdate4, astUchar1, astUchar2, astUchar3, astUchar4,
				astUint1, astUint2, astUint3, astUint4, astUdec1, astUdec2,
				astUserid, astModDate, astSusBeg, astSusEnd, astSpExpCc,
				astSpExpProj, astPrevMethod, astQad01, astQad02, astQad03,
				astUser1, astUser2, oidAstMstr);
	}

}
