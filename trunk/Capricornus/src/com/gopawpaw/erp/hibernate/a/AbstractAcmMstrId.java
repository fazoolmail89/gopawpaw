package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcmMstrId entity provides the base persistence definition of the
 * AcmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcmMstrId implements java.io.Serializable {

	// Fields

	private String acmSite;
	private String acmPart;
	private String acmProdLine;
	private String acmMethod;
	private String acmUser1;
	private String acmUser2;
	private String acmQadc01;
	private String acmDomain;
	private Double oidAcmMstr;

	// Constructors

	/** default constructor */
	public AbstractAcmMstrId() {
	}

	/** minimal constructor */
	public AbstractAcmMstrId(String acmMethod, String acmDomain,
			Double oidAcmMstr) {
		this.acmMethod = acmMethod;
		this.acmDomain = acmDomain;
		this.oidAcmMstr = oidAcmMstr;
	}

	/** full constructor */
	public AbstractAcmMstrId(String acmSite, String acmPart,
			String acmProdLine, String acmMethod, String acmUser1,
			String acmUser2, String acmQadc01, String acmDomain,
			Double oidAcmMstr) {
		this.acmSite = acmSite;
		this.acmPart = acmPart;
		this.acmProdLine = acmProdLine;
		this.acmMethod = acmMethod;
		this.acmUser1 = acmUser1;
		this.acmUser2 = acmUser2;
		this.acmQadc01 = acmQadc01;
		this.acmDomain = acmDomain;
		this.oidAcmMstr = oidAcmMstr;
	}

	// Property accessors

	public String getAcmSite() {
		return this.acmSite;
	}

	public void setAcmSite(String acmSite) {
		this.acmSite = acmSite;
	}

	public String getAcmPart() {
		return this.acmPart;
	}

	public void setAcmPart(String acmPart) {
		this.acmPart = acmPart;
	}

	public String getAcmProdLine() {
		return this.acmProdLine;
	}

	public void setAcmProdLine(String acmProdLine) {
		this.acmProdLine = acmProdLine;
	}

	public String getAcmMethod() {
		return this.acmMethod;
	}

	public void setAcmMethod(String acmMethod) {
		this.acmMethod = acmMethod;
	}

	public String getAcmUser1() {
		return this.acmUser1;
	}

	public void setAcmUser1(String acmUser1) {
		this.acmUser1 = acmUser1;
	}

	public String getAcmUser2() {
		return this.acmUser2;
	}

	public void setAcmUser2(String acmUser2) {
		this.acmUser2 = acmUser2;
	}

	public String getAcmQadc01() {
		return this.acmQadc01;
	}

	public void setAcmQadc01(String acmQadc01) {
		this.acmQadc01 = acmQadc01;
	}

	public String getAcmDomain() {
		return this.acmDomain;
	}

	public void setAcmDomain(String acmDomain) {
		this.acmDomain = acmDomain;
	}

	public Double getOidAcmMstr() {
		return this.oidAcmMstr;
	}

	public void setOidAcmMstr(Double oidAcmMstr) {
		this.oidAcmMstr = oidAcmMstr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAcmMstrId))
			return false;
		AbstractAcmMstrId castOther = (AbstractAcmMstrId) other;

		return ((this.getAcmSite() == castOther.getAcmSite()) || (this
				.getAcmSite() != null
				&& castOther.getAcmSite() != null && this.getAcmSite().equals(
				castOther.getAcmSite())))
				&& ((this.getAcmPart() == castOther.getAcmPart()) || (this
						.getAcmPart() != null
						&& castOther.getAcmPart() != null && this.getAcmPart()
						.equals(castOther.getAcmPart())))
				&& ((this.getAcmProdLine() == castOther.getAcmProdLine()) || (this
						.getAcmProdLine() != null
						&& castOther.getAcmProdLine() != null && this
						.getAcmProdLine().equals(castOther.getAcmProdLine())))
				&& ((this.getAcmMethod() == castOther.getAcmMethod()) || (this
						.getAcmMethod() != null
						&& castOther.getAcmMethod() != null && this
						.getAcmMethod().equals(castOther.getAcmMethod())))
				&& ((this.getAcmUser1() == castOther.getAcmUser1()) || (this
						.getAcmUser1() != null
						&& castOther.getAcmUser1() != null && this
						.getAcmUser1().equals(castOther.getAcmUser1())))
				&& ((this.getAcmUser2() == castOther.getAcmUser2()) || (this
						.getAcmUser2() != null
						&& castOther.getAcmUser2() != null && this
						.getAcmUser2().equals(castOther.getAcmUser2())))
				&& ((this.getAcmQadc01() == castOther.getAcmQadc01()) || (this
						.getAcmQadc01() != null
						&& castOther.getAcmQadc01() != null && this
						.getAcmQadc01().equals(castOther.getAcmQadc01())))
				&& ((this.getAcmDomain() == castOther.getAcmDomain()) || (this
						.getAcmDomain() != null
						&& castOther.getAcmDomain() != null && this
						.getAcmDomain().equals(castOther.getAcmDomain())))
				&& ((this.getOidAcmMstr() == castOther.getOidAcmMstr()) || (this
						.getOidAcmMstr() != null
						&& castOther.getOidAcmMstr() != null && this
						.getOidAcmMstr().equals(castOther.getOidAcmMstr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAcmSite() == null ? 0 : this.getAcmSite().hashCode());
		result = 37 * result
				+ (getAcmPart() == null ? 0 : this.getAcmPart().hashCode());
		result = 37
				* result
				+ (getAcmProdLine() == null ? 0 : this.getAcmProdLine()
						.hashCode());
		result = 37 * result
				+ (getAcmMethod() == null ? 0 : this.getAcmMethod().hashCode());
		result = 37 * result
				+ (getAcmUser1() == null ? 0 : this.getAcmUser1().hashCode());
		result = 37 * result
				+ (getAcmUser2() == null ? 0 : this.getAcmUser2().hashCode());
		result = 37 * result
				+ (getAcmQadc01() == null ? 0 : this.getAcmQadc01().hashCode());
		result = 37 * result
				+ (getAcmDomain() == null ? 0 : this.getAcmDomain().hashCode());
		result = 37
				* result
				+ (getOidAcmMstr() == null ? 0 : this.getOidAcmMstr()
						.hashCode());
		return result;
	}

}