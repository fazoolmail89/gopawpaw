package com.gopawpaw.erp.hibernate.q;

/**
 * AbstractQcsMstr entity provides the base persistence definition of the
 * QcsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQcsMstr implements java.io.Serializable {

	// Fields

	private QcsMstrId id;
	private Integer qcsLotInt;
	private Integer qcsDays;
	private String qcsUser1;
	private String qcsUser2;
	private String qcsChr01;
	private String qcsChr02;
	private String qcsChr03;
	private String qcsChr04;
	private String qcsChr05;
	private Double oidQcsMstr;

	// Constructors

	/** default constructor */
	public AbstractQcsMstr() {
	}

	/** minimal constructor */
	public AbstractQcsMstr(QcsMstrId id, Double oidQcsMstr) {
		this.id = id;
		this.oidQcsMstr = oidQcsMstr;
	}

	/** full constructor */
	public AbstractQcsMstr(QcsMstrId id, Integer qcsLotInt, Integer qcsDays,
			String qcsUser1, String qcsUser2, String qcsChr01, String qcsChr02,
			String qcsChr03, String qcsChr04, String qcsChr05, Double oidQcsMstr) {
		this.id = id;
		this.qcsLotInt = qcsLotInt;
		this.qcsDays = qcsDays;
		this.qcsUser1 = qcsUser1;
		this.qcsUser2 = qcsUser2;
		this.qcsChr01 = qcsChr01;
		this.qcsChr02 = qcsChr02;
		this.qcsChr03 = qcsChr03;
		this.qcsChr04 = qcsChr04;
		this.qcsChr05 = qcsChr05;
		this.oidQcsMstr = oidQcsMstr;
	}

	// Property accessors

	public QcsMstrId getId() {
		return this.id;
	}

	public void setId(QcsMstrId id) {
		this.id = id;
	}

	public Integer getQcsLotInt() {
		return this.qcsLotInt;
	}

	public void setQcsLotInt(Integer qcsLotInt) {
		this.qcsLotInt = qcsLotInt;
	}

	public Integer getQcsDays() {
		return this.qcsDays;
	}

	public void setQcsDays(Integer qcsDays) {
		this.qcsDays = qcsDays;
	}

	public String getQcsUser1() {
		return this.qcsUser1;
	}

	public void setQcsUser1(String qcsUser1) {
		this.qcsUser1 = qcsUser1;
	}

	public String getQcsUser2() {
		return this.qcsUser2;
	}

	public void setQcsUser2(String qcsUser2) {
		this.qcsUser2 = qcsUser2;
	}

	public String getQcsChr01() {
		return this.qcsChr01;
	}

	public void setQcsChr01(String qcsChr01) {
		this.qcsChr01 = qcsChr01;
	}

	public String getQcsChr02() {
		return this.qcsChr02;
	}

	public void setQcsChr02(String qcsChr02) {
		this.qcsChr02 = qcsChr02;
	}

	public String getQcsChr03() {
		return this.qcsChr03;
	}

	public void setQcsChr03(String qcsChr03) {
		this.qcsChr03 = qcsChr03;
	}

	public String getQcsChr04() {
		return this.qcsChr04;
	}

	public void setQcsChr04(String qcsChr04) {
		this.qcsChr04 = qcsChr04;
	}

	public String getQcsChr05() {
		return this.qcsChr05;
	}

	public void setQcsChr05(String qcsChr05) {
		this.qcsChr05 = qcsChr05;
	}

	public Double getOidQcsMstr() {
		return this.oidQcsMstr;
	}

	public void setOidQcsMstr(Double oidQcsMstr) {
		this.oidQcsMstr = oidQcsMstr;
	}

}