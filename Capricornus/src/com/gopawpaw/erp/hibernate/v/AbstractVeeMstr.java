package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVeeMstr entity provides the base persistence definition of the
 * VeeMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVeeMstr implements java.io.Serializable {

	// Fields

	private VeeMstrId id;
	private String veeName;
	private String veeDesc;
	private Double veePoints;
	private String veeModUserid;
	private Date veeModDate;
	private String veeUser1;
	private String veeUser2;
	private String veeUser3;
	private String veeUser4;
	private String veeQadc01;
	private String veeQadc02;
	private String veeQadc03;
	private String veeQadc04;
	private Double veeQadd01;
	private Double veeQadd02;
	private Boolean veeQadl01;
	private Boolean veeQadl02;
	private Date veeQadt01;
	private Date veeQadt02;
	private Integer veeQadi01;
	private Integer veeQadi02;
	private Double oidVeeMstr;

	// Constructors

	/** default constructor */
	public AbstractVeeMstr() {
	}

	/** minimal constructor */
	public AbstractVeeMstr(VeeMstrId id, Double oidVeeMstr) {
		this.id = id;
		this.oidVeeMstr = oidVeeMstr;
	}

	/** full constructor */
	public AbstractVeeMstr(VeeMstrId id, String veeName, String veeDesc,
			Double veePoints, String veeModUserid, Date veeModDate,
			String veeUser1, String veeUser2, String veeUser3, String veeUser4,
			String veeQadc01, String veeQadc02, String veeQadc03,
			String veeQadc04, Double veeQadd01, Double veeQadd02,
			Boolean veeQadl01, Boolean veeQadl02, Date veeQadt01,
			Date veeQadt02, Integer veeQadi01, Integer veeQadi02,
			Double oidVeeMstr) {
		this.id = id;
		this.veeName = veeName;
		this.veeDesc = veeDesc;
		this.veePoints = veePoints;
		this.veeModUserid = veeModUserid;
		this.veeModDate = veeModDate;
		this.veeUser1 = veeUser1;
		this.veeUser2 = veeUser2;
		this.veeUser3 = veeUser3;
		this.veeUser4 = veeUser4;
		this.veeQadc01 = veeQadc01;
		this.veeQadc02 = veeQadc02;
		this.veeQadc03 = veeQadc03;
		this.veeQadc04 = veeQadc04;
		this.veeQadd01 = veeQadd01;
		this.veeQadd02 = veeQadd02;
		this.veeQadl01 = veeQadl01;
		this.veeQadl02 = veeQadl02;
		this.veeQadt01 = veeQadt01;
		this.veeQadt02 = veeQadt02;
		this.veeQadi01 = veeQadi01;
		this.veeQadi02 = veeQadi02;
		this.oidVeeMstr = oidVeeMstr;
	}

	// Property accessors

	public VeeMstrId getId() {
		return this.id;
	}

	public void setId(VeeMstrId id) {
		this.id = id;
	}

	public String getVeeName() {
		return this.veeName;
	}

	public void setVeeName(String veeName) {
		this.veeName = veeName;
	}

	public String getVeeDesc() {
		return this.veeDesc;
	}

	public void setVeeDesc(String veeDesc) {
		this.veeDesc = veeDesc;
	}

	public Double getVeePoints() {
		return this.veePoints;
	}

	public void setVeePoints(Double veePoints) {
		this.veePoints = veePoints;
	}

	public String getVeeModUserid() {
		return this.veeModUserid;
	}

	public void setVeeModUserid(String veeModUserid) {
		this.veeModUserid = veeModUserid;
	}

	public Date getVeeModDate() {
		return this.veeModDate;
	}

	public void setVeeModDate(Date veeModDate) {
		this.veeModDate = veeModDate;
	}

	public String getVeeUser1() {
		return this.veeUser1;
	}

	public void setVeeUser1(String veeUser1) {
		this.veeUser1 = veeUser1;
	}

	public String getVeeUser2() {
		return this.veeUser2;
	}

	public void setVeeUser2(String veeUser2) {
		this.veeUser2 = veeUser2;
	}

	public String getVeeUser3() {
		return this.veeUser3;
	}

	public void setVeeUser3(String veeUser3) {
		this.veeUser3 = veeUser3;
	}

	public String getVeeUser4() {
		return this.veeUser4;
	}

	public void setVeeUser4(String veeUser4) {
		this.veeUser4 = veeUser4;
	}

	public String getVeeQadc01() {
		return this.veeQadc01;
	}

	public void setVeeQadc01(String veeQadc01) {
		this.veeQadc01 = veeQadc01;
	}

	public String getVeeQadc02() {
		return this.veeQadc02;
	}

	public void setVeeQadc02(String veeQadc02) {
		this.veeQadc02 = veeQadc02;
	}

	public String getVeeQadc03() {
		return this.veeQadc03;
	}

	public void setVeeQadc03(String veeQadc03) {
		this.veeQadc03 = veeQadc03;
	}

	public String getVeeQadc04() {
		return this.veeQadc04;
	}

	public void setVeeQadc04(String veeQadc04) {
		this.veeQadc04 = veeQadc04;
	}

	public Double getVeeQadd01() {
		return this.veeQadd01;
	}

	public void setVeeQadd01(Double veeQadd01) {
		this.veeQadd01 = veeQadd01;
	}

	public Double getVeeQadd02() {
		return this.veeQadd02;
	}

	public void setVeeQadd02(Double veeQadd02) {
		this.veeQadd02 = veeQadd02;
	}

	public Boolean getVeeQadl01() {
		return this.veeQadl01;
	}

	public void setVeeQadl01(Boolean veeQadl01) {
		this.veeQadl01 = veeQadl01;
	}

	public Boolean getVeeQadl02() {
		return this.veeQadl02;
	}

	public void setVeeQadl02(Boolean veeQadl02) {
		this.veeQadl02 = veeQadl02;
	}

	public Date getVeeQadt01() {
		return this.veeQadt01;
	}

	public void setVeeQadt01(Date veeQadt01) {
		this.veeQadt01 = veeQadt01;
	}

	public Date getVeeQadt02() {
		return this.veeQadt02;
	}

	public void setVeeQadt02(Date veeQadt02) {
		this.veeQadt02 = veeQadt02;
	}

	public Integer getVeeQadi01() {
		return this.veeQadi01;
	}

	public void setVeeQadi01(Integer veeQadi01) {
		this.veeQadi01 = veeQadi01;
	}

	public Integer getVeeQadi02() {
		return this.veeQadi02;
	}

	public void setVeeQadi02(Integer veeQadi02) {
		this.veeQadi02 = veeQadi02;
	}

	public Double getOidVeeMstr() {
		return this.oidVeeMstr;
	}

	public void setOidVeeMstr(Double oidVeeMstr) {
		this.oidVeeMstr = oidVeeMstr;
	}

}