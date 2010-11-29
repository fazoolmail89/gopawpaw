package com.gopawpaw.erp.hibernate.c;

/**
 * CksdDet entity. @author MyEclipse Persistence Tools
 */
public class CksdDet extends AbstractCksdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CksdDet() {
	}

	/** minimal constructor */
	public CksdDet(CksdDetId id, Double cksdExRate2, String cksdExRatetype,
			Integer cksdExruSeq, Double oidCksdDet) {
		super(id, cksdExRate2, cksdExRatetype, cksdExruSeq, oidCksdDet);
	}

	/** full constructor */
	public CksdDet(CksdDetId id, String cksdUser1, String cksdUser2,
			String cksdAcct, String cksdCc, Double cksdExRate,
			String cksdQadc01, Double cksdExRate2, String cksdExRatetype,
			Integer cksdExruSeq, String cksdSub, Double oidCksdDet) {
		super(id, cksdUser1, cksdUser2, cksdAcct, cksdCc, cksdExRate,
				cksdQadc01, cksdExRate2, cksdExRatetype, cksdExruSeq, cksdSub,
				oidCksdDet);
	}

}
