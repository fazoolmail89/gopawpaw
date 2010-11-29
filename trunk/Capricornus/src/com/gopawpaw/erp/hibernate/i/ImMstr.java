package com.gopawpaw.erp.hibernate.i;

/**
 * ImMstr entity. @author MyEclipse Persistence Tools
 */
public class ImMstr extends AbstractImMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ImMstr() {
	}

	/** minimal constructor */
	public ImMstr(ImMstrId id, String imDesc, String imTrType,
			String imUnplannedAcct, String imUnplannedSub,
			String imUnplannedCc, Double oidImMstr) {
		super(id, imDesc, imTrType, imUnplannedAcct, imUnplannedSub,
				imUnplannedCc, oidImMstr);
	}

	/** full constructor */
	public ImMstr(ImMstrId id, String imDesc, String imTrType, String imUser1,
			String imUser2, String imQadc01, String imUnplannedAcct,
			String imUnplannedSub, String imUnplannedCc, Double oidImMstr) {
		super(id, imDesc, imTrType, imUser1, imUser2, imQadc01,
				imUnplannedAcct, imUnplannedSub, imUnplannedCc, oidImMstr);
	}

}
