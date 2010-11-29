package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FasCtrl entity. @author MyEclipse Persistence Tools
 */
public class FasCtrl extends AbstractFasCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FasCtrl() {
	}

	/** minimal constructor */
	public FasCtrl(Double oidFasCtrl) {
		super(oidFasCtrl);
	}

	/** full constructor */
	public FasCtrl(String fasGainAcct, String fasGainCc, String fasGainSub,
			String fasLossAcct, String fasLossSub, String fasLossCc,
			String fasUser1, String fasUser2, Double fasMinimum,
			Boolean fasDetail, Boolean fasShortYear, String fasUserid,
			Date fasModDate, Integer fasNextAsset, Date fasShortEnd,
			Boolean fasQad01, String fasQad02, String fasQad03,
			Double oidFasCtrl) {
		super(fasGainAcct, fasGainCc, fasGainSub, fasLossAcct, fasLossSub,
				fasLossCc, fasUser1, fasUser2, fasMinimum, fasDetail,
				fasShortYear, fasUserid, fasModDate, fasNextAsset, fasShortEnd,
				fasQad01, fasQad02, fasQad03, oidFasCtrl);
	}

}
