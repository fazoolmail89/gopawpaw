package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcd5DetId entity provides the base persistence definition of the
 * Ecd5DetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcd5DetId implements java.io.Serializable {

	// Fields

	private String ecd5Domain;
	private String ecd5Part;
	private String ecd5Site;
	private String ecd5Routing;
	private String ecd5BomCode;
	private Date ecd5Start;

	// Constructors

	/** default constructor */
	public AbstractEcd5DetId() {
	}

	/** minimal constructor */
	public AbstractEcd5DetId(String ecd5Domain, String ecd5Part,
			String ecd5BomCode) {
		this.ecd5Domain = ecd5Domain;
		this.ecd5Part = ecd5Part;
		this.ecd5BomCode = ecd5BomCode;
	}

	/** full constructor */
	public AbstractEcd5DetId(String ecd5Domain, String ecd5Part,
			String ecd5Site, String ecd5Routing, String ecd5BomCode,
			Date ecd5Start) {
		this.ecd5Domain = ecd5Domain;
		this.ecd5Part = ecd5Part;
		this.ecd5Site = ecd5Site;
		this.ecd5Routing = ecd5Routing;
		this.ecd5BomCode = ecd5BomCode;
		this.ecd5Start = ecd5Start;
	}

	// Property accessors

	public String getEcd5Domain() {
		return this.ecd5Domain;
	}

	public void setEcd5Domain(String ecd5Domain) {
		this.ecd5Domain = ecd5Domain;
	}

	public String getEcd5Part() {
		return this.ecd5Part;
	}

	public void setEcd5Part(String ecd5Part) {
		this.ecd5Part = ecd5Part;
	}

	public String getEcd5Site() {
		return this.ecd5Site;
	}

	public void setEcd5Site(String ecd5Site) {
		this.ecd5Site = ecd5Site;
	}

	public String getEcd5Routing() {
		return this.ecd5Routing;
	}

	public void setEcd5Routing(String ecd5Routing) {
		this.ecd5Routing = ecd5Routing;
	}

	public String getEcd5BomCode() {
		return this.ecd5BomCode;
	}

	public void setEcd5BomCode(String ecd5BomCode) {
		this.ecd5BomCode = ecd5BomCode;
	}

	public Date getEcd5Start() {
		return this.ecd5Start;
	}

	public void setEcd5Start(Date ecd5Start) {
		this.ecd5Start = ecd5Start;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEcd5DetId))
			return false;
		AbstractEcd5DetId castOther = (AbstractEcd5DetId) other;

		return ((this.getEcd5Domain() == castOther.getEcd5Domain()) || (this
				.getEcd5Domain() != null
				&& castOther.getEcd5Domain() != null && this.getEcd5Domain()
				.equals(castOther.getEcd5Domain())))
				&& ((this.getEcd5Part() == castOther.getEcd5Part()) || (this
						.getEcd5Part() != null
						&& castOther.getEcd5Part() != null && this
						.getEcd5Part().equals(castOther.getEcd5Part())))
				&& ((this.getEcd5Site() == castOther.getEcd5Site()) || (this
						.getEcd5Site() != null
						&& castOther.getEcd5Site() != null && this
						.getEcd5Site().equals(castOther.getEcd5Site())))
				&& ((this.getEcd5Routing() == castOther.getEcd5Routing()) || (this
						.getEcd5Routing() != null
						&& castOther.getEcd5Routing() != null && this
						.getEcd5Routing().equals(castOther.getEcd5Routing())))
				&& ((this.getEcd5BomCode() == castOther.getEcd5BomCode()) || (this
						.getEcd5BomCode() != null
						&& castOther.getEcd5BomCode() != null && this
						.getEcd5BomCode().equals(castOther.getEcd5BomCode())))
				&& ((this.getEcd5Start() == castOther.getEcd5Start()) || (this
						.getEcd5Start() != null
						&& castOther.getEcd5Start() != null && this
						.getEcd5Start().equals(castOther.getEcd5Start())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEcd5Domain() == null ? 0 : this.getEcd5Domain()
						.hashCode());
		result = 37 * result
				+ (getEcd5Part() == null ? 0 : this.getEcd5Part().hashCode());
		result = 37 * result
				+ (getEcd5Site() == null ? 0 : this.getEcd5Site().hashCode());
		result = 37
				* result
				+ (getEcd5Routing() == null ? 0 : this.getEcd5Routing()
						.hashCode());
		result = 37
				* result
				+ (getEcd5BomCode() == null ? 0 : this.getEcd5BomCode()
						.hashCode());
		result = 37 * result
				+ (getEcd5Start() == null ? 0 : this.getEcd5Start().hashCode());
		return result;
	}

}