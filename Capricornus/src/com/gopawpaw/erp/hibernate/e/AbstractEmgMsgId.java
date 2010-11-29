package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEmgMsgId entity provides the base persistence definition of the
 * EmgMsgId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmgMsgId implements java.io.Serializable {

	// Fields

	private String emgDomain;
	private Integer emgDocId;
	private Integer emgDocSufx;
	private String emgPrcgStage;
	private String emgReturnCode;

	// Constructors

	/** default constructor */
	public AbstractEmgMsgId() {
	}

	/** minimal constructor */
	public AbstractEmgMsgId(String emgDomain) {
		this.emgDomain = emgDomain;
	}

	/** full constructor */
	public AbstractEmgMsgId(String emgDomain, Integer emgDocId,
			Integer emgDocSufx, String emgPrcgStage, String emgReturnCode) {
		this.emgDomain = emgDomain;
		this.emgDocId = emgDocId;
		this.emgDocSufx = emgDocSufx;
		this.emgPrcgStage = emgPrcgStage;
		this.emgReturnCode = emgReturnCode;
	}

	// Property accessors

	public String getEmgDomain() {
		return this.emgDomain;
	}

	public void setEmgDomain(String emgDomain) {
		this.emgDomain = emgDomain;
	}

	public Integer getEmgDocId() {
		return this.emgDocId;
	}

	public void setEmgDocId(Integer emgDocId) {
		this.emgDocId = emgDocId;
	}

	public Integer getEmgDocSufx() {
		return this.emgDocSufx;
	}

	public void setEmgDocSufx(Integer emgDocSufx) {
		this.emgDocSufx = emgDocSufx;
	}

	public String getEmgPrcgStage() {
		return this.emgPrcgStage;
	}

	public void setEmgPrcgStage(String emgPrcgStage) {
		this.emgPrcgStage = emgPrcgStage;
	}

	public String getEmgReturnCode() {
		return this.emgReturnCode;
	}

	public void setEmgReturnCode(String emgReturnCode) {
		this.emgReturnCode = emgReturnCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEmgMsgId))
			return false;
		AbstractEmgMsgId castOther = (AbstractEmgMsgId) other;

		return ((this.getEmgDomain() == castOther.getEmgDomain()) || (this
				.getEmgDomain() != null
				&& castOther.getEmgDomain() != null && this.getEmgDomain()
				.equals(castOther.getEmgDomain())))
				&& ((this.getEmgDocId() == castOther.getEmgDocId()) || (this
						.getEmgDocId() != null
						&& castOther.getEmgDocId() != null && this
						.getEmgDocId().equals(castOther.getEmgDocId())))
				&& ((this.getEmgDocSufx() == castOther.getEmgDocSufx()) || (this
						.getEmgDocSufx() != null
						&& castOther.getEmgDocSufx() != null && this
						.getEmgDocSufx().equals(castOther.getEmgDocSufx())))
				&& ((this.getEmgPrcgStage() == castOther.getEmgPrcgStage()) || (this
						.getEmgPrcgStage() != null
						&& castOther.getEmgPrcgStage() != null && this
						.getEmgPrcgStage().equals(castOther.getEmgPrcgStage())))
				&& ((this.getEmgReturnCode() == castOther.getEmgReturnCode()) || (this
						.getEmgReturnCode() != null
						&& castOther.getEmgReturnCode() != null && this
						.getEmgReturnCode()
						.equals(castOther.getEmgReturnCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEmgDomain() == null ? 0 : this.getEmgDomain().hashCode());
		result = 37 * result
				+ (getEmgDocId() == null ? 0 : this.getEmgDocId().hashCode());
		result = 37
				* result
				+ (getEmgDocSufx() == null ? 0 : this.getEmgDocSufx()
						.hashCode());
		result = 37
				* result
				+ (getEmgPrcgStage() == null ? 0 : this.getEmgPrcgStage()
						.hashCode());
		result = 37
				* result
				+ (getEmgReturnCode() == null ? 0 : this.getEmgReturnCode()
						.hashCode());
		return result;
	}

}