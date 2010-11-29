package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IsbMstr entity. @author MyEclipse Persistence Tools
 */
public class IsbMstr extends AbstractIsbMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsbMstr() {
	}

	/** minimal constructor */
	public IsbMstr(IsbMstrId id, Double oidIsbMstr) {
		super(id, oidIsbMstr);
	}

	/** full constructor */
	public IsbMstr(IsbMstrId id, Integer isbSeq, Integer isbQadi03,
			Integer isbWarrDur, String isbStatus, String isbQadc04,
			Integer isbQadi04, String isbRev, Date isbInsDate, Date isbLastPm,
			Integer isbPmDays, String isbSoNbr, String isbDesc1,
			String isbDesc2, String isbWarrCd, Boolean isbComp,
			Boolean isbParent, Date isbWarrExp, Date isbNextPm,
			Integer isbSoLine, String isbInvNbr, String isbOwner,
			String isbTarrif, String isbOrigin, String isbSysType,
			String isbChr01, String isbChr02, String isbChr03, String isbChr04,
			String isbChr05, String isbChr06, String isbChr07, String isbChr08,
			String isbChr09, String isbChr10, Double isbDec01, Double isbDec02,
			Double isbDec03, Date isbDte01, Date isbDte02, Date isbDte03,
			Date isbDte04, Boolean isbLog01, Boolean isbLog02,
			Boolean isbLog03, Boolean isbLog04, Boolean isbLog05,
			Date isbLstUpd, String isbPmUm, String isbLocation,
			String isbUser1, String isbUser2, String isbArticle,
			Double isbCalibration, Date isbCalibDate, Integer isbCmtindx,
			String isbCustomerId, String isbEco, String isbIcRef,
			String isbModel, Date isbOrigIns, Double isbPriceSold,
			Boolean isbRebuild, Date isbShipDate, String isbSoldTo,
			String isbUpdates, Boolean isbPlantMaint, Integer isbEudTrnbr,
			String isbEngCode, Date isbLbWarrExp, String isbModUserid,
			Date isbModDate, String isbQadc01, String isbQadc02,
			String isbQadc03, Date isbQadt01, Date isbQadt02, Date isbQadt03,
			Double isbQade01, Double isbQade02, Double isbQade03,
			Integer isbQadi01, Integer isbQadi02, Boolean isbQadl01,
			Boolean isbQadl02, Boolean isbQadl03, Double isbQty,
			Double isbMeterRdg, Date isbMeterDate, Double isbMeterInterval,
			String isbMeterUm, Boolean isbWarrOverride, Double oidIsbMstr) {
		super(id, isbSeq, isbQadi03, isbWarrDur, isbStatus, isbQadc04,
				isbQadi04, isbRev, isbInsDate, isbLastPm, isbPmDays, isbSoNbr,
				isbDesc1, isbDesc2, isbWarrCd, isbComp, isbParent, isbWarrExp,
				isbNextPm, isbSoLine, isbInvNbr, isbOwner, isbTarrif,
				isbOrigin, isbSysType, isbChr01, isbChr02, isbChr03, isbChr04,
				isbChr05, isbChr06, isbChr07, isbChr08, isbChr09, isbChr10,
				isbDec01, isbDec02, isbDec03, isbDte01, isbDte02, isbDte03,
				isbDte04, isbLog01, isbLog02, isbLog03, isbLog04, isbLog05,
				isbLstUpd, isbPmUm, isbLocation, isbUser1, isbUser2,
				isbArticle, isbCalibration, isbCalibDate, isbCmtindx,
				isbCustomerId, isbEco, isbIcRef, isbModel, isbOrigIns,
				isbPriceSold, isbRebuild, isbShipDate, isbSoldTo, isbUpdates,
				isbPlantMaint, isbEudTrnbr, isbEngCode, isbLbWarrExp,
				isbModUserid, isbModDate, isbQadc01, isbQadc02, isbQadc03,
				isbQadt01, isbQadt02, isbQadt03, isbQade01, isbQade02,
				isbQade03, isbQadi01, isbQadi02, isbQadl01, isbQadl02,
				isbQadl03, isbQty, isbMeterRdg, isbMeterDate, isbMeterInterval,
				isbMeterUm, isbWarrOverride, oidIsbMstr);
	}

}
