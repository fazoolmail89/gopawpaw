package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUrlMstrId entity provides the base persistence definition of the
 * UrlMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUrlMstrId implements java.io.Serializable {

	// Fields

	private String urlType;
	private String urlField;
	private String urlFieldValue;
	private String urlAddr;
	private String urlCallPgm;
	private String urlExec;
	private String urlScript;

	// Constructors

	/** default constructor */
	public AbstractUrlMstrId() {
	}

	/** minimal constructor */
	public AbstractUrlMstrId(String urlExec) {
		this.urlExec = urlExec;
	}

	/** full constructor */
	public AbstractUrlMstrId(String urlType, String urlField,
			String urlFieldValue, String urlAddr, String urlCallPgm,
			String urlExec, String urlScript) {
		this.urlType = urlType;
		this.urlField = urlField;
		this.urlFieldValue = urlFieldValue;
		this.urlAddr = urlAddr;
		this.urlCallPgm = urlCallPgm;
		this.urlExec = urlExec;
		this.urlScript = urlScript;
	}

	// Property accessors

	public String getUrlType() {
		return this.urlType;
	}

	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

	public String getUrlField() {
		return this.urlField;
	}

	public void setUrlField(String urlField) {
		this.urlField = urlField;
	}

	public String getUrlFieldValue() {
		return this.urlFieldValue;
	}

	public void setUrlFieldValue(String urlFieldValue) {
		this.urlFieldValue = urlFieldValue;
	}

	public String getUrlAddr() {
		return this.urlAddr;
	}

	public void setUrlAddr(String urlAddr) {
		this.urlAddr = urlAddr;
	}

	public String getUrlCallPgm() {
		return this.urlCallPgm;
	}

	public void setUrlCallPgm(String urlCallPgm) {
		this.urlCallPgm = urlCallPgm;
	}

	public String getUrlExec() {
		return this.urlExec;
	}

	public void setUrlExec(String urlExec) {
		this.urlExec = urlExec;
	}

	public String getUrlScript() {
		return this.urlScript;
	}

	public void setUrlScript(String urlScript) {
		this.urlScript = urlScript;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractUrlMstrId))
			return false;
		AbstractUrlMstrId castOther = (AbstractUrlMstrId) other;

		return ((this.getUrlType() == castOther.getUrlType()) || (this
				.getUrlType() != null
				&& castOther.getUrlType() != null && this.getUrlType().equals(
				castOther.getUrlType())))
				&& ((this.getUrlField() == castOther.getUrlField()) || (this
						.getUrlField() != null
						&& castOther.getUrlField() != null && this
						.getUrlField().equals(castOther.getUrlField())))
				&& ((this.getUrlFieldValue() == castOther.getUrlFieldValue()) || (this
						.getUrlFieldValue() != null
						&& castOther.getUrlFieldValue() != null && this
						.getUrlFieldValue()
						.equals(castOther.getUrlFieldValue())))
				&& ((this.getUrlAddr() == castOther.getUrlAddr()) || (this
						.getUrlAddr() != null
						&& castOther.getUrlAddr() != null && this.getUrlAddr()
						.equals(castOther.getUrlAddr())))
				&& ((this.getUrlCallPgm() == castOther.getUrlCallPgm()) || (this
						.getUrlCallPgm() != null
						&& castOther.getUrlCallPgm() != null && this
						.getUrlCallPgm().equals(castOther.getUrlCallPgm())))
				&& ((this.getUrlExec() == castOther.getUrlExec()) || (this
						.getUrlExec() != null
						&& castOther.getUrlExec() != null && this.getUrlExec()
						.equals(castOther.getUrlExec())))
				&& ((this.getUrlScript() == castOther.getUrlScript()) || (this
						.getUrlScript() != null
						&& castOther.getUrlScript() != null && this
						.getUrlScript().equals(castOther.getUrlScript())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getUrlType() == null ? 0 : this.getUrlType().hashCode());
		result = 37 * result
				+ (getUrlField() == null ? 0 : this.getUrlField().hashCode());
		result = 37
				* result
				+ (getUrlFieldValue() == null ? 0 : this.getUrlFieldValue()
						.hashCode());
		result = 37 * result
				+ (getUrlAddr() == null ? 0 : this.getUrlAddr().hashCode());
		result = 37
				* result
				+ (getUrlCallPgm() == null ? 0 : this.getUrlCallPgm()
						.hashCode());
		result = 37 * result
				+ (getUrlExec() == null ? 0 : this.getUrlExec().hashCode());
		result = 37 * result
				+ (getUrlScript() == null ? 0 : this.getUrlScript().hashCode());
		return result;
	}

}