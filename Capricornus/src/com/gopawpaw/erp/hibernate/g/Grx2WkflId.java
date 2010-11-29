package com.gopawpaw.erp.hibernate.g;

/**
 * Grx2WkflId entity. @author MyEclipse Persistence Tools
 */
public class Grx2WkflId extends AbstractGrx2WkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Grx2WkflId() {
	}

	/** minimal constructor */
	public Grx2WkflId(String grx2Domain, Double oidGrx2Wkfl) {
		super(grx2Domain, oidGrx2Wkfl);
	}

	/** full constructor */
	public Grx2WkflId(Integer grx2RunId, Boolean grx2Type, Integer grx2Nbr,
			String grx2Acct, String grx2Cc, String grx2Entity,
			String grx2Project, String grx2Sub, Boolean grx2Actual,
			String grx2BgCode, Integer grx2Level, String grx2User1,
			String grx2User2, String grx2Qadc01, String grx2Domain,
			Double oidGrx2Wkfl) {
		super(grx2RunId, grx2Type, grx2Nbr, grx2Acct, grx2Cc, grx2Entity,
				grx2Project, grx2Sub, grx2Actual, grx2BgCode, grx2Level,
				grx2User1, grx2User2, grx2Qadc01, grx2Domain, oidGrx2Wkfl);
	}

}
