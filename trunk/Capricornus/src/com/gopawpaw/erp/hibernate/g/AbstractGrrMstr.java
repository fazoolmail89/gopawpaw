package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGrrMstr entity provides the base persistence definition of the
 * GrrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrrMstr implements java.io.Serializable {

	// Fields

	private GrrMstrId id;
	private String grrDesc;
	private Integer grrWidth;
	private String grrAddId;
	private Date grrAddDate;
	private String grrModId;
	private Date grrModDate;
	private String grrGroup;
	private Boolean grrStatus;
	private Integer grrCmtindx;
	private String grrUser1;
	private String grrUser2;
	private Boolean grrContPg;
	private String grrBrkGl;
	private String grrBrkAc;
	private String grrQadc01;
	private Double oidGrrMstr;

	// Constructors

	/** default constructor */
	public AbstractGrrMstr() {
	}

	/** minimal constructor */
	public AbstractGrrMstr(GrrMstrId id, Double oidGrrMstr) {
		this.id = id;
		this.oidGrrMstr = oidGrrMstr;
	}

	/** full constructor */
	public AbstractGrrMstr(GrrMstrId id, String grrDesc, Integer grrWidth,
			String grrAddId, Date grrAddDate, String grrModId, Date grrModDate,
			String grrGroup, Boolean grrStatus, Integer grrCmtindx,
			String grrUser1, String grrUser2, Boolean grrContPg,
			String grrBrkGl, String grrBrkAc, String grrQadc01,
			Double oidGrrMstr) {
		this.id = id;
		this.grrDesc = grrDesc;
		this.grrWidth = grrWidth;
		this.grrAddId = grrAddId;
		this.grrAddDate = grrAddDate;
		this.grrModId = grrModId;
		this.grrModDate = grrModDate;
		this.grrGroup = grrGroup;
		this.grrStatus = grrStatus;
		this.grrCmtindx = grrCmtindx;
		this.grrUser1 = grrUser1;
		this.grrUser2 = grrUser2;
		this.grrContPg = grrContPg;
		this.grrBrkGl = grrBrkGl;
		this.grrBrkAc = grrBrkAc;
		this.grrQadc01 = grrQadc01;
		this.oidGrrMstr = oidGrrMstr;
	}

	// Property accessors

	public GrrMstrId getId() {
		return this.id;
	}

	public void setId(GrrMstrId id) {
		this.id = id;
	}

	public String getGrrDesc() {
		return this.grrDesc;
	}

	public void setGrrDesc(String grrDesc) {
		this.grrDesc = grrDesc;
	}

	public Integer getGrrWidth() {
		return this.grrWidth;
	}

	public void setGrrWidth(Integer grrWidth) {
		this.grrWidth = grrWidth;
	}

	public String getGrrAddId() {
		return this.grrAddId;
	}

	public void setGrrAddId(String grrAddId) {
		this.grrAddId = grrAddId;
	}

	public Date getGrrAddDate() {
		return this.grrAddDate;
	}

	public void setGrrAddDate(Date grrAddDate) {
		this.grrAddDate = grrAddDate;
	}

	public String getGrrModId() {
		return this.grrModId;
	}

	public void setGrrModId(String grrModId) {
		this.grrModId = grrModId;
	}

	public Date getGrrModDate() {
		return this.grrModDate;
	}

	public void setGrrModDate(Date grrModDate) {
		this.grrModDate = grrModDate;
	}

	public String getGrrGroup() {
		return this.grrGroup;
	}

	public void setGrrGroup(String grrGroup) {
		this.grrGroup = grrGroup;
	}

	public Boolean getGrrStatus() {
		return this.grrStatus;
	}

	public void setGrrStatus(Boolean grrStatus) {
		this.grrStatus = grrStatus;
	}

	public Integer getGrrCmtindx() {
		return this.grrCmtindx;
	}

	public void setGrrCmtindx(Integer grrCmtindx) {
		this.grrCmtindx = grrCmtindx;
	}

	public String getGrrUser1() {
		return this.grrUser1;
	}

	public void setGrrUser1(String grrUser1) {
		this.grrUser1 = grrUser1;
	}

	public String getGrrUser2() {
		return this.grrUser2;
	}

	public void setGrrUser2(String grrUser2) {
		this.grrUser2 = grrUser2;
	}

	public Boolean getGrrContPg() {
		return this.grrContPg;
	}

	public void setGrrContPg(Boolean grrContPg) {
		this.grrContPg = grrContPg;
	}

	public String getGrrBrkGl() {
		return this.grrBrkGl;
	}

	public void setGrrBrkGl(String grrBrkGl) {
		this.grrBrkGl = grrBrkGl;
	}

	public String getGrrBrkAc() {
		return this.grrBrkAc;
	}

	public void setGrrBrkAc(String grrBrkAc) {
		this.grrBrkAc = grrBrkAc;
	}

	public String getGrrQadc01() {
		return this.grrQadc01;
	}

	public void setGrrQadc01(String grrQadc01) {
		this.grrQadc01 = grrQadc01;
	}

	public Double getOidGrrMstr() {
		return this.oidGrrMstr;
	}

	public void setOidGrrMstr(Double oidGrrMstr) {
		this.oidGrrMstr = oidGrrMstr;
	}

}