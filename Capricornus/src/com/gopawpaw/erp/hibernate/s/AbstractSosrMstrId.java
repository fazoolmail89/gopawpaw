package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSosrMstrId entity provides the base persistence definition of the
 * SosrMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSosrMstrId implements java.io.Serializable {

	// Fields

	private String sosrDomain;
	private String sosrNbr;
	private Integer sosrLine;
	private String sosrShipfrom;
	private String sosrAbsId;

	// Constructors

	/** default constructor */
	public AbstractSosrMstrId() {
	}

	/** full constructor */
	public AbstractSosrMstrId(String sosrDomain, String sosrNbr,
			Integer sosrLine, String sosrShipfrom, String sosrAbsId) {
		this.sosrDomain = sosrDomain;
		this.sosrNbr = sosrNbr;
		this.sosrLine = sosrLine;
		this.sosrShipfrom = sosrShipfrom;
		this.sosrAbsId = sosrAbsId;
	}

	// Property accessors

	public String getSosrDomain() {
		return this.sosrDomain;
	}

	public void setSosrDomain(String sosrDomain) {
		this.sosrDomain = sosrDomain;
	}

	public String getSosrNbr() {
		return this.sosrNbr;
	}

	public void setSosrNbr(String sosrNbr) {
		this.sosrNbr = sosrNbr;
	}

	public Integer getSosrLine() {
		return this.sosrLine;
	}

	public void setSosrLine(Integer sosrLine) {
		this.sosrLine = sosrLine;
	}

	public String getSosrShipfrom() {
		return this.sosrShipfrom;
	}

	public void setSosrShipfrom(String sosrShipfrom) {
		this.sosrShipfrom = sosrShipfrom;
	}

	public String getSosrAbsId() {
		return this.sosrAbsId;
	}

	public void setSosrAbsId(String sosrAbsId) {
		this.sosrAbsId = sosrAbsId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSosrMstrId))
			return false;
		AbstractSosrMstrId castOther = (AbstractSosrMstrId) other;

		return ((this.getSosrDomain() == castOther.getSosrDomain()) || (this
				.getSosrDomain() != null
				&& castOther.getSosrDomain() != null && this.getSosrDomain()
				.equals(castOther.getSosrDomain())))
				&& ((this.getSosrNbr() == castOther.getSosrNbr()) || (this
						.getSosrNbr() != null
						&& castOther.getSosrNbr() != null && this.getSosrNbr()
						.equals(castOther.getSosrNbr())))
				&& ((this.getSosrLine() == castOther.getSosrLine()) || (this
						.getSosrLine() != null
						&& castOther.getSosrLine() != null && this
						.getSosrLine().equals(castOther.getSosrLine())))
				&& ((this.getSosrShipfrom() == castOther.getSosrShipfrom()) || (this
						.getSosrShipfrom() != null
						&& castOther.getSosrShipfrom() != null && this
						.getSosrShipfrom().equals(castOther.getSosrShipfrom())))
				&& ((this.getSosrAbsId() == castOther.getSosrAbsId()) || (this
						.getSosrAbsId() != null
						&& castOther.getSosrAbsId() != null && this
						.getSosrAbsId().equals(castOther.getSosrAbsId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSosrDomain() == null ? 0 : this.getSosrDomain()
						.hashCode());
		result = 37 * result
				+ (getSosrNbr() == null ? 0 : this.getSosrNbr().hashCode());
		result = 37 * result
				+ (getSosrLine() == null ? 0 : this.getSosrLine().hashCode());
		result = 37
				* result
				+ (getSosrShipfrom() == null ? 0 : this.getSosrShipfrom()
						.hashCode());
		result = 37 * result
				+ (getSosrAbsId() == null ? 0 : this.getSosrAbsId().hashCode());
		return result;
	}

}