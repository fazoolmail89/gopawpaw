package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFpcMstrId entity provides the base persistence definition of the
 * FpcMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFpcMstrId implements java.io.Serializable {

	// Fields

	private String fpcDomain;
	private String fpcList;
	private String fpcListType;
	private String fpcCurr;
	private String fpcCaIntType;
	private String fpcSvcGroup;
	private String fpcProdLine;
	private String fpcFscCode;
	private String fpcPart;
	private String fpcUm;
	private Date fpcStart;

	// Constructors

	/** default constructor */
	public AbstractFpcMstrId() {
	}

	/** minimal constructor */
	public AbstractFpcMstrId(String fpcDomain) {
		this.fpcDomain = fpcDomain;
	}

	/** full constructor */
	public AbstractFpcMstrId(String fpcDomain, String fpcList,
			String fpcListType, String fpcCurr, String fpcCaIntType,
			String fpcSvcGroup, String fpcProdLine, String fpcFscCode,
			String fpcPart, String fpcUm, Date fpcStart) {
		this.fpcDomain = fpcDomain;
		this.fpcList = fpcList;
		this.fpcListType = fpcListType;
		this.fpcCurr = fpcCurr;
		this.fpcCaIntType = fpcCaIntType;
		this.fpcSvcGroup = fpcSvcGroup;
		this.fpcProdLine = fpcProdLine;
		this.fpcFscCode = fpcFscCode;
		this.fpcPart = fpcPart;
		this.fpcUm = fpcUm;
		this.fpcStart = fpcStart;
	}

	// Property accessors

	public String getFpcDomain() {
		return this.fpcDomain;
	}

	public void setFpcDomain(String fpcDomain) {
		this.fpcDomain = fpcDomain;
	}

	public String getFpcList() {
		return this.fpcList;
	}

	public void setFpcList(String fpcList) {
		this.fpcList = fpcList;
	}

	public String getFpcListType() {
		return this.fpcListType;
	}

	public void setFpcListType(String fpcListType) {
		this.fpcListType = fpcListType;
	}

	public String getFpcCurr() {
		return this.fpcCurr;
	}

	public void setFpcCurr(String fpcCurr) {
		this.fpcCurr = fpcCurr;
	}

	public String getFpcCaIntType() {
		return this.fpcCaIntType;
	}

	public void setFpcCaIntType(String fpcCaIntType) {
		this.fpcCaIntType = fpcCaIntType;
	}

	public String getFpcSvcGroup() {
		return this.fpcSvcGroup;
	}

	public void setFpcSvcGroup(String fpcSvcGroup) {
		this.fpcSvcGroup = fpcSvcGroup;
	}

	public String getFpcProdLine() {
		return this.fpcProdLine;
	}

	public void setFpcProdLine(String fpcProdLine) {
		this.fpcProdLine = fpcProdLine;
	}

	public String getFpcFscCode() {
		return this.fpcFscCode;
	}

	public void setFpcFscCode(String fpcFscCode) {
		this.fpcFscCode = fpcFscCode;
	}

	public String getFpcPart() {
		return this.fpcPart;
	}

	public void setFpcPart(String fpcPart) {
		this.fpcPart = fpcPart;
	}

	public String getFpcUm() {
		return this.fpcUm;
	}

	public void setFpcUm(String fpcUm) {
		this.fpcUm = fpcUm;
	}

	public Date getFpcStart() {
		return this.fpcStart;
	}

	public void setFpcStart(Date fpcStart) {
		this.fpcStart = fpcStart;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractFpcMstrId))
			return false;
		AbstractFpcMstrId castOther = (AbstractFpcMstrId) other;

		return ((this.getFpcDomain() == castOther.getFpcDomain()) || (this
				.getFpcDomain() != null
				&& castOther.getFpcDomain() != null && this.getFpcDomain()
				.equals(castOther.getFpcDomain())))
				&& ((this.getFpcList() == castOther.getFpcList()) || (this
						.getFpcList() != null
						&& castOther.getFpcList() != null && this.getFpcList()
						.equals(castOther.getFpcList())))
				&& ((this.getFpcListType() == castOther.getFpcListType()) || (this
						.getFpcListType() != null
						&& castOther.getFpcListType() != null && this
						.getFpcListType().equals(castOther.getFpcListType())))
				&& ((this.getFpcCurr() == castOther.getFpcCurr()) || (this
						.getFpcCurr() != null
						&& castOther.getFpcCurr() != null && this.getFpcCurr()
						.equals(castOther.getFpcCurr())))
				&& ((this.getFpcCaIntType() == castOther.getFpcCaIntType()) || (this
						.getFpcCaIntType() != null
						&& castOther.getFpcCaIntType() != null && this
						.getFpcCaIntType().equals(castOther.getFpcCaIntType())))
				&& ((this.getFpcSvcGroup() == castOther.getFpcSvcGroup()) || (this
						.getFpcSvcGroup() != null
						&& castOther.getFpcSvcGroup() != null && this
						.getFpcSvcGroup().equals(castOther.getFpcSvcGroup())))
				&& ((this.getFpcProdLine() == castOther.getFpcProdLine()) || (this
						.getFpcProdLine() != null
						&& castOther.getFpcProdLine() != null && this
						.getFpcProdLine().equals(castOther.getFpcProdLine())))
				&& ((this.getFpcFscCode() == castOther.getFpcFscCode()) || (this
						.getFpcFscCode() != null
						&& castOther.getFpcFscCode() != null && this
						.getFpcFscCode().equals(castOther.getFpcFscCode())))
				&& ((this.getFpcPart() == castOther.getFpcPart()) || (this
						.getFpcPart() != null
						&& castOther.getFpcPart() != null && this.getFpcPart()
						.equals(castOther.getFpcPart())))
				&& ((this.getFpcUm() == castOther.getFpcUm()) || (this
						.getFpcUm() != null
						&& castOther.getFpcUm() != null && this.getFpcUm()
						.equals(castOther.getFpcUm())))
				&& ((this.getFpcStart() == castOther.getFpcStart()) || (this
						.getFpcStart() != null
						&& castOther.getFpcStart() != null && this
						.getFpcStart().equals(castOther.getFpcStart())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getFpcDomain() == null ? 0 : this.getFpcDomain().hashCode());
		result = 37 * result
				+ (getFpcList() == null ? 0 : this.getFpcList().hashCode());
		result = 37
				* result
				+ (getFpcListType() == null ? 0 : this.getFpcListType()
						.hashCode());
		result = 37 * result
				+ (getFpcCurr() == null ? 0 : this.getFpcCurr().hashCode());
		result = 37
				* result
				+ (getFpcCaIntType() == null ? 0 : this.getFpcCaIntType()
						.hashCode());
		result = 37
				* result
				+ (getFpcSvcGroup() == null ? 0 : this.getFpcSvcGroup()
						.hashCode());
		result = 37
				* result
				+ (getFpcProdLine() == null ? 0 : this.getFpcProdLine()
						.hashCode());
		result = 37
				* result
				+ (getFpcFscCode() == null ? 0 : this.getFpcFscCode()
						.hashCode());
		result = 37 * result
				+ (getFpcPart() == null ? 0 : this.getFpcPart().hashCode());
		result = 37 * result
				+ (getFpcUm() == null ? 0 : this.getFpcUm().hashCode());
		result = 37 * result
				+ (getFpcStart() == null ? 0 : this.getFpcStart().hashCode());
		return result;
	}

}