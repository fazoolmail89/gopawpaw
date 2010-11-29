package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VphHist entity. @author MyEclipse Persistence Tools
 */
public class VphHist extends AbstractVphHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VphHist() {
	}

	/** minimal constructor */
	public VphHist(VphHistId id, String vphAvgPost, Double oidVphHist) {
		super(id, vphAvgPost, oidVphHist);
	}

	/** full constructor */
	public VphHist(VphHistId id, Double vphCurrAmt, String vphQadc02,
			Integer vphQadi01, String vphNbr, Double vphInvCost,
			Double vphInvQty, Date vphInvDate, String vphUser1,
			String vphUser2, String vphAvgPost, String vphAcct, String vphCc,
			Double vphAmt, String vphElement, String vphQadc01,
			String vphProject, String vphCostadjAcct, String vphCostadjSub,
			String vphCostadjCc, String vphDscrAcct, String vphDscrSub,
			String vphDscrCc, String vphSub, Boolean vphAdjInv,
			Boolean vphAdjWip, Double vphAdjAmt, Double vphDscrAmt,
			Double vphCfAdjAmt, Double vphCfDscrAmt, Double vphAdjPrvCst,
			Double vphQohAtAdj, Double oidVphHist) {
		super(id, vphCurrAmt, vphQadc02, vphQadi01, vphNbr, vphInvCost,
				vphInvQty, vphInvDate, vphUser1, vphUser2, vphAvgPost, vphAcct,
				vphCc, vphAmt, vphElement, vphQadc01, vphProject,
				vphCostadjAcct, vphCostadjSub, vphCostadjCc, vphDscrAcct,
				vphDscrSub, vphDscrCc, vphSub, vphAdjInv, vphAdjWip, vphAdjAmt,
				vphDscrAmt, vphCfAdjAmt, vphCfDscrAmt, vphAdjPrvCst,
				vphQohAtAdj, oidVphHist);
	}

}
