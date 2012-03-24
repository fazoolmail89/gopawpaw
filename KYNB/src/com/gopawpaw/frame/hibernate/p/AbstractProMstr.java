package com.gopawpaw.frame.hibernate.p;

import java.sql.Timestamp;

/**
 * AbstractProMstr entity provides the base persistence definition of the
 * ProMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProMstr implements java.io.Serializable {

	// Fields

	private ProMstrId id;
	private String proName;
	private String proMd5;
	private Timestamp proMdate;

	// Constructors

	/** default constructor */
	public AbstractProMstr() {
	}

	/** minimal constructor */
	public AbstractProMstr(ProMstrId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractProMstr(ProMstrId id, String proName, String proMd5,
			Timestamp proMdate) {
		this.id = id;
		this.proName = proName;
		this.proMd5 = proMd5;
		this.proMdate = proMdate;
	}

	// Property accessors

	public ProMstrId getId() {
		return this.id;
	}

	public void setId(ProMstrId id) {
		this.id = id;
	}

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProMd5() {
		return this.proMd5;
	}

	public void setProMd5(String proMd5) {
		this.proMd5 = proMd5;
	}

	public Timestamp getProMdate() {
		return this.proMdate;
	}

	public void setProMdate(Timestamp proMdate) {
		this.proMdate = proMdate;
	}

}