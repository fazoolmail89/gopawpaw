package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSypsDetId entity provides the base persistence definition of the
 * SypsDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSypsDetId implements java.io.Serializable {

	// Fields

	private String sypsAppId;
	private String sypsDocStd;
	private String sypsDocTyp;
	private String sypsDocRev;
	private String sypsTradptrId;
	private Boolean sypsImDoc;
	private String sypsProflId;

	// Constructors

	/** default constructor */
	public AbstractSypsDetId() {
	}

	/** full constructor */
	public AbstractSypsDetId(String sypsAppId, String sypsDocStd,
			String sypsDocTyp, String sypsDocRev, String sypsTradptrId,
			Boolean sypsImDoc, String sypsProflId) {
		this.sypsAppId = sypsAppId;
		this.sypsDocStd = sypsDocStd;
		this.sypsDocTyp = sypsDocTyp;
		this.sypsDocRev = sypsDocRev;
		this.sypsTradptrId = sypsTradptrId;
		this.sypsImDoc = sypsImDoc;
		this.sypsProflId = sypsProflId;
	}

	// Property accessors

	public String getSypsAppId() {
		return this.sypsAppId;
	}

	public void setSypsAppId(String sypsAppId) {
		this.sypsAppId = sypsAppId;
	}

	public String getSypsDocStd() {
		return this.sypsDocStd;
	}

	public void setSypsDocStd(String sypsDocStd) {
		this.sypsDocStd = sypsDocStd;
	}

	public String getSypsDocTyp() {
		return this.sypsDocTyp;
	}

	public void setSypsDocTyp(String sypsDocTyp) {
		this.sypsDocTyp = sypsDocTyp;
	}

	public String getSypsDocRev() {
		return this.sypsDocRev;
	}

	public void setSypsDocRev(String sypsDocRev) {
		this.sypsDocRev = sypsDocRev;
	}

	public String getSypsTradptrId() {
		return this.sypsTradptrId;
	}

	public void setSypsTradptrId(String sypsTradptrId) {
		this.sypsTradptrId = sypsTradptrId;
	}

	public Boolean getSypsImDoc() {
		return this.sypsImDoc;
	}

	public void setSypsImDoc(Boolean sypsImDoc) {
		this.sypsImDoc = sypsImDoc;
	}

	public String getSypsProflId() {
		return this.sypsProflId;
	}

	public void setSypsProflId(String sypsProflId) {
		this.sypsProflId = sypsProflId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSypsDetId))
			return false;
		AbstractSypsDetId castOther = (AbstractSypsDetId) other;

		return ((this.getSypsAppId() == castOther.getSypsAppId()) || (this
				.getSypsAppId() != null
				&& castOther.getSypsAppId() != null && this.getSypsAppId()
				.equals(castOther.getSypsAppId())))
				&& ((this.getSypsDocStd() == castOther.getSypsDocStd()) || (this
						.getSypsDocStd() != null
						&& castOther.getSypsDocStd() != null && this
						.getSypsDocStd().equals(castOther.getSypsDocStd())))
				&& ((this.getSypsDocTyp() == castOther.getSypsDocTyp()) || (this
						.getSypsDocTyp() != null
						&& castOther.getSypsDocTyp() != null && this
						.getSypsDocTyp().equals(castOther.getSypsDocTyp())))
				&& ((this.getSypsDocRev() == castOther.getSypsDocRev()) || (this
						.getSypsDocRev() != null
						&& castOther.getSypsDocRev() != null && this
						.getSypsDocRev().equals(castOther.getSypsDocRev())))
				&& ((this.getSypsTradptrId() == castOther.getSypsTradptrId()) || (this
						.getSypsTradptrId() != null
						&& castOther.getSypsTradptrId() != null && this
						.getSypsTradptrId()
						.equals(castOther.getSypsTradptrId())))
				&& ((this.getSypsImDoc() == castOther.getSypsImDoc()) || (this
						.getSypsImDoc() != null
						&& castOther.getSypsImDoc() != null && this
						.getSypsImDoc().equals(castOther.getSypsImDoc())))
				&& ((this.getSypsProflId() == castOther.getSypsProflId()) || (this
						.getSypsProflId() != null
						&& castOther.getSypsProflId() != null && this
						.getSypsProflId().equals(castOther.getSypsProflId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSypsAppId() == null ? 0 : this.getSypsAppId().hashCode());
		result = 37
				* result
				+ (getSypsDocStd() == null ? 0 : this.getSypsDocStd()
						.hashCode());
		result = 37
				* result
				+ (getSypsDocTyp() == null ? 0 : this.getSypsDocTyp()
						.hashCode());
		result = 37
				* result
				+ (getSypsDocRev() == null ? 0 : this.getSypsDocRev()
						.hashCode());
		result = 37
				* result
				+ (getSypsTradptrId() == null ? 0 : this.getSypsTradptrId()
						.hashCode());
		result = 37 * result
				+ (getSypsImDoc() == null ? 0 : this.getSypsImDoc().hashCode());
		result = 37
				* result
				+ (getSypsProflId() == null ? 0 : this.getSypsProflId()
						.hashCode());
		return result;
	}

}