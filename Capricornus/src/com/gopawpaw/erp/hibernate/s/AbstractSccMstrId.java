package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSccMstrId entity provides the base persistence definition of the
 * SccMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSccMstrId implements java.io.Serializable {

	// Fields

	private String sccDomain;
	private String sccCustomerSource;
	private String sccShipfrom;
	private String sccReceiveAddr;
	private String sccPart;

	// Constructors

	/** default constructor */
	public AbstractSccMstrId() {
	}

	/** full constructor */
	public AbstractSccMstrId(String sccDomain, String sccCustomerSource,
			String sccShipfrom, String sccReceiveAddr, String sccPart) {
		this.sccDomain = sccDomain;
		this.sccCustomerSource = sccCustomerSource;
		this.sccShipfrom = sccShipfrom;
		this.sccReceiveAddr = sccReceiveAddr;
		this.sccPart = sccPart;
	}

	// Property accessors

	public String getSccDomain() {
		return this.sccDomain;
	}

	public void setSccDomain(String sccDomain) {
		this.sccDomain = sccDomain;
	}

	public String getSccCustomerSource() {
		return this.sccCustomerSource;
	}

	public void setSccCustomerSource(String sccCustomerSource) {
		this.sccCustomerSource = sccCustomerSource;
	}

	public String getSccShipfrom() {
		return this.sccShipfrom;
	}

	public void setSccShipfrom(String sccShipfrom) {
		this.sccShipfrom = sccShipfrom;
	}

	public String getSccReceiveAddr() {
		return this.sccReceiveAddr;
	}

	public void setSccReceiveAddr(String sccReceiveAddr) {
		this.sccReceiveAddr = sccReceiveAddr;
	}

	public String getSccPart() {
		return this.sccPart;
	}

	public void setSccPart(String sccPart) {
		this.sccPart = sccPart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSccMstrId))
			return false;
		AbstractSccMstrId castOther = (AbstractSccMstrId) other;

		return ((this.getSccDomain() == castOther.getSccDomain()) || (this
				.getSccDomain() != null
				&& castOther.getSccDomain() != null && this.getSccDomain()
				.equals(castOther.getSccDomain())))
				&& ((this.getSccCustomerSource() == castOther
						.getSccCustomerSource()) || (this
						.getSccCustomerSource() != null
						&& castOther.getSccCustomerSource() != null && this
						.getSccCustomerSource().equals(
								castOther.getSccCustomerSource())))
				&& ((this.getSccShipfrom() == castOther.getSccShipfrom()) || (this
						.getSccShipfrom() != null
						&& castOther.getSccShipfrom() != null && this
						.getSccShipfrom().equals(castOther.getSccShipfrom())))
				&& ((this.getSccReceiveAddr() == castOther.getSccReceiveAddr()) || (this
						.getSccReceiveAddr() != null
						&& castOther.getSccReceiveAddr() != null && this
						.getSccReceiveAddr().equals(
								castOther.getSccReceiveAddr())))
				&& ((this.getSccPart() == castOther.getSccPart()) || (this
						.getSccPart() != null
						&& castOther.getSccPart() != null && this.getSccPart()
						.equals(castOther.getSccPart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSccDomain() == null ? 0 : this.getSccDomain().hashCode());
		result = 37
				* result
				+ (getSccCustomerSource() == null ? 0 : this
						.getSccCustomerSource().hashCode());
		result = 37
				* result
				+ (getSccShipfrom() == null ? 0 : this.getSccShipfrom()
						.hashCode());
		result = 37
				* result
				+ (getSccReceiveAddr() == null ? 0 : this.getSccReceiveAddr()
						.hashCode());
		result = 37 * result
				+ (getSccPart() == null ? 0 : this.getSccPart().hashCode());
		return result;
	}

}