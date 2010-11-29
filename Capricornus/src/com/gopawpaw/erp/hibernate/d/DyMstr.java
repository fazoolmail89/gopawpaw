package com.gopawpaw.erp.hibernate.d;

/**
 * DyMstr entity. @author MyEclipse Persistence Tools
 */
public class DyMstr extends AbstractDyMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DyMstr() {
	}

	/** minimal constructor */
	public DyMstr(DyMstrId id, String dyDesc, String dyType,
			Integer dyNextPgdet, Integer dyNextPgcen, String dyLastEntdet,
			String dyLastEntcen, Double oidDyMstr) {
		super(id, dyDesc, dyType, dyNextPgdet, dyNextPgcen, dyLastEntdet,
				dyLastEntcen, oidDyMstr);
	}

	/** full constructor */
	public DyMstr(DyMstrId id, String dyDesc, String dyType,
			Integer dyNextPgdet, Integer dyNextPgcen, String dyLastEntdet,
			String dyLastEntcen, String dyUser1, String dyUser2,
			String dyQadc01, Double oidDyMstr) {
		super(id, dyDesc, dyType, dyNextPgdet, dyNextPgcen, dyLastEntdet,
				dyLastEntcen, dyUser1, dyUser2, dyQadc01, oidDyMstr);
	}

}
