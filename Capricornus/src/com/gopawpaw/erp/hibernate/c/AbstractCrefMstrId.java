package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCrefMstrId entity provides the base persistence definition of the
 * CrefMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCrefMstrId implements java.io.Serializable {

	// Fields

	private String crefDomain;
	private String crefRefType;
	private String crefItem1;
	private String crefItem2;

	// Constructors

	/** default constructor */
	public AbstractCrefMstrId() {
	}

	/** minimal constructor */
	public AbstractCrefMstrId(String crefDomain) {
		this.crefDomain = crefDomain;
	}

	/** full constructor */
	public AbstractCrefMstrId(String crefDomain, String crefRefType,
			String crefItem1, String crefItem2) {
		this.crefDomain = crefDomain;
		this.crefRefType = crefRefType;
		this.crefItem1 = crefItem1;
		this.crefItem2 = crefItem2;
	}

	// Property accessors

	public String getCrefDomain() {
		return this.crefDomain;
	}

	public void setCrefDomain(String crefDomain) {
		this.crefDomain = crefDomain;
	}

	public String getCrefRefType() {
		return this.crefRefType;
	}

	public void setCrefRefType(String crefRefType) {
		this.crefRefType = crefRefType;
	}

	public String getCrefItem1() {
		return this.crefItem1;
	}

	public void setCrefItem1(String crefItem1) {
		this.crefItem1 = crefItem1;
	}

	public String getCrefItem2() {
		return this.crefItem2;
	}

	public void setCrefItem2(String crefItem2) {
		this.crefItem2 = crefItem2;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCrefMstrId))
			return false;
		AbstractCrefMstrId castOther = (AbstractCrefMstrId) other;

		return ((this.getCrefDomain() == castOther.getCrefDomain()) || (this
				.getCrefDomain() != null
				&& castOther.getCrefDomain() != null && this.getCrefDomain()
				.equals(castOther.getCrefDomain())))
				&& ((this.getCrefRefType() == castOther.getCrefRefType()) || (this
						.getCrefRefType() != null
						&& castOther.getCrefRefType() != null && this
						.getCrefRefType().equals(castOther.getCrefRefType())))
				&& ((this.getCrefItem1() == castOther.getCrefItem1()) || (this
						.getCrefItem1() != null
						&& castOther.getCrefItem1() != null && this
						.getCrefItem1().equals(castOther.getCrefItem1())))
				&& ((this.getCrefItem2() == castOther.getCrefItem2()) || (this
						.getCrefItem2() != null
						&& castOther.getCrefItem2() != null && this
						.getCrefItem2().equals(castOther.getCrefItem2())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCrefDomain() == null ? 0 : this.getCrefDomain()
						.hashCode());
		result = 37
				* result
				+ (getCrefRefType() == null ? 0 : this.getCrefRefType()
						.hashCode());
		result = 37 * result
				+ (getCrefItem1() == null ? 0 : this.getCrefItem1().hashCode());
		result = 37 * result
				+ (getCrefItem2() == null ? 0 : this.getCrefItem2().hashCode());
		return result;
	}

}