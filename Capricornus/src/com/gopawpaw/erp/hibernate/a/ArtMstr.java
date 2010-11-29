package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ArtMstr entity. @author MyEclipse Persistence Tools
 */
public class ArtMstr extends AbstractArtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArtMstr() {
	}

	/** minimal constructor */
	public ArtMstr(ArtMstrId id, Double oidArtMstr) {
		super(id, oidArtMstr);
	}

	/** full constructor */
	public ArtMstr(ArtMstrId id, String artDesc, Integer artMfgMsgCode,
			Date artModDate, String artModUserid, String artSevLvl,
			String artUser1, String artUser2, Double artDec01, Double artDec02,
			Integer artInt01, Integer artInt02, Boolean artLog01,
			Boolean artLog02, Date artDte01, Date artDte02, String artQadc01,
			String artQadc02, String artQadc03, String artQadc04,
			Double artQadd01, Double artQadd02, Integer artQadi01,
			Integer artQadi02, Boolean artQadl01, Boolean artQadl02,
			Date artQadt01, Date artQadt02, Double oidArtMstr) {
		super(id, artDesc, artMfgMsgCode, artModDate, artModUserid, artSevLvl,
				artUser1, artUser2, artDec01, artDec02, artInt01, artInt02,
				artLog01, artLog02, artDte01, artDte02, artQadc01, artQadc02,
				artQadc03, artQadc04, artQadd01, artQadd02, artQadi01,
				artQadi02, artQadl01, artQadl02, artQadt01, artQadt02,
				oidArtMstr);
	}

}
