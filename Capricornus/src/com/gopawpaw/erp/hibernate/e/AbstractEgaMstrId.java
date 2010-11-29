package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEgaMstrId entity provides the base persistence definition of the
 * EgaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgaMstrId implements java.io.Serializable {

	// Fields

	private String egaDomain;
	private String egaEngCode;
	private Date egaWeek;
	private String egaEshSchedule;

	// Constructors

	/** default constructor */
	public AbstractEgaMstrId() {
	}

	/** minimal constructor */
	public AbstractEgaMstrId(String egaDomain) {
		this.egaDomain = egaDomain;
	}

	/** full constructor */
	public AbstractEgaMstrId(String egaDomain, String egaEngCode, Date egaWeek,
			String egaEshSchedule) {
		this.egaDomain = egaDomain;
		this.egaEngCode = egaEngCode;
		this.egaWeek = egaWeek;
		this.egaEshSchedule = egaEshSchedule;
	}

	// Property accessors

	public String getEgaDomain() {
		return this.egaDomain;
	}

	public void setEgaDomain(String egaDomain) {
		this.egaDomain = egaDomain;
	}

	public String getEgaEngCode() {
		return this.egaEngCode;
	}

	public void setEgaEngCode(String egaEngCode) {
		this.egaEngCode = egaEngCode;
	}

	public Date getEgaWeek() {
		return this.egaWeek;
	}

	public void setEgaWeek(Date egaWeek) {
		this.egaWeek = egaWeek;
	}

	public String getEgaEshSchedule() {
		return this.egaEshSchedule;
	}

	public void setEgaEshSchedule(String egaEshSchedule) {
		this.egaEshSchedule = egaEshSchedule;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEgaMstrId))
			return false;
		AbstractEgaMstrId castOther = (AbstractEgaMstrId) other;

		return ((this.getEgaDomain() == castOther.getEgaDomain()) || (this
				.getEgaDomain() != null
				&& castOther.getEgaDomain() != null && this.getEgaDomain()
				.equals(castOther.getEgaDomain())))
				&& ((this.getEgaEngCode() == castOther.getEgaEngCode()) || (this
						.getEgaEngCode() != null
						&& castOther.getEgaEngCode() != null && this
						.getEgaEngCode().equals(castOther.getEgaEngCode())))
				&& ((this.getEgaWeek() == castOther.getEgaWeek()) || (this
						.getEgaWeek() != null
						&& castOther.getEgaWeek() != null && this.getEgaWeek()
						.equals(castOther.getEgaWeek())))
				&& ((this.getEgaEshSchedule() == castOther.getEgaEshSchedule()) || (this
						.getEgaEshSchedule() != null
						&& castOther.getEgaEshSchedule() != null && this
						.getEgaEshSchedule().equals(
								castOther.getEgaEshSchedule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getEgaDomain() == null ? 0 : this.getEgaDomain().hashCode());
		result = 37
				* result
				+ (getEgaEngCode() == null ? 0 : this.getEgaEngCode()
						.hashCode());
		result = 37 * result
				+ (getEgaWeek() == null ? 0 : this.getEgaWeek().hashCode());
		result = 37
				* result
				+ (getEgaEshSchedule() == null ? 0 : this.getEgaEshSchedule()
						.hashCode());
		return result;
	}

}