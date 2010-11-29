package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPihHistId entity provides the base persistence definition of the
 * PihHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPihHistId implements java.io.Serializable {

	// Fields

	private String pihDomain;
	private Integer pihDocType;
	private String pihNbr;
	private Integer pihLine;
	private Boolean pihConfgDisc;
	private String pihSource;
	private String pihListId;
	private String pihAmtType;
	private String pihParent;
	private String pihFeature;
	private String pihOption;

	// Constructors

	/** default constructor */
	public AbstractPihHistId() {
	}

	/** minimal constructor */
	public AbstractPihHistId(String pihDomain) {
		this.pihDomain = pihDomain;
	}

	/** full constructor */
	public AbstractPihHistId(String pihDomain, Integer pihDocType,
			String pihNbr, Integer pihLine, Boolean pihConfgDisc,
			String pihSource, String pihListId, String pihAmtType,
			String pihParent, String pihFeature, String pihOption) {
		this.pihDomain = pihDomain;
		this.pihDocType = pihDocType;
		this.pihNbr = pihNbr;
		this.pihLine = pihLine;
		this.pihConfgDisc = pihConfgDisc;
		this.pihSource = pihSource;
		this.pihListId = pihListId;
		this.pihAmtType = pihAmtType;
		this.pihParent = pihParent;
		this.pihFeature = pihFeature;
		this.pihOption = pihOption;
	}

	// Property accessors

	public String getPihDomain() {
		return this.pihDomain;
	}

	public void setPihDomain(String pihDomain) {
		this.pihDomain = pihDomain;
	}

	public Integer getPihDocType() {
		return this.pihDocType;
	}

	public void setPihDocType(Integer pihDocType) {
		this.pihDocType = pihDocType;
	}

	public String getPihNbr() {
		return this.pihNbr;
	}

	public void setPihNbr(String pihNbr) {
		this.pihNbr = pihNbr;
	}

	public Integer getPihLine() {
		return this.pihLine;
	}

	public void setPihLine(Integer pihLine) {
		this.pihLine = pihLine;
	}

	public Boolean getPihConfgDisc() {
		return this.pihConfgDisc;
	}

	public void setPihConfgDisc(Boolean pihConfgDisc) {
		this.pihConfgDisc = pihConfgDisc;
	}

	public String getPihSource() {
		return this.pihSource;
	}

	public void setPihSource(String pihSource) {
		this.pihSource = pihSource;
	}

	public String getPihListId() {
		return this.pihListId;
	}

	public void setPihListId(String pihListId) {
		this.pihListId = pihListId;
	}

	public String getPihAmtType() {
		return this.pihAmtType;
	}

	public void setPihAmtType(String pihAmtType) {
		this.pihAmtType = pihAmtType;
	}

	public String getPihParent() {
		return this.pihParent;
	}

	public void setPihParent(String pihParent) {
		this.pihParent = pihParent;
	}

	public String getPihFeature() {
		return this.pihFeature;
	}

	public void setPihFeature(String pihFeature) {
		this.pihFeature = pihFeature;
	}

	public String getPihOption() {
		return this.pihOption;
	}

	public void setPihOption(String pihOption) {
		this.pihOption = pihOption;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPihHistId))
			return false;
		AbstractPihHistId castOther = (AbstractPihHistId) other;

		return ((this.getPihDomain() == castOther.getPihDomain()) || (this
				.getPihDomain() != null
				&& castOther.getPihDomain() != null && this.getPihDomain()
				.equals(castOther.getPihDomain())))
				&& ((this.getPihDocType() == castOther.getPihDocType()) || (this
						.getPihDocType() != null
						&& castOther.getPihDocType() != null && this
						.getPihDocType().equals(castOther.getPihDocType())))
				&& ((this.getPihNbr() == castOther.getPihNbr()) || (this
						.getPihNbr() != null
						&& castOther.getPihNbr() != null && this.getPihNbr()
						.equals(castOther.getPihNbr())))
				&& ((this.getPihLine() == castOther.getPihLine()) || (this
						.getPihLine() != null
						&& castOther.getPihLine() != null && this.getPihLine()
						.equals(castOther.getPihLine())))
				&& ((this.getPihConfgDisc() == castOther.getPihConfgDisc()) || (this
						.getPihConfgDisc() != null
						&& castOther.getPihConfgDisc() != null && this
						.getPihConfgDisc().equals(castOther.getPihConfgDisc())))
				&& ((this.getPihSource() == castOther.getPihSource()) || (this
						.getPihSource() != null
						&& castOther.getPihSource() != null && this
						.getPihSource().equals(castOther.getPihSource())))
				&& ((this.getPihListId() == castOther.getPihListId()) || (this
						.getPihListId() != null
						&& castOther.getPihListId() != null && this
						.getPihListId().equals(castOther.getPihListId())))
				&& ((this.getPihAmtType() == castOther.getPihAmtType()) || (this
						.getPihAmtType() != null
						&& castOther.getPihAmtType() != null && this
						.getPihAmtType().equals(castOther.getPihAmtType())))
				&& ((this.getPihParent() == castOther.getPihParent()) || (this
						.getPihParent() != null
						&& castOther.getPihParent() != null && this
						.getPihParent().equals(castOther.getPihParent())))
				&& ((this.getPihFeature() == castOther.getPihFeature()) || (this
						.getPihFeature() != null
						&& castOther.getPihFeature() != null && this
						.getPihFeature().equals(castOther.getPihFeature())))
				&& ((this.getPihOption() == castOther.getPihOption()) || (this
						.getPihOption() != null
						&& castOther.getPihOption() != null && this
						.getPihOption().equals(castOther.getPihOption())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPihDomain() == null ? 0 : this.getPihDomain().hashCode());
		result = 37
				* result
				+ (getPihDocType() == null ? 0 : this.getPihDocType()
						.hashCode());
		result = 37 * result
				+ (getPihNbr() == null ? 0 : this.getPihNbr().hashCode());
		result = 37 * result
				+ (getPihLine() == null ? 0 : this.getPihLine().hashCode());
		result = 37
				* result
				+ (getPihConfgDisc() == null ? 0 : this.getPihConfgDisc()
						.hashCode());
		result = 37 * result
				+ (getPihSource() == null ? 0 : this.getPihSource().hashCode());
		result = 37 * result
				+ (getPihListId() == null ? 0 : this.getPihListId().hashCode());
		result = 37
				* result
				+ (getPihAmtType() == null ? 0 : this.getPihAmtType()
						.hashCode());
		result = 37 * result
				+ (getPihParent() == null ? 0 : this.getPihParent().hashCode());
		result = 37
				* result
				+ (getPihFeature() == null ? 0 : this.getPihFeature()
						.hashCode());
		result = 37 * result
				+ (getPihOption() == null ? 0 : this.getPihOption().hashCode());
		return result;
	}

}