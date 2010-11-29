package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKbtrdDetId entity provides the base persistence definition of the
 * KbtrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbtrdDetId implements java.io.Serializable {

	// Fields

	private String kbtrdDomain;
	private String kbtrdDataset;
	private Integer kbtrdKbtrTransNbr;
	private Integer kbtrdTrTrnbr;

	// Constructors

	/** default constructor */
	public AbstractKbtrdDetId() {
	}

	/** full constructor */
	public AbstractKbtrdDetId(String kbtrdDomain, String kbtrdDataset,
			Integer kbtrdKbtrTransNbr, Integer kbtrdTrTrnbr) {
		this.kbtrdDomain = kbtrdDomain;
		this.kbtrdDataset = kbtrdDataset;
		this.kbtrdKbtrTransNbr = kbtrdKbtrTransNbr;
		this.kbtrdTrTrnbr = kbtrdTrTrnbr;
	}

	// Property accessors

	public String getKbtrdDomain() {
		return this.kbtrdDomain;
	}

	public void setKbtrdDomain(String kbtrdDomain) {
		this.kbtrdDomain = kbtrdDomain;
	}

	public String getKbtrdDataset() {
		return this.kbtrdDataset;
	}

	public void setKbtrdDataset(String kbtrdDataset) {
		this.kbtrdDataset = kbtrdDataset;
	}

	public Integer getKbtrdKbtrTransNbr() {
		return this.kbtrdKbtrTransNbr;
	}

	public void setKbtrdKbtrTransNbr(Integer kbtrdKbtrTransNbr) {
		this.kbtrdKbtrTransNbr = kbtrdKbtrTransNbr;
	}

	public Integer getKbtrdTrTrnbr() {
		return this.kbtrdTrTrnbr;
	}

	public void setKbtrdTrTrnbr(Integer kbtrdTrTrnbr) {
		this.kbtrdTrTrnbr = kbtrdTrTrnbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractKbtrdDetId))
			return false;
		AbstractKbtrdDetId castOther = (AbstractKbtrdDetId) other;

		return ((this.getKbtrdDomain() == castOther.getKbtrdDomain()) || (this
				.getKbtrdDomain() != null
				&& castOther.getKbtrdDomain() != null && this.getKbtrdDomain()
				.equals(castOther.getKbtrdDomain())))
				&& ((this.getKbtrdDataset() == castOther.getKbtrdDataset()) || (this
						.getKbtrdDataset() != null
						&& castOther.getKbtrdDataset() != null && this
						.getKbtrdDataset().equals(castOther.getKbtrdDataset())))
				&& ((this.getKbtrdKbtrTransNbr() == castOther
						.getKbtrdKbtrTransNbr()) || (this
						.getKbtrdKbtrTransNbr() != null
						&& castOther.getKbtrdKbtrTransNbr() != null && this
						.getKbtrdKbtrTransNbr().equals(
								castOther.getKbtrdKbtrTransNbr())))
				&& ((this.getKbtrdTrTrnbr() == castOther.getKbtrdTrTrnbr()) || (this
						.getKbtrdTrTrnbr() != null
						&& castOther.getKbtrdTrTrnbr() != null && this
						.getKbtrdTrTrnbr().equals(castOther.getKbtrdTrTrnbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getKbtrdDomain() == null ? 0 : this.getKbtrdDomain()
						.hashCode());
		result = 37
				* result
				+ (getKbtrdDataset() == null ? 0 : this.getKbtrdDataset()
						.hashCode());
		result = 37
				* result
				+ (getKbtrdKbtrTransNbr() == null ? 0 : this
						.getKbtrdKbtrTransNbr().hashCode());
		result = 37
				* result
				+ (getKbtrdTrTrnbr() == null ? 0 : this.getKbtrdTrTrnbr()
						.hashCode());
		return result;
	}

}