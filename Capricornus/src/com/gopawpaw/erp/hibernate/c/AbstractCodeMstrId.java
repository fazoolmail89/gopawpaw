package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCodeMstrId entity provides the base persistence definition of the
 * CodeMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCodeMstrId implements java.io.Serializable {

	// Fields

	private String codeDomain;
	private String codeFldname;
	private String codeValue;

	// Constructors

	/** default constructor */
	public AbstractCodeMstrId() {
	}

	/** minimal constructor */
	public AbstractCodeMstrId(String codeDomain) {
		this.codeDomain = codeDomain;
	}

	/** full constructor */
	public AbstractCodeMstrId(String codeDomain, String codeFldname,
			String codeValue) {
		this.codeDomain = codeDomain;
		this.codeFldname = codeFldname;
		this.codeValue = codeValue;
	}

	// Property accessors

	public String getCodeDomain() {
		return this.codeDomain;
	}

	public void setCodeDomain(String codeDomain) {
		this.codeDomain = codeDomain;
	}

	public String getCodeFldname() {
		return this.codeFldname;
	}

	public void setCodeFldname(String codeFldname) {
		this.codeFldname = codeFldname;
	}

	public String getCodeValue() {
		return this.codeValue;
	}

	public void setCodeValue(String codeValue) {
		this.codeValue = codeValue;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCodeMstrId))
			return false;
		AbstractCodeMstrId castOther = (AbstractCodeMstrId) other;

		return ((this.getCodeDomain() == castOther.getCodeDomain()) || (this
				.getCodeDomain() != null
				&& castOther.getCodeDomain() != null && this.getCodeDomain()
				.equals(castOther.getCodeDomain())))
				&& ((this.getCodeFldname() == castOther.getCodeFldname()) || (this
						.getCodeFldname() != null
						&& castOther.getCodeFldname() != null && this
						.getCodeFldname().equals(castOther.getCodeFldname())))
				&& ((this.getCodeValue() == castOther.getCodeValue()) || (this
						.getCodeValue() != null
						&& castOther.getCodeValue() != null && this
						.getCodeValue().equals(castOther.getCodeValue())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCodeDomain() == null ? 0 : this.getCodeDomain()
						.hashCode());
		result = 37
				* result
				+ (getCodeFldname() == null ? 0 : this.getCodeFldname()
						.hashCode());
		result = 37 * result
				+ (getCodeValue() == null ? 0 : this.getCodeValue().hashCode());
		return result;
	}

}