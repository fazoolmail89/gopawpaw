package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEgaMstr entity provides the base persistence definition of the
 * EgaMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgaMstr implements java.io.Serializable {

	// Fields

	private EgaMstrId id;
	private String egaAvailHours;
	private String egaHours;
	private String egaCalls;
	private String egaUser1;
	private String egaUser2;
	private Integer egaInt01;
	private Integer egaQadi01;
	private Double egaDec01;
	private Double egaQade01;
	private Boolean egaLog01;
	private Boolean egaQadl01;
	private Double oidEgaMstr;

	// Constructors

	/** default constructor */
	public AbstractEgaMstr() {
	}

	/** minimal constructor */
	public AbstractEgaMstr(EgaMstrId id, Double oidEgaMstr) {
		this.id = id;
		this.oidEgaMstr = oidEgaMstr;
	}

	/** full constructor */
	public AbstractEgaMstr(EgaMstrId id, String egaAvailHours, String egaHours,
			String egaCalls, String egaUser1, String egaUser2,
			Integer egaInt01, Integer egaQadi01, Double egaDec01,
			Double egaQade01, Boolean egaLog01, Boolean egaQadl01,
			Double oidEgaMstr) {
		this.id = id;
		this.egaAvailHours = egaAvailHours;
		this.egaHours = egaHours;
		this.egaCalls = egaCalls;
		this.egaUser1 = egaUser1;
		this.egaUser2 = egaUser2;
		this.egaInt01 = egaInt01;
		this.egaQadi01 = egaQadi01;
		this.egaDec01 = egaDec01;
		this.egaQade01 = egaQade01;
		this.egaLog01 = egaLog01;
		this.egaQadl01 = egaQadl01;
		this.oidEgaMstr = oidEgaMstr;
	}

	// Property accessors

	public EgaMstrId getId() {
		return this.id;
	}

	public void setId(EgaMstrId id) {
		this.id = id;
	}

	public String getEgaAvailHours() {
		return this.egaAvailHours;
	}

	public void setEgaAvailHours(String egaAvailHours) {
		this.egaAvailHours = egaAvailHours;
	}

	public String getEgaHours() {
		return this.egaHours;
	}

	public void setEgaHours(String egaHours) {
		this.egaHours = egaHours;
	}

	public String getEgaCalls() {
		return this.egaCalls;
	}

	public void setEgaCalls(String egaCalls) {
		this.egaCalls = egaCalls;
	}

	public String getEgaUser1() {
		return this.egaUser1;
	}

	public void setEgaUser1(String egaUser1) {
		this.egaUser1 = egaUser1;
	}

	public String getEgaUser2() {
		return this.egaUser2;
	}

	public void setEgaUser2(String egaUser2) {
		this.egaUser2 = egaUser2;
	}

	public Integer getEgaInt01() {
		return this.egaInt01;
	}

	public void setEgaInt01(Integer egaInt01) {
		this.egaInt01 = egaInt01;
	}

	public Integer getEgaQadi01() {
		return this.egaQadi01;
	}

	public void setEgaQadi01(Integer egaQadi01) {
		this.egaQadi01 = egaQadi01;
	}

	public Double getEgaDec01() {
		return this.egaDec01;
	}

	public void setEgaDec01(Double egaDec01) {
		this.egaDec01 = egaDec01;
	}

	public Double getEgaQade01() {
		return this.egaQade01;
	}

	public void setEgaQade01(Double egaQade01) {
		this.egaQade01 = egaQade01;
	}

	public Boolean getEgaLog01() {
		return this.egaLog01;
	}

	public void setEgaLog01(Boolean egaLog01) {
		this.egaLog01 = egaLog01;
	}

	public Boolean getEgaQadl01() {
		return this.egaQadl01;
	}

	public void setEgaQadl01(Boolean egaQadl01) {
		this.egaQadl01 = egaQadl01;
	}

	public Double getOidEgaMstr() {
		return this.oidEgaMstr;
	}

	public void setOidEgaMstr(Double oidEgaMstr) {
		this.oidEgaMstr = oidEgaMstr;
	}

}