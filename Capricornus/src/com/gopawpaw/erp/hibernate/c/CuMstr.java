package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CuMstr entity. @author MyEclipse Persistence Tools
 */
public class CuMstr extends AbstractCuMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CuMstr() {
	}

	/** minimal constructor */
	public CuMstr(String cuDesc, String cuRndMthd, Boolean cuActive,
			String cuQadc02, String cuQadc04, String cuQadc05, String cuQadc07,
			String cuQadc08, String cuQadc10, String cuQadc11, String cuQadc13,
			String cuQadc14, String cuQadc16, String cuModUserid,
			Date cuModDate, String cuUser1, String cuUser2, Double cuQadd01,
			String cuQadc01, Boolean cuQadl01, String cuIsoCurr,
			Double oidCuMstr) {
		super(cuDesc, cuRndMthd, cuActive, cuQadc02, cuQadc04, cuQadc05,
				cuQadc07, cuQadc08, cuQadc10, cuQadc11, cuQadc13, cuQadc14,
				cuQadc16, cuModUserid, cuModDate, cuUser1, cuUser2, cuQadd01,
				cuQadc01, cuQadl01, cuIsoCurr, oidCuMstr);
	}

	/** full constructor */
	public CuMstr(String cuDesc, String cuRndMthd, Boolean cuActive,
			String cuQadc02, String cuQadc04, String cuQadc05, String cuQadc07,
			String cuQadc08, String cuQadc10, String cuQadc11, String cuQadc13,
			String cuQadc14, String cuQadc16, String cuModUserid,
			Date cuModDate, String cuUser1, String cuUser2, Date cuQadt01,
			Date cuQadt02, Double cuQadd01, String cuQadc01, Boolean cuQadl01,
			String cuQadc15, String cuQadc09, String cuQadc12, String cuQadc03,
			String cuQadc06, String cuIsoCurr, Double oidCuMstr) {
		super(cuDesc, cuRndMthd, cuActive, cuQadc02, cuQadc04, cuQadc05,
				cuQadc07, cuQadc08, cuQadc10, cuQadc11, cuQadc13, cuQadc14,
				cuQadc16, cuModUserid, cuModDate, cuUser1, cuUser2, cuQadt01,
				cuQadt02, cuQadd01, cuQadc01, cuQadl01, cuQadc15, cuQadc09,
				cuQadc12, cuQadc03, cuQadc06, cuIsoCurr, oidCuMstr);
	}

}
