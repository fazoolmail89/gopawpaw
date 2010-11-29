package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPtvDetId entity provides the base persistence definition of the
 * PtvDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtvDetId implements java.io.Serializable {

	// Fields

	private String ptvDomain;
	private String ptvPart;
	private String ptvCtryExp;
	private String ptvCtryImp;

	// Constructors

	/** default constructor */
	public AbstractPtvDetId() {
	}

	/** full constructor */
	public AbstractPtvDetId(String ptvDomain, String ptvPart,
			String ptvCtryExp, String ptvCtryImp) {
		this.ptvDomain = ptvDomain;
		this.ptvPart = ptvPart;
		this.ptvCtryExp = ptvCtryExp;
		this.ptvCtryImp = ptvCtryImp;
	}

	// Property accessors

	public String getPtvDomain() {
		return this.ptvDomain;
	}

	public void setPtvDomain(String ptvDomain) {
		this.ptvDomain = ptvDomain;
	}

	public String getPtvPart() {
		return this.ptvPart;
	}

	public void setPtvPart(String ptvPart) {
		this.ptvPart = ptvPart;
	}

	public String getPtvCtryExp() {
		return this.ptvCtryExp;
	}

	public void setPtvCtryExp(String ptvCtryExp) {
		this.ptvCtryExp = ptvCtryExp;
	}

	public String getPtvCtryImp() {
		return this.ptvCtryImp;
	}

	public void setPtvCtryImp(String ptvCtryImp) {
		this.ptvCtryImp = ptvCtryImp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPtvDetId))
			return false;
		AbstractPtvDetId castOther = (AbstractPtvDetId) other;

		return ((this.getPtvDomain() == castOther.getPtvDomain()) || (this
				.getPtvDomain() != null
				&& castOther.getPtvDomain() != null && this.getPtvDomain()
				.equals(castOther.getPtvDomain())))
				&& ((this.getPtvPart() == castOther.getPtvPart()) || (this
						.getPtvPart() != null
						&& castOther.getPtvPart() != null && this.getPtvPart()
						.equals(castOther.getPtvPart())))
				&& ((this.getPtvCtryExp() == castOther.getPtvCtryExp()) || (this
						.getPtvCtryExp() != null
						&& castOther.getPtvCtryExp() != null && this
						.getPtvCtryExp().equals(castOther.getPtvCtryExp())))
				&& ((this.getPtvCtryImp() == castOther.getPtvCtryImp()) || (this
						.getPtvCtryImp() != null
						&& castOther.getPtvCtryImp() != null && this
						.getPtvCtryImp().equals(castOther.getPtvCtryImp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPtvDomain() == null ? 0 : this.getPtvDomain().hashCode());
		result = 37 * result
				+ (getPtvPart() == null ? 0 : this.getPtvPart().hashCode());
		result = 37
				* result
				+ (getPtvCtryExp() == null ? 0 : this.getPtvCtryExp()
						.hashCode());
		result = 37
				* result
				+ (getPtvCtryImp() == null ? 0 : this.getPtvCtryImp()
						.hashCode());
		return result;
	}

}