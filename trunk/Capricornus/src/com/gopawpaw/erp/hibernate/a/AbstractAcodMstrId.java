package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcodMstrId entity provides the base persistence definition of the
 * AcodMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcodMstrId implements java.io.Serializable {

	// Fields

	private String acodDomain;
	private String acodAppId;
	private String acodDocStd;
	private String acodDocTyp;
	private String acodDocRev;
	private String acodTradptrId;
	private String acodFldname;
	private String acodSrcVal;

	// Constructors

	/** default constructor */
	public AbstractAcodMstrId() {
	}

	/** minimal constructor */
	public AbstractAcodMstrId(String acodDomain) {
		this.acodDomain = acodDomain;
	}

	/** full constructor */
	public AbstractAcodMstrId(String acodDomain, String acodAppId,
			String acodDocStd, String acodDocTyp, String acodDocRev,
			String acodTradptrId, String acodFldname, String acodSrcVal) {
		this.acodDomain = acodDomain;
		this.acodAppId = acodAppId;
		this.acodDocStd = acodDocStd;
		this.acodDocTyp = acodDocTyp;
		this.acodDocRev = acodDocRev;
		this.acodTradptrId = acodTradptrId;
		this.acodFldname = acodFldname;
		this.acodSrcVal = acodSrcVal;
	}

	// Property accessors

	public String getAcodDomain() {
		return this.acodDomain;
	}

	public void setAcodDomain(String acodDomain) {
		this.acodDomain = acodDomain;
	}

	public String getAcodAppId() {
		return this.acodAppId;
	}

	public void setAcodAppId(String acodAppId) {
		this.acodAppId = acodAppId;
	}

	public String getAcodDocStd() {
		return this.acodDocStd;
	}

	public void setAcodDocStd(String acodDocStd) {
		this.acodDocStd = acodDocStd;
	}

	public String getAcodDocTyp() {
		return this.acodDocTyp;
	}

	public void setAcodDocTyp(String acodDocTyp) {
		this.acodDocTyp = acodDocTyp;
	}

	public String getAcodDocRev() {
		return this.acodDocRev;
	}

	public void setAcodDocRev(String acodDocRev) {
		this.acodDocRev = acodDocRev;
	}

	public String getAcodTradptrId() {
		return this.acodTradptrId;
	}

	public void setAcodTradptrId(String acodTradptrId) {
		this.acodTradptrId = acodTradptrId;
	}

	public String getAcodFldname() {
		return this.acodFldname;
	}

	public void setAcodFldname(String acodFldname) {
		this.acodFldname = acodFldname;
	}

	public String getAcodSrcVal() {
		return this.acodSrcVal;
	}

	public void setAcodSrcVal(String acodSrcVal) {
		this.acodSrcVal = acodSrcVal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAcodMstrId))
			return false;
		AbstractAcodMstrId castOther = (AbstractAcodMstrId) other;

		return ((this.getAcodDomain() == castOther.getAcodDomain()) || (this
				.getAcodDomain() != null
				&& castOther.getAcodDomain() != null && this.getAcodDomain()
				.equals(castOther.getAcodDomain())))
				&& ((this.getAcodAppId() == castOther.getAcodAppId()) || (this
						.getAcodAppId() != null
						&& castOther.getAcodAppId() != null && this
						.getAcodAppId().equals(castOther.getAcodAppId())))
				&& ((this.getAcodDocStd() == castOther.getAcodDocStd()) || (this
						.getAcodDocStd() != null
						&& castOther.getAcodDocStd() != null && this
						.getAcodDocStd().equals(castOther.getAcodDocStd())))
				&& ((this.getAcodDocTyp() == castOther.getAcodDocTyp()) || (this
						.getAcodDocTyp() != null
						&& castOther.getAcodDocTyp() != null && this
						.getAcodDocTyp().equals(castOther.getAcodDocTyp())))
				&& ((this.getAcodDocRev() == castOther.getAcodDocRev()) || (this
						.getAcodDocRev() != null
						&& castOther.getAcodDocRev() != null && this
						.getAcodDocRev().equals(castOther.getAcodDocRev())))
				&& ((this.getAcodTradptrId() == castOther.getAcodTradptrId()) || (this
						.getAcodTradptrId() != null
						&& castOther.getAcodTradptrId() != null && this
						.getAcodTradptrId()
						.equals(castOther.getAcodTradptrId())))
				&& ((this.getAcodFldname() == castOther.getAcodFldname()) || (this
						.getAcodFldname() != null
						&& castOther.getAcodFldname() != null && this
						.getAcodFldname().equals(castOther.getAcodFldname())))
				&& ((this.getAcodSrcVal() == castOther.getAcodSrcVal()) || (this
						.getAcodSrcVal() != null
						&& castOther.getAcodSrcVal() != null && this
						.getAcodSrcVal().equals(castOther.getAcodSrcVal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAcodDomain() == null ? 0 : this.getAcodDomain()
						.hashCode());
		result = 37 * result
				+ (getAcodAppId() == null ? 0 : this.getAcodAppId().hashCode());
		result = 37
				* result
				+ (getAcodDocStd() == null ? 0 : this.getAcodDocStd()
						.hashCode());
		result = 37
				* result
				+ (getAcodDocTyp() == null ? 0 : this.getAcodDocTyp()
						.hashCode());
		result = 37
				* result
				+ (getAcodDocRev() == null ? 0 : this.getAcodDocRev()
						.hashCode());
		result = 37
				* result
				+ (getAcodTradptrId() == null ? 0 : this.getAcodTradptrId()
						.hashCode());
		result = 37
				* result
				+ (getAcodFldname() == null ? 0 : this.getAcodFldname()
						.hashCode());
		result = 37
				* result
				+ (getAcodSrcVal() == null ? 0 : this.getAcodSrcVal()
						.hashCode());
		return result;
	}

}