package com.gopawpaw.erp.hibernate.t;

/**
 * TrlMstr entity. @author MyEclipse Persistence Tools
 */
public class TrlMstr extends AbstractTrlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrlMstr() {
	}

	/** minimal constructor */
	public TrlMstr(TrlMstrId id, Double oidTrlMstr) {
		super(id, oidTrlMstr);
	}

	/** full constructor */
	public TrlMstr(TrlMstrId id, String trlDesc, String trlAcct, String trlCc,
			String trlProject, Boolean trlTaxable, String trlTaxc,
			Boolean trlFst, Boolean trlPst, String trlUser1, String trlUser2,
			String trlQadc01, String trlSub, Double oidTrlMstr) {
		super(id, trlDesc, trlAcct, trlCc, trlProject, trlTaxable, trlTaxc,
				trlFst, trlPst, trlUser1, trlUser2, trlQadc01, trlSub,
				oidTrlMstr);
	}

}
