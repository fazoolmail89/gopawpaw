package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPigMstr entity provides the base persistence definition of the
 * PigMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPigMstr implements java.io.Serializable {

	// Fields

	private PigMstrId id;
	private Boolean pigAllCusts;
	private Boolean pigAllItems;
	private String pigCurr;
	private String pigDesc;
	private String pigDiv;
	private Date pigExpire;
	private String pigList;
	private String pigListId;
	private Integer pigPriority;
	private String pigRefCode;
	private Integer pigRefType;
	private Date pigStart;
	private String pigValType;
	private String pigUser1;
	private String pigUser2;
	private String pigQadc01;
	private String pigQadc02;
	private String pigQadc03;
	private Double pigQadd01;
	private Double pigQadd02;
	private Integer pigQadi01;
	private Integer pigQadi02;
	private Boolean pigQadl01;
	private Boolean pigQadl02;
	private Date pigQadt01;
	private Date pigQadt02;
	private Integer pigSrchType;
	private Double oidPigMstr;

	// Constructors

	/** default constructor */
	public AbstractPigMstr() {
	}

	/** minimal constructor */
	public AbstractPigMstr(PigMstrId id, Double oidPigMstr) {
		this.id = id;
		this.oidPigMstr = oidPigMstr;
	}

	/** full constructor */
	public AbstractPigMstr(PigMstrId id, Boolean pigAllCusts,
			Boolean pigAllItems, String pigCurr, String pigDesc, String pigDiv,
			Date pigExpire, String pigList, String pigListId,
			Integer pigPriority, String pigRefCode, Integer pigRefType,
			Date pigStart, String pigValType, String pigUser1, String pigUser2,
			String pigQadc01, String pigQadc02, String pigQadc03,
			Double pigQadd01, Double pigQadd02, Integer pigQadi01,
			Integer pigQadi02, Boolean pigQadl01, Boolean pigQadl02,
			Date pigQadt01, Date pigQadt02, Integer pigSrchType,
			Double oidPigMstr) {
		this.id = id;
		this.pigAllCusts = pigAllCusts;
		this.pigAllItems = pigAllItems;
		this.pigCurr = pigCurr;
		this.pigDesc = pigDesc;
		this.pigDiv = pigDiv;
		this.pigExpire = pigExpire;
		this.pigList = pigList;
		this.pigListId = pigListId;
		this.pigPriority = pigPriority;
		this.pigRefCode = pigRefCode;
		this.pigRefType = pigRefType;
		this.pigStart = pigStart;
		this.pigValType = pigValType;
		this.pigUser1 = pigUser1;
		this.pigUser2 = pigUser2;
		this.pigQadc01 = pigQadc01;
		this.pigQadc02 = pigQadc02;
		this.pigQadc03 = pigQadc03;
		this.pigQadd01 = pigQadd01;
		this.pigQadd02 = pigQadd02;
		this.pigQadi01 = pigQadi01;
		this.pigQadi02 = pigQadi02;
		this.pigQadl01 = pigQadl01;
		this.pigQadl02 = pigQadl02;
		this.pigQadt01 = pigQadt01;
		this.pigQadt02 = pigQadt02;
		this.pigSrchType = pigSrchType;
		this.oidPigMstr = oidPigMstr;
	}

	// Property accessors

	public PigMstrId getId() {
		return this.id;
	}

	public void setId(PigMstrId id) {
		this.id = id;
	}

	public Boolean getPigAllCusts() {
		return this.pigAllCusts;
	}

	public void setPigAllCusts(Boolean pigAllCusts) {
		this.pigAllCusts = pigAllCusts;
	}

	public Boolean getPigAllItems() {
		return this.pigAllItems;
	}

	public void setPigAllItems(Boolean pigAllItems) {
		this.pigAllItems = pigAllItems;
	}

	public String getPigCurr() {
		return this.pigCurr;
	}

	public void setPigCurr(String pigCurr) {
		this.pigCurr = pigCurr;
	}

	public String getPigDesc() {
		return this.pigDesc;
	}

	public void setPigDesc(String pigDesc) {
		this.pigDesc = pigDesc;
	}

	public String getPigDiv() {
		return this.pigDiv;
	}

	public void setPigDiv(String pigDiv) {
		this.pigDiv = pigDiv;
	}

	public Date getPigExpire() {
		return this.pigExpire;
	}

	public void setPigExpire(Date pigExpire) {
		this.pigExpire = pigExpire;
	}

	public String getPigList() {
		return this.pigList;
	}

	public void setPigList(String pigList) {
		this.pigList = pigList;
	}

	public String getPigListId() {
		return this.pigListId;
	}

	public void setPigListId(String pigListId) {
		this.pigListId = pigListId;
	}

	public Integer getPigPriority() {
		return this.pigPriority;
	}

	public void setPigPriority(Integer pigPriority) {
		this.pigPriority = pigPriority;
	}

	public String getPigRefCode() {
		return this.pigRefCode;
	}

	public void setPigRefCode(String pigRefCode) {
		this.pigRefCode = pigRefCode;
	}

	public Integer getPigRefType() {
		return this.pigRefType;
	}

	public void setPigRefType(Integer pigRefType) {
		this.pigRefType = pigRefType;
	}

	public Date getPigStart() {
		return this.pigStart;
	}

	public void setPigStart(Date pigStart) {
		this.pigStart = pigStart;
	}

	public String getPigValType() {
		return this.pigValType;
	}

	public void setPigValType(String pigValType) {
		this.pigValType = pigValType;
	}

	public String getPigUser1() {
		return this.pigUser1;
	}

	public void setPigUser1(String pigUser1) {
		this.pigUser1 = pigUser1;
	}

	public String getPigUser2() {
		return this.pigUser2;
	}

	public void setPigUser2(String pigUser2) {
		this.pigUser2 = pigUser2;
	}

	public String getPigQadc01() {
		return this.pigQadc01;
	}

	public void setPigQadc01(String pigQadc01) {
		this.pigQadc01 = pigQadc01;
	}

	public String getPigQadc02() {
		return this.pigQadc02;
	}

	public void setPigQadc02(String pigQadc02) {
		this.pigQadc02 = pigQadc02;
	}

	public String getPigQadc03() {
		return this.pigQadc03;
	}

	public void setPigQadc03(String pigQadc03) {
		this.pigQadc03 = pigQadc03;
	}

	public Double getPigQadd01() {
		return this.pigQadd01;
	}

	public void setPigQadd01(Double pigQadd01) {
		this.pigQadd01 = pigQadd01;
	}

	public Double getPigQadd02() {
		return this.pigQadd02;
	}

	public void setPigQadd02(Double pigQadd02) {
		this.pigQadd02 = pigQadd02;
	}

	public Integer getPigQadi01() {
		return this.pigQadi01;
	}

	public void setPigQadi01(Integer pigQadi01) {
		this.pigQadi01 = pigQadi01;
	}

	public Integer getPigQadi02() {
		return this.pigQadi02;
	}

	public void setPigQadi02(Integer pigQadi02) {
		this.pigQadi02 = pigQadi02;
	}

	public Boolean getPigQadl01() {
		return this.pigQadl01;
	}

	public void setPigQadl01(Boolean pigQadl01) {
		this.pigQadl01 = pigQadl01;
	}

	public Boolean getPigQadl02() {
		return this.pigQadl02;
	}

	public void setPigQadl02(Boolean pigQadl02) {
		this.pigQadl02 = pigQadl02;
	}

	public Date getPigQadt01() {
		return this.pigQadt01;
	}

	public void setPigQadt01(Date pigQadt01) {
		this.pigQadt01 = pigQadt01;
	}

	public Date getPigQadt02() {
		return this.pigQadt02;
	}

	public void setPigQadt02(Date pigQadt02) {
		this.pigQadt02 = pigQadt02;
	}

	public Integer getPigSrchType() {
		return this.pigSrchType;
	}

	public void setPigSrchType(Integer pigSrchType) {
		this.pigSrchType = pigSrchType;
	}

	public Double getOidPigMstr() {
		return this.oidPigMstr;
	}

	public void setOidPigMstr(Double oidPigMstr) {
		this.oidPigMstr = oidPigMstr;
	}

}