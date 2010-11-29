package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIsbMstrId entity provides the base persistence definition of the
 * IsbMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsbMstrId implements java.io.Serializable {

	// Fields

	private String isbDomain;
	private String isbEuNbr;
	private String isbPart;
	private String isbSerial;
	private Integer isbRef;

	// Constructors

	/** default constructor */
	public AbstractIsbMstrId() {
	}

	/** minimal constructor */
	public AbstractIsbMstrId(String isbDomain) {
		this.isbDomain = isbDomain;
	}

	/** full constructor */
	public AbstractIsbMstrId(String isbDomain, String isbEuNbr, String isbPart,
			String isbSerial, Integer isbRef) {
		this.isbDomain = isbDomain;
		this.isbEuNbr = isbEuNbr;
		this.isbPart = isbPart;
		this.isbSerial = isbSerial;
		this.isbRef = isbRef;
	}

	// Property accessors

	public String getIsbDomain() {
		return this.isbDomain;
	}

	public void setIsbDomain(String isbDomain) {
		this.isbDomain = isbDomain;
	}

	public String getIsbEuNbr() {
		return this.isbEuNbr;
	}

	public void setIsbEuNbr(String isbEuNbr) {
		this.isbEuNbr = isbEuNbr;
	}

	public String getIsbPart() {
		return this.isbPart;
	}

	public void setIsbPart(String isbPart) {
		this.isbPart = isbPart;
	}

	public String getIsbSerial() {
		return this.isbSerial;
	}

	public void setIsbSerial(String isbSerial) {
		this.isbSerial = isbSerial;
	}

	public Integer getIsbRef() {
		return this.isbRef;
	}

	public void setIsbRef(Integer isbRef) {
		this.isbRef = isbRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIsbMstrId))
			return false;
		AbstractIsbMstrId castOther = (AbstractIsbMstrId) other;

		return ((this.getIsbDomain() == castOther.getIsbDomain()) || (this
				.getIsbDomain() != null
				&& castOther.getIsbDomain() != null && this.getIsbDomain()
				.equals(castOther.getIsbDomain())))
				&& ((this.getIsbEuNbr() == castOther.getIsbEuNbr()) || (this
						.getIsbEuNbr() != null
						&& castOther.getIsbEuNbr() != null && this
						.getIsbEuNbr().equals(castOther.getIsbEuNbr())))
				&& ((this.getIsbPart() == castOther.getIsbPart()) || (this
						.getIsbPart() != null
						&& castOther.getIsbPart() != null && this.getIsbPart()
						.equals(castOther.getIsbPart())))
				&& ((this.getIsbSerial() == castOther.getIsbSerial()) || (this
						.getIsbSerial() != null
						&& castOther.getIsbSerial() != null && this
						.getIsbSerial().equals(castOther.getIsbSerial())))
				&& ((this.getIsbRef() == castOther.getIsbRef()) || (this
						.getIsbRef() != null
						&& castOther.getIsbRef() != null && this.getIsbRef()
						.equals(castOther.getIsbRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getIsbDomain() == null ? 0 : this.getIsbDomain().hashCode());
		result = 37 * result
				+ (getIsbEuNbr() == null ? 0 : this.getIsbEuNbr().hashCode());
		result = 37 * result
				+ (getIsbPart() == null ? 0 : this.getIsbPart().hashCode());
		result = 37 * result
				+ (getIsbSerial() == null ? 0 : this.getIsbSerial().hashCode());
		result = 37 * result
				+ (getIsbRef() == null ? 0 : this.getIsbRef().hashCode());
		return result;
	}

}