package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqcdDetId entity provides the base persistence definition of the
 * RqcdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqcdDetId implements java.io.Serializable {

	// Fields

	private String rqcdDomain;
	private String rqcdCategory;
	private String rqcdAcctFrom;
	private String rqcdSubFrom;

	// Constructors

	/** default constructor */
	public AbstractRqcdDetId() {
	}

	/** minimal constructor */
	public AbstractRqcdDetId(String rqcdDomain) {
		this.rqcdDomain = rqcdDomain;
	}

	/** full constructor */
	public AbstractRqcdDetId(String rqcdDomain, String rqcdCategory,
			String rqcdAcctFrom, String rqcdSubFrom) {
		this.rqcdDomain = rqcdDomain;
		this.rqcdCategory = rqcdCategory;
		this.rqcdAcctFrom = rqcdAcctFrom;
		this.rqcdSubFrom = rqcdSubFrom;
	}

	// Property accessors

	public String getRqcdDomain() {
		return this.rqcdDomain;
	}

	public void setRqcdDomain(String rqcdDomain) {
		this.rqcdDomain = rqcdDomain;
	}

	public String getRqcdCategory() {
		return this.rqcdCategory;
	}

	public void setRqcdCategory(String rqcdCategory) {
		this.rqcdCategory = rqcdCategory;
	}

	public String getRqcdAcctFrom() {
		return this.rqcdAcctFrom;
	}

	public void setRqcdAcctFrom(String rqcdAcctFrom) {
		this.rqcdAcctFrom = rqcdAcctFrom;
	}

	public String getRqcdSubFrom() {
		return this.rqcdSubFrom;
	}

	public void setRqcdSubFrom(String rqcdSubFrom) {
		this.rqcdSubFrom = rqcdSubFrom;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqcdDetId))
			return false;
		AbstractRqcdDetId castOther = (AbstractRqcdDetId) other;

		return ((this.getRqcdDomain() == castOther.getRqcdDomain()) || (this
				.getRqcdDomain() != null
				&& castOther.getRqcdDomain() != null && this.getRqcdDomain()
				.equals(castOther.getRqcdDomain())))
				&& ((this.getRqcdCategory() == castOther.getRqcdCategory()) || (this
						.getRqcdCategory() != null
						&& castOther.getRqcdCategory() != null && this
						.getRqcdCategory().equals(castOther.getRqcdCategory())))
				&& ((this.getRqcdAcctFrom() == castOther.getRqcdAcctFrom()) || (this
						.getRqcdAcctFrom() != null
						&& castOther.getRqcdAcctFrom() != null && this
						.getRqcdAcctFrom().equals(castOther.getRqcdAcctFrom())))
				&& ((this.getRqcdSubFrom() == castOther.getRqcdSubFrom()) || (this
						.getRqcdSubFrom() != null
						&& castOther.getRqcdSubFrom() != null && this
						.getRqcdSubFrom().equals(castOther.getRqcdSubFrom())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRqcdDomain() == null ? 0 : this.getRqcdDomain()
						.hashCode());
		result = 37
				* result
				+ (getRqcdCategory() == null ? 0 : this.getRqcdCategory()
						.hashCode());
		result = 37
				* result
				+ (getRqcdAcctFrom() == null ? 0 : this.getRqcdAcctFrom()
						.hashCode());
		result = 37
				* result
				+ (getRqcdSubFrom() == null ? 0 : this.getRqcdSubFrom()
						.hashCode());
		return result;
	}

}