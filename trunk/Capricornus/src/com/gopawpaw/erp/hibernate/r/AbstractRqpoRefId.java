package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqpoRefId entity provides the base persistence definition of the
 * RqpoRefId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqpoRefId implements java.io.Serializable {

	// Fields

	private String rqpoDomain;
	private String rqpoReqNbr;
	private Integer rqpoReqLine;
	private String rqpoPoNbr;
	private Integer rqpoPoLine;

	// Constructors

	/** default constructor */
	public AbstractRqpoRefId() {
	}

	/** minimal constructor */
	public AbstractRqpoRefId(String rqpoDomain) {
		this.rqpoDomain = rqpoDomain;
	}

	/** full constructor */
	public AbstractRqpoRefId(String rqpoDomain, String rqpoReqNbr,
			Integer rqpoReqLine, String rqpoPoNbr, Integer rqpoPoLine) {
		this.rqpoDomain = rqpoDomain;
		this.rqpoReqNbr = rqpoReqNbr;
		this.rqpoReqLine = rqpoReqLine;
		this.rqpoPoNbr = rqpoPoNbr;
		this.rqpoPoLine = rqpoPoLine;
	}

	// Property accessors

	public String getRqpoDomain() {
		return this.rqpoDomain;
	}

	public void setRqpoDomain(String rqpoDomain) {
		this.rqpoDomain = rqpoDomain;
	}

	public String getRqpoReqNbr() {
		return this.rqpoReqNbr;
	}

	public void setRqpoReqNbr(String rqpoReqNbr) {
		this.rqpoReqNbr = rqpoReqNbr;
	}

	public Integer getRqpoReqLine() {
		return this.rqpoReqLine;
	}

	public void setRqpoReqLine(Integer rqpoReqLine) {
		this.rqpoReqLine = rqpoReqLine;
	}

	public String getRqpoPoNbr() {
		return this.rqpoPoNbr;
	}

	public void setRqpoPoNbr(String rqpoPoNbr) {
		this.rqpoPoNbr = rqpoPoNbr;
	}

	public Integer getRqpoPoLine() {
		return this.rqpoPoLine;
	}

	public void setRqpoPoLine(Integer rqpoPoLine) {
		this.rqpoPoLine = rqpoPoLine;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqpoRefId))
			return false;
		AbstractRqpoRefId castOther = (AbstractRqpoRefId) other;

		return ((this.getRqpoDomain() == castOther.getRqpoDomain()) || (this
				.getRqpoDomain() != null
				&& castOther.getRqpoDomain() != null && this.getRqpoDomain()
				.equals(castOther.getRqpoDomain())))
				&& ((this.getRqpoReqNbr() == castOther.getRqpoReqNbr()) || (this
						.getRqpoReqNbr() != null
						&& castOther.getRqpoReqNbr() != null && this
						.getRqpoReqNbr().equals(castOther.getRqpoReqNbr())))
				&& ((this.getRqpoReqLine() == castOther.getRqpoReqLine()) || (this
						.getRqpoReqLine() != null
						&& castOther.getRqpoReqLine() != null && this
						.getRqpoReqLine().equals(castOther.getRqpoReqLine())))
				&& ((this.getRqpoPoNbr() == castOther.getRqpoPoNbr()) || (this
						.getRqpoPoNbr() != null
						&& castOther.getRqpoPoNbr() != null && this
						.getRqpoPoNbr().equals(castOther.getRqpoPoNbr())))
				&& ((this.getRqpoPoLine() == castOther.getRqpoPoLine()) || (this
						.getRqpoPoLine() != null
						&& castOther.getRqpoPoLine() != null && this
						.getRqpoPoLine().equals(castOther.getRqpoPoLine())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getRqpoDomain() == null ? 0 : this.getRqpoDomain()
						.hashCode());
		result = 37
				* result
				+ (getRqpoReqNbr() == null ? 0 : this.getRqpoReqNbr()
						.hashCode());
		result = 37
				* result
				+ (getRqpoReqLine() == null ? 0 : this.getRqpoReqLine()
						.hashCode());
		result = 37 * result
				+ (getRqpoPoNbr() == null ? 0 : this.getRqpoPoNbr().hashCode());
		result = 37
				* result
				+ (getRqpoPoLine() == null ? 0 : this.getRqpoPoLine()
						.hashCode());
		return result;
	}

}