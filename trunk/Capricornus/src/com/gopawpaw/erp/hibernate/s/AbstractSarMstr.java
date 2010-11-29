package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSarMstr entity provides the base persistence definition of the
 * SarMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSarMstr implements java.io.Serializable {

	// Fields

	private SarMstrId id;
	private String sarQadc01;
	private String sarChr01;
	private String sarChr02;
	private String sarChr03;
	private Double sarDec01;
	private Double sarDec02;
	private Date sarDte01;
	private Date sarDte02;
	private Boolean sarLog01;
	private Boolean sarLog02;
	private String sarPart;
	private String sarUser1;
	private String sarUser2;
	private Double oidSarMstr;

	// Constructors

	/** default constructor */
	public AbstractSarMstr() {
	}

	/** minimal constructor */
	public AbstractSarMstr(SarMstrId id, Double oidSarMstr) {
		this.id = id;
		this.oidSarMstr = oidSarMstr;
	}

	/** full constructor */
	public AbstractSarMstr(SarMstrId id, String sarQadc01, String sarChr01,
			String sarChr02, String sarChr03, Double sarDec01, Double sarDec02,
			Date sarDte01, Date sarDte02, Boolean sarLog01, Boolean sarLog02,
			String sarPart, String sarUser1, String sarUser2, Double oidSarMstr) {
		this.id = id;
		this.sarQadc01 = sarQadc01;
		this.sarChr01 = sarChr01;
		this.sarChr02 = sarChr02;
		this.sarChr03 = sarChr03;
		this.sarDec01 = sarDec01;
		this.sarDec02 = sarDec02;
		this.sarDte01 = sarDte01;
		this.sarDte02 = sarDte02;
		this.sarLog01 = sarLog01;
		this.sarLog02 = sarLog02;
		this.sarPart = sarPart;
		this.sarUser1 = sarUser1;
		this.sarUser2 = sarUser2;
		this.oidSarMstr = oidSarMstr;
	}

	// Property accessors

	public SarMstrId getId() {
		return this.id;
	}

	public void setId(SarMstrId id) {
		this.id = id;
	}

	public String getSarQadc01() {
		return this.sarQadc01;
	}

	public void setSarQadc01(String sarQadc01) {
		this.sarQadc01 = sarQadc01;
	}

	public String getSarChr01() {
		return this.sarChr01;
	}

	public void setSarChr01(String sarChr01) {
		this.sarChr01 = sarChr01;
	}

	public String getSarChr02() {
		return this.sarChr02;
	}

	public void setSarChr02(String sarChr02) {
		this.sarChr02 = sarChr02;
	}

	public String getSarChr03() {
		return this.sarChr03;
	}

	public void setSarChr03(String sarChr03) {
		this.sarChr03 = sarChr03;
	}

	public Double getSarDec01() {
		return this.sarDec01;
	}

	public void setSarDec01(Double sarDec01) {
		this.sarDec01 = sarDec01;
	}

	public Double getSarDec02() {
		return this.sarDec02;
	}

	public void setSarDec02(Double sarDec02) {
		this.sarDec02 = sarDec02;
	}

	public Date getSarDte01() {
		return this.sarDte01;
	}

	public void setSarDte01(Date sarDte01) {
		this.sarDte01 = sarDte01;
	}

	public Date getSarDte02() {
		return this.sarDte02;
	}

	public void setSarDte02(Date sarDte02) {
		this.sarDte02 = sarDte02;
	}

	public Boolean getSarLog01() {
		return this.sarLog01;
	}

	public void setSarLog01(Boolean sarLog01) {
		this.sarLog01 = sarLog01;
	}

	public Boolean getSarLog02() {
		return this.sarLog02;
	}

	public void setSarLog02(Boolean sarLog02) {
		this.sarLog02 = sarLog02;
	}

	public String getSarPart() {
		return this.sarPart;
	}

	public void setSarPart(String sarPart) {
		this.sarPart = sarPart;
	}

	public String getSarUser1() {
		return this.sarUser1;
	}

	public void setSarUser1(String sarUser1) {
		this.sarUser1 = sarUser1;
	}

	public String getSarUser2() {
		return this.sarUser2;
	}

	public void setSarUser2(String sarUser2) {
		this.sarUser2 = sarUser2;
	}

	public Double getOidSarMstr() {
		return this.oidSarMstr;
	}

	public void setOidSarMstr(Double oidSarMstr) {
		this.oidSarMstr = oidSarMstr;
	}

}