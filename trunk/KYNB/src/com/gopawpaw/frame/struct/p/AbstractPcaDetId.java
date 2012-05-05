package com.gopawpaw.frame.struct.p;

/**
 * AbstractPcaDetId entity provides the base persistence definition of the
 * PcaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcaDetId implements java.io.Serializable {

	// Fields

	private String pcaMndNbrSelect;
	private String pcaProComSerial;
	private String pcaTarget;
	private String pcaType;

	// Constructors

	/** default constructor */
	public AbstractPcaDetId() {
	}

	/** full constructor */
	public AbstractPcaDetId(String pcaMndNbrSelect, String pcaProComSerial,
			String pcaTarget, String pcaType) {
		this.pcaMndNbrSelect = pcaMndNbrSelect;
		this.pcaProComSerial = pcaProComSerial;
		this.pcaTarget = pcaTarget;
		this.pcaType = pcaType;
	}

	// Property accessors

	public String getPcaMndNbrSelect() {
		return this.pcaMndNbrSelect;
	}

	public void setPcaMndNbrSelect(String pcaMndNbrSelect) {
		this.pcaMndNbrSelect = pcaMndNbrSelect;
	}

	public String getPcaProComSerial() {
		return this.pcaProComSerial;
	}

	public void setPcaProComSerial(String pcaProComSerial) {
		this.pcaProComSerial = pcaProComSerial;
	}

	public String getPcaTarget() {
		return this.pcaTarget;
	}

	public void setPcaTarget(String pcaTarget) {
		this.pcaTarget = pcaTarget;
	}

	public String getPcaType() {
		return this.pcaType;
	}

	public void setPcaType(String pcaType) {
		this.pcaType = pcaType;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPcaDetId))
			return false;
		AbstractPcaDetId castOther = (AbstractPcaDetId) other;

		return ((this.getPcaMndNbrSelect() == castOther.getPcaMndNbrSelect()) || (this
				.getPcaMndNbrSelect() != null
				&& castOther.getPcaMndNbrSelect() != null && this
				.getPcaMndNbrSelect().equals(castOther.getPcaMndNbrSelect())))
				&& ((this.getPcaProComSerial() == castOther
						.getPcaProComSerial()) || (this.getPcaProComSerial() != null
						&& castOther.getPcaProComSerial() != null && this
						.getPcaProComSerial().equals(
								castOther.getPcaProComSerial())))
				&& ((this.getPcaTarget() == castOther.getPcaTarget()) || (this
						.getPcaTarget() != null
						&& castOther.getPcaTarget() != null && this
						.getPcaTarget().equals(castOther.getPcaTarget())))
				&& ((this.getPcaType() == castOther.getPcaType()) || (this
						.getPcaType() != null
						&& castOther.getPcaType() != null && this.getPcaType()
						.equals(castOther.getPcaType())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPcaMndNbrSelect() == null ? 0 : this.getPcaMndNbrSelect()
						.hashCode());
		result = 37
				* result
				+ (getPcaProComSerial() == null ? 0 : this.getPcaProComSerial()
						.hashCode());
		result = 37 * result
				+ (getPcaTarget() == null ? 0 : this.getPcaTarget().hashCode());
		result = 37 * result
				+ (getPcaType() == null ? 0 : this.getPcaType().hashCode());
		return result;
	}

}