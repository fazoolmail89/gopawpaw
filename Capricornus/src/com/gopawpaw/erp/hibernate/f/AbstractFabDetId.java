package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFabDetId entity provides the base persistence definition of the
 * FabDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabDetId implements java.io.Serializable {

	// Fields

	private String fabDomain;
	private String fabFaId;
	private Integer fabFabkSeq;
	private String fabFabkId;
	private Integer fabResrv;

	// Constructors

	/** default constructor */
	public AbstractFabDetId() {
	}

	/** full constructor */
	public AbstractFabDetId(String fabDomain, String fabFaId,
			Integer fabFabkSeq, String fabFabkId, Integer fabResrv) {
		this.fabDomain = fabDomain;
		this.fabFaId = fabFaId;
		this.fabFabkSeq = fabFabkSeq;
		this.fabFabkId = fabFabkId;
		this.fabResrv = fabResrv;
	}

	// Property accessors

	public String getFabDomain() {
		return this.fabDomain;
	}

	public void setFabDomain(String fabDomain) {
		this.fabDomain = fabDomain;
	}

	public String getFabFaId() {
		return this.fabFaId;
	}

	public void setFabFaId(String fabFaId) {
		this.fabFaId = fabFaId;
	}

	public Integer getFabFabkSeq() {
		return this.fabFabkSeq;
	}

	public void setFabFabkSeq(Integer fabFabkSeq) {
		this.fabFabkSeq = fabFabkSeq;
	}

	public String getFabFabkId() {
		return this.fabFabkId;
	}

	public void setFabFabkId(String fabFabkId) {
		this.fabFabkId = fabFabkId;
	}

	public Integer getFabResrv() {
		return this.fabResrv;
	}

	public void setFabResrv(Integer fabResrv) {
		this.fabResrv = fabResrv;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFabDetId))
			return false;
		AbstractFabDetId castOther = (AbstractFabDetId) other;

		return ((this.getFabDomain() == castOther.getFabDomain()) || (this
				.getFabDomain() != null
				&& castOther.getFabDomain() != null && this.getFabDomain()
				.equals(castOther.getFabDomain())))
				&& ((this.getFabFaId() == castOther.getFabFaId()) || (this
						.getFabFaId() != null
						&& castOther.getFabFaId() != null && this.getFabFaId()
						.equals(castOther.getFabFaId())))
				&& ((this.getFabFabkSeq() == castOther.getFabFabkSeq()) || (this
						.getFabFabkSeq() != null
						&& castOther.getFabFabkSeq() != null && this
						.getFabFabkSeq().equals(castOther.getFabFabkSeq())))
				&& ((this.getFabFabkId() == castOther.getFabFabkId()) || (this
						.getFabFabkId() != null
						&& castOther.getFabFabkId() != null && this
						.getFabFabkId().equals(castOther.getFabFabkId())))
				&& ((this.getFabResrv() == castOther.getFabResrv()) || (this
						.getFabResrv() != null
						&& castOther.getFabResrv() != null && this
						.getFabResrv().equals(castOther.getFabResrv())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFabDomain() == null ? 0 : this.getFabDomain().hashCode());
		result = 37 * result
				+ (getFabFaId() == null ? 0 : this.getFabFaId().hashCode());
		result = 37
				* result
				+ (getFabFabkSeq() == null ? 0 : this.getFabFabkSeq()
						.hashCode());
		result = 37 * result
				+ (getFabFabkId() == null ? 0 : this.getFabFabkId().hashCode());
		result = 37 * result
				+ (getFabResrv() == null ? 0 : this.getFabResrv().hashCode());
		return result;
	}

}