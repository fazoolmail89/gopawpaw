package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSwcDetId entity provides the base persistence definition of the
 * SwcDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSwcDetId implements java.io.Serializable {

	// Fields

	private String swcDomain;
	private String swcSim;
	private String swcWkctr;
	private String swcMch;
	private String swcElement;

	// Constructors

	/** default constructor */
	public AbstractSwcDetId() {
	}

	/** minimal constructor */
	public AbstractSwcDetId(String swcDomain) {
		this.swcDomain = swcDomain;
	}

	/** full constructor */
	public AbstractSwcDetId(String swcDomain, String swcSim, String swcWkctr,
			String swcMch, String swcElement) {
		this.swcDomain = swcDomain;
		this.swcSim = swcSim;
		this.swcWkctr = swcWkctr;
		this.swcMch = swcMch;
		this.swcElement = swcElement;
	}

	// Property accessors

	public String getSwcDomain() {
		return this.swcDomain;
	}

	public void setSwcDomain(String swcDomain) {
		this.swcDomain = swcDomain;
	}

	public String getSwcSim() {
		return this.swcSim;
	}

	public void setSwcSim(String swcSim) {
		this.swcSim = swcSim;
	}

	public String getSwcWkctr() {
		return this.swcWkctr;
	}

	public void setSwcWkctr(String swcWkctr) {
		this.swcWkctr = swcWkctr;
	}

	public String getSwcMch() {
		return this.swcMch;
	}

	public void setSwcMch(String swcMch) {
		this.swcMch = swcMch;
	}

	public String getSwcElement() {
		return this.swcElement;
	}

	public void setSwcElement(String swcElement) {
		this.swcElement = swcElement;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSwcDetId))
			return false;
		AbstractSwcDetId castOther = (AbstractSwcDetId) other;

		return ((this.getSwcDomain() == castOther.getSwcDomain()) || (this
				.getSwcDomain() != null
				&& castOther.getSwcDomain() != null && this.getSwcDomain()
				.equals(castOther.getSwcDomain())))
				&& ((this.getSwcSim() == castOther.getSwcSim()) || (this
						.getSwcSim() != null
						&& castOther.getSwcSim() != null && this.getSwcSim()
						.equals(castOther.getSwcSim())))
				&& ((this.getSwcWkctr() == castOther.getSwcWkctr()) || (this
						.getSwcWkctr() != null
						&& castOther.getSwcWkctr() != null && this
						.getSwcWkctr().equals(castOther.getSwcWkctr())))
				&& ((this.getSwcMch() == castOther.getSwcMch()) || (this
						.getSwcMch() != null
						&& castOther.getSwcMch() != null && this.getSwcMch()
						.equals(castOther.getSwcMch())))
				&& ((this.getSwcElement() == castOther.getSwcElement()) || (this
						.getSwcElement() != null
						&& castOther.getSwcElement() != null && this
						.getSwcElement().equals(castOther.getSwcElement())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSwcDomain() == null ? 0 : this.getSwcDomain().hashCode());
		result = 37 * result
				+ (getSwcSim() == null ? 0 : this.getSwcSim().hashCode());
		result = 37 * result
				+ (getSwcWkctr() == null ? 0 : this.getSwcWkctr().hashCode());
		result = 37 * result
				+ (getSwcMch() == null ? 0 : this.getSwcMch().hashCode());
		result = 37
				* result
				+ (getSwcElement() == null ? 0 : this.getSwcElement()
						.hashCode());
		return result;
	}

}