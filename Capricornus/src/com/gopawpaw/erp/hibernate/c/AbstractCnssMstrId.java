package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCnssMstrId entity provides the base persistence definition of the
 * CnssMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnssMstrId implements java.io.Serializable {

	// Fields

	private String cnssDomain;
	private String cnssSupplier;
	private String cnssPart;

	// Constructors

	/** default constructor */
	public AbstractCnssMstrId() {
	}

	/** full constructor */
	public AbstractCnssMstrId(String cnssDomain, String cnssSupplier,
			String cnssPart) {
		this.cnssDomain = cnssDomain;
		this.cnssSupplier = cnssSupplier;
		this.cnssPart = cnssPart;
	}

	// Property accessors

	public String getCnssDomain() {
		return this.cnssDomain;
	}

	public void setCnssDomain(String cnssDomain) {
		this.cnssDomain = cnssDomain;
	}

	public String getCnssSupplier() {
		return this.cnssSupplier;
	}

	public void setCnssSupplier(String cnssSupplier) {
		this.cnssSupplier = cnssSupplier;
	}

	public String getCnssPart() {
		return this.cnssPart;
	}

	public void setCnssPart(String cnssPart) {
		this.cnssPart = cnssPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCnssMstrId))
			return false;
		AbstractCnssMstrId castOther = (AbstractCnssMstrId) other;

		return ((this.getCnssDomain() == castOther.getCnssDomain()) || (this
				.getCnssDomain() != null
				&& castOther.getCnssDomain() != null && this.getCnssDomain()
				.equals(castOther.getCnssDomain())))
				&& ((this.getCnssSupplier() == castOther.getCnssSupplier()) || (this
						.getCnssSupplier() != null
						&& castOther.getCnssSupplier() != null && this
						.getCnssSupplier().equals(castOther.getCnssSupplier())))
				&& ((this.getCnssPart() == castOther.getCnssPart()) || (this
						.getCnssPart() != null
						&& castOther.getCnssPart() != null && this
						.getCnssPart().equals(castOther.getCnssPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCnssDomain() == null ? 0 : this.getCnssDomain()
						.hashCode());
		result = 37
				* result
				+ (getCnssSupplier() == null ? 0 : this.getCnssSupplier()
						.hashCode());
		result = 37 * result
				+ (getCnssPart() == null ? 0 : this.getCnssPart().hashCode());
		return result;
	}

}