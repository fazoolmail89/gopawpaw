package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DssMstr entity. @author MyEclipse Persistence Tools
 */
public class DssMstr extends AbstractDssMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DssMstr() {
	}

	/** minimal constructor */
	public DssMstr(DssMstrId id, String dssSoNbr, String dssAppOwner,
			Double dssWeight, String dssWeightUm, Double dssFrMinWt,
			Double oidDssMstr) {
		super(id, dssSoNbr, dssAppOwner, dssWeight, dssWeightUm, dssFrMinWt,
				oidDssMstr);
	}

	/** full constructor */
	public DssMstr(DssMstrId id, String dssBol, Integer dssCartons,
			Integer dssCmtindx, Date dssDueDate, String dssFob,
			String dssFrList, String dssFrTerms, String dssLang,
			String dssSoNbr, Date dssCreated, String dssPoNbr, String dssRmks,
			String dssRecSite, String dssShipvia, Date dssShipdate,
			String dssStatus, String dssUser1, String dssUser2,
			String dssChr01, String dssChr02, String dssChr03, String dssChr04,
			String dssChr05, String dssChr06, String dssChr07, String dssChr08,
			String dssChr09, String dssChr10, Double dssDec01, Double dssDec02,
			Date dssDte01, Date dssDte02, Boolean dssLog01, Double dssQad01,
			Double dssQad02, Double dssQad03, Integer dssQad04,
			String dssQad05, String dssAppOwner, Double dssWeight,
			String dssWeightUm, Double dssFrMinWt, Double oidDssMstr) {
		super(id, dssBol, dssCartons, dssCmtindx, dssDueDate, dssFob,
				dssFrList, dssFrTerms, dssLang, dssSoNbr, dssCreated, dssPoNbr,
				dssRmks, dssRecSite, dssShipvia, dssShipdate, dssStatus,
				dssUser1, dssUser2, dssChr01, dssChr02, dssChr03, dssChr04,
				dssChr05, dssChr06, dssChr07, dssChr08, dssChr09, dssChr10,
				dssDec01, dssDec02, dssDte01, dssDte02, dssLog01, dssQad01,
				dssQad02, dssQad03, dssQad04, dssQad05, dssAppOwner, dssWeight,
				dssWeightUm, dssFrMinWt, oidDssMstr);
	}

}
