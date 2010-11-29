package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFrmMstrId entity provides the base persistence definition of the
 * FrmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrmMstrId implements java.io.Serializable {

	// Fields

	private String frmDomain;
	private String frmCode;

	// Constructors

	/** default constructor */
	public AbstractFrmMstrId() {
	}

	/** minimal constructor */
	public AbstractFrmMstrId(String frmDomain) {
		this.frmDomain = frmDomain;
	}

	/** full constructor */
	public AbstractFrmMstrId(String frmDomain, String frmCode) {
		this.frmDomain = frmDomain;
		this.frmCode = frmCode;
	}

	// Property accessors

	public String getFrmDomain() {
		return this.frmDomain;
	}

	public void setFrmDomain(String frmDomain) {
		this.frmDomain = frmDomain;
	}

	public String getFrmCode() {
		return this.frmCode;
	}

	public void setFrmCode(String frmCode) {
		this.frmCode = frmCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFrmMstrId))
			return false;
		AbstractFrmMstrId castOther = (AbstractFrmMstrId) other;

		return ((this.getFrmDomain() == castOther.getFrmDomain()) || (this
				.getFrmDomain() != null
				&& castOther.getFrmDomain() != null && this.getFrmDomain()
				.equals(castOther.getFrmDomain())))
				&& ((this.getFrmCode() == castOther.getFrmCode()) || (this
						.getFrmCode() != null
						&& castOther.getFrmCode() != null && this.getFrmCode()
						.equals(castOther.getFrmCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFrmDomain() == null ? 0 : this.getFrmDomain().hashCode());
		result = 37 * result
				+ (getFrmCode() == null ? 0 : this.getFrmCode().hashCode());
		return result;
	}

}