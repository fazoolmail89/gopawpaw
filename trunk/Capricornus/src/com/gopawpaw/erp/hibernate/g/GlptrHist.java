package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GlptrHist entity. @author MyEclipse Persistence Tools
 */
public class GlptrHist extends AbstractGlptrHist implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlptrHist() {
	}

	/** minimal constructor */
	public GlptrHist(GlptrHistId id, Integer glptrProtNbr, String glptrUser1,
			String glptrUser2, String glptrModUserid, Date glptrModDate,
			String glptrQadc01, String glptrQadc02, Double oidGlptrHist) {
		super(id, glptrProtNbr, glptrUser1, glptrUser2, glptrModUserid,
				glptrModDate, glptrQadc01, glptrQadc02, oidGlptrHist);
	}

	/** full constructor */
	public GlptrHist(GlptrHistId id, Date glptrEffDate, Date glptrPrtDate,
			Integer glptrProtNbr, String glptrUser1, String glptrUser2,
			String glptrModUserid, Date glptrModDate, String glptrQadc01,
			String glptrQadc02, Double oidGlptrHist) {
		super(id, glptrEffDate, glptrPrtDate, glptrProtNbr, glptrUser1,
				glptrUser2, glptrModUserid, glptrModDate, glptrQadc01,
				glptrQadc02, oidGlptrHist);
	}

}
