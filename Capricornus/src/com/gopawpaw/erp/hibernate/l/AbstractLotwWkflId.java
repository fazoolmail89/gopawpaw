package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLotwWkflId entity provides the base persistence definition of the
 * LotwWkflId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLotwWkflId implements java.io.Serializable {

	// Fields

	private String lotwDomain;
	private String lotwLotser;
	private String lotwPart;

	// Constructors

	/** default constructor */
	public AbstractLotwWkflId() {
	}

	/** minimal constructor */
	public AbstractLotwWkflId(String lotwDomain) {
		this.lotwDomain = lotwDomain;
	}

	/** full constructor */
	public AbstractLotwWkflId(String lotwDomain, String lotwLotser,
			String lotwPart) {
		this.lotwDomain = lotwDomain;
		this.lotwLotser = lotwLotser;
		this.lotwPart = lotwPart;
	}

	// Property accessors

	public String getLotwDomain() {
		return this.lotwDomain;
	}

	public void setLotwDomain(String lotwDomain) {
		this.lotwDomain = lotwDomain;
	}

	public String getLotwLotser() {
		return this.lotwLotser;
	}

	public void setLotwLotser(String lotwLotser) {
		this.lotwLotser = lotwLotser;
	}

	public String getLotwPart() {
		return this.lotwPart;
	}

	public void setLotwPart(String lotwPart) {
		this.lotwPart = lotwPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLotwWkflId))
			return false;
		AbstractLotwWkflId castOther = (AbstractLotwWkflId) other;

		return ((this.getLotwDomain() == castOther.getLotwDomain()) || (this
				.getLotwDomain() != null
				&& castOther.getLotwDomain() != null && this.getLotwDomain()
				.equals(castOther.getLotwDomain())))
				&& ((this.getLotwLotser() == castOther.getLotwLotser()) || (this
						.getLotwLotser() != null
						&& castOther.getLotwLotser() != null && this
						.getLotwLotser().equals(castOther.getLotwLotser())))
				&& ((this.getLotwPart() == castOther.getLotwPart()) || (this
						.getLotwPart() != null
						&& castOther.getLotwPart() != null && this
						.getLotwPart().equals(castOther.getLotwPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getLotwDomain() == null ? 0 : this.getLotwDomain()
						.hashCode());
		result = 37
				* result
				+ (getLotwLotser() == null ? 0 : this.getLotwLotser()
						.hashCode());
		result = 37 * result
				+ (getLotwPart() == null ? 0 : this.getLotwPart().hashCode());
		return result;
	}

}