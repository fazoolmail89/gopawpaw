package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * ImgMsg entity. @author MyEclipse Persistence Tools
 */
public class ImgMsg extends AbstractImgMsg implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ImgMsg() {
	}

	/** minimal constructor */
	public ImgMsg(ImgMsgId id, Double oidImgMsg) {
		super(id, oidImgMsg);
	}

	/** full constructor */
	public ImgMsg(ImgMsgId id, String imgAppId, Boolean imgEmailSent,
			Date imgModDate, String imgModUserid, String imgReturnTxt,
			String imgSevLvl, String imgUser1, String imgUser2,
			Double imgDec01, Double imgDec02, Integer imgInt01,
			Integer imgInt02, Boolean imgLog01, Boolean imgLog02,
			Date imgDte01, Date imgDte02, String imgQadc01, String imgQadc02,
			String imgQadc03, String imgQadc04, Double imgQadd01,
			Double imgQadd02, Integer imgQadi01, Integer imgQadi02,
			Boolean imgQadl01, Boolean imgQadl02, Date imgQadt01,
			Date imgQadt02, Double oidImgMsg) {
		super(id, imgAppId, imgEmailSent, imgModDate, imgModUserid,
				imgReturnTxt, imgSevLvl, imgUser1, imgUser2, imgDec01,
				imgDec02, imgInt01, imgInt02, imgLog01, imgLog02, imgDte01,
				imgDte02, imgQadc01, imgQadc02, imgQadc03, imgQadc04,
				imgQadd01, imgQadd02, imgQadi01, imgQadi02, imgQadl01,
				imgQadl02, imgQadt01, imgQadt02, oidImgMsg);
	}

}
