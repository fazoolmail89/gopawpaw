package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AcdfMstr entity. @author MyEclipse Persistence Tools
 */
public class AcdfMstr extends AbstractAcdfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcdfMstr() {
	}

	/** minimal constructor */
	public AcdfMstr(AcdfMstrId id, String acdfAcct, String acdfSub,
			String acdfCc, String acdfModUserid, Date acdfModDate,
			String acdfUserc01, String acdfUserc02, Double acdfUserd01,
			Integer acdfUseri01, Boolean acdfUserl01, String acdfQadc01,
			Double acdfQadd01, Integer acdfQadi01, Boolean acdfQadl01,
			Double oidAcdfMstr) {
		super(id, acdfAcct, acdfSub, acdfCc, acdfModUserid, acdfModDate,
				acdfUserc01, acdfUserc02, acdfUserd01, acdfUseri01,
				acdfUserl01, acdfQadc01, acdfQadd01, acdfQadi01, acdfQadl01,
				oidAcdfMstr);
	}

	/** full constructor */
	public AcdfMstr(AcdfMstrId id, String acdfAcct, String acdfSub,
			String acdfCc, String acdfModUserid, Date acdfModDate,
			String acdfUserc01, String acdfUserc02, Double acdfUserd01,
			Integer acdfUseri01, Boolean acdfUserl01, Date acdfUsert01,
			String acdfQadc01, Double acdfQadd01, Integer acdfQadi01,
			Boolean acdfQadl01, Date acdfQadt01, Double oidAcdfMstr) {
		super(id, acdfAcct, acdfSub, acdfCc, acdfModUserid, acdfModDate,
				acdfUserc01, acdfUserc02, acdfUserd01, acdfUseri01,
				acdfUserl01, acdfUsert01, acdfQadc01, acdfQadd01, acdfQadi01,
				acdfQadl01, acdfQadt01, oidAcdfMstr);
	}

}
