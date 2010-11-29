package com.gopawpaw.erp.hibernate.i;

/**
 * ImgMsgId entity. @author MyEclipse Persistence Tools
 */
public class ImgMsgId extends AbstractImgMsgId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ImgMsgId() {
	}

	/** minimal constructor */
	public ImgMsgId(String imgDomain) {
		super(imgDomain);
	}

	/** full constructor */
	public ImgMsgId(String imgDomain, Integer imgDocId, Integer imgDocSufx,
			String imgPrcgStage, String imgReturnCode) {
		super(imgDomain, imgDocId, imgDocSufx, imgPrcgStage, imgReturnCode);
	}

}
