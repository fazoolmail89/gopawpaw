package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShftDet entity provides the base persistence definition of the
 * ShftDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShftDet implements java.io.Serializable {

	// Fields

	private ShftDetId id;
	private Double shftStart1;
	private Double shftStart2;
	private Double shftStart3;
	private Double shftStart4;
	private Double shftHour1;
	private Double shftHour2;
	private Double shftHour3;
	private Double shftHour4;
	private String shftPat2;
	private String shftPat3;
	private String shftPat4;
	private String shftPat1;
	private Double shftLoad1;
	private Double shftLoad2;
	private Double shftLoad3;
	private Double shftLoad4;
	private String shftUser1;
	private String shftUser2;
	private String shftChr01;
	private String shftChr02;
	private String shftChr03;
	private String shftChr04;
	private String shftChr05;
	private Double shftDec01;
	private Double shftDec02;
	private Double shftDec03;
	private Double shftDec04;
	private Boolean shftLog01;
	private Double oidShftDet;

	// Constructors

	/** default constructor */
	public AbstractShftDet() {
	}

	/** minimal constructor */
	public AbstractShftDet(ShftDetId id, Double oidShftDet) {
		this.id = id;
		this.oidShftDet = oidShftDet;
	}

	/** full constructor */
	public AbstractShftDet(ShftDetId id, Double shftStart1, Double shftStart2,
			Double shftStart3, Double shftStart4, Double shftHour1,
			Double shftHour2, Double shftHour3, Double shftHour4,
			String shftPat2, String shftPat3, String shftPat4, String shftPat1,
			Double shftLoad1, Double shftLoad2, Double shftLoad3,
			Double shftLoad4, String shftUser1, String shftUser2,
			String shftChr01, String shftChr02, String shftChr03,
			String shftChr04, String shftChr05, Double shftDec01,
			Double shftDec02, Double shftDec03, Double shftDec04,
			Boolean shftLog01, Double oidShftDet) {
		this.id = id;
		this.shftStart1 = shftStart1;
		this.shftStart2 = shftStart2;
		this.shftStart3 = shftStart3;
		this.shftStart4 = shftStart4;
		this.shftHour1 = shftHour1;
		this.shftHour2 = shftHour2;
		this.shftHour3 = shftHour3;
		this.shftHour4 = shftHour4;
		this.shftPat2 = shftPat2;
		this.shftPat3 = shftPat3;
		this.shftPat4 = shftPat4;
		this.shftPat1 = shftPat1;
		this.shftLoad1 = shftLoad1;
		this.shftLoad2 = shftLoad2;
		this.shftLoad3 = shftLoad3;
		this.shftLoad4 = shftLoad4;
		this.shftUser1 = shftUser1;
		this.shftUser2 = shftUser2;
		this.shftChr01 = shftChr01;
		this.shftChr02 = shftChr02;
		this.shftChr03 = shftChr03;
		this.shftChr04 = shftChr04;
		this.shftChr05 = shftChr05;
		this.shftDec01 = shftDec01;
		this.shftDec02 = shftDec02;
		this.shftDec03 = shftDec03;
		this.shftDec04 = shftDec04;
		this.shftLog01 = shftLog01;
		this.oidShftDet = oidShftDet;
	}

	// Property accessors

	public ShftDetId getId() {
		return this.id;
	}

	public void setId(ShftDetId id) {
		this.id = id;
	}

	public Double getShftStart1() {
		return this.shftStart1;
	}

	public void setShftStart1(Double shftStart1) {
		this.shftStart1 = shftStart1;
	}

	public Double getShftStart2() {
		return this.shftStart2;
	}

	public void setShftStart2(Double shftStart2) {
		this.shftStart2 = shftStart2;
	}

	public Double getShftStart3() {
		return this.shftStart3;
	}

	public void setShftStart3(Double shftStart3) {
		this.shftStart3 = shftStart3;
	}

	public Double getShftStart4() {
		return this.shftStart4;
	}

	public void setShftStart4(Double shftStart4) {
		this.shftStart4 = shftStart4;
	}

	public Double getShftHour1() {
		return this.shftHour1;
	}

	public void setShftHour1(Double shftHour1) {
		this.shftHour1 = shftHour1;
	}

	public Double getShftHour2() {
		return this.shftHour2;
	}

	public void setShftHour2(Double shftHour2) {
		this.shftHour2 = shftHour2;
	}

	public Double getShftHour3() {
		return this.shftHour3;
	}

	public void setShftHour3(Double shftHour3) {
		this.shftHour3 = shftHour3;
	}

	public Double getShftHour4() {
		return this.shftHour4;
	}

	public void setShftHour4(Double shftHour4) {
		this.shftHour4 = shftHour4;
	}

	public String getShftPat2() {
		return this.shftPat2;
	}

	public void setShftPat2(String shftPat2) {
		this.shftPat2 = shftPat2;
	}

	public String getShftPat3() {
		return this.shftPat3;
	}

	public void setShftPat3(String shftPat3) {
		this.shftPat3 = shftPat3;
	}

	public String getShftPat4() {
		return this.shftPat4;
	}

	public void setShftPat4(String shftPat4) {
		this.shftPat4 = shftPat4;
	}

	public String getShftPat1() {
		return this.shftPat1;
	}

	public void setShftPat1(String shftPat1) {
		this.shftPat1 = shftPat1;
	}

	public Double getShftLoad1() {
		return this.shftLoad1;
	}

	public void setShftLoad1(Double shftLoad1) {
		this.shftLoad1 = shftLoad1;
	}

	public Double getShftLoad2() {
		return this.shftLoad2;
	}

	public void setShftLoad2(Double shftLoad2) {
		this.shftLoad2 = shftLoad2;
	}

	public Double getShftLoad3() {
		return this.shftLoad3;
	}

	public void setShftLoad3(Double shftLoad3) {
		this.shftLoad3 = shftLoad3;
	}

	public Double getShftLoad4() {
		return this.shftLoad4;
	}

	public void setShftLoad4(Double shftLoad4) {
		this.shftLoad4 = shftLoad4;
	}

	public String getShftUser1() {
		return this.shftUser1;
	}

	public void setShftUser1(String shftUser1) {
		this.shftUser1 = shftUser1;
	}

	public String getShftUser2() {
		return this.shftUser2;
	}

	public void setShftUser2(String shftUser2) {
		this.shftUser2 = shftUser2;
	}

	public String getShftChr01() {
		return this.shftChr01;
	}

	public void setShftChr01(String shftChr01) {
		this.shftChr01 = shftChr01;
	}

	public String getShftChr02() {
		return this.shftChr02;
	}

	public void setShftChr02(String shftChr02) {
		this.shftChr02 = shftChr02;
	}

	public String getShftChr03() {
		return this.shftChr03;
	}

	public void setShftChr03(String shftChr03) {
		this.shftChr03 = shftChr03;
	}

	public String getShftChr04() {
		return this.shftChr04;
	}

	public void setShftChr04(String shftChr04) {
		this.shftChr04 = shftChr04;
	}

	public String getShftChr05() {
		return this.shftChr05;
	}

	public void setShftChr05(String shftChr05) {
		this.shftChr05 = shftChr05;
	}

	public Double getShftDec01() {
		return this.shftDec01;
	}

	public void setShftDec01(Double shftDec01) {
		this.shftDec01 = shftDec01;
	}

	public Double getShftDec02() {
		return this.shftDec02;
	}

	public void setShftDec02(Double shftDec02) {
		this.shftDec02 = shftDec02;
	}

	public Double getShftDec03() {
		return this.shftDec03;
	}

	public void setShftDec03(Double shftDec03) {
		this.shftDec03 = shftDec03;
	}

	public Double getShftDec04() {
		return this.shftDec04;
	}

	public void setShftDec04(Double shftDec04) {
		this.shftDec04 = shftDec04;
	}

	public Boolean getShftLog01() {
		return this.shftLog01;
	}

	public void setShftLog01(Boolean shftLog01) {
		this.shftLog01 = shftLog01;
	}

	public Double getOidShftDet() {
		return this.oidShftDet;
	}

	public void setOidShftDet(Double oidShftDet) {
		this.oidShftDet = oidShftDet;
	}

}