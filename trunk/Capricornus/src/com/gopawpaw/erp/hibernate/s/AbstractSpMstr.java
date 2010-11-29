package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSpMstr entity provides the base persistence definition of the SpMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSpMstr implements java.io.Serializable {

	// Fields

	private SpMstrId id;
	private String spTerritory;
	private Double spCommPct;
	private String spSort;
	private String spUser1;
	private String spUser2;
	private String spChr01;
	private String spChr02;
	private String spChr03;
	private String spChr04;
	private String spChr05;
	private Date spDte01;
	private Date spDte02;
	private Double spDec01;
	private Double spDec02;
	private Boolean spLog01;
	private Double oidSpMstr;

	// Constructors

	/** default constructor */
	public AbstractSpMstr() {
	}

	/** minimal constructor */
	public AbstractSpMstr(SpMstrId id, Double oidSpMstr) {
		this.id = id;
		this.oidSpMstr = oidSpMstr;
	}

	/** full constructor */
	public AbstractSpMstr(SpMstrId id, String spTerritory, Double spCommPct,
			String spSort, String spUser1, String spUser2, String spChr01,
			String spChr02, String spChr03, String spChr04, String spChr05,
			Date spDte01, Date spDte02, Double spDec01, Double spDec02,
			Boolean spLog01, Double oidSpMstr) {
		this.id = id;
		this.spTerritory = spTerritory;
		this.spCommPct = spCommPct;
		this.spSort = spSort;
		this.spUser1 = spUser1;
		this.spUser2 = spUser2;
		this.spChr01 = spChr01;
		this.spChr02 = spChr02;
		this.spChr03 = spChr03;
		this.spChr04 = spChr04;
		this.spChr05 = spChr05;
		this.spDte01 = spDte01;
		this.spDte02 = spDte02;
		this.spDec01 = spDec01;
		this.spDec02 = spDec02;
		this.spLog01 = spLog01;
		this.oidSpMstr = oidSpMstr;
	}

	// Property accessors

	public SpMstrId getId() {
		return this.id;
	}

	public void setId(SpMstrId id) {
		this.id = id;
	}

	public String getSpTerritory() {
		return this.spTerritory;
	}

	public void setSpTerritory(String spTerritory) {
		this.spTerritory = spTerritory;
	}

	public Double getSpCommPct() {
		return this.spCommPct;
	}

	public void setSpCommPct(Double spCommPct) {
		this.spCommPct = spCommPct;
	}

	public String getSpSort() {
		return this.spSort;
	}

	public void setSpSort(String spSort) {
		this.spSort = spSort;
	}

	public String getSpUser1() {
		return this.spUser1;
	}

	public void setSpUser1(String spUser1) {
		this.spUser1 = spUser1;
	}

	public String getSpUser2() {
		return this.spUser2;
	}

	public void setSpUser2(String spUser2) {
		this.spUser2 = spUser2;
	}

	public String getSpChr01() {
		return this.spChr01;
	}

	public void setSpChr01(String spChr01) {
		this.spChr01 = spChr01;
	}

	public String getSpChr02() {
		return this.spChr02;
	}

	public void setSpChr02(String spChr02) {
		this.spChr02 = spChr02;
	}

	public String getSpChr03() {
		return this.spChr03;
	}

	public void setSpChr03(String spChr03) {
		this.spChr03 = spChr03;
	}

	public String getSpChr04() {
		return this.spChr04;
	}

	public void setSpChr04(String spChr04) {
		this.spChr04 = spChr04;
	}

	public String getSpChr05() {
		return this.spChr05;
	}

	public void setSpChr05(String spChr05) {
		this.spChr05 = spChr05;
	}

	public Date getSpDte01() {
		return this.spDte01;
	}

	public void setSpDte01(Date spDte01) {
		this.spDte01 = spDte01;
	}

	public Date getSpDte02() {
		return this.spDte02;
	}

	public void setSpDte02(Date spDte02) {
		this.spDte02 = spDte02;
	}

	public Double getSpDec01() {
		return this.spDec01;
	}

	public void setSpDec01(Double spDec01) {
		this.spDec01 = spDec01;
	}

	public Double getSpDec02() {
		return this.spDec02;
	}

	public void setSpDec02(Double spDec02) {
		this.spDec02 = spDec02;
	}

	public Boolean getSpLog01() {
		return this.spLog01;
	}

	public void setSpLog01(Boolean spLog01) {
		this.spLog01 = spLog01;
	}

	public Double getOidSpMstr() {
		return this.oidSpMstr;
	}

	public void setOidSpMstr(Double oidSpMstr) {
		this.oidSpMstr = oidSpMstr;
	}

}