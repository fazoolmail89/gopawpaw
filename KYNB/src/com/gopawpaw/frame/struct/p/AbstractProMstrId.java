package com.gopawpaw.frame.struct.p;

/**
 * AbstractProMstrId entity provides the base persistence definition of the
 * ProMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProMstrId implements java.io.Serializable {

	// Fields

	private String proMndNbrSelect;
	private String proSerial;

	// Constructors

	/** default constructor */
	public AbstractProMstrId() {
	}

	/** full constructor */
	public AbstractProMstrId(String proMndNbrSelect, String proSerial) {
		this.proMndNbrSelect = proMndNbrSelect;
		this.proSerial = proSerial;
	}

	// Property accessors

	public String getProMndNbrSelect() {
		return this.proMndNbrSelect;
	}

	public void setProMndNbrSelect(String proMndNbrSelect) {
		this.proMndNbrSelect = proMndNbrSelect;
	}

	public String getProSerial() {
		return this.proSerial;
	}

	public void setProSerial(String proSerial) {
		this.proSerial = proSerial;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractProMstrId))
			return false;
		AbstractProMstrId castOther = (AbstractProMstrId) other;

		return ((this.getProMndNbrSelect() == castOther.getProMndNbrSelect()) || (this
				.getProMndNbrSelect() != null
				&& castOther.getProMndNbrSelect() != null && this
				.getProMndNbrSelect().equals(castOther.getProMndNbrSelect())))
				&& ((this.getProSerial() == castOther.getProSerial()) || (this
						.getProSerial() != null
						&& castOther.getProSerial() != null && this
						.getProSerial().equals(castOther.getProSerial())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getProMndNbrSelect() == null ? 0 : this.getProMndNbrSelect()
						.hashCode());
		result = 37 * result
				+ (getProSerial() == null ? 0 : this.getProSerial().hashCode());
		return result;
	}

}