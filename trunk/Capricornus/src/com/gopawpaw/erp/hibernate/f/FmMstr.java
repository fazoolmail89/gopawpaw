package com.gopawpaw.erp.hibernate.f;

/**
 * FmMstr entity. @author MyEclipse Persistence Tools
 */
public class FmMstr extends AbstractFmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FmMstr() {
	}

	/** minimal constructor */
	public FmMstr(FmMstrId id, Double oidFmMstr) {
		super(id, oidFmMstr);
	}

	/** full constructor */
	public FmMstr(FmMstrId id, String fmDesc, Boolean fmDrCr,
			Boolean fmPageBrk, Boolean fmHeader, Boolean fmTotal,
			Boolean fmSkip, Boolean fmUnderln, String fmUser1, String fmUser2,
			Boolean fmCcSort, Boolean fmSubSort, String fmQadc01,
			Double oidFmMstr) {
		super(id, fmDesc, fmDrCr, fmPageBrk, fmHeader, fmTotal, fmSkip,
				fmUnderln, fmUser1, fmUser2, fmCcSort, fmSubSort, fmQadc01,
				oidFmMstr);
	}

}
