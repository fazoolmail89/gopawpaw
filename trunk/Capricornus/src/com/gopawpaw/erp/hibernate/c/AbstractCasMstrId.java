package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCasMstrId entity provides the base persistence definition of the
 * CasMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCasMstrId implements java.io.Serializable {

	// Fields

	private String casDomain;
	private String casStatus;
	private String casFileType;

	// Constructors

	/** default constructor */
	public AbstractCasMstrId() {
	}

	/** minimal constructor */
	public AbstractCasMstrId(String casDomain) {
		this.casDomain = casDomain;
	}

	/** full constructor */
	public AbstractCasMstrId(String casDomain, String casStatus,
			String casFileType) {
		this.casDomain = casDomain;
		this.casStatus = casStatus;
		this.casFileType = casFileType;
	}

	// Property accessors

	public String getCasDomain() {
		return this.casDomain;
	}

	public void setCasDomain(String casDomain) {
		this.casDomain = casDomain;
	}

	public String getCasStatus() {
		return this.casStatus;
	}

	public void setCasStatus(String casStatus) {
		this.casStatus = casStatus;
	}

	public String getCasFileType() {
		return this.casFileType;
	}

	public void setCasFileType(String casFileType) {
		this.casFileType = casFileType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCasMstrId))
			return false;
		AbstractCasMstrId castOther = (AbstractCasMstrId) other;

		return ((this.getCasDomain() == castOther.getCasDomain()) || (this
				.getCasDomain() != null
				&& castOther.getCasDomain() != null && this.getCasDomain()
				.equals(castOther.getCasDomain())))
				&& ((this.getCasStatus() == castOther.getCasStatus()) || (this
						.getCasStatus() != null
						&& castOther.getCasStatus() != null && this
						.getCasStatus().equals(castOther.getCasStatus())))
				&& ((this.getCasFileType() == castOther.getCasFileType()) || (this
						.getCasFileType() != null
						&& castOther.getCasFileType() != null && this
						.getCasFileType().equals(castOther.getCasFileType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCasDomain() == null ? 0 : this.getCasDomain().hashCode());
		result = 37 * result
				+ (getCasStatus() == null ? 0 : this.getCasStatus().hashCode());
		result = 37
				* result
				+ (getCasFileType() == null ? 0 : this.getCasFileType()
						.hashCode());
		return result;
	}

}