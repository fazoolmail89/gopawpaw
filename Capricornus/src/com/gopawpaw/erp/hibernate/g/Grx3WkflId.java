package com.gopawpaw.erp.hibernate.g;

/**
 * Grx3WkflId entity. @author MyEclipse Persistence Tools
 */
public class Grx3WkflId extends AbstractGrx3WkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Grx3WkflId() {
	}

	/** minimal constructor */
	public Grx3WkflId(String grx3Domain, Double oidGrx3Wkfl) {
		super(grx3Domain, oidGrx3Wkfl);
	}

	/** full constructor */
	public Grx3WkflId(Integer grx3RunId, Integer grx3Row, Integer grx3Col,
			Integer grx3Line, Integer grx3Priority, Integer grx3Explode,
			String grx3Element1, String grx3Element2, String grx3Element3,
			String grx3Element4, String grx3Element5, String grx3User1,
			String grx3User2, String grx3Qadc01, String grx3Domain,
			Double oidGrx3Wkfl) {
		super(grx3RunId, grx3Row, grx3Col, grx3Line, grx3Priority, grx3Explode,
				grx3Element1, grx3Element2, grx3Element3, grx3Element4,
				grx3Element5, grx3User1, grx3User2, grx3Qadc01, grx3Domain,
				oidGrx3Wkfl);
	}

}
