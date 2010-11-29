package com.gopawpaw.erp.hibernate.w;

/**
 * AbstractWcrRoute entity provides the base persistence definition of the
 * WcrRoute entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractWcrRoute implements java.io.Serializable {

	// Fields

	private WcrRouteId id;
	private Integer wcrRate;
	private String wcrUser1;
	private String wcrUser2;
	private String wcrQadc01;
	private Double oidWcrRoute;

	// Constructors

	/** default constructor */
	public AbstractWcrRoute() {
	}

	/** minimal constructor */
	public AbstractWcrRoute(WcrRouteId id, Double oidWcrRoute) {
		this.id = id;
		this.oidWcrRoute = oidWcrRoute;
	}

	/** full constructor */
	public AbstractWcrRoute(WcrRouteId id, Integer wcrRate, String wcrUser1,
			String wcrUser2, String wcrQadc01, Double oidWcrRoute) {
		this.id = id;
		this.wcrRate = wcrRate;
		this.wcrUser1 = wcrUser1;
		this.wcrUser2 = wcrUser2;
		this.wcrQadc01 = wcrQadc01;
		this.oidWcrRoute = oidWcrRoute;
	}

	// Property accessors

	public WcrRouteId getId() {
		return this.id;
	}

	public void setId(WcrRouteId id) {
		this.id = id;
	}

	public Integer getWcrRate() {
		return this.wcrRate;
	}

	public void setWcrRate(Integer wcrRate) {
		this.wcrRate = wcrRate;
	}

	public String getWcrUser1() {
		return this.wcrUser1;
	}

	public void setWcrUser1(String wcrUser1) {
		this.wcrUser1 = wcrUser1;
	}

	public String getWcrUser2() {
		return this.wcrUser2;
	}

	public void setWcrUser2(String wcrUser2) {
		this.wcrUser2 = wcrUser2;
	}

	public String getWcrQadc01() {
		return this.wcrQadc01;
	}

	public void setWcrQadc01(String wcrQadc01) {
		this.wcrQadc01 = wcrQadc01;
	}

	public Double getOidWcrRoute() {
		return this.oidWcrRoute;
	}

	public void setOidWcrRoute(Double oidWcrRoute) {
		this.oidWcrRoute = oidWcrRoute;
	}

}