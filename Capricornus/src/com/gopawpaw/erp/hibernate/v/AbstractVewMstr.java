package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVewMstr entity provides the base persistence definition of the
 * VewMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVewMstr implements java.io.Serializable {

	// Fields

	private VewMstrId id;
	private String vewName;
	private String vewDesc;
	private Double vewWeightFactor;
	private String vewModUserid;
	private Date vewModDate;
	private String vewUser1;
	private String vewUser2;
	private String vewUser3;
	private String vewUser4;
	private String vewQadc01;
	private String vewQadc02;
	private String vewQadc03;
	private String vewQadc04;
	private Double vewQadd01;
	private Double vewQadd02;
	private Boolean vewQadl01;
	private Boolean vewQadl02;
	private Date vewQadt01;
	private Date vewQadt02;
	private Integer vewQadi01;
	private Integer vewQadi02;
	private Double oidVewMstr;

	// Constructors

	/** default constructor */
	public AbstractVewMstr() {
	}

	/** minimal constructor */
	public AbstractVewMstr(VewMstrId id, Double oidVewMstr) {
		this.id = id;
		this.oidVewMstr = oidVewMstr;
	}

	/** full constructor */
	public AbstractVewMstr(VewMstrId id, String vewName, String vewDesc,
			Double vewWeightFactor, String vewModUserid, Date vewModDate,
			String vewUser1, String vewUser2, String vewUser3, String vewUser4,
			String vewQadc01, String vewQadc02, String vewQadc03,
			String vewQadc04, Double vewQadd01, Double vewQadd02,
			Boolean vewQadl01, Boolean vewQadl02, Date vewQadt01,
			Date vewQadt02, Integer vewQadi01, Integer vewQadi02,
			Double oidVewMstr) {
		this.id = id;
		this.vewName = vewName;
		this.vewDesc = vewDesc;
		this.vewWeightFactor = vewWeightFactor;
		this.vewModUserid = vewModUserid;
		this.vewModDate = vewModDate;
		this.vewUser1 = vewUser1;
		this.vewUser2 = vewUser2;
		this.vewUser3 = vewUser3;
		this.vewUser4 = vewUser4;
		this.vewQadc01 = vewQadc01;
		this.vewQadc02 = vewQadc02;
		this.vewQadc03 = vewQadc03;
		this.vewQadc04 = vewQadc04;
		this.vewQadd01 = vewQadd01;
		this.vewQadd02 = vewQadd02;
		this.vewQadl01 = vewQadl01;
		this.vewQadl02 = vewQadl02;
		this.vewQadt01 = vewQadt01;
		this.vewQadt02 = vewQadt02;
		this.vewQadi01 = vewQadi01;
		this.vewQadi02 = vewQadi02;
		this.oidVewMstr = oidVewMstr;
	}

	// Property accessors

	public VewMstrId getId() {
		return this.id;
	}

	public void setId(VewMstrId id) {
		this.id = id;
	}

	public String getVewName() {
		return this.vewName;
	}

	public void setVewName(String vewName) {
		this.vewName = vewName;
	}

	public String getVewDesc() {
		return this.vewDesc;
	}

	public void setVewDesc(String vewDesc) {
		this.vewDesc = vewDesc;
	}

	public Double getVewWeightFactor() {
		return this.vewWeightFactor;
	}

	public void setVewWeightFactor(Double vewWeightFactor) {
		this.vewWeightFactor = vewWeightFactor;
	}

	public String getVewModUserid() {
		return this.vewModUserid;
	}

	public void setVewModUserid(String vewModUserid) {
		this.vewModUserid = vewModUserid;
	}

	public Date getVewModDate() {
		return this.vewModDate;
	}

	public void setVewModDate(Date vewModDate) {
		this.vewModDate = vewModDate;
	}

	public String getVewUser1() {
		return this.vewUser1;
	}

	public void setVewUser1(String vewUser1) {
		this.vewUser1 = vewUser1;
	}

	public String getVewUser2() {
		return this.vewUser2;
	}

	public void setVewUser2(String vewUser2) {
		this.vewUser2 = vewUser2;
	}

	public String getVewUser3() {
		return this.vewUser3;
	}

	public void setVewUser3(String vewUser3) {
		this.vewUser3 = vewUser3;
	}

	public String getVewUser4() {
		return this.vewUser4;
	}

	public void setVewUser4(String vewUser4) {
		this.vewUser4 = vewUser4;
	}

	public String getVewQadc01() {
		return this.vewQadc01;
	}

	public void setVewQadc01(String vewQadc01) {
		this.vewQadc01 = vewQadc01;
	}

	public String getVewQadc02() {
		return this.vewQadc02;
	}

	public void setVewQadc02(String vewQadc02) {
		this.vewQadc02 = vewQadc02;
	}

	public String getVewQadc03() {
		return this.vewQadc03;
	}

	public void setVewQadc03(String vewQadc03) {
		this.vewQadc03 = vewQadc03;
	}

	public String getVewQadc04() {
		return this.vewQadc04;
	}

	public void setVewQadc04(String vewQadc04) {
		this.vewQadc04 = vewQadc04;
	}

	public Double getVewQadd01() {
		return this.vewQadd01;
	}

	public void setVewQadd01(Double vewQadd01) {
		this.vewQadd01 = vewQadd01;
	}

	public Double getVewQadd02() {
		return this.vewQadd02;
	}

	public void setVewQadd02(Double vewQadd02) {
		this.vewQadd02 = vewQadd02;
	}

	public Boolean getVewQadl01() {
		return this.vewQadl01;
	}

	public void setVewQadl01(Boolean vewQadl01) {
		this.vewQadl01 = vewQadl01;
	}

	public Boolean getVewQadl02() {
		return this.vewQadl02;
	}

	public void setVewQadl02(Boolean vewQadl02) {
		this.vewQadl02 = vewQadl02;
	}

	public Date getVewQadt01() {
		return this.vewQadt01;
	}

	public void setVewQadt01(Date vewQadt01) {
		this.vewQadt01 = vewQadt01;
	}

	public Date getVewQadt02() {
		return this.vewQadt02;
	}

	public void setVewQadt02(Date vewQadt02) {
		this.vewQadt02 = vewQadt02;
	}

	public Integer getVewQadi01() {
		return this.vewQadi01;
	}

	public void setVewQadi01(Integer vewQadi01) {
		this.vewQadi01 = vewQadi01;
	}

	public Integer getVewQadi02() {
		return this.vewQadi02;
	}

	public void setVewQadi02(Integer vewQadi02) {
		this.vewQadi02 = vewQadi02;
	}

	public Double getOidVewMstr() {
		return this.oidVewMstr;
	}

	public void setOidVewMstr(Double oidVewMstr) {
		this.oidVewMstr = oidVewMstr;
	}

}