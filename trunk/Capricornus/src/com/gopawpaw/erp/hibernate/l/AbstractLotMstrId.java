package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLotMstrId entity provides the base persistence definition of the
 * LotMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLotMstrId implements java.io.Serializable {

	// Fields

	private String lotDomain;
	private String lotPart;
	private String lotSerial;

	// Constructors

	/** default constructor */
	public AbstractLotMstrId() {
	}

	/** full constructor */
	public AbstractLotMstrId(String lotDomain, String lotPart, String lotSerial) {
		this.lotDomain = lotDomain;
		this.lotPart = lotPart;
		this.lotSerial = lotSerial;
	}

	// Property accessors

	public String getLotDomain() {
		return this.lotDomain;
	}

	public void setLotDomain(String lotDomain) {
		this.lotDomain = lotDomain;
	}

	public String getLotPart() {
		return this.lotPart;
	}

	public void setLotPart(String lotPart) {
		this.lotPart = lotPart;
	}

	public String getLotSerial() {
		return this.lotSerial;
	}

	public void setLotSerial(String lotSerial) {
		this.lotSerial = lotSerial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLotMstrId))
			return false;
		AbstractLotMstrId castOther = (AbstractLotMstrId) other;

		return ((this.getLotDomain() == castOther.getLotDomain()) || (this
				.getLotDomain() != null
				&& castOther.getLotDomain() != null && this.getLotDomain()
				.equals(castOther.getLotDomain())))
				&& ((this.getLotPart() == castOther.getLotPart()) || (this
						.getLotPart() != null
						&& castOther.getLotPart() != null && this.getLotPart()
						.equals(castOther.getLotPart())))
				&& ((this.getLotSerial() == castOther.getLotSerial()) || (this
						.getLotSerial() != null
						&& castOther.getLotSerial() != null && this
						.getLotSerial().equals(castOther.getLotSerial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLotDomain() == null ? 0 : this.getLotDomain().hashCode());
		result = 37 * result
				+ (getLotPart() == null ? 0 : this.getLotPart().hashCode());
		result = 37 * result
				+ (getLotSerial() == null ? 0 : this.getLotSerial().hashCode());
		return result;
	}

}