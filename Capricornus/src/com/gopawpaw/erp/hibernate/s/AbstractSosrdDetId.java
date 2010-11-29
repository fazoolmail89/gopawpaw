package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSosrdDetId entity provides the base persistence definition of the
 * SosrdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSosrdDetId implements java.io.Serializable {

	// Fields

	private String sosrdDomain;
	private String sosrdNbr;
	private Integer sosrdLine;
	private String sosrdShipfrom;
	private String sosrdAbsId;
	private Integer sosrdMeasurementType;
	private String sosrdDataset;

	// Constructors

	/** default constructor */
	public AbstractSosrdDetId() {
	}

	/** full constructor */
	public AbstractSosrdDetId(String sosrdDomain, String sosrdNbr,
			Integer sosrdLine, String sosrdShipfrom, String sosrdAbsId,
			Integer sosrdMeasurementType, String sosrdDataset) {
		this.sosrdDomain = sosrdDomain;
		this.sosrdNbr = sosrdNbr;
		this.sosrdLine = sosrdLine;
		this.sosrdShipfrom = sosrdShipfrom;
		this.sosrdAbsId = sosrdAbsId;
		this.sosrdMeasurementType = sosrdMeasurementType;
		this.sosrdDataset = sosrdDataset;
	}

	// Property accessors

	public String getSosrdDomain() {
		return this.sosrdDomain;
	}

	public void setSosrdDomain(String sosrdDomain) {
		this.sosrdDomain = sosrdDomain;
	}

	public String getSosrdNbr() {
		return this.sosrdNbr;
	}

	public void setSosrdNbr(String sosrdNbr) {
		this.sosrdNbr = sosrdNbr;
	}

	public Integer getSosrdLine() {
		return this.sosrdLine;
	}

	public void setSosrdLine(Integer sosrdLine) {
		this.sosrdLine = sosrdLine;
	}

	public String getSosrdShipfrom() {
		return this.sosrdShipfrom;
	}

	public void setSosrdShipfrom(String sosrdShipfrom) {
		this.sosrdShipfrom = sosrdShipfrom;
	}

	public String getSosrdAbsId() {
		return this.sosrdAbsId;
	}

	public void setSosrdAbsId(String sosrdAbsId) {
		this.sosrdAbsId = sosrdAbsId;
	}

	public Integer getSosrdMeasurementType() {
		return this.sosrdMeasurementType;
	}

	public void setSosrdMeasurementType(Integer sosrdMeasurementType) {
		this.sosrdMeasurementType = sosrdMeasurementType;
	}

	public String getSosrdDataset() {
		return this.sosrdDataset;
	}

	public void setSosrdDataset(String sosrdDataset) {
		this.sosrdDataset = sosrdDataset;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSosrdDetId))
			return false;
		AbstractSosrdDetId castOther = (AbstractSosrdDetId) other;

		return ((this.getSosrdDomain() == castOther.getSosrdDomain()) || (this
				.getSosrdDomain() != null
				&& castOther.getSosrdDomain() != null && this.getSosrdDomain()
				.equals(castOther.getSosrdDomain())))
				&& ((this.getSosrdNbr() == castOther.getSosrdNbr()) || (this
						.getSosrdNbr() != null
						&& castOther.getSosrdNbr() != null && this
						.getSosrdNbr().equals(castOther.getSosrdNbr())))
				&& ((this.getSosrdLine() == castOther.getSosrdLine()) || (this
						.getSosrdLine() != null
						&& castOther.getSosrdLine() != null && this
						.getSosrdLine().equals(castOther.getSosrdLine())))
				&& ((this.getSosrdShipfrom() == castOther.getSosrdShipfrom()) || (this
						.getSosrdShipfrom() != null
						&& castOther.getSosrdShipfrom() != null && this
						.getSosrdShipfrom()
						.equals(castOther.getSosrdShipfrom())))
				&& ((this.getSosrdAbsId() == castOther.getSosrdAbsId()) || (this
						.getSosrdAbsId() != null
						&& castOther.getSosrdAbsId() != null && this
						.getSosrdAbsId().equals(castOther.getSosrdAbsId())))
				&& ((this.getSosrdMeasurementType() == castOther
						.getSosrdMeasurementType()) || (this
						.getSosrdMeasurementType() != null
						&& castOther.getSosrdMeasurementType() != null && this
						.getSosrdMeasurementType().equals(
								castOther.getSosrdMeasurementType())))
				&& ((this.getSosrdDataset() == castOther.getSosrdDataset()) || (this
						.getSosrdDataset() != null
						&& castOther.getSosrdDataset() != null && this
						.getSosrdDataset().equals(castOther.getSosrdDataset())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getSosrdDomain() == null ? 0 : this.getSosrdDomain()
						.hashCode());
		result = 37 * result
				+ (getSosrdNbr() == null ? 0 : this.getSosrdNbr().hashCode());
		result = 37 * result
				+ (getSosrdLine() == null ? 0 : this.getSosrdLine().hashCode());
		result = 37
				* result
				+ (getSosrdShipfrom() == null ? 0 : this.getSosrdShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getSosrdAbsId() == null ? 0 : this.getSosrdAbsId()
						.hashCode());
		result = 37
				* result
				+ (getSosrdMeasurementType() == null ? 0 : this
						.getSosrdMeasurementType().hashCode());
		result = 37
				* result
				+ (getSosrdDataset() == null ? 0 : this.getSosrdDataset()
						.hashCode());
		return result;
	}

}