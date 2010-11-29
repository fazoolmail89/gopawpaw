package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGrcMstr entity provides the base persistence definition of the
 * GrcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrcMstr implements java.io.Serializable {

	// Fields

	private GrcMstrId id;
	private String grcDesc;
	private String grcAddId;
	private Date grcAddDate;
	private String grcModId;
	private Date grcModDate;
	private String grcGroup;
	private Boolean grcStatus;
	private Integer grcCmtindx;
	private String grcUser1;
	private String grcUser2;
	private String grcQadc01;
	private Double oidGrcMstr;

	// Constructors

	/** default constructor */
	public AbstractGrcMstr() {
	}

	/** minimal constructor */
	public AbstractGrcMstr(GrcMstrId id, Double oidGrcMstr) {
		this.id = id;
		this.oidGrcMstr = oidGrcMstr;
	}

	/** full constructor */
	public AbstractGrcMstr(GrcMstrId id, String grcDesc, String grcAddId,
			Date grcAddDate, String grcModId, Date grcModDate, String grcGroup,
			Boolean grcStatus, Integer grcCmtindx, String grcUser1,
			String grcUser2, String grcQadc01, Double oidGrcMstr) {
		this.id = id;
		this.grcDesc = grcDesc;
		this.grcAddId = grcAddId;
		this.grcAddDate = grcAddDate;
		this.grcModId = grcModId;
		this.grcModDate = grcModDate;
		this.grcGroup = grcGroup;
		this.grcStatus = grcStatus;
		this.grcCmtindx = grcCmtindx;
		this.grcUser1 = grcUser1;
		this.grcUser2 = grcUser2;
		this.grcQadc01 = grcQadc01;
		this.oidGrcMstr = oidGrcMstr;
	}

	// Property accessors

	public GrcMstrId getId() {
		return this.id;
	}

	public void setId(GrcMstrId id) {
		this.id = id;
	}

	public String getGrcDesc() {
		return this.grcDesc;
	}

	public void setGrcDesc(String grcDesc) {
		this.grcDesc = grcDesc;
	}

	public String getGrcAddId() {
		return this.grcAddId;
	}

	public void setGrcAddId(String grcAddId) {
		this.grcAddId = grcAddId;
	}

	public Date getGrcAddDate() {
		return this.grcAddDate;
	}

	public void setGrcAddDate(Date grcAddDate) {
		this.grcAddDate = grcAddDate;
	}

	public String getGrcModId() {
		return this.grcModId;
	}

	public void setGrcModId(String grcModId) {
		this.grcModId = grcModId;
	}

	public Date getGrcModDate() {
		return this.grcModDate;
	}

	public void setGrcModDate(Date grcModDate) {
		this.grcModDate = grcModDate;
	}

	public String getGrcGroup() {
		return this.grcGroup;
	}

	public void setGrcGroup(String grcGroup) {
		this.grcGroup = grcGroup;
	}

	public Boolean getGrcStatus() {
		return this.grcStatus;
	}

	public void setGrcStatus(Boolean grcStatus) {
		this.grcStatus = grcStatus;
	}

	public Integer getGrcCmtindx() {
		return this.grcCmtindx;
	}

	public void setGrcCmtindx(Integer grcCmtindx) {
		this.grcCmtindx = grcCmtindx;
	}

	public String getGrcUser1() {
		return this.grcUser1;
	}

	public void setGrcUser1(String grcUser1) {
		this.grcUser1 = grcUser1;
	}

	public String getGrcUser2() {
		return this.grcUser2;
	}

	public void setGrcUser2(String grcUser2) {
		this.grcUser2 = grcUser2;
	}

	public String getGrcQadc01() {
		return this.grcQadc01;
	}

	public void setGrcQadc01(String grcQadc01) {
		this.grcQadc01 = grcQadc01;
	}

	public Double getOidGrcMstr() {
		return this.oidGrcMstr;
	}

	public void setOidGrcMstr(Double oidGrcMstr) {
		this.oidGrcMstr = oidGrcMstr;
	}

}