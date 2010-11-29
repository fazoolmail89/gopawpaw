package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEmMstrId entity provides the base persistence definition of the
 * EmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEmMstrId implements java.io.Serializable {

	// Fields

	private String emSystemId;
	private String emOpsys;
	private Date emStart;

	// Constructors

	/** default constructor */
	public AbstractEmMstrId() {
	}

	/** full constructor */
	public AbstractEmMstrId(String emSystemId, String emOpsys, Date emStart) {
		this.emSystemId = emSystemId;
		this.emOpsys = emOpsys;
		this.emStart = emStart;
	}

	// Property accessors

	public String getEmSystemId() {
		return this.emSystemId;
	}

	public void setEmSystemId(String emSystemId) {
		this.emSystemId = emSystemId;
	}

	public String getEmOpsys() {
		return this.emOpsys;
	}

	public void setEmOpsys(String emOpsys) {
		this.emOpsys = emOpsys;
	}

	public Date getEmStart() {
		return this.emStart;
	}

	public void setEmStart(Date emStart) {
		this.emStart = emStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractEmMstrId))
			return false;
		AbstractEmMstrId castOther = (AbstractEmMstrId) other;

		return ((this.getEmSystemId() == castOther.getEmSystemId()) || (this
				.getEmSystemId() != null
				&& castOther.getEmSystemId() != null && this.getEmSystemId()
				.equals(castOther.getEmSystemId())))
				&& ((this.getEmOpsys() == castOther.getEmOpsys()) || (this
						.getEmOpsys() != null
						&& castOther.getEmOpsys() != null && this.getEmOpsys()
						.equals(castOther.getEmOpsys())))
				&& ((this.getEmStart() == castOther.getEmStart()) || (this
						.getEmStart() != null
						&& castOther.getEmStart() != null && this.getEmStart()
						.equals(castOther.getEmStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmSystemId() == null ? 0 : this.getEmSystemId()
						.hashCode());
		result = 37 * result
				+ (getEmOpsys() == null ? 0 : this.getEmOpsys().hashCode());
		result = 37 * result
				+ (getEmStart() == null ? 0 : this.getEmStart().hashCode());
		return result;
	}

}