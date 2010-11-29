package com.gopawpaw.erp.hibernate.f;

/**
 * FshMstr entity. @author MyEclipse Persistence Tools
 */
public class FshMstr extends AbstractFshMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FshMstr() {
	}

	/** minimal constructor */
	public FshMstr(FshMstrId id, Double oidFshMstr) {
		super(id, oidFshMstr);
	}

	/** full constructor */
	public FshMstr(FshMstrId id, String fshDesc, Boolean fshCovered,
			String fshUser1, String fshUser2, String fshQadc01,
			Double oidFshMstr) {
		super(id, fshDesc, fshCovered, fshUser1, fshUser2, fshQadc01,
				oidFshMstr);
	}

}
