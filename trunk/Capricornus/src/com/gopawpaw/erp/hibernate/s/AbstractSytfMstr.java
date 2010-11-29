package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSytfMstr entity provides the base persistence definition of the
 * SytfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSytfMstr implements java.io.Serializable {

	// Fields

	private SytfMstrId id;
	private Boolean sytfReqdAdd;
	private Boolean sytfReqdChgdel;
	private String sytfModUserid;
	private Date sytfModDate;
	private String sytfUser1;
	private String sytfUser2;
	private String sytfChr01;
	private String sytfChr02;
	private Double sytfDec01;
	private Double sytfDec02;
	private Integer sytfInt01;
	private Integer sytfInt02;
	private Boolean sytfLog01;
	private Boolean sytfLog02;
	private Date sytfDte01;
	private Date sytfDte02;
	private String sytfQadc01;
	private String sytfQadc02;
	private String sytfQadc03;
	private String sytfQadc04;
	private Double sytfQadd01;
	private Double sytfQadd02;
	private Integer sytfQadi01;
	private Integer sytfQadi02;
	private Boolean sytfQadl01;
	private Boolean sytfQadl02;
	private Date sytfQadt01;
	private Date sytfQadt02;
	private Double oidSytfMstr;

	// Constructors

	/** default constructor */
	public AbstractSytfMstr() {
	}

	/** minimal constructor */
	public AbstractSytfMstr(SytfMstrId id, Double oidSytfMstr) {
		this.id = id;
		this.oidSytfMstr = oidSytfMstr;
	}

	/** full constructor */
	public AbstractSytfMstr(SytfMstrId id, Boolean sytfReqdAdd,
			Boolean sytfReqdChgdel, String sytfModUserid, Date sytfModDate,
			String sytfUser1, String sytfUser2, String sytfChr01,
			String sytfChr02, Double sytfDec01, Double sytfDec02,
			Integer sytfInt01, Integer sytfInt02, Boolean sytfLog01,
			Boolean sytfLog02, Date sytfDte01, Date sytfDte02,
			String sytfQadc01, String sytfQadc02, String sytfQadc03,
			String sytfQadc04, Double sytfQadd01, Double sytfQadd02,
			Integer sytfQadi01, Integer sytfQadi02, Boolean sytfQadl01,
			Boolean sytfQadl02, Date sytfQadt01, Date sytfQadt02,
			Double oidSytfMstr) {
		this.id = id;
		this.sytfReqdAdd = sytfReqdAdd;
		this.sytfReqdChgdel = sytfReqdChgdel;
		this.sytfModUserid = sytfModUserid;
		this.sytfModDate = sytfModDate;
		this.sytfUser1 = sytfUser1;
		this.sytfUser2 = sytfUser2;
		this.sytfChr01 = sytfChr01;
		this.sytfChr02 = sytfChr02;
		this.sytfDec01 = sytfDec01;
		this.sytfDec02 = sytfDec02;
		this.sytfInt01 = sytfInt01;
		this.sytfInt02 = sytfInt02;
		this.sytfLog01 = sytfLog01;
		this.sytfLog02 = sytfLog02;
		this.sytfDte01 = sytfDte01;
		this.sytfDte02 = sytfDte02;
		this.sytfQadc01 = sytfQadc01;
		this.sytfQadc02 = sytfQadc02;
		this.sytfQadc03 = sytfQadc03;
		this.sytfQadc04 = sytfQadc04;
		this.sytfQadd01 = sytfQadd01;
		this.sytfQadd02 = sytfQadd02;
		this.sytfQadi01 = sytfQadi01;
		this.sytfQadi02 = sytfQadi02;
		this.sytfQadl01 = sytfQadl01;
		this.sytfQadl02 = sytfQadl02;
		this.sytfQadt01 = sytfQadt01;
		this.sytfQadt02 = sytfQadt02;
		this.oidSytfMstr = oidSytfMstr;
	}

	// Property accessors

	public SytfMstrId getId() {
		return this.id;
	}

	public void setId(SytfMstrId id) {
		this.id = id;
	}

	public Boolean getSytfReqdAdd() {
		return this.sytfReqdAdd;
	}

	public void setSytfReqdAdd(Boolean sytfReqdAdd) {
		this.sytfReqdAdd = sytfReqdAdd;
	}

	public Boolean getSytfReqdChgdel() {
		return this.sytfReqdChgdel;
	}

	public void setSytfReqdChgdel(Boolean sytfReqdChgdel) {
		this.sytfReqdChgdel = sytfReqdChgdel;
	}

	public String getSytfModUserid() {
		return this.sytfModUserid;
	}

	public void setSytfModUserid(String sytfModUserid) {
		this.sytfModUserid = sytfModUserid;
	}

	public Date getSytfModDate() {
		return this.sytfModDate;
	}

	public void setSytfModDate(Date sytfModDate) {
		this.sytfModDate = sytfModDate;
	}

	public String getSytfUser1() {
		return this.sytfUser1;
	}

	public void setSytfUser1(String sytfUser1) {
		this.sytfUser1 = sytfUser1;
	}

	public String getSytfUser2() {
		return this.sytfUser2;
	}

	public void setSytfUser2(String sytfUser2) {
		this.sytfUser2 = sytfUser2;
	}

	public String getSytfChr01() {
		return this.sytfChr01;
	}

	public void setSytfChr01(String sytfChr01) {
		this.sytfChr01 = sytfChr01;
	}

	public String getSytfChr02() {
		return this.sytfChr02;
	}

	public void setSytfChr02(String sytfChr02) {
		this.sytfChr02 = sytfChr02;
	}

	public Double getSytfDec01() {
		return this.sytfDec01;
	}

	public void setSytfDec01(Double sytfDec01) {
		this.sytfDec01 = sytfDec01;
	}

	public Double getSytfDec02() {
		return this.sytfDec02;
	}

	public void setSytfDec02(Double sytfDec02) {
		this.sytfDec02 = sytfDec02;
	}

	public Integer getSytfInt01() {
		return this.sytfInt01;
	}

	public void setSytfInt01(Integer sytfInt01) {
		this.sytfInt01 = sytfInt01;
	}

	public Integer getSytfInt02() {
		return this.sytfInt02;
	}

	public void setSytfInt02(Integer sytfInt02) {
		this.sytfInt02 = sytfInt02;
	}

	public Boolean getSytfLog01() {
		return this.sytfLog01;
	}

	public void setSytfLog01(Boolean sytfLog01) {
		this.sytfLog01 = sytfLog01;
	}

	public Boolean getSytfLog02() {
		return this.sytfLog02;
	}

	public void setSytfLog02(Boolean sytfLog02) {
		this.sytfLog02 = sytfLog02;
	}

	public Date getSytfDte01() {
		return this.sytfDte01;
	}

	public void setSytfDte01(Date sytfDte01) {
		this.sytfDte01 = sytfDte01;
	}

	public Date getSytfDte02() {
		return this.sytfDte02;
	}

	public void setSytfDte02(Date sytfDte02) {
		this.sytfDte02 = sytfDte02;
	}

	public String getSytfQadc01() {
		return this.sytfQadc01;
	}

	public void setSytfQadc01(String sytfQadc01) {
		this.sytfQadc01 = sytfQadc01;
	}

	public String getSytfQadc02() {
		return this.sytfQadc02;
	}

	public void setSytfQadc02(String sytfQadc02) {
		this.sytfQadc02 = sytfQadc02;
	}

	public String getSytfQadc03() {
		return this.sytfQadc03;
	}

	public void setSytfQadc03(String sytfQadc03) {
		this.sytfQadc03 = sytfQadc03;
	}

	public String getSytfQadc04() {
		return this.sytfQadc04;
	}

	public void setSytfQadc04(String sytfQadc04) {
		this.sytfQadc04 = sytfQadc04;
	}

	public Double getSytfQadd01() {
		return this.sytfQadd01;
	}

	public void setSytfQadd01(Double sytfQadd01) {
		this.sytfQadd01 = sytfQadd01;
	}

	public Double getSytfQadd02() {
		return this.sytfQadd02;
	}

	public void setSytfQadd02(Double sytfQadd02) {
		this.sytfQadd02 = sytfQadd02;
	}

	public Integer getSytfQadi01() {
		return this.sytfQadi01;
	}

	public void setSytfQadi01(Integer sytfQadi01) {
		this.sytfQadi01 = sytfQadi01;
	}

	public Integer getSytfQadi02() {
		return this.sytfQadi02;
	}

	public void setSytfQadi02(Integer sytfQadi02) {
		this.sytfQadi02 = sytfQadi02;
	}

	public Boolean getSytfQadl01() {
		return this.sytfQadl01;
	}

	public void setSytfQadl01(Boolean sytfQadl01) {
		this.sytfQadl01 = sytfQadl01;
	}

	public Boolean getSytfQadl02() {
		return this.sytfQadl02;
	}

	public void setSytfQadl02(Boolean sytfQadl02) {
		this.sytfQadl02 = sytfQadl02;
	}

	public Date getSytfQadt01() {
		return this.sytfQadt01;
	}

	public void setSytfQadt01(Date sytfQadt01) {
		this.sytfQadt01 = sytfQadt01;
	}

	public Date getSytfQadt02() {
		return this.sytfQadt02;
	}

	public void setSytfQadt02(Date sytfQadt02) {
		this.sytfQadt02 = sytfQadt02;
	}

	public Double getOidSytfMstr() {
		return this.oidSytfMstr;
	}

	public void setOidSytfMstr(Double oidSytfMstr) {
		this.oidSytfMstr = oidSytfMstr;
	}

}