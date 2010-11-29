package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKbdtMstrId entity provides the base persistence definition of the
 * KbdtMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbdtMstrId implements java.io.Serializable {

	// Fields

	private String kbdtDomain;
	private String kbdtTemplate;

	// Constructors

	/** default constructor */
	public AbstractKbdtMstrId() {
	}

	/** full constructor */
	public AbstractKbdtMstrId(String kbdtDomain, String kbdtTemplate) {
		this.kbdtDomain = kbdtDomain;
		this.kbdtTemplate = kbdtTemplate;
	}

	// Property accessors

	public String getKbdtDomain() {
		return this.kbdtDomain;
	}

	public void setKbdtDomain(String kbdtDomain) {
		this.kbdtDomain = kbdtDomain;
	}

	public String getKbdtTemplate() {
		return this.kbdtTemplate;
	}

	public void setKbdtTemplate(String kbdtTemplate) {
		this.kbdtTemplate = kbdtTemplate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKbdtMstrId))
			return false;
		AbstractKbdtMstrId castOther = (AbstractKbdtMstrId) other;

		return ((this.getKbdtDomain() == castOther.getKbdtDomain()) || (this
				.getKbdtDomain() != null
				&& castOther.getKbdtDomain() != null && this.getKbdtDomain()
				.equals(castOther.getKbdtDomain())))
				&& ((this.getKbdtTemplate() == castOther.getKbdtTemplate()) || (this
						.getKbdtTemplate() != null
						&& castOther.getKbdtTemplate() != null && this
						.getKbdtTemplate().equals(castOther.getKbdtTemplate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKbdtDomain() == null ? 0 : this.getKbdtDomain()
						.hashCode());
		result = 37
				* result
				+ (getKbdtTemplate() == null ? 0 : this.getKbdtTemplate()
						.hashCode());
		return result;
	}

}