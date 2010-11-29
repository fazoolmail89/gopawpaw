package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIsvcMstrId entity provides the base persistence definition of the
 * IsvcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIsvcMstrId implements java.io.Serializable {

	// Fields

	private String isvcDomain;
	private String isvcTermsDelivery;
	private String isvcModeTransp;
	private String isvcShipvia;
	private String isvcFlow;
	private String isvcCtryOrig;
	private String isvcCtryDest;

	// Constructors

	/** default constructor */
	public AbstractIsvcMstrId() {
	}

	/** full constructor */
	public AbstractIsvcMstrId(String isvcDomain, String isvcTermsDelivery,
			String isvcModeTransp, String isvcShipvia, String isvcFlow,
			String isvcCtryOrig, String isvcCtryDest) {
		this.isvcDomain = isvcDomain;
		this.isvcTermsDelivery = isvcTermsDelivery;
		this.isvcModeTransp = isvcModeTransp;
		this.isvcShipvia = isvcShipvia;
		this.isvcFlow = isvcFlow;
		this.isvcCtryOrig = isvcCtryOrig;
		this.isvcCtryDest = isvcCtryDest;
	}

	// Property accessors

	public String getIsvcDomain() {
		return this.isvcDomain;
	}

	public void setIsvcDomain(String isvcDomain) {
		this.isvcDomain = isvcDomain;
	}

	public String getIsvcTermsDelivery() {
		return this.isvcTermsDelivery;
	}

	public void setIsvcTermsDelivery(String isvcTermsDelivery) {
		this.isvcTermsDelivery = isvcTermsDelivery;
	}

	public String getIsvcModeTransp() {
		return this.isvcModeTransp;
	}

	public void setIsvcModeTransp(String isvcModeTransp) {
		this.isvcModeTransp = isvcModeTransp;
	}

	public String getIsvcShipvia() {
		return this.isvcShipvia;
	}

	public void setIsvcShipvia(String isvcShipvia) {
		this.isvcShipvia = isvcShipvia;
	}

	public String getIsvcFlow() {
		return this.isvcFlow;
	}

	public void setIsvcFlow(String isvcFlow) {
		this.isvcFlow = isvcFlow;
	}

	public String getIsvcCtryOrig() {
		return this.isvcCtryOrig;
	}

	public void setIsvcCtryOrig(String isvcCtryOrig) {
		this.isvcCtryOrig = isvcCtryOrig;
	}

	public String getIsvcCtryDest() {
		return this.isvcCtryDest;
	}

	public void setIsvcCtryDest(String isvcCtryDest) {
		this.isvcCtryDest = isvcCtryDest;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractIsvcMstrId))
			return false;
		AbstractIsvcMstrId castOther = (AbstractIsvcMstrId) other;

		return ((this.getIsvcDomain() == castOther.getIsvcDomain()) || (this
				.getIsvcDomain() != null
				&& castOther.getIsvcDomain() != null && this.getIsvcDomain()
				.equals(castOther.getIsvcDomain())))
				&& ((this.getIsvcTermsDelivery() == castOther
						.getIsvcTermsDelivery()) || (this
						.getIsvcTermsDelivery() != null
						&& castOther.getIsvcTermsDelivery() != null && this
						.getIsvcTermsDelivery().equals(
								castOther.getIsvcTermsDelivery())))
				&& ((this.getIsvcModeTransp() == castOther.getIsvcModeTransp()) || (this
						.getIsvcModeTransp() != null
						&& castOther.getIsvcModeTransp() != null && this
						.getIsvcModeTransp().equals(
								castOther.getIsvcModeTransp())))
				&& ((this.getIsvcShipvia() == castOther.getIsvcShipvia()) || (this
						.getIsvcShipvia() != null
						&& castOther.getIsvcShipvia() != null && this
						.getIsvcShipvia().equals(castOther.getIsvcShipvia())))
				&& ((this.getIsvcFlow() == castOther.getIsvcFlow()) || (this
						.getIsvcFlow() != null
						&& castOther.getIsvcFlow() != null && this
						.getIsvcFlow().equals(castOther.getIsvcFlow())))
				&& ((this.getIsvcCtryOrig() == castOther.getIsvcCtryOrig()) || (this
						.getIsvcCtryOrig() != null
						&& castOther.getIsvcCtryOrig() != null && this
						.getIsvcCtryOrig().equals(castOther.getIsvcCtryOrig())))
				&& ((this.getIsvcCtryDest() == castOther.getIsvcCtryDest()) || (this
						.getIsvcCtryDest() != null
						&& castOther.getIsvcCtryDest() != null && this
						.getIsvcCtryDest().equals(castOther.getIsvcCtryDest())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getIsvcDomain() == null ? 0 : this.getIsvcDomain()
						.hashCode());
		result = 37
				* result
				+ (getIsvcTermsDelivery() == null ? 0 : this
						.getIsvcTermsDelivery().hashCode());
		result = 37
				* result
				+ (getIsvcModeTransp() == null ? 0 : this.getIsvcModeTransp()
						.hashCode());
		result = 37
				* result
				+ (getIsvcShipvia() == null ? 0 : this.getIsvcShipvia()
						.hashCode());
		result = 37 * result
				+ (getIsvcFlow() == null ? 0 : this.getIsvcFlow().hashCode());
		result = 37
				* result
				+ (getIsvcCtryOrig() == null ? 0 : this.getIsvcCtryOrig()
						.hashCode());
		result = 37
				* result
				+ (getIsvcCtryDest() == null ? 0 : this.getIsvcCtryDest()
						.hashCode());
		return result;
	}

}