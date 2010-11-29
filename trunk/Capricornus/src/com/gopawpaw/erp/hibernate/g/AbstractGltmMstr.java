package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGltmMstr entity provides the base persistence definition of the
 * GltmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltmMstr implements java.io.Serializable {

	// Fields

	private GltmMstrId id;
	private Date gltmEffDt;
	private String gltmRef;
	private Boolean gltmRflag;
	private Integer gltmLine;
	private String gltmModUserid;
	private Date gltmModDate;
	private String gltmUser1;
	private String gltmUser2;
	private Double gltmUserd01;
	private Integer gltmUseri01;
	private Boolean gltmUserl01;
	private Date gltmUsert01;
	private String gltmQadc01;
	private String gltmQadc02;
	private Double gltmQadd01;
	private Integer gltmQadi01;
	private Boolean gltmQadl01;
	private Date gltmQadt01;
	private Double oidGltmMstr;

	// Constructors

	/** default constructor */
	public AbstractGltmMstr() {
	}

	/** minimal constructor */
	public AbstractGltmMstr(GltmMstrId id, Date gltmEffDt, String gltmRef,
			Boolean gltmRflag, Integer gltmLine, String gltmModUserid,
			Date gltmModDate, String gltmUser1, String gltmUser2,
			Double gltmUserd01, Integer gltmUseri01, Boolean gltmUserl01,
			String gltmQadc01, String gltmQadc02, Double gltmQadd01,
			Integer gltmQadi01, Boolean gltmQadl01, Double oidGltmMstr) {
		this.id = id;
		this.gltmEffDt = gltmEffDt;
		this.gltmRef = gltmRef;
		this.gltmRflag = gltmRflag;
		this.gltmLine = gltmLine;
		this.gltmModUserid = gltmModUserid;
		this.gltmModDate = gltmModDate;
		this.gltmUser1 = gltmUser1;
		this.gltmUser2 = gltmUser2;
		this.gltmUserd01 = gltmUserd01;
		this.gltmUseri01 = gltmUseri01;
		this.gltmUserl01 = gltmUserl01;
		this.gltmQadc01 = gltmQadc01;
		this.gltmQadc02 = gltmQadc02;
		this.gltmQadd01 = gltmQadd01;
		this.gltmQadi01 = gltmQadi01;
		this.gltmQadl01 = gltmQadl01;
		this.oidGltmMstr = oidGltmMstr;
	}

	/** full constructor */
	public AbstractGltmMstr(GltmMstrId id, Date gltmEffDt, String gltmRef,
			Boolean gltmRflag, Integer gltmLine, String gltmModUserid,
			Date gltmModDate, String gltmUser1, String gltmUser2,
			Double gltmUserd01, Integer gltmUseri01, Boolean gltmUserl01,
			Date gltmUsert01, String gltmQadc01, String gltmQadc02,
			Double gltmQadd01, Integer gltmQadi01, Boolean gltmQadl01,
			Date gltmQadt01, Double oidGltmMstr) {
		this.id = id;
		this.gltmEffDt = gltmEffDt;
		this.gltmRef = gltmRef;
		this.gltmRflag = gltmRflag;
		this.gltmLine = gltmLine;
		this.gltmModUserid = gltmModUserid;
		this.gltmModDate = gltmModDate;
		this.gltmUser1 = gltmUser1;
		this.gltmUser2 = gltmUser2;
		this.gltmUserd01 = gltmUserd01;
		this.gltmUseri01 = gltmUseri01;
		this.gltmUserl01 = gltmUserl01;
		this.gltmUsert01 = gltmUsert01;
		this.gltmQadc01 = gltmQadc01;
		this.gltmQadc02 = gltmQadc02;
		this.gltmQadd01 = gltmQadd01;
		this.gltmQadi01 = gltmQadi01;
		this.gltmQadl01 = gltmQadl01;
		this.gltmQadt01 = gltmQadt01;
		this.oidGltmMstr = oidGltmMstr;
	}

	// Property accessors

	public GltmMstrId getId() {
		return this.id;
	}

	public void setId(GltmMstrId id) {
		this.id = id;
	}

	public Date getGltmEffDt() {
		return this.gltmEffDt;
	}

	public void setGltmEffDt(Date gltmEffDt) {
		this.gltmEffDt = gltmEffDt;
	}

	public String getGltmRef() {
		return this.gltmRef;
	}

	public void setGltmRef(String gltmRef) {
		this.gltmRef = gltmRef;
	}

	public Boolean getGltmRflag() {
		return this.gltmRflag;
	}

	public void setGltmRflag(Boolean gltmRflag) {
		this.gltmRflag = gltmRflag;
	}

	public Integer getGltmLine() {
		return this.gltmLine;
	}

	public void setGltmLine(Integer gltmLine) {
		this.gltmLine = gltmLine;
	}

	public String getGltmModUserid() {
		return this.gltmModUserid;
	}

	public void setGltmModUserid(String gltmModUserid) {
		this.gltmModUserid = gltmModUserid;
	}

	public Date getGltmModDate() {
		return this.gltmModDate;
	}

	public void setGltmModDate(Date gltmModDate) {
		this.gltmModDate = gltmModDate;
	}

	public String getGltmUser1() {
		return this.gltmUser1;
	}

	public void setGltmUser1(String gltmUser1) {
		this.gltmUser1 = gltmUser1;
	}

	public String getGltmUser2() {
		return this.gltmUser2;
	}

	public void setGltmUser2(String gltmUser2) {
		this.gltmUser2 = gltmUser2;
	}

	public Double getGltmUserd01() {
		return this.gltmUserd01;
	}

	public void setGltmUserd01(Double gltmUserd01) {
		this.gltmUserd01 = gltmUserd01;
	}

	public Integer getGltmUseri01() {
		return this.gltmUseri01;
	}

	public void setGltmUseri01(Integer gltmUseri01) {
		this.gltmUseri01 = gltmUseri01;
	}

	public Boolean getGltmUserl01() {
		return this.gltmUserl01;
	}

	public void setGltmUserl01(Boolean gltmUserl01) {
		this.gltmUserl01 = gltmUserl01;
	}

	public Date getGltmUsert01() {
		return this.gltmUsert01;
	}

	public void setGltmUsert01(Date gltmUsert01) {
		this.gltmUsert01 = gltmUsert01;
	}

	public String getGltmQadc01() {
		return this.gltmQadc01;
	}

	public void setGltmQadc01(String gltmQadc01) {
		this.gltmQadc01 = gltmQadc01;
	}

	public String getGltmQadc02() {
		return this.gltmQadc02;
	}

	public void setGltmQadc02(String gltmQadc02) {
		this.gltmQadc02 = gltmQadc02;
	}

	public Double getGltmQadd01() {
		return this.gltmQadd01;
	}

	public void setGltmQadd01(Double gltmQadd01) {
		this.gltmQadd01 = gltmQadd01;
	}

	public Integer getGltmQadi01() {
		return this.gltmQadi01;
	}

	public void setGltmQadi01(Integer gltmQadi01) {
		this.gltmQadi01 = gltmQadi01;
	}

	public Boolean getGltmQadl01() {
		return this.gltmQadl01;
	}

	public void setGltmQadl01(Boolean gltmQadl01) {
		this.gltmQadl01 = gltmQadl01;
	}

	public Date getGltmQadt01() {
		return this.gltmQadt01;
	}

	public void setGltmQadt01(Date gltmQadt01) {
		this.gltmQadt01 = gltmQadt01;
	}

	public Double getOidGltmMstr() {
		return this.oidGltmMstr;
	}

	public void setOidGltmMstr(Double oidGltmMstr) {
		this.oidGltmMstr = oidGltmMstr;
	}

}