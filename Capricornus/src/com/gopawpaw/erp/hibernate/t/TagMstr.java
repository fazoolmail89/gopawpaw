package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TagMstr entity. @author MyEclipse Persistence Tools
 */
public class TagMstr extends AbstractTagMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TagMstr() {
	}

	/** minimal constructor */
	public TagMstr(TagMstrId id, Double oidTagMstr) {
		super(id, oidTagMstr);
	}

	/** full constructor */
	public TagMstr(TagMstrId id, String tagPart, String tagLoc,
			String tagSerial, Double tagCntQty, String tagCntNam,
			Date tagCntDt, Double tagRcntQty, String tagRcntNam,
			Date tagRcntDt, String tagSite, String tagType, Boolean tagVoid,
			Date tagPrtDt, Date tagCrtDt, Boolean tagPosted, String tagCntUm,
			String tagRcntUm, Double tagRcntCnv, Double tagCntCnv,
			String tagRmks, Double tagQad01, String tagUser1, String tagUser2,
			String tagRef, Double oidTagMstr) {
		super(id, tagPart, tagLoc, tagSerial, tagCntQty, tagCntNam, tagCntDt,
				tagRcntQty, tagRcntNam, tagRcntDt, tagSite, tagType, tagVoid,
				tagPrtDt, tagCrtDt, tagPosted, tagCntUm, tagRcntUm, tagRcntCnv,
				tagCntCnv, tagRmks, tagQad01, tagUser1, tagUser2, tagRef,
				oidTagMstr);
	}

}
