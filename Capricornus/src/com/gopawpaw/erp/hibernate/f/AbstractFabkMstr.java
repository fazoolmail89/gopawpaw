package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFabkMstr entity provides the base persistence definition of the
 * FabkMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabkMstr implements java.io.Serializable {

	// Fields

	private FabkMstrId id;
	private String fabkDesc;
	private Integer fabkSeq;
	private Boolean fabkPost;
	private String fabkCalendar;
	private String fabkModUserid;
	private Date fabkModDate;
	private String fabkUser1;
	private String fabkUser2;
	private String fabkChr01;
	private Double fabkDec01;
	private Boolean fabkLog01;
	private Date fabkDte01;
	private Integer fabkInt01;
	private String fabkQadc01;
	private Double fabkQadd01;
	private Boolean fabkQadl01;
	private Date fabkQadt01;
	private Integer fabkQadi01;
	private String fabkQadc02;
	private Double oidFabkMstr;

	// Constructors

	/** default constructor */
	public AbstractFabkMstr() {
	}

	/** minimal constructor */
	public AbstractFabkMstr(FabkMstrId id, String fabkDesc, Integer fabkSeq,
			Boolean fabkPost, String fabkCalendar, String fabkModUserid,
			Date fabkModDate, String fabkUser1, String fabkUser2,
			String fabkChr01, Double fabkDec01, Boolean fabkLog01,
			Integer fabkInt01, String fabkQadc01, Double fabkQadd01,
			Boolean fabkQadl01, Integer fabkQadi01, String fabkQadc02,
			Double oidFabkMstr) {
		this.id = id;
		this.fabkDesc = fabkDesc;
		this.fabkSeq = fabkSeq;
		this.fabkPost = fabkPost;
		this.fabkCalendar = fabkCalendar;
		this.fabkModUserid = fabkModUserid;
		this.fabkModDate = fabkModDate;
		this.fabkUser1 = fabkUser1;
		this.fabkUser2 = fabkUser2;
		this.fabkChr01 = fabkChr01;
		this.fabkDec01 = fabkDec01;
		this.fabkLog01 = fabkLog01;
		this.fabkInt01 = fabkInt01;
		this.fabkQadc01 = fabkQadc01;
		this.fabkQadd01 = fabkQadd01;
		this.fabkQadl01 = fabkQadl01;
		this.fabkQadi01 = fabkQadi01;
		this.fabkQadc02 = fabkQadc02;
		this.oidFabkMstr = oidFabkMstr;
	}

	/** full constructor */
	public AbstractFabkMstr(FabkMstrId id, String fabkDesc, Integer fabkSeq,
			Boolean fabkPost, String fabkCalendar, String fabkModUserid,
			Date fabkModDate, String fabkUser1, String fabkUser2,
			String fabkChr01, Double fabkDec01, Boolean fabkLog01,
			Date fabkDte01, Integer fabkInt01, String fabkQadc01,
			Double fabkQadd01, Boolean fabkQadl01, Date fabkQadt01,
			Integer fabkQadi01, String fabkQadc02, Double oidFabkMstr) {
		this.id = id;
		this.fabkDesc = fabkDesc;
		this.fabkSeq = fabkSeq;
		this.fabkPost = fabkPost;
		this.fabkCalendar = fabkCalendar;
		this.fabkModUserid = fabkModUserid;
		this.fabkModDate = fabkModDate;
		this.fabkUser1 = fabkUser1;
		this.fabkUser2 = fabkUser2;
		this.fabkChr01 = fabkChr01;
		this.fabkDec01 = fabkDec01;
		this.fabkLog01 = fabkLog01;
		this.fabkDte01 = fabkDte01;
		this.fabkInt01 = fabkInt01;
		this.fabkQadc01 = fabkQadc01;
		this.fabkQadd01 = fabkQadd01;
		this.fabkQadl01 = fabkQadl01;
		this.fabkQadt01 = fabkQadt01;
		this.fabkQadi01 = fabkQadi01;
		this.fabkQadc02 = fabkQadc02;
		this.oidFabkMstr = oidFabkMstr;
	}

	// Property accessors

	public FabkMstrId getId() {
		return this.id;
	}

	public void setId(FabkMstrId id) {
		this.id = id;
	}

	public String getFabkDesc() {
		return this.fabkDesc;
	}

	public void setFabkDesc(String fabkDesc) {
		this.fabkDesc = fabkDesc;
	}

	public Integer getFabkSeq() {
		return this.fabkSeq;
	}

	public void setFabkSeq(Integer fabkSeq) {
		this.fabkSeq = fabkSeq;
	}

	public Boolean getFabkPost() {
		return this.fabkPost;
	}

	public void setFabkPost(Boolean fabkPost) {
		this.fabkPost = fabkPost;
	}

	public String getFabkCalendar() {
		return this.fabkCalendar;
	}

	public void setFabkCalendar(String fabkCalendar) {
		this.fabkCalendar = fabkCalendar;
	}

	public String getFabkModUserid() {
		return this.fabkModUserid;
	}

	public void setFabkModUserid(String fabkModUserid) {
		this.fabkModUserid = fabkModUserid;
	}

	public Date getFabkModDate() {
		return this.fabkModDate;
	}

	public void setFabkModDate(Date fabkModDate) {
		this.fabkModDate = fabkModDate;
	}

	public String getFabkUser1() {
		return this.fabkUser1;
	}

	public void setFabkUser1(String fabkUser1) {
		this.fabkUser1 = fabkUser1;
	}

	public String getFabkUser2() {
		return this.fabkUser2;
	}

	public void setFabkUser2(String fabkUser2) {
		this.fabkUser2 = fabkUser2;
	}

	public String getFabkChr01() {
		return this.fabkChr01;
	}

	public void setFabkChr01(String fabkChr01) {
		this.fabkChr01 = fabkChr01;
	}

	public Double getFabkDec01() {
		return this.fabkDec01;
	}

	public void setFabkDec01(Double fabkDec01) {
		this.fabkDec01 = fabkDec01;
	}

	public Boolean getFabkLog01() {
		return this.fabkLog01;
	}

	public void setFabkLog01(Boolean fabkLog01) {
		this.fabkLog01 = fabkLog01;
	}

	public Date getFabkDte01() {
		return this.fabkDte01;
	}

	public void setFabkDte01(Date fabkDte01) {
		this.fabkDte01 = fabkDte01;
	}

	public Integer getFabkInt01() {
		return this.fabkInt01;
	}

	public void setFabkInt01(Integer fabkInt01) {
		this.fabkInt01 = fabkInt01;
	}

	public String getFabkQadc01() {
		return this.fabkQadc01;
	}

	public void setFabkQadc01(String fabkQadc01) {
		this.fabkQadc01 = fabkQadc01;
	}

	public Double getFabkQadd01() {
		return this.fabkQadd01;
	}

	public void setFabkQadd01(Double fabkQadd01) {
		this.fabkQadd01 = fabkQadd01;
	}

	public Boolean getFabkQadl01() {
		return this.fabkQadl01;
	}

	public void setFabkQadl01(Boolean fabkQadl01) {
		this.fabkQadl01 = fabkQadl01;
	}

	public Date getFabkQadt01() {
		return this.fabkQadt01;
	}

	public void setFabkQadt01(Date fabkQadt01) {
		this.fabkQadt01 = fabkQadt01;
	}

	public Integer getFabkQadi01() {
		return this.fabkQadi01;
	}

	public void setFabkQadi01(Integer fabkQadi01) {
		this.fabkQadi01 = fabkQadi01;
	}

	public String getFabkQadc02() {
		return this.fabkQadc02;
	}

	public void setFabkQadc02(String fabkQadc02) {
		this.fabkQadc02 = fabkQadc02;
	}

	public Double getOidFabkMstr() {
		return this.oidFabkMstr;
	}

	public void setOidFabkMstr(Double oidFabkMstr) {
		this.oidFabkMstr = oidFabkMstr;
	}

}