package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIphHistId entity provides the base persistence definition of the
 * IphHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIphHistId implements java.io.Serializable {

	// Fields

	private String iphDomain;
	private String iphInvNbr;
	private String iphNbr;
	private Integer iphLine;
	private Boolean iphConfgDisc;
	private String iphSource;
	private String iphListId;
	private String iphAmtType;
	private String iphParent;
	private String iphFeature;
	private String iphOption;

	// Constructors

	/** default constructor */
	public AbstractIphHistId() {
	}

	/** minimal constructor */
	public AbstractIphHistId(String iphDomain) {
		this.iphDomain = iphDomain;
	}

	/** full constructor */
	public AbstractIphHistId(String iphDomain, String iphInvNbr, String iphNbr,
			Integer iphLine, Boolean iphConfgDisc, String iphSource,
			String iphListId, String iphAmtType, String iphParent,
			String iphFeature, String iphOption) {
		this.iphDomain = iphDomain;
		this.iphInvNbr = iphInvNbr;
		this.iphNbr = iphNbr;
		this.iphLine = iphLine;
		this.iphConfgDisc = iphConfgDisc;
		this.iphSource = iphSource;
		this.iphListId = iphListId;
		this.iphAmtType = iphAmtType;
		this.iphParent = iphParent;
		this.iphFeature = iphFeature;
		this.iphOption = iphOption;
	}

	// Property accessors

	public String getIphDomain() {
		return this.iphDomain;
	}

	public void setIphDomain(String iphDomain) {
		this.iphDomain = iphDomain;
	}

	public String getIphInvNbr() {
		return this.iphInvNbr;
	}

	public void setIphInvNbr(String iphInvNbr) {
		this.iphInvNbr = iphInvNbr;
	}

	public String getIphNbr() {
		return this.iphNbr;
	}

	public void setIphNbr(String iphNbr) {
		this.iphNbr = iphNbr;
	}

	public Integer getIphLine() {
		return this.iphLine;
	}

	public void setIphLine(Integer iphLine) {
		this.iphLine = iphLine;
	}

	public Boolean getIphConfgDisc() {
		return this.iphConfgDisc;
	}

	public void setIphConfgDisc(Boolean iphConfgDisc) {
		this.iphConfgDisc = iphConfgDisc;
	}

	public String getIphSource() {
		return this.iphSource;
	}

	public void setIphSource(String iphSource) {
		this.iphSource = iphSource;
	}

	public String getIphListId() {
		return this.iphListId;
	}

	public void setIphListId(String iphListId) {
		this.iphListId = iphListId;
	}

	public String getIphAmtType() {
		return this.iphAmtType;
	}

	public void setIphAmtType(String iphAmtType) {
		this.iphAmtType = iphAmtType;
	}

	public String getIphParent() {
		return this.iphParent;
	}

	public void setIphParent(String iphParent) {
		this.iphParent = iphParent;
	}

	public String getIphFeature() {
		return this.iphFeature;
	}

	public void setIphFeature(String iphFeature) {
		this.iphFeature = iphFeature;
	}

	public String getIphOption() {
		return this.iphOption;
	}

	public void setIphOption(String iphOption) {
		this.iphOption = iphOption;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIphHistId))
			return false;
		AbstractIphHistId castOther = (AbstractIphHistId) other;

		return ((this.getIphDomain() == castOther.getIphDomain()) || (this
				.getIphDomain() != null
				&& castOther.getIphDomain() != null && this.getIphDomain()
				.equals(castOther.getIphDomain())))
				&& ((this.getIphInvNbr() == castOther.getIphInvNbr()) || (this
						.getIphInvNbr() != null
						&& castOther.getIphInvNbr() != null && this
						.getIphInvNbr().equals(castOther.getIphInvNbr())))
				&& ((this.getIphNbr() == castOther.getIphNbr()) || (this
						.getIphNbr() != null
						&& castOther.getIphNbr() != null && this.getIphNbr()
						.equals(castOther.getIphNbr())))
				&& ((this.getIphLine() == castOther.getIphLine()) || (this
						.getIphLine() != null
						&& castOther.getIphLine() != null && this.getIphLine()
						.equals(castOther.getIphLine())))
				&& ((this.getIphConfgDisc() == castOther.getIphConfgDisc()) || (this
						.getIphConfgDisc() != null
						&& castOther.getIphConfgDisc() != null && this
						.getIphConfgDisc().equals(castOther.getIphConfgDisc())))
				&& ((this.getIphSource() == castOther.getIphSource()) || (this
						.getIphSource() != null
						&& castOther.getIphSource() != null && this
						.getIphSource().equals(castOther.getIphSource())))
				&& ((this.getIphListId() == castOther.getIphListId()) || (this
						.getIphListId() != null
						&& castOther.getIphListId() != null && this
						.getIphListId().equals(castOther.getIphListId())))
				&& ((this.getIphAmtType() == castOther.getIphAmtType()) || (this
						.getIphAmtType() != null
						&& castOther.getIphAmtType() != null && this
						.getIphAmtType().equals(castOther.getIphAmtType())))
				&& ((this.getIphParent() == castOther.getIphParent()) || (this
						.getIphParent() != null
						&& castOther.getIphParent() != null && this
						.getIphParent().equals(castOther.getIphParent())))
				&& ((this.getIphFeature() == castOther.getIphFeature()) || (this
						.getIphFeature() != null
						&& castOther.getIphFeature() != null && this
						.getIphFeature().equals(castOther.getIphFeature())))
				&& ((this.getIphOption() == castOther.getIphOption()) || (this
						.getIphOption() != null
						&& castOther.getIphOption() != null && this
						.getIphOption().equals(castOther.getIphOption())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIphDomain() == null ? 0 : this.getIphDomain().hashCode());
		result = 37 * result
				+ (getIphInvNbr() == null ? 0 : this.getIphInvNbr().hashCode());
		result = 37 * result
				+ (getIphNbr() == null ? 0 : this.getIphNbr().hashCode());
		result = 37 * result
				+ (getIphLine() == null ? 0 : this.getIphLine().hashCode());
		result = 37
				* result
				+ (getIphConfgDisc() == null ? 0 : this.getIphConfgDisc()
						.hashCode());
		result = 37 * result
				+ (getIphSource() == null ? 0 : this.getIphSource().hashCode());
		result = 37 * result
				+ (getIphListId() == null ? 0 : this.getIphListId().hashCode());
		result = 37
				* result
				+ (getIphAmtType() == null ? 0 : this.getIphAmtType()
						.hashCode());
		result = 37 * result
				+ (getIphParent() == null ? 0 : this.getIphParent().hashCode());
		result = 37
				* result
				+ (getIphFeature() == null ? 0 : this.getIphFeature()
						.hashCode());
		result = 37 * result
				+ (getIphOption() == null ? 0 : this.getIphOption().hashCode());
		return result;
	}

}