package com.gopawpaw.erp.hibernate.e;

/**
 * EnMstr entity. @author MyEclipse Persistence Tools
 */
public class EnMstr extends AbstractEnMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EnMstr() {
	}

	/** minimal constructor */
	public EnMstr(EnMstrId id, Integer enNextProt, String enSrcDescLang,
			String enAddr, Boolean enConsolidation, String enType,
			Double oidEnMstr) {
		super(id, enNextProt, enSrcDescLang, enAddr, enConsolidation, enType,
				oidEnMstr);
	}

	/** full constructor */
	public EnMstr(EnMstrId id, String enName, Boolean enPrimary,
			Integer enQad02, Boolean enQad01, String enCurr, String enUser1,
			String enUser2, Boolean enAdjBs, Integer enPageNum,
			Integer enNextProt, String enSrcDescLang, String enAddr,
			Boolean enConsolidation, String enType, Double oidEnMstr) {
		super(id, enName, enPrimary, enQad02, enQad01, enCurr, enUser1,
				enUser2, enAdjBs, enPageNum, enNextProt, enSrcDescLang, enAddr,
				enConsolidation, enType, oidEnMstr);
	}

}
