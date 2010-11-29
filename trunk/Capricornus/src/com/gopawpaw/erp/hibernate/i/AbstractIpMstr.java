package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIpMstr entity provides the base persistence definition of the IpMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIpMstr implements java.io.Serializable {

	// Fields

	private IpMstrId id;
	private String ipNbr;
	private String ipUser1;
	private String ipUser2;
	private String ipChr01;
	private String ipChr02;
	private String ipChr03;
	private String ipChr04;
	private String ipChr05;
	private Double ipDec01;
	private Double ipDec02;
	private Double oidIpMstr;

	// Constructors

	/** default constructor */
	public AbstractIpMstr() {
	}

	/** minimal constructor */
	public AbstractIpMstr(IpMstrId id, Double oidIpMstr) {
		this.id = id;
		this.oidIpMstr = oidIpMstr;
	}

	/** full constructor */
	public AbstractIpMstr(IpMstrId id, String ipNbr, String ipUser1,
			String ipUser2, String ipChr01, String ipChr02, String ipChr03,
			String ipChr04, String ipChr05, Double ipDec01, Double ipDec02,
			Double oidIpMstr) {
		this.id = id;
		this.ipNbr = ipNbr;
		this.ipUser1 = ipUser1;
		this.ipUser2 = ipUser2;
		this.ipChr01 = ipChr01;
		this.ipChr02 = ipChr02;
		this.ipChr03 = ipChr03;
		this.ipChr04 = ipChr04;
		this.ipChr05 = ipChr05;
		this.ipDec01 = ipDec01;
		this.ipDec02 = ipDec02;
		this.oidIpMstr = oidIpMstr;
	}

	// Property accessors

	public IpMstrId getId() {
		return this.id;
	}

	public void setId(IpMstrId id) {
		this.id = id;
	}

	public String getIpNbr() {
		return this.ipNbr;
	}

	public void setIpNbr(String ipNbr) {
		this.ipNbr = ipNbr;
	}

	public String getIpUser1() {
		return this.ipUser1;
	}

	public void setIpUser1(String ipUser1) {
		this.ipUser1 = ipUser1;
	}

	public String getIpUser2() {
		return this.ipUser2;
	}

	public void setIpUser2(String ipUser2) {
		this.ipUser2 = ipUser2;
	}

	public String getIpChr01() {
		return this.ipChr01;
	}

	public void setIpChr01(String ipChr01) {
		this.ipChr01 = ipChr01;
	}

	public String getIpChr02() {
		return this.ipChr02;
	}

	public void setIpChr02(String ipChr02) {
		this.ipChr02 = ipChr02;
	}

	public String getIpChr03() {
		return this.ipChr03;
	}

	public void setIpChr03(String ipChr03) {
		this.ipChr03 = ipChr03;
	}

	public String getIpChr04() {
		return this.ipChr04;
	}

	public void setIpChr04(String ipChr04) {
		this.ipChr04 = ipChr04;
	}

	public String getIpChr05() {
		return this.ipChr05;
	}

	public void setIpChr05(String ipChr05) {
		this.ipChr05 = ipChr05;
	}

	public Double getIpDec01() {
		return this.ipDec01;
	}

	public void setIpDec01(Double ipDec01) {
		this.ipDec01 = ipDec01;
	}

	public Double getIpDec02() {
		return this.ipDec02;
	}

	public void setIpDec02(Double ipDec02) {
		this.ipDec02 = ipDec02;
	}

	public Double getOidIpMstr() {
		return this.oidIpMstr;
	}

	public void setOidIpMstr(Double oidIpMstr) {
		this.oidIpMstr = oidIpMstr;
	}

}