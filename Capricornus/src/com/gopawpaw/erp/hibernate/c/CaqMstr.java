package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CaqMstr entity. @author MyEclipse Persistence Tools
 */
public class CaqMstr extends AbstractCaqMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CaqMstr() {
	}

	/** minimal constructor */
	public CaqMstr(CaqMstrId id, Boolean caq3rdParty, Boolean caqAreaPri,
			Boolean caqAreaSc, Boolean caqCreateBom, Boolean caqCreateRte,
			Boolean caqCreateWo, String caqDefaultRte, Boolean caqField,
			Boolean caqProbPri, Double oidCaqMstr) {
		super(id, caq3rdParty, caqAreaPri, caqAreaSc, caqCreateBom,
				caqCreateRte, caqCreateWo, caqDefaultRte, caqField, caqProbPri,
				oidCaqMstr);
	}

	/** full constructor */
	public CaqMstr(CaqMstrId id, String caqDesc, String caqArea,
			String caqNode, String caqChr01, String caqChr02, String caqChr03,
			Boolean caqLog01, Boolean caqLog02, Date caqDte01, Date caqDte02,
			Double caqDec01, Double caqDec02, String caqUser1, String caqUser2,
			Boolean caq3rdParty, Boolean caqAreaPri, Boolean caqAreaSc,
			Boolean caqCreateBom, Boolean caqCreateRte, Boolean caqCreateWo,
			String caqDefaultRte, Boolean caqField, Boolean caqProbPri,
			Boolean caqDepot, Double oidCaqMstr) {
		super(id, caqDesc, caqArea, caqNode, caqChr01, caqChr02, caqChr03,
				caqLog01, caqLog02, caqDte01, caqDte02, caqDec01, caqDec02,
				caqUser1, caqUser2, caq3rdParty, caqAreaPri, caqAreaSc,
				caqCreateBom, caqCreateRte, caqCreateWo, caqDefaultRte,
				caqField, caqProbPri, caqDepot, oidCaqMstr);
	}

}
