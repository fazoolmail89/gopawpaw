package com.gopawpaw.erp.hibernate.s;

/**
 * SsmMstr entity. @author MyEclipse Persistence Tools
 */
public class SsmMstr extends AbstractSsmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SsmMstr() {
	}

	/** minimal constructor */
	public SsmMstr(SsmMstrId id, Double oidSsmMstr) {
		super(id, oidSsmMstr);
	}

	/** full constructor */
	public SsmMstr(SsmMstrId id, String ssmDesc, String ssmPlanner,
			String ssmUser1, String ssmUser2, String ssmQadc01,
			Double oidSsmMstr) {
		super(id, ssmDesc, ssmPlanner, ssmUser1, ssmUser2, ssmQadc01,
				oidSsmMstr);
	}

}
