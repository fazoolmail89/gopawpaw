package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIbDetId entity provides the base persistence definition of the
 * IbDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIbDetId implements java.io.Serializable {

	// Fields

	private String ibDomain;
	private String ibEuNbr;
	private String ibConfig;
	private String ibSysPart;
	private String ibSysSerial;
	private Integer ibSysRef;
	private Integer ibSysSeq;
	private String ibComp;

	// Constructors

	/** default constructor */
	public AbstractIbDetId() {
	}

	/** minimal constructor */
	public AbstractIbDetId(String ibDomain) {
		this.ibDomain = ibDomain;
	}

	/** full constructor */
	public AbstractIbDetId(String ibDomain, String ibEuNbr, String ibConfig,
			String ibSysPart, String ibSysSerial, Integer ibSysRef,
			Integer ibSysSeq, String ibComp) {
		this.ibDomain = ibDomain;
		this.ibEuNbr = ibEuNbr;
		this.ibConfig = ibConfig;
		this.ibSysPart = ibSysPart;
		this.ibSysSerial = ibSysSerial;
		this.ibSysRef = ibSysRef;
		this.ibSysSeq = ibSysSeq;
		this.ibComp = ibComp;
	}

	// Property accessors

	public String getIbDomain() {
		return this.ibDomain;
	}

	public void setIbDomain(String ibDomain) {
		this.ibDomain = ibDomain;
	}

	public String getIbEuNbr() {
		return this.ibEuNbr;
	}

	public void setIbEuNbr(String ibEuNbr) {
		this.ibEuNbr = ibEuNbr;
	}

	public String getIbConfig() {
		return this.ibConfig;
	}

	public void setIbConfig(String ibConfig) {
		this.ibConfig = ibConfig;
	}

	public String getIbSysPart() {
		return this.ibSysPart;
	}

	public void setIbSysPart(String ibSysPart) {
		this.ibSysPart = ibSysPart;
	}

	public String getIbSysSerial() {
		return this.ibSysSerial;
	}

	public void setIbSysSerial(String ibSysSerial) {
		this.ibSysSerial = ibSysSerial;
	}

	public Integer getIbSysRef() {
		return this.ibSysRef;
	}

	public void setIbSysRef(Integer ibSysRef) {
		this.ibSysRef = ibSysRef;
	}

	public Integer getIbSysSeq() {
		return this.ibSysSeq;
	}

	public void setIbSysSeq(Integer ibSysSeq) {
		this.ibSysSeq = ibSysSeq;
	}

	public String getIbComp() {
		return this.ibComp;
	}

	public void setIbComp(String ibComp) {
		this.ibComp = ibComp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIbDetId))
			return false;
		AbstractIbDetId castOther = (AbstractIbDetId) other;

		return ((this.getIbDomain() == castOther.getIbDomain()) || (this
				.getIbDomain() != null
				&& castOther.getIbDomain() != null && this.getIbDomain()
				.equals(castOther.getIbDomain())))
				&& ((this.getIbEuNbr() == castOther.getIbEuNbr()) || (this
						.getIbEuNbr() != null
						&& castOther.getIbEuNbr() != null && this.getIbEuNbr()
						.equals(castOther.getIbEuNbr())))
				&& ((this.getIbConfig() == castOther.getIbConfig()) || (this
						.getIbConfig() != null
						&& castOther.getIbConfig() != null && this
						.getIbConfig().equals(castOther.getIbConfig())))
				&& ((this.getIbSysPart() == castOther.getIbSysPart()) || (this
						.getIbSysPart() != null
						&& castOther.getIbSysPart() != null && this
						.getIbSysPart().equals(castOther.getIbSysPart())))
				&& ((this.getIbSysSerial() == castOther.getIbSysSerial()) || (this
						.getIbSysSerial() != null
						&& castOther.getIbSysSerial() != null && this
						.getIbSysSerial().equals(castOther.getIbSysSerial())))
				&& ((this.getIbSysRef() == castOther.getIbSysRef()) || (this
						.getIbSysRef() != null
						&& castOther.getIbSysRef() != null && this
						.getIbSysRef().equals(castOther.getIbSysRef())))
				&& ((this.getIbSysSeq() == castOther.getIbSysSeq()) || (this
						.getIbSysSeq() != null
						&& castOther.getIbSysSeq() != null && this
						.getIbSysSeq().equals(castOther.getIbSysSeq())))
				&& ((this.getIbComp() == castOther.getIbComp()) || (this
						.getIbComp() != null
						&& castOther.getIbComp() != null && this.getIbComp()
						.equals(castOther.getIbComp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIbDomain() == null ? 0 : this.getIbDomain().hashCode());
		result = 37 * result
				+ (getIbEuNbr() == null ? 0 : this.getIbEuNbr().hashCode());
		result = 37 * result
				+ (getIbConfig() == null ? 0 : this.getIbConfig().hashCode());
		result = 37 * result
				+ (getIbSysPart() == null ? 0 : this.getIbSysPart().hashCode());
		result = 37
				* result
				+ (getIbSysSerial() == null ? 0 : this.getIbSysSerial()
						.hashCode());
		result = 37 * result
				+ (getIbSysRef() == null ? 0 : this.getIbSysRef().hashCode());
		result = 37 * result
				+ (getIbSysSeq() == null ? 0 : this.getIbSysSeq().hashCode());
		result = 37 * result
				+ (getIbComp() == null ? 0 : this.getIbComp().hashCode());
		return result;
	}

}