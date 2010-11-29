package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractImgMsgId entity provides the base persistence definition of the
 * ImgMsgId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractImgMsgId implements java.io.Serializable {

	// Fields

	private String imgDomain;
	private Integer imgDocId;
	private Integer imgDocSufx;
	private String imgPrcgStage;
	private String imgReturnCode;

	// Constructors

	/** default constructor */
	public AbstractImgMsgId() {
	}

	/** minimal constructor */
	public AbstractImgMsgId(String imgDomain) {
		this.imgDomain = imgDomain;
	}

	/** full constructor */
	public AbstractImgMsgId(String imgDomain, Integer imgDocId,
			Integer imgDocSufx, String imgPrcgStage, String imgReturnCode) {
		this.imgDomain = imgDomain;
		this.imgDocId = imgDocId;
		this.imgDocSufx = imgDocSufx;
		this.imgPrcgStage = imgPrcgStage;
		this.imgReturnCode = imgReturnCode;
	}

	// Property accessors

	public String getImgDomain() {
		return this.imgDomain;
	}

	public void setImgDomain(String imgDomain) {
		this.imgDomain = imgDomain;
	}

	public Integer getImgDocId() {
		return this.imgDocId;
	}

	public void setImgDocId(Integer imgDocId) {
		this.imgDocId = imgDocId;
	}

	public Integer getImgDocSufx() {
		return this.imgDocSufx;
	}

	public void setImgDocSufx(Integer imgDocSufx) {
		this.imgDocSufx = imgDocSufx;
	}

	public String getImgPrcgStage() {
		return this.imgPrcgStage;
	}

	public void setImgPrcgStage(String imgPrcgStage) {
		this.imgPrcgStage = imgPrcgStage;
	}

	public String getImgReturnCode() {
		return this.imgReturnCode;
	}

	public void setImgReturnCode(String imgReturnCode) {
		this.imgReturnCode = imgReturnCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractImgMsgId))
			return false;
		AbstractImgMsgId castOther = (AbstractImgMsgId) other;

		return ((this.getImgDomain() == castOther.getImgDomain()) || (this
				.getImgDomain() != null
				&& castOther.getImgDomain() != null && this.getImgDomain()
				.equals(castOther.getImgDomain())))
				&& ((this.getImgDocId() == castOther.getImgDocId()) || (this
						.getImgDocId() != null
						&& castOther.getImgDocId() != null && this
						.getImgDocId().equals(castOther.getImgDocId())))
				&& ((this.getImgDocSufx() == castOther.getImgDocSufx()) || (this
						.getImgDocSufx() != null
						&& castOther.getImgDocSufx() != null && this
						.getImgDocSufx().equals(castOther.getImgDocSufx())))
				&& ((this.getImgPrcgStage() == castOther.getImgPrcgStage()) || (this
						.getImgPrcgStage() != null
						&& castOther.getImgPrcgStage() != null && this
						.getImgPrcgStage().equals(castOther.getImgPrcgStage())))
				&& ((this.getImgReturnCode() == castOther.getImgReturnCode()) || (this
						.getImgReturnCode() != null
						&& castOther.getImgReturnCode() != null && this
						.getImgReturnCode()
						.equals(castOther.getImgReturnCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getImgDomain() == null ? 0 : this.getImgDomain().hashCode());
		result = 37 * result
				+ (getImgDocId() == null ? 0 : this.getImgDocId().hashCode());
		result = 37
				* result
				+ (getImgDocSufx() == null ? 0 : this.getImgDocSufx()
						.hashCode());
		result = 37
				* result
				+ (getImgPrcgStage() == null ? 0 : this.getImgPrcgStage()
						.hashCode());
		result = 37
				* result
				+ (getImgReturnCode() == null ? 0 : this.getImgReturnCode()
						.hashCode());
		return result;
	}

}