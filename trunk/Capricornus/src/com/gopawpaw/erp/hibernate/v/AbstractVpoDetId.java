package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVpoDetId entity provides the base persistence definition of the
 * VpoDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVpoDetId implements java.io.Serializable {

	// Fields

	private String vpoDomain;
	private String vpoRef;
	private String vpoPo;

	// Constructors

	/** default constructor */
	public AbstractVpoDetId() {
	}

	/** minimal constructor */
	public AbstractVpoDetId(String vpoDomain) {
		this.vpoDomain = vpoDomain;
	}

	/** full constructor */
	public AbstractVpoDetId(String vpoDomain, String vpoRef, String vpoPo) {
		this.vpoDomain = vpoDomain;
		this.vpoRef = vpoRef;
		this.vpoPo = vpoPo;
	}

	// Property accessors

	public String getVpoDomain() {
		return this.vpoDomain;
	}

	public void setVpoDomain(String vpoDomain) {
		this.vpoDomain = vpoDomain;
	}

	public String getVpoRef() {
		return this.vpoRef;
	}

	public void setVpoRef(String vpoRef) {
		this.vpoRef = vpoRef;
	}

	public String getVpoPo() {
		return this.vpoPo;
	}

	public void setVpoPo(String vpoPo) {
		this.vpoPo = vpoPo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractVpoDetId))
			return false;
		AbstractVpoDetId castOther = (AbstractVpoDetId) other;

		return ((this.getVpoDomain() == castOther.getVpoDomain()) || (this
				.getVpoDomain() != null
				&& castOther.getVpoDomain() != null && this.getVpoDomain()
				.equals(castOther.getVpoDomain())))
				&& ((this.getVpoRef() == castOther.getVpoRef()) || (this
						.getVpoRef() != null
						&& castOther.getVpoRef() != null && this.getVpoRef()
						.equals(castOther.getVpoRef())))
				&& ((this.getVpoPo() == castOther.getVpoPo()) || (this
						.getVpoPo() != null
						&& castOther.getVpoPo() != null && this.getVpoPo()
						.equals(castOther.getVpoPo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVpoDomain() == null ? 0 : this.getVpoDomain().hashCode());
		result = 37 * result
				+ (getVpoRef() == null ? 0 : this.getVpoRef().hashCode());
		result = 37 * result
				+ (getVpoPo() == null ? 0 : this.getVpoPo().hashCode());
		return result;
	}

}