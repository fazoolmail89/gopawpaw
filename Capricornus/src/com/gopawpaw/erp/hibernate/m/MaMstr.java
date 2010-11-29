package com.gopawpaw.erp.hibernate.m;

/**
 * MaMstr entity. @author MyEclipse Persistence Tools
 */
public class MaMstr extends AbstractMaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MaMstr() {
	}

	/** minimal constructor */
	public MaMstr(MaMstrId id, Double oidMaMstr) {
		super(id, oidMaMstr);
	}

	/** full constructor */
	public MaMstr(MaMstrId id, String maMrAcct1, String maMrCc1,
			String maMrAcct2, String maMrCc2, String maUser1, String maUser2,
			String maQadc01, String maMrSub1, String maMrSub2, Double oidMaMstr) {
		super(id, maMrAcct1, maMrCc1, maMrAcct2, maMrCc2, maUser1, maUser2,
				maQadc01, maMrSub1, maMrSub2, oidMaMstr);
	}

}
