package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCmdDetId entity provides the base persistence definition of the
 * CmdDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCmdDetId implements java.io.Serializable {

	// Fields

	private String cmdDomain;
	private Integer cmdTransNbr;
	private String cmdFile;
	private String cmdField;
	private String cmdKeyVal;

	// Constructors

	/** default constructor */
	public AbstractCmdDetId() {
	}

	/** full constructor */
	public AbstractCmdDetId(String cmdDomain, Integer cmdTransNbr,
			String cmdFile, String cmdField, String cmdKeyVal) {
		this.cmdDomain = cmdDomain;
		this.cmdTransNbr = cmdTransNbr;
		this.cmdFile = cmdFile;
		this.cmdField = cmdField;
		this.cmdKeyVal = cmdKeyVal;
	}

	// Property accessors

	public String getCmdDomain() {
		return this.cmdDomain;
	}

	public void setCmdDomain(String cmdDomain) {
		this.cmdDomain = cmdDomain;
	}

	public Integer getCmdTransNbr() {
		return this.cmdTransNbr;
	}

	public void setCmdTransNbr(Integer cmdTransNbr) {
		this.cmdTransNbr = cmdTransNbr;
	}

	public String getCmdFile() {
		return this.cmdFile;
	}

	public void setCmdFile(String cmdFile) {
		this.cmdFile = cmdFile;
	}

	public String getCmdField() {
		return this.cmdField;
	}

	public void setCmdField(String cmdField) {
		this.cmdField = cmdField;
	}

	public String getCmdKeyVal() {
		return this.cmdKeyVal;
	}

	public void setCmdKeyVal(String cmdKeyVal) {
		this.cmdKeyVal = cmdKeyVal;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractCmdDetId))
			return false;
		AbstractCmdDetId castOther = (AbstractCmdDetId) other;

		return ((this.getCmdDomain() == castOther.getCmdDomain()) || (this
				.getCmdDomain() != null
				&& castOther.getCmdDomain() != null && this.getCmdDomain()
				.equals(castOther.getCmdDomain())))
				&& ((this.getCmdTransNbr() == castOther.getCmdTransNbr()) || (this
						.getCmdTransNbr() != null
						&& castOther.getCmdTransNbr() != null && this
						.getCmdTransNbr().equals(castOther.getCmdTransNbr())))
				&& ((this.getCmdFile() == castOther.getCmdFile()) || (this
						.getCmdFile() != null
						&& castOther.getCmdFile() != null && this.getCmdFile()
						.equals(castOther.getCmdFile())))
				&& ((this.getCmdField() == castOther.getCmdField()) || (this
						.getCmdField() != null
						&& castOther.getCmdField() != null && this
						.getCmdField().equals(castOther.getCmdField())))
				&& ((this.getCmdKeyVal() == castOther.getCmdKeyVal()) || (this
						.getCmdKeyVal() != null
						&& castOther.getCmdKeyVal() != null && this
						.getCmdKeyVal().equals(castOther.getCmdKeyVal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCmdDomain() == null ? 0 : this.getCmdDomain().hashCode());
		result = 37
				* result
				+ (getCmdTransNbr() == null ? 0 : this.getCmdTransNbr()
						.hashCode());
		result = 37 * result
				+ (getCmdFile() == null ? 0 : this.getCmdFile().hashCode());
		result = 37 * result
				+ (getCmdField() == null ? 0 : this.getCmdField().hashCode());
		result = 37 * result
				+ (getCmdKeyVal() == null ? 0 : this.getCmdKeyVal().hashCode());
		return result;
	}

}