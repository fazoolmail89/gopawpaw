package com.gopawpaw.erp.hibernate.p;

/**
 * PrMstr entity. @author MyEclipse Persistence Tools
 */
public class PrMstr extends AbstractPrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PrMstr() {
	}

	/** minimal constructor */
	public PrMstr(Double oidPrMstr) {
		super(oidPrMstr);
	}

	/** full constructor */
	public PrMstr(String prDesc, String prSt80, String prReset, String prSt132,
			String prStBc, String prEndBc, String prNegLine, Integer prLength,
			Integer prBlank, String prPage, String prInit, String prUser1,
			String prUser2, String prQadc01, Double oidPrMstr) {
		super(prDesc, prSt80, prReset, prSt132, prStBc, prEndBc, prNegLine,
				prLength, prBlank, prPage, prInit, prUser1, prUser2, prQadc01,
				oidPrMstr);
	}

}
