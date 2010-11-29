package com.gopawpaw.erp.hibernate.a;

/**
 * AscMstr entity. @author MyEclipse Persistence Tools
 */
public class AscMstr extends AbstractAscMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AscMstr() {
	}

	/** minimal constructor */
	public AscMstr(AscMstrId id, Double oidAscMstr) {
		super(id, oidAscMstr);
	}

	/** full constructor */
	public AscMstr(AscMstrId id, String ascDesc, String ascUser1,
			String ascUser2, Integer ascFpos, String ascQadc01,
			Double oidAscMstr) {
		super(id, ascDesc, ascUser1, ascUser2, ascFpos, ascQadc01, oidAscMstr);
	}

}
