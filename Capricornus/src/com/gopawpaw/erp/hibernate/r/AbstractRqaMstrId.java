package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqaMstrId entity provides the base persistence definition of the
 * RqaMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqaMstrId implements java.io.Serializable {

	// Fields

	private String rqaDomain;
	private String rqaApr;
	private Integer rqaType;
	private String rqaSite;
	private String rqaProdLine;
	private String rqaEntity;
	private String rqaJob;
	private String rqaCategory;
	private String rqaSubFrom;
	private String rqaCcFrom;
	private Date rqaStart;

	// Constructors

	/** default constructor */
	public AbstractRqaMstrId() {
	}

	/** minimal constructor */
	public AbstractRqaMstrId(String rqaDomain, String rqaApr) {
		this.rqaDomain = rqaDomain;
		this.rqaApr = rqaApr;
	}

	/** full constructor */
	public AbstractRqaMstrId(String rqaDomain, String rqaApr, Integer rqaType,
			String rqaSite, String rqaProdLine, String rqaEntity,
			String rqaJob, String rqaCategory, String rqaSubFrom,
			String rqaCcFrom, Date rqaStart) {
		this.rqaDomain = rqaDomain;
		this.rqaApr = rqaApr;
		this.rqaType = rqaType;
		this.rqaSite = rqaSite;
		this.rqaProdLine = rqaProdLine;
		this.rqaEntity = rqaEntity;
		this.rqaJob = rqaJob;
		this.rqaCategory = rqaCategory;
		this.rqaSubFrom = rqaSubFrom;
		this.rqaCcFrom = rqaCcFrom;
		this.rqaStart = rqaStart;
	}

	// Property accessors

	public String getRqaDomain() {
		return this.rqaDomain;
	}

	public void setRqaDomain(String rqaDomain) {
		this.rqaDomain = rqaDomain;
	}

	public String getRqaApr() {
		return this.rqaApr;
	}

	public void setRqaApr(String rqaApr) {
		this.rqaApr = rqaApr;
	}

	public Integer getRqaType() {
		return this.rqaType;
	}

	public void setRqaType(Integer rqaType) {
		this.rqaType = rqaType;
	}

	public String getRqaSite() {
		return this.rqaSite;
	}

	public void setRqaSite(String rqaSite) {
		this.rqaSite = rqaSite;
	}

	public String getRqaProdLine() {
		return this.rqaProdLine;
	}

	public void setRqaProdLine(String rqaProdLine) {
		this.rqaProdLine = rqaProdLine;
	}

	public String getRqaEntity() {
		return this.rqaEntity;
	}

	public void setRqaEntity(String rqaEntity) {
		this.rqaEntity = rqaEntity;
	}

	public String getRqaJob() {
		return this.rqaJob;
	}

	public void setRqaJob(String rqaJob) {
		this.rqaJob = rqaJob;
	}

	public String getRqaCategory() {
		return this.rqaCategory;
	}

	public void setRqaCategory(String rqaCategory) {
		this.rqaCategory = rqaCategory;
	}

	public String getRqaSubFrom() {
		return this.rqaSubFrom;
	}

	public void setRqaSubFrom(String rqaSubFrom) {
		this.rqaSubFrom = rqaSubFrom;
	}

	public String getRqaCcFrom() {
		return this.rqaCcFrom;
	}

	public void setRqaCcFrom(String rqaCcFrom) {
		this.rqaCcFrom = rqaCcFrom;
	}

	public Date getRqaStart() {
		return this.rqaStart;
	}

	public void setRqaStart(Date rqaStart) {
		this.rqaStart = rqaStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractRqaMstrId))
			return false;
		AbstractRqaMstrId castOther = (AbstractRqaMstrId) other;

		return ((this.getRqaDomain() == castOther.getRqaDomain()) || (this
				.getRqaDomain() != null
				&& castOther.getRqaDomain() != null && this.getRqaDomain()
				.equals(castOther.getRqaDomain())))
				&& ((this.getRqaApr() == castOther.getRqaApr()) || (this
						.getRqaApr() != null
						&& castOther.getRqaApr() != null && this.getRqaApr()
						.equals(castOther.getRqaApr())))
				&& ((this.getRqaType() == castOther.getRqaType()) || (this
						.getRqaType() != null
						&& castOther.getRqaType() != null && this.getRqaType()
						.equals(castOther.getRqaType())))
				&& ((this.getRqaSite() == castOther.getRqaSite()) || (this
						.getRqaSite() != null
						&& castOther.getRqaSite() != null && this.getRqaSite()
						.equals(castOther.getRqaSite())))
				&& ((this.getRqaProdLine() == castOther.getRqaProdLine()) || (this
						.getRqaProdLine() != null
						&& castOther.getRqaProdLine() != null && this
						.getRqaProdLine().equals(castOther.getRqaProdLine())))
				&& ((this.getRqaEntity() == castOther.getRqaEntity()) || (this
						.getRqaEntity() != null
						&& castOther.getRqaEntity() != null && this
						.getRqaEntity().equals(castOther.getRqaEntity())))
				&& ((this.getRqaJob() == castOther.getRqaJob()) || (this
						.getRqaJob() != null
						&& castOther.getRqaJob() != null && this.getRqaJob()
						.equals(castOther.getRqaJob())))
				&& ((this.getRqaCategory() == castOther.getRqaCategory()) || (this
						.getRqaCategory() != null
						&& castOther.getRqaCategory() != null && this
						.getRqaCategory().equals(castOther.getRqaCategory())))
				&& ((this.getRqaSubFrom() == castOther.getRqaSubFrom()) || (this
						.getRqaSubFrom() != null
						&& castOther.getRqaSubFrom() != null && this
						.getRqaSubFrom().equals(castOther.getRqaSubFrom())))
				&& ((this.getRqaCcFrom() == castOther.getRqaCcFrom()) || (this
						.getRqaCcFrom() != null
						&& castOther.getRqaCcFrom() != null && this
						.getRqaCcFrom().equals(castOther.getRqaCcFrom())))
				&& ((this.getRqaStart() == castOther.getRqaStart()) || (this
						.getRqaStart() != null
						&& castOther.getRqaStart() != null && this
						.getRqaStart().equals(castOther.getRqaStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRqaDomain() == null ? 0 : this.getRqaDomain().hashCode());
		result = 37 * result
				+ (getRqaApr() == null ? 0 : this.getRqaApr().hashCode());
		result = 37 * result
				+ (getRqaType() == null ? 0 : this.getRqaType().hashCode());
		result = 37 * result
				+ (getRqaSite() == null ? 0 : this.getRqaSite().hashCode());
		result = 37
				* result
				+ (getRqaProdLine() == null ? 0 : this.getRqaProdLine()
						.hashCode());
		result = 37 * result
				+ (getRqaEntity() == null ? 0 : this.getRqaEntity().hashCode());
		result = 37 * result
				+ (getRqaJob() == null ? 0 : this.getRqaJob().hashCode());
		result = 37
				* result
				+ (getRqaCategory() == null ? 0 : this.getRqaCategory()
						.hashCode());
		result = 37
				* result
				+ (getRqaSubFrom() == null ? 0 : this.getRqaSubFrom()
						.hashCode());
		result = 37 * result
				+ (getRqaCcFrom() == null ? 0 : this.getRqaCcFrom().hashCode());
		result = 37 * result
				+ (getRqaStart() == null ? 0 : this.getRqaStart().hashCode());
		return result;
	}

}