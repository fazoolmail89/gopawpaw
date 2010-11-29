package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPsMstrId entity provides the base persistence definition of the
 * PsMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPsMstrId implements java.io.Serializable {

	// Fields

	private String psDomain;
	private String psPar;
	private String psComp;
	private String psRef;
	private Date psStart;

	// Constructors

	/** default constructor */
	public AbstractPsMstrId() {
	}

	/** minimal constructor */
	public AbstractPsMstrId(String psDomain, String psPar, String psComp) {
		this.psDomain = psDomain;
		this.psPar = psPar;
		this.psComp = psComp;
	}

	/** full constructor */
	public AbstractPsMstrId(String psDomain, String psPar, String psComp,
			String psRef, Date psStart) {
		this.psDomain = psDomain;
		this.psPar = psPar;
		this.psComp = psComp;
		this.psRef = psRef;
		this.psStart = psStart;
	}

	// Property accessors

	public String getPsDomain() {
		return this.psDomain;
	}

	public void setPsDomain(String psDomain) {
		this.psDomain = psDomain;
	}

	public String getPsPar() {
		return this.psPar;
	}

	public void setPsPar(String psPar) {
		this.psPar = psPar;
	}

	public String getPsComp() {
		return this.psComp;
	}

	public void setPsComp(String psComp) {
		this.psComp = psComp;
	}

	public String getPsRef() {
		return this.psRef;
	}

	public void setPsRef(String psRef) {
		this.psRef = psRef;
	}

	public Date getPsStart() {
		return this.psStart;
	}

	public void setPsStart(Date psStart) {
		this.psStart = psStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractPsMstrId))
			return false;
		AbstractPsMstrId castOther = (AbstractPsMstrId) other;

		return ((this.getPsDomain() == castOther.getPsDomain()) || (this
				.getPsDomain() != null
				&& castOther.getPsDomain() != null && this.getPsDomain()
				.equals(castOther.getPsDomain())))
				&& ((this.getPsPar() == castOther.getPsPar()) || (this
						.getPsPar() != null
						&& castOther.getPsPar() != null && this.getPsPar()
						.equals(castOther.getPsPar())))
				&& ((this.getPsComp() == castOther.getPsComp()) || (this
						.getPsComp() != null
						&& castOther.getPsComp() != null && this.getPsComp()
						.equals(castOther.getPsComp())))
				&& ((this.getPsRef() == castOther.getPsRef()) || (this
						.getPsRef() != null
						&& castOther.getPsRef() != null && this.getPsRef()
						.equals(castOther.getPsRef())))
				&& ((this.getPsStart() == castOther.getPsStart()) || (this
						.getPsStart() != null
						&& castOther.getPsStart() != null && this.getPsStart()
						.equals(castOther.getPsStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getPsDomain() == null ? 0 : this.getPsDomain().hashCode());
		result = 37 * result
				+ (getPsPar() == null ? 0 : this.getPsPar().hashCode());
		result = 37 * result
				+ (getPsComp() == null ? 0 : this.getPsComp().hashCode());
		result = 37 * result
				+ (getPsRef() == null ? 0 : this.getPsRef().hashCode());
		result = 37 * result
				+ (getPsStart() == null ? 0 : this.getPsStart().hashCode());
		return result;
	}

}