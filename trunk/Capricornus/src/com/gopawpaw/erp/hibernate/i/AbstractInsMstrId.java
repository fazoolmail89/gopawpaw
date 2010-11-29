package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractInsMstrId entity provides the base persistence definition of the
 * InsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInsMstrId implements java.io.Serializable {

	// Fields

	private String insDomain;
	private String insPrjNbr;
	private Integer insSubNbr;
	private String insSchedNbr;

	// Constructors

	/** default constructor */
	public AbstractInsMstrId() {
	}

	/** full constructor */
	public AbstractInsMstrId(String insDomain, String insPrjNbr,
			Integer insSubNbr, String insSchedNbr) {
		this.insDomain = insDomain;
		this.insPrjNbr = insPrjNbr;
		this.insSubNbr = insSubNbr;
		this.insSchedNbr = insSchedNbr;
	}

	// Property accessors

	public String getInsDomain() {
		return this.insDomain;
	}

	public void setInsDomain(String insDomain) {
		this.insDomain = insDomain;
	}

	public String getInsPrjNbr() {
		return this.insPrjNbr;
	}

	public void setInsPrjNbr(String insPrjNbr) {
		this.insPrjNbr = insPrjNbr;
	}

	public Integer getInsSubNbr() {
		return this.insSubNbr;
	}

	public void setInsSubNbr(Integer insSubNbr) {
		this.insSubNbr = insSubNbr;
	}

	public String getInsSchedNbr() {
		return this.insSchedNbr;
	}

	public void setInsSchedNbr(String insSchedNbr) {
		this.insSchedNbr = insSchedNbr;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractInsMstrId))
			return false;
		AbstractInsMstrId castOther = (AbstractInsMstrId) other;

		return ((this.getInsDomain() == castOther.getInsDomain()) || (this
				.getInsDomain() != null
				&& castOther.getInsDomain() != null && this.getInsDomain()
				.equals(castOther.getInsDomain())))
				&& ((this.getInsPrjNbr() == castOther.getInsPrjNbr()) || (this
						.getInsPrjNbr() != null
						&& castOther.getInsPrjNbr() != null && this
						.getInsPrjNbr().equals(castOther.getInsPrjNbr())))
				&& ((this.getInsSubNbr() == castOther.getInsSubNbr()) || (this
						.getInsSubNbr() != null
						&& castOther.getInsSubNbr() != null && this
						.getInsSubNbr().equals(castOther.getInsSubNbr())))
				&& ((this.getInsSchedNbr() == castOther.getInsSchedNbr()) || (this
						.getInsSchedNbr() != null
						&& castOther.getInsSchedNbr() != null && this
						.getInsSchedNbr().equals(castOther.getInsSchedNbr())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getInsDomain() == null ? 0 : this.getInsDomain().hashCode());
		result = 37 * result
				+ (getInsPrjNbr() == null ? 0 : this.getInsPrjNbr().hashCode());
		result = 37 * result
				+ (getInsSubNbr() == null ? 0 : this.getInsSubNbr().hashCode());
		result = 37
				* result
				+ (getInsSchedNbr() == null ? 0 : this.getInsSchedNbr()
						.hashCode());
		return result;
	}

}