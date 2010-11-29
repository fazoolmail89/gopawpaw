package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGltmdDet entity provides the base persistence definition of the
 * GltmdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltmdDet implements java.io.Serializable {

	// Fields

	private GltmdDetId id;
	private Date gltmdModDate;
	private String gltmdModUserid;
	private String gltmdUser1;
	private String gltmdUser2;
	private Double gltmdUserd01;
	private Integer gltmdUseri01;
	private Boolean gltmdUserl01;
	private Date gltmdUsert01;
	private String gltmdQadc01;
	private String gltmdQadc02;
	private Double gltmdQadd01;
	private Integer gltmdQadi01;
	private Boolean gltmdQadl01;
	private Date gltmdQadt01;
	private Boolean gltmdConsTrans;
	private Double gltmdConsAmt;
	private Double oidGltmdDet;

	// Constructors

	/** default constructor */
	public AbstractGltmdDet() {
	}

	/** minimal constructor */
	public AbstractGltmdDet(GltmdDetId id, Date gltmdModDate,
			String gltmdModUserid, String gltmdUser1, String gltmdUser2,
			Double gltmdUserd01, Integer gltmdUseri01, Boolean gltmdUserl01,
			String gltmdQadc01, String gltmdQadc02, Double gltmdQadd01,
			Integer gltmdQadi01, Boolean gltmdQadl01, Boolean gltmdConsTrans,
			Double gltmdConsAmt, Double oidGltmdDet) {
		this.id = id;
		this.gltmdModDate = gltmdModDate;
		this.gltmdModUserid = gltmdModUserid;
		this.gltmdUser1 = gltmdUser1;
		this.gltmdUser2 = gltmdUser2;
		this.gltmdUserd01 = gltmdUserd01;
		this.gltmdUseri01 = gltmdUseri01;
		this.gltmdUserl01 = gltmdUserl01;
		this.gltmdQadc01 = gltmdQadc01;
		this.gltmdQadc02 = gltmdQadc02;
		this.gltmdQadd01 = gltmdQadd01;
		this.gltmdQadi01 = gltmdQadi01;
		this.gltmdQadl01 = gltmdQadl01;
		this.gltmdConsTrans = gltmdConsTrans;
		this.gltmdConsAmt = gltmdConsAmt;
		this.oidGltmdDet = oidGltmdDet;
	}

	/** full constructor */
	public AbstractGltmdDet(GltmdDetId id, Date gltmdModDate,
			String gltmdModUserid, String gltmdUser1, String gltmdUser2,
			Double gltmdUserd01, Integer gltmdUseri01, Boolean gltmdUserl01,
			Date gltmdUsert01, String gltmdQadc01, String gltmdQadc02,
			Double gltmdQadd01, Integer gltmdQadi01, Boolean gltmdQadl01,
			Date gltmdQadt01, Boolean gltmdConsTrans, Double gltmdConsAmt,
			Double oidGltmdDet) {
		this.id = id;
		this.gltmdModDate = gltmdModDate;
		this.gltmdModUserid = gltmdModUserid;
		this.gltmdUser1 = gltmdUser1;
		this.gltmdUser2 = gltmdUser2;
		this.gltmdUserd01 = gltmdUserd01;
		this.gltmdUseri01 = gltmdUseri01;
		this.gltmdUserl01 = gltmdUserl01;
		this.gltmdUsert01 = gltmdUsert01;
		this.gltmdQadc01 = gltmdQadc01;
		this.gltmdQadc02 = gltmdQadc02;
		this.gltmdQadd01 = gltmdQadd01;
		this.gltmdQadi01 = gltmdQadi01;
		this.gltmdQadl01 = gltmdQadl01;
		this.gltmdQadt01 = gltmdQadt01;
		this.gltmdConsTrans = gltmdConsTrans;
		this.gltmdConsAmt = gltmdConsAmt;
		this.oidGltmdDet = oidGltmdDet;
	}

	// Property accessors

	public GltmdDetId getId() {
		return this.id;
	}

	public void setId(GltmdDetId id) {
		this.id = id;
	}

	public Date getGltmdModDate() {
		return this.gltmdModDate;
	}

	public void setGltmdModDate(Date gltmdModDate) {
		this.gltmdModDate = gltmdModDate;
	}

	public String getGltmdModUserid() {
		return this.gltmdModUserid;
	}

	public void setGltmdModUserid(String gltmdModUserid) {
		this.gltmdModUserid = gltmdModUserid;
	}

	public String getGltmdUser1() {
		return this.gltmdUser1;
	}

	public void setGltmdUser1(String gltmdUser1) {
		this.gltmdUser1 = gltmdUser1;
	}

	public String getGltmdUser2() {
		return this.gltmdUser2;
	}

	public void setGltmdUser2(String gltmdUser2) {
		this.gltmdUser2 = gltmdUser2;
	}

	public Double getGltmdUserd01() {
		return this.gltmdUserd01;
	}

	public void setGltmdUserd01(Double gltmdUserd01) {
		this.gltmdUserd01 = gltmdUserd01;
	}

	public Integer getGltmdUseri01() {
		return this.gltmdUseri01;
	}

	public void setGltmdUseri01(Integer gltmdUseri01) {
		this.gltmdUseri01 = gltmdUseri01;
	}

	public Boolean getGltmdUserl01() {
		return this.gltmdUserl01;
	}

	public void setGltmdUserl01(Boolean gltmdUserl01) {
		this.gltmdUserl01 = gltmdUserl01;
	}

	public Date getGltmdUsert01() {
		return this.gltmdUsert01;
	}

	public void setGltmdUsert01(Date gltmdUsert01) {
		this.gltmdUsert01 = gltmdUsert01;
	}

	public String getGltmdQadc01() {
		return this.gltmdQadc01;
	}

	public void setGltmdQadc01(String gltmdQadc01) {
		this.gltmdQadc01 = gltmdQadc01;
	}

	public String getGltmdQadc02() {
		return this.gltmdQadc02;
	}

	public void setGltmdQadc02(String gltmdQadc02) {
		this.gltmdQadc02 = gltmdQadc02;
	}

	public Double getGltmdQadd01() {
		return this.gltmdQadd01;
	}

	public void setGltmdQadd01(Double gltmdQadd01) {
		this.gltmdQadd01 = gltmdQadd01;
	}

	public Integer getGltmdQadi01() {
		return this.gltmdQadi01;
	}

	public void setGltmdQadi01(Integer gltmdQadi01) {
		this.gltmdQadi01 = gltmdQadi01;
	}

	public Boolean getGltmdQadl01() {
		return this.gltmdQadl01;
	}

	public void setGltmdQadl01(Boolean gltmdQadl01) {
		this.gltmdQadl01 = gltmdQadl01;
	}

	public Date getGltmdQadt01() {
		return this.gltmdQadt01;
	}

	public void setGltmdQadt01(Date gltmdQadt01) {
		this.gltmdQadt01 = gltmdQadt01;
	}

	public Boolean getGltmdConsTrans() {
		return this.gltmdConsTrans;
	}

	public void setGltmdConsTrans(Boolean gltmdConsTrans) {
		this.gltmdConsTrans = gltmdConsTrans;
	}

	public Double getGltmdConsAmt() {
		return this.gltmdConsAmt;
	}

	public void setGltmdConsAmt(Double gltmdConsAmt) {
		this.gltmdConsAmt = gltmdConsAmt;
	}

	public Double getOidGltmdDet() {
		return this.oidGltmdDet;
	}

	public void setOidGltmdDet(Double oidGltmdDet) {
		this.oidGltmdDet = oidGltmdDet;
	}

}