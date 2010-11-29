package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAldDetId entity provides the base persistence definition of the
 * AldDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAldDetId implements java.io.Serializable {

	// Fields

	private String aldDomain;
	private String aldCode;
	private String aldAcc;
	private String aldSub;
	private String aldCc;
	private String aldProject;

	// Constructors

	/** default constructor */
	public AbstractAldDetId() {
	}

	/** minimal constructor */
	public AbstractAldDetId(String aldDomain) {
		this.aldDomain = aldDomain;
	}

	/** full constructor */
	public AbstractAldDetId(String aldDomain, String aldCode, String aldAcc,
			String aldSub, String aldCc, String aldProject) {
		this.aldDomain = aldDomain;
		this.aldCode = aldCode;
		this.aldAcc = aldAcc;
		this.aldSub = aldSub;
		this.aldCc = aldCc;
		this.aldProject = aldProject;
	}

	// Property accessors

	public String getAldDomain() {
		return this.aldDomain;
	}

	public void setAldDomain(String aldDomain) {
		this.aldDomain = aldDomain;
	}

	public String getAldCode() {
		return this.aldCode;
	}

	public void setAldCode(String aldCode) {
		this.aldCode = aldCode;
	}

	public String getAldAcc() {
		return this.aldAcc;
	}

	public void setAldAcc(String aldAcc) {
		this.aldAcc = aldAcc;
	}

	public String getAldSub() {
		return this.aldSub;
	}

	public void setAldSub(String aldSub) {
		this.aldSub = aldSub;
	}

	public String getAldCc() {
		return this.aldCc;
	}

	public void setAldCc(String aldCc) {
		this.aldCc = aldCc;
	}

	public String getAldProject() {
		return this.aldProject;
	}

	public void setAldProject(String aldProject) {
		this.aldProject = aldProject;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAldDetId))
			return false;
		AbstractAldDetId castOther = (AbstractAldDetId) other;

		return ((this.getAldDomain() == castOther.getAldDomain()) || (this
				.getAldDomain() != null
				&& castOther.getAldDomain() != null && this.getAldDomain()
				.equals(castOther.getAldDomain())))
				&& ((this.getAldCode() == castOther.getAldCode()) || (this
						.getAldCode() != null
						&& castOther.getAldCode() != null && this.getAldCode()
						.equals(castOther.getAldCode())))
				&& ((this.getAldAcc() == castOther.getAldAcc()) || (this
						.getAldAcc() != null
						&& castOther.getAldAcc() != null && this.getAldAcc()
						.equals(castOther.getAldAcc())))
				&& ((this.getAldSub() == castOther.getAldSub()) || (this
						.getAldSub() != null
						&& castOther.getAldSub() != null && this.getAldSub()
						.equals(castOther.getAldSub())))
				&& ((this.getAldCc() == castOther.getAldCc()) || (this
						.getAldCc() != null
						&& castOther.getAldCc() != null && this.getAldCc()
						.equals(castOther.getAldCc())))
				&& ((this.getAldProject() == castOther.getAldProject()) || (this
						.getAldProject() != null
						&& castOther.getAldProject() != null && this
						.getAldProject().equals(castOther.getAldProject())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAldDomain() == null ? 0 : this.getAldDomain().hashCode());
		result = 37 * result
				+ (getAldCode() == null ? 0 : this.getAldCode().hashCode());
		result = 37 * result
				+ (getAldAcc() == null ? 0 : this.getAldAcc().hashCode());
		result = 37 * result
				+ (getAldSub() == null ? 0 : this.getAldSub().hashCode());
		result = 37 * result
				+ (getAldCc() == null ? 0 : this.getAldCc().hashCode());
		result = 37
				* result
				+ (getAldProject() == null ? 0 : this.getAldProject()
						.hashCode());
		return result;
	}

}