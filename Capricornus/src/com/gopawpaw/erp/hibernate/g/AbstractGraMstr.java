package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGraMstr entity provides the base persistence definition of the
 * GraMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGraMstr implements java.io.Serializable {

	// Fields

	private GraMstrId id;
	private String graGlType;
	private Boolean graLink;
	private String graDesc;
	private String graAddId;
	private Date graAddDate;
	private String graModId;
	private Date graModDate;
	private String graGroup;
	private Boolean graStatus;
	private Integer graCmtindx;
	private String graUser1;
	private String graUser2;
	private String graQadc01;
	private Double oidGraMstr;

	// Constructors

	/** default constructor */
	public AbstractGraMstr() {
	}

	/** minimal constructor */
	public AbstractGraMstr(GraMstrId id, Double oidGraMstr) {
		this.id = id;
		this.oidGraMstr = oidGraMstr;
	}

	/** full constructor */
	public AbstractGraMstr(GraMstrId id, String graGlType, Boolean graLink,
			String graDesc, String graAddId, Date graAddDate, String graModId,
			Date graModDate, String graGroup, Boolean graStatus,
			Integer graCmtindx, String graUser1, String graUser2,
			String graQadc01, Double oidGraMstr) {
		this.id = id;
		this.graGlType = graGlType;
		this.graLink = graLink;
		this.graDesc = graDesc;
		this.graAddId = graAddId;
		this.graAddDate = graAddDate;
		this.graModId = graModId;
		this.graModDate = graModDate;
		this.graGroup = graGroup;
		this.graStatus = graStatus;
		this.graCmtindx = graCmtindx;
		this.graUser1 = graUser1;
		this.graUser2 = graUser2;
		this.graQadc01 = graQadc01;
		this.oidGraMstr = oidGraMstr;
	}

	// Property accessors

	public GraMstrId getId() {
		return this.id;
	}

	public void setId(GraMstrId id) {
		this.id = id;
	}

	public String getGraGlType() {
		return this.graGlType;
	}

	public void setGraGlType(String graGlType) {
		this.graGlType = graGlType;
	}

	public Boolean getGraLink() {
		return this.graLink;
	}

	public void setGraLink(Boolean graLink) {
		this.graLink = graLink;
	}

	public String getGraDesc() {
		return this.graDesc;
	}

	public void setGraDesc(String graDesc) {
		this.graDesc = graDesc;
	}

	public String getGraAddId() {
		return this.graAddId;
	}

	public void setGraAddId(String graAddId) {
		this.graAddId = graAddId;
	}

	public Date getGraAddDate() {
		return this.graAddDate;
	}

	public void setGraAddDate(Date graAddDate) {
		this.graAddDate = graAddDate;
	}

	public String getGraModId() {
		return this.graModId;
	}

	public void setGraModId(String graModId) {
		this.graModId = graModId;
	}

	public Date getGraModDate() {
		return this.graModDate;
	}

	public void setGraModDate(Date graModDate) {
		this.graModDate = graModDate;
	}

	public String getGraGroup() {
		return this.graGroup;
	}

	public void setGraGroup(String graGroup) {
		this.graGroup = graGroup;
	}

	public Boolean getGraStatus() {
		return this.graStatus;
	}

	public void setGraStatus(Boolean graStatus) {
		this.graStatus = graStatus;
	}

	public Integer getGraCmtindx() {
		return this.graCmtindx;
	}

	public void setGraCmtindx(Integer graCmtindx) {
		this.graCmtindx = graCmtindx;
	}

	public String getGraUser1() {
		return this.graUser1;
	}

	public void setGraUser1(String graUser1) {
		this.graUser1 = graUser1;
	}

	public String getGraUser2() {
		return this.graUser2;
	}

	public void setGraUser2(String graUser2) {
		this.graUser2 = graUser2;
	}

	public String getGraQadc01() {
		return this.graQadc01;
	}

	public void setGraQadc01(String graQadc01) {
		this.graQadc01 = graQadc01;
	}

	public Double getOidGraMstr() {
		return this.oidGraMstr;
	}

	public void setOidGraMstr(Double oidGraMstr) {
		this.oidGraMstr = oidGraMstr;
	}

}