package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VdfMstr entity. @author MyEclipse Persistence Tools
 */
public class VdfMstr extends AbstractVdfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VdfMstr() {
	}

	/** minimal constructor */
	public VdfMstr(VdfMstrId id, String vdfBirthcity, String vdfFiscalCode,
			String vdfForFiscalCode, String vdfRsnCode, Boolean vdfWithholdtax,
			String vdfModUserid, Date vdfModDate, String vdfUser1,
			String vdfUser2, String vdfUserc03, String vdfUserc04,
			String vdfUserc05, Double vdfUserd01, Double vdfUserd02,
			Integer vdfUseri01, Integer vdfUseri02, Boolean vdfUserl01,
			Boolean vdfUserl02, String vdfQadc01, String vdfQadc02,
			String vdfQadc03, String vdfQadc04, String vdfQadc05,
			Double vdfQadd01, Double vdfQadd02, Integer vdfQadi01,
			Integer vdfQadi02, Boolean vdfQadl01, Boolean vdfQadl02,
			Double oidVdfMstr) {
		super(id, vdfBirthcity, vdfFiscalCode, vdfForFiscalCode, vdfRsnCode,
				vdfWithholdtax, vdfModUserid, vdfModDate, vdfUser1, vdfUser2,
				vdfUserc03, vdfUserc04, vdfUserc05, vdfUserd01, vdfUserd02,
				vdfUseri01, vdfUseri02, vdfUserl01, vdfUserl02, vdfQadc01,
				vdfQadc02, vdfQadc03, vdfQadc04, vdfQadc05, vdfQadd01,
				vdfQadd02, vdfQadi01, vdfQadi02, vdfQadl01, vdfQadl02,
				oidVdfMstr);
	}

	/** full constructor */
	public VdfMstr(VdfMstrId id, String vdfBirthcity, Date vdfBirthday,
			String vdfFiscalCode, String vdfForFiscalCode, String vdfRsnCode,
			Boolean vdfWithholdtax, String vdfModUserid, Date vdfModDate,
			String vdfUser1, String vdfUser2, String vdfUserc03,
			String vdfUserc04, String vdfUserc05, Double vdfUserd01,
			Double vdfUserd02, Integer vdfUseri01, Integer vdfUseri02,
			Boolean vdfUserl01, Boolean vdfUserl02, Date vdfUsert01,
			Date vdfUsert02, String vdfQadc01, String vdfQadc02,
			String vdfQadc03, String vdfQadc04, String vdfQadc05,
			Double vdfQadd01, Double vdfQadd02, Integer vdfQadi01,
			Integer vdfQadi02, Boolean vdfQadl01, Boolean vdfQadl02,
			Date vdfQadt01, Date vdfQadt02, Double oidVdfMstr) {
		super(id, vdfBirthcity, vdfBirthday, vdfFiscalCode, vdfForFiscalCode,
				vdfRsnCode, vdfWithholdtax, vdfModUserid, vdfModDate, vdfUser1,
				vdfUser2, vdfUserc03, vdfUserc04, vdfUserc05, vdfUserd01,
				vdfUserd02, vdfUseri01, vdfUseri02, vdfUserl01, vdfUserl02,
				vdfUsert01, vdfUsert02, vdfQadc01, vdfQadc02, vdfQadc03,
				vdfQadc04, vdfQadc05, vdfQadd01, vdfQadd02, vdfQadi01,
				vdfQadi02, vdfQadl01, vdfQadl02, vdfQadt01, vdfQadt02,
				oidVdfMstr);
	}

}
