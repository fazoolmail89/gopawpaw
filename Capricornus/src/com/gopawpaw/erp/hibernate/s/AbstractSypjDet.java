package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSypjDet entity provides the base persistence definition of the
 * SypjDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSypjDet implements java.io.Serializable {

	// Fields

	private SypjDetId id;
	private String sypjJoinCrit;
	private String sypjModUserid;
	private Date sypjModDate;
	private String sypjUser1;
	private String sypjUser2;
	private String sypjChr01;
	private String sypjChr02;
	private Double sypjDec01;
	private Double sypjDec02;
	private Integer sypjInt01;
	private Integer sypjInt02;
	private Boolean sypjLog01;
	private Boolean sypjLog02;
	private Date sypjDte01;
	private Date sypjDte02;
	private String sypjQadc01;
	private String sypjQadc02;
	private String sypjQadc03;
	private String sypjQadc04;
	private Double sypjQadd01;
	private Double sypjQadd02;
	private Integer sypjQadi01;
	private Integer sypjQadi02;
	private Boolean sypjQadl01;
	private Boolean sypjQadl02;
	private Date sypjQadt01;
	private Date sypjQadt02;
	private Boolean sypjReqdJoin;
	private Boolean sypjPublJoined;
	private Integer sypjSeq;
	private Double oidSypjDet;

	// Constructors

	/** default constructor */
	public AbstractSypjDet() {
	}

	/** minimal constructor */
	public AbstractSypjDet(SypjDetId id, Double oidSypjDet) {
		this.id = id;
		this.oidSypjDet = oidSypjDet;
	}

	/** full constructor */
	public AbstractSypjDet(SypjDetId id, String sypjJoinCrit,
			String sypjModUserid, Date sypjModDate, String sypjUser1,
			String sypjUser2, String sypjChr01, String sypjChr02,
			Double sypjDec01, Double sypjDec02, Integer sypjInt01,
			Integer sypjInt02, Boolean sypjLog01, Boolean sypjLog02,
			Date sypjDte01, Date sypjDte02, String sypjQadc01,
			String sypjQadc02, String sypjQadc03, String sypjQadc04,
			Double sypjQadd01, Double sypjQadd02, Integer sypjQadi01,
			Integer sypjQadi02, Boolean sypjQadl01, Boolean sypjQadl02,
			Date sypjQadt01, Date sypjQadt02, Boolean sypjReqdJoin,
			Boolean sypjPublJoined, Integer sypjSeq, Double oidSypjDet) {
		this.id = id;
		this.sypjJoinCrit = sypjJoinCrit;
		this.sypjModUserid = sypjModUserid;
		this.sypjModDate = sypjModDate;
		this.sypjUser1 = sypjUser1;
		this.sypjUser2 = sypjUser2;
		this.sypjChr01 = sypjChr01;
		this.sypjChr02 = sypjChr02;
		this.sypjDec01 = sypjDec01;
		this.sypjDec02 = sypjDec02;
		this.sypjInt01 = sypjInt01;
		this.sypjInt02 = sypjInt02;
		this.sypjLog01 = sypjLog01;
		this.sypjLog02 = sypjLog02;
		this.sypjDte01 = sypjDte01;
		this.sypjDte02 = sypjDte02;
		this.sypjQadc01 = sypjQadc01;
		this.sypjQadc02 = sypjQadc02;
		this.sypjQadc03 = sypjQadc03;
		this.sypjQadc04 = sypjQadc04;
		this.sypjQadd01 = sypjQadd01;
		this.sypjQadd02 = sypjQadd02;
		this.sypjQadi01 = sypjQadi01;
		this.sypjQadi02 = sypjQadi02;
		this.sypjQadl01 = sypjQadl01;
		this.sypjQadl02 = sypjQadl02;
		this.sypjQadt01 = sypjQadt01;
		this.sypjQadt02 = sypjQadt02;
		this.sypjReqdJoin = sypjReqdJoin;
		this.sypjPublJoined = sypjPublJoined;
		this.sypjSeq = sypjSeq;
		this.oidSypjDet = oidSypjDet;
	}

	// Property accessors

	public SypjDetId getId() {
		return this.id;
	}

	public void setId(SypjDetId id) {
		this.id = id;
	}

	public String getSypjJoinCrit() {
		return this.sypjJoinCrit;
	}

	public void setSypjJoinCrit(String sypjJoinCrit) {
		this.sypjJoinCrit = sypjJoinCrit;
	}

	public String getSypjModUserid() {
		return this.sypjModUserid;
	}

	public void setSypjModUserid(String sypjModUserid) {
		this.sypjModUserid = sypjModUserid;
	}

	public Date getSypjModDate() {
		return this.sypjModDate;
	}

	public void setSypjModDate(Date sypjModDate) {
		this.sypjModDate = sypjModDate;
	}

	public String getSypjUser1() {
		return this.sypjUser1;
	}

	public void setSypjUser1(String sypjUser1) {
		this.sypjUser1 = sypjUser1;
	}

	public String getSypjUser2() {
		return this.sypjUser2;
	}

	public void setSypjUser2(String sypjUser2) {
		this.sypjUser2 = sypjUser2;
	}

	public String getSypjChr01() {
		return this.sypjChr01;
	}

	public void setSypjChr01(String sypjChr01) {
		this.sypjChr01 = sypjChr01;
	}

	public String getSypjChr02() {
		return this.sypjChr02;
	}

	public void setSypjChr02(String sypjChr02) {
		this.sypjChr02 = sypjChr02;
	}

	public Double getSypjDec01() {
		return this.sypjDec01;
	}

	public void setSypjDec01(Double sypjDec01) {
		this.sypjDec01 = sypjDec01;
	}

	public Double getSypjDec02() {
		return this.sypjDec02;
	}

	public void setSypjDec02(Double sypjDec02) {
		this.sypjDec02 = sypjDec02;
	}

	public Integer getSypjInt01() {
		return this.sypjInt01;
	}

	public void setSypjInt01(Integer sypjInt01) {
		this.sypjInt01 = sypjInt01;
	}

	public Integer getSypjInt02() {
		return this.sypjInt02;
	}

	public void setSypjInt02(Integer sypjInt02) {
		this.sypjInt02 = sypjInt02;
	}

	public Boolean getSypjLog01() {
		return this.sypjLog01;
	}

	public void setSypjLog01(Boolean sypjLog01) {
		this.sypjLog01 = sypjLog01;
	}

	public Boolean getSypjLog02() {
		return this.sypjLog02;
	}

	public void setSypjLog02(Boolean sypjLog02) {
		this.sypjLog02 = sypjLog02;
	}

	public Date getSypjDte01() {
		return this.sypjDte01;
	}

	public void setSypjDte01(Date sypjDte01) {
		this.sypjDte01 = sypjDte01;
	}

	public Date getSypjDte02() {
		return this.sypjDte02;
	}

	public void setSypjDte02(Date sypjDte02) {
		this.sypjDte02 = sypjDte02;
	}

	public String getSypjQadc01() {
		return this.sypjQadc01;
	}

	public void setSypjQadc01(String sypjQadc01) {
		this.sypjQadc01 = sypjQadc01;
	}

	public String getSypjQadc02() {
		return this.sypjQadc02;
	}

	public void setSypjQadc02(String sypjQadc02) {
		this.sypjQadc02 = sypjQadc02;
	}

	public String getSypjQadc03() {
		return this.sypjQadc03;
	}

	public void setSypjQadc03(String sypjQadc03) {
		this.sypjQadc03 = sypjQadc03;
	}

	public String getSypjQadc04() {
		return this.sypjQadc04;
	}

	public void setSypjQadc04(String sypjQadc04) {
		this.sypjQadc04 = sypjQadc04;
	}

	public Double getSypjQadd01() {
		return this.sypjQadd01;
	}

	public void setSypjQadd01(Double sypjQadd01) {
		this.sypjQadd01 = sypjQadd01;
	}

	public Double getSypjQadd02() {
		return this.sypjQadd02;
	}

	public void setSypjQadd02(Double sypjQadd02) {
		this.sypjQadd02 = sypjQadd02;
	}

	public Integer getSypjQadi01() {
		return this.sypjQadi01;
	}

	public void setSypjQadi01(Integer sypjQadi01) {
		this.sypjQadi01 = sypjQadi01;
	}

	public Integer getSypjQadi02() {
		return this.sypjQadi02;
	}

	public void setSypjQadi02(Integer sypjQadi02) {
		this.sypjQadi02 = sypjQadi02;
	}

	public Boolean getSypjQadl01() {
		return this.sypjQadl01;
	}

	public void setSypjQadl01(Boolean sypjQadl01) {
		this.sypjQadl01 = sypjQadl01;
	}

	public Boolean getSypjQadl02() {
		return this.sypjQadl02;
	}

	public void setSypjQadl02(Boolean sypjQadl02) {
		this.sypjQadl02 = sypjQadl02;
	}

	public Date getSypjQadt01() {
		return this.sypjQadt01;
	}

	public void setSypjQadt01(Date sypjQadt01) {
		this.sypjQadt01 = sypjQadt01;
	}

	public Date getSypjQadt02() {
		return this.sypjQadt02;
	}

	public void setSypjQadt02(Date sypjQadt02) {
		this.sypjQadt02 = sypjQadt02;
	}

	public Boolean getSypjReqdJoin() {
		return this.sypjReqdJoin;
	}

	public void setSypjReqdJoin(Boolean sypjReqdJoin) {
		this.sypjReqdJoin = sypjReqdJoin;
	}

	public Boolean getSypjPublJoined() {
		return this.sypjPublJoined;
	}

	public void setSypjPublJoined(Boolean sypjPublJoined) {
		this.sypjPublJoined = sypjPublJoined;
	}

	public Integer getSypjSeq() {
		return this.sypjSeq;
	}

	public void setSypjSeq(Integer sypjSeq) {
		this.sypjSeq = sypjSeq;
	}

	public Double getOidSypjDet() {
		return this.oidSypjDet;
	}

	public void setOidSypjDet(Double oidSypjDet) {
		this.oidSypjDet = oidSypjDet;
	}

}