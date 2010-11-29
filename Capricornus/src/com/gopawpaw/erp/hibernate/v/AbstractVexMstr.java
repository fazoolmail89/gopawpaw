package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVexMstr entity provides the base persistence definition of the
 * VexMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVexMstr implements java.io.Serializable {

	// Fields

	private VexMstrId id;
	private String vexToSite;
	private String vexToVendor;
	private String vexToVendorSource;
	private String vexModUserid;
	private Date vexModDate;
	private String vexUser1;
	private String vexUser2;
	private String vexUser3;
	private String vexUser4;
	private String vexQadc01;
	private String vexQadc02;
	private String vexQadc03;
	private String vexQadc04;
	private Double vexQadd01;
	private Double vexQadd02;
	private Boolean vexQadl01;
	private Boolean vexQadl02;
	private Date vexQadt02;
	private Date vexQadt01;
	private Integer vexQadi01;
	private Integer vexQadi02;
	private Double oidVexMstr;

	// Constructors

	/** default constructor */
	public AbstractVexMstr() {
	}

	/** minimal constructor */
	public AbstractVexMstr(VexMstrId id, Double oidVexMstr) {
		this.id = id;
		this.oidVexMstr = oidVexMstr;
	}

	/** full constructor */
	public AbstractVexMstr(VexMstrId id, String vexToSite, String vexToVendor,
			String vexToVendorSource, String vexModUserid, Date vexModDate,
			String vexUser1, String vexUser2, String vexUser3, String vexUser4,
			String vexQadc01, String vexQadc02, String vexQadc03,
			String vexQadc04, Double vexQadd01, Double vexQadd02,
			Boolean vexQadl01, Boolean vexQadl02, Date vexQadt02,
			Date vexQadt01, Integer vexQadi01, Integer vexQadi02,
			Double oidVexMstr) {
		this.id = id;
		this.vexToSite = vexToSite;
		this.vexToVendor = vexToVendor;
		this.vexToVendorSource = vexToVendorSource;
		this.vexModUserid = vexModUserid;
		this.vexModDate = vexModDate;
		this.vexUser1 = vexUser1;
		this.vexUser2 = vexUser2;
		this.vexUser3 = vexUser3;
		this.vexUser4 = vexUser4;
		this.vexQadc01 = vexQadc01;
		this.vexQadc02 = vexQadc02;
		this.vexQadc03 = vexQadc03;
		this.vexQadc04 = vexQadc04;
		this.vexQadd01 = vexQadd01;
		this.vexQadd02 = vexQadd02;
		this.vexQadl01 = vexQadl01;
		this.vexQadl02 = vexQadl02;
		this.vexQadt02 = vexQadt02;
		this.vexQadt01 = vexQadt01;
		this.vexQadi01 = vexQadi01;
		this.vexQadi02 = vexQadi02;
		this.oidVexMstr = oidVexMstr;
	}

	// Property accessors

	public VexMstrId getId() {
		return this.id;
	}

	public void setId(VexMstrId id) {
		this.id = id;
	}

	public String getVexToSite() {
		return this.vexToSite;
	}

	public void setVexToSite(String vexToSite) {
		this.vexToSite = vexToSite;
	}

	public String getVexToVendor() {
		return this.vexToVendor;
	}

	public void setVexToVendor(String vexToVendor) {
		this.vexToVendor = vexToVendor;
	}

	public String getVexToVendorSource() {
		return this.vexToVendorSource;
	}

	public void setVexToVendorSource(String vexToVendorSource) {
		this.vexToVendorSource = vexToVendorSource;
	}

	public String getVexModUserid() {
		return this.vexModUserid;
	}

	public void setVexModUserid(String vexModUserid) {
		this.vexModUserid = vexModUserid;
	}

	public Date getVexModDate() {
		return this.vexModDate;
	}

	public void setVexModDate(Date vexModDate) {
		this.vexModDate = vexModDate;
	}

	public String getVexUser1() {
		return this.vexUser1;
	}

	public void setVexUser1(String vexUser1) {
		this.vexUser1 = vexUser1;
	}

	public String getVexUser2() {
		return this.vexUser2;
	}

	public void setVexUser2(String vexUser2) {
		this.vexUser2 = vexUser2;
	}

	public String getVexUser3() {
		return this.vexUser3;
	}

	public void setVexUser3(String vexUser3) {
		this.vexUser3 = vexUser3;
	}

	public String getVexUser4() {
		return this.vexUser4;
	}

	public void setVexUser4(String vexUser4) {
		this.vexUser4 = vexUser4;
	}

	public String getVexQadc01() {
		return this.vexQadc01;
	}

	public void setVexQadc01(String vexQadc01) {
		this.vexQadc01 = vexQadc01;
	}

	public String getVexQadc02() {
		return this.vexQadc02;
	}

	public void setVexQadc02(String vexQadc02) {
		this.vexQadc02 = vexQadc02;
	}

	public String getVexQadc03() {
		return this.vexQadc03;
	}

	public void setVexQadc03(String vexQadc03) {
		this.vexQadc03 = vexQadc03;
	}

	public String getVexQadc04() {
		return this.vexQadc04;
	}

	public void setVexQadc04(String vexQadc04) {
		this.vexQadc04 = vexQadc04;
	}

	public Double getVexQadd01() {
		return this.vexQadd01;
	}

	public void setVexQadd01(Double vexQadd01) {
		this.vexQadd01 = vexQadd01;
	}

	public Double getVexQadd02() {
		return this.vexQadd02;
	}

	public void setVexQadd02(Double vexQadd02) {
		this.vexQadd02 = vexQadd02;
	}

	public Boolean getVexQadl01() {
		return this.vexQadl01;
	}

	public void setVexQadl01(Boolean vexQadl01) {
		this.vexQadl01 = vexQadl01;
	}

	public Boolean getVexQadl02() {
		return this.vexQadl02;
	}

	public void setVexQadl02(Boolean vexQadl02) {
		this.vexQadl02 = vexQadl02;
	}

	public Date getVexQadt02() {
		return this.vexQadt02;
	}

	public void setVexQadt02(Date vexQadt02) {
		this.vexQadt02 = vexQadt02;
	}

	public Date getVexQadt01() {
		return this.vexQadt01;
	}

	public void setVexQadt01(Date vexQadt01) {
		this.vexQadt01 = vexQadt01;
	}

	public Integer getVexQadi01() {
		return this.vexQadi01;
	}

	public void setVexQadi01(Integer vexQadi01) {
		this.vexQadi01 = vexQadi01;
	}

	public Integer getVexQadi02() {
		return this.vexQadi02;
	}

	public void setVexQadi02(Integer vexQadi02) {
		this.vexQadi02 = vexQadi02;
	}

	public Double getOidVexMstr() {
		return this.oidVexMstr;
	}

	public void setOidVexMstr(Double oidVexMstr) {
		this.oidVexMstr = oidVexMstr;
	}

}