package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcaMstr entity provides the base persistence definition of the
 * EcaMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcaMstr implements java.io.Serializable {

	// Fields

	private EcaMstrId id;
	private Integer ecaSeq;
	private Integer ecaReroute;
	private Boolean ecaQad01;
	private Date ecaQad02;
	private String ecaQad03;
	private String ecaQad04;
	private String ecaQad05;
	private Date ecaModDate;
	private String ecaUserid;
	private String ecaUser1;
	private String ecaUser2;
	private Double oidEcaMstr;

	// Constructors

	/** default constructor */
	public AbstractEcaMstr() {
	}

	/** minimal constructor */
	public AbstractEcaMstr(EcaMstrId id, Double oidEcaMstr) {
		this.id = id;
		this.oidEcaMstr = oidEcaMstr;
	}

	/** full constructor */
	public AbstractEcaMstr(EcaMstrId id, Integer ecaSeq, Integer ecaReroute,
			Boolean ecaQad01, Date ecaQad02, String ecaQad03, String ecaQad04,
			String ecaQad05, Date ecaModDate, String ecaUserid,
			String ecaUser1, String ecaUser2, Double oidEcaMstr) {
		this.id = id;
		this.ecaSeq = ecaSeq;
		this.ecaReroute = ecaReroute;
		this.ecaQad01 = ecaQad01;
		this.ecaQad02 = ecaQad02;
		this.ecaQad03 = ecaQad03;
		this.ecaQad04 = ecaQad04;
		this.ecaQad05 = ecaQad05;
		this.ecaModDate = ecaModDate;
		this.ecaUserid = ecaUserid;
		this.ecaUser1 = ecaUser1;
		this.ecaUser2 = ecaUser2;
		this.oidEcaMstr = oidEcaMstr;
	}

	// Property accessors

	public EcaMstrId getId() {
		return this.id;
	}

	public void setId(EcaMstrId id) {
		this.id = id;
	}

	public Integer getEcaSeq() {
		return this.ecaSeq;
	}

	public void setEcaSeq(Integer ecaSeq) {
		this.ecaSeq = ecaSeq;
	}

	public Integer getEcaReroute() {
		return this.ecaReroute;
	}

	public void setEcaReroute(Integer ecaReroute) {
		this.ecaReroute = ecaReroute;
	}

	public Boolean getEcaQad01() {
		return this.ecaQad01;
	}

	public void setEcaQad01(Boolean ecaQad01) {
		this.ecaQad01 = ecaQad01;
	}

	public Date getEcaQad02() {
		return this.ecaQad02;
	}

	public void setEcaQad02(Date ecaQad02) {
		this.ecaQad02 = ecaQad02;
	}

	public String getEcaQad03() {
		return this.ecaQad03;
	}

	public void setEcaQad03(String ecaQad03) {
		this.ecaQad03 = ecaQad03;
	}

	public String getEcaQad04() {
		return this.ecaQad04;
	}

	public void setEcaQad04(String ecaQad04) {
		this.ecaQad04 = ecaQad04;
	}

	public String getEcaQad05() {
		return this.ecaQad05;
	}

	public void setEcaQad05(String ecaQad05) {
		this.ecaQad05 = ecaQad05;
	}

	public Date getEcaModDate() {
		return this.ecaModDate;
	}

	public void setEcaModDate(Date ecaModDate) {
		this.ecaModDate = ecaModDate;
	}

	public String getEcaUserid() {
		return this.ecaUserid;
	}

	public void setEcaUserid(String ecaUserid) {
		this.ecaUserid = ecaUserid;
	}

	public String getEcaUser1() {
		return this.ecaUser1;
	}

	public void setEcaUser1(String ecaUser1) {
		this.ecaUser1 = ecaUser1;
	}

	public String getEcaUser2() {
		return this.ecaUser2;
	}

	public void setEcaUser2(String ecaUser2) {
		this.ecaUser2 = ecaUser2;
	}

	public Double getOidEcaMstr() {
		return this.oidEcaMstr;
	}

	public void setOidEcaMstr(Double oidEcaMstr) {
		this.oidEcaMstr = oidEcaMstr;
	}

}