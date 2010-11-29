package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFhMstr entity provides the base persistence definition of the FhMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFhMstr implements java.io.Serializable {

	// Fields

	private FhMstrId id;
	private Double fhFcstPct;
	private String fhRlupPct;
	private Date fhModDate;
	private String fhModUserid;
	private String fhUser1;
	private String fhUser2;
	private String fhRmks;
	private String fhQadc01;
	private Double oidFhMstr;

	// Constructors

	/** default constructor */
	public AbstractFhMstr() {
	}

	/** minimal constructor */
	public AbstractFhMstr(FhMstrId id, Double oidFhMstr) {
		this.id = id;
		this.oidFhMstr = oidFhMstr;
	}

	/** full constructor */
	public AbstractFhMstr(FhMstrId id, Double fhFcstPct, String fhRlupPct,
			Date fhModDate, String fhModUserid, String fhUser1, String fhUser2,
			String fhRmks, String fhQadc01, Double oidFhMstr) {
		this.id = id;
		this.fhFcstPct = fhFcstPct;
		this.fhRlupPct = fhRlupPct;
		this.fhModDate = fhModDate;
		this.fhModUserid = fhModUserid;
		this.fhUser1 = fhUser1;
		this.fhUser2 = fhUser2;
		this.fhRmks = fhRmks;
		this.fhQadc01 = fhQadc01;
		this.oidFhMstr = oidFhMstr;
	}

	// Property accessors

	public FhMstrId getId() {
		return this.id;
	}

	public void setId(FhMstrId id) {
		this.id = id;
	}

	public Double getFhFcstPct() {
		return this.fhFcstPct;
	}

	public void setFhFcstPct(Double fhFcstPct) {
		this.fhFcstPct = fhFcstPct;
	}

	public String getFhRlupPct() {
		return this.fhRlupPct;
	}

	public void setFhRlupPct(String fhRlupPct) {
		this.fhRlupPct = fhRlupPct;
	}

	public Date getFhModDate() {
		return this.fhModDate;
	}

	public void setFhModDate(Date fhModDate) {
		this.fhModDate = fhModDate;
	}

	public String getFhModUserid() {
		return this.fhModUserid;
	}

	public void setFhModUserid(String fhModUserid) {
		this.fhModUserid = fhModUserid;
	}

	public String getFhUser1() {
		return this.fhUser1;
	}

	public void setFhUser1(String fhUser1) {
		this.fhUser1 = fhUser1;
	}

	public String getFhUser2() {
		return this.fhUser2;
	}

	public void setFhUser2(String fhUser2) {
		this.fhUser2 = fhUser2;
	}

	public String getFhRmks() {
		return this.fhRmks;
	}

	public void setFhRmks(String fhRmks) {
		this.fhRmks = fhRmks;
	}

	public String getFhQadc01() {
		return this.fhQadc01;
	}

	public void setFhQadc01(String fhQadc01) {
		this.fhQadc01 = fhQadc01;
	}

	public Double getOidFhMstr() {
		return this.oidFhMstr;
	}

	public void setOidFhMstr(Double oidFhMstr) {
		this.oidFhMstr = oidFhMstr;
	}

}