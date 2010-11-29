package com.gopawpaw.erp.hibernate.g;

/**
 * Grx1WkflId entity. @author MyEclipse Persistence Tools
 */
public class Grx1WkflId extends AbstractGrx1WkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Grx1WkflId() {
	}

	/** minimal constructor */
	public Grx1WkflId(String grx1Domain, Double oidGrx1Wkfl) {
		super(grx1Domain, oidGrx1Wkfl);
	}

	/** full constructor */
	public Grx1WkflId(Integer grx1RunId, String grx1AnCode,
			String grx1LinkType, String grx1LinkCode, String grx1User1,
			String grx1User2, String grx1Qadc01, String grx1Domain,
			Double oidGrx1Wkfl) {
		super(grx1RunId, grx1AnCode, grx1LinkType, grx1LinkCode, grx1User1,
				grx1User2, grx1Qadc01, grx1Domain, oidGrx1Wkfl);
	}

}
