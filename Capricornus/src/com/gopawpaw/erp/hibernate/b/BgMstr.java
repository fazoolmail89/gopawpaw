package com.gopawpaw.erp.hibernate.b;

/**
 * BgMstr entity. @author MyEclipse Persistence Tools
 */
public class BgMstr extends AbstractBgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BgMstr() {
	}

	/** minimal constructor */
	public BgMstr(BgMstrId id, Double oidBgMstr) {
		super(id, oidBgMstr);
	}

	/** full constructor */
	public BgMstr(BgMstrId id, String bgBudgAcc, String bgBudgCc,
			Integer bgBudgFpos, String bgUser1, String bgUser2,
			String bgBudgSub, String bgQadc01, Double oidBgMstr) {
		super(id, bgBudgAcc, bgBudgCc, bgBudgFpos, bgUser1, bgUser2, bgBudgSub,
				bgQadc01, oidBgMstr);
	}

}
