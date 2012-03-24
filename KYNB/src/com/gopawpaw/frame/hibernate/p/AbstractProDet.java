package com.gopawpaw.frame.hibernate.p;

import java.sql.Timestamp;

/**
 * AbstractProDet entity provides the base persistence definition of the ProDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractProDet implements java.io.Serializable {

	// Fields

	private String proComSerial;
	private String proComName;
	private String proComObject;
	private String proComParSerial;
	private String proSerial;
	private Timestamp proMdate;

	// Constructors

	/** default constructor */
	public AbstractProDet() {
	}

	/** minimal constructor */
	public AbstractProDet(String proComParSerial, String proSerial) {
		this.proComParSerial = proComParSerial;
		this.proSerial = proSerial;
	}

	/** full constructor */
	public AbstractProDet(String proComName, String proComObject,
			String proComParSerial, String proSerial, Timestamp proMdate) {
		this.proComName = proComName;
		this.proComObject = proComObject;
		this.proComParSerial = proComParSerial;
		this.proSerial = proSerial;
		this.proMdate = proMdate;
	}

	// Property accessors

	public String getProComSerial() {
		return this.proComSerial;
	}

	public void setProComSerial(String proComSerial) {
		this.proComSerial = proComSerial;
	}

	public String getProComName() {
		return this.proComName;
	}

	public void setProComName(String proComName) {
		this.proComName = proComName;
	}

	public String getProComObject() {
		return this.proComObject;
	}

	public void setProComObject(String proComObject) {
		this.proComObject = proComObject;
	}

	public String getProComParSerial() {
		return this.proComParSerial;
	}

	public void setProComParSerial(String proComParSerial) {
		this.proComParSerial = proComParSerial;
	}

	public String getProSerial() {
		return this.proSerial;
	}

	public void setProSerial(String proSerial) {
		this.proSerial = proSerial;
	}

	public Timestamp getProMdate() {
		return this.proMdate;
	}

	public void setProMdate(Timestamp proMdate) {
		this.proMdate = proMdate;
	}

}