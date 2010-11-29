package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTagMstr entity provides the base persistence definition of the
 * TagMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTagMstr implements java.io.Serializable {

	// Fields

	private TagMstrId id;
	private String tagPart;
	private String tagLoc;
	private String tagSerial;
	private Double tagCntQty;
	private String tagCntNam;
	private Date tagCntDt;
	private Double tagRcntQty;
	private String tagRcntNam;
	private Date tagRcntDt;
	private String tagSite;
	private String tagType;
	private Boolean tagVoid;
	private Date tagPrtDt;
	private Date tagCrtDt;
	private Boolean tagPosted;
	private String tagCntUm;
	private String tagRcntUm;
	private Double tagRcntCnv;
	private Double tagCntCnv;
	private String tagRmks;
	private Double tagQad01;
	private String tagUser1;
	private String tagUser2;
	private String tagRef;
	private Double oidTagMstr;

	// Constructors

	/** default constructor */
	public AbstractTagMstr() {
	}

	/** minimal constructor */
	public AbstractTagMstr(TagMstrId id, Double oidTagMstr) {
		this.id = id;
		this.oidTagMstr = oidTagMstr;
	}

	/** full constructor */
	public AbstractTagMstr(TagMstrId id, String tagPart, String tagLoc,
			String tagSerial, Double tagCntQty, String tagCntNam,
			Date tagCntDt, Double tagRcntQty, String tagRcntNam,
			Date tagRcntDt, String tagSite, String tagType, Boolean tagVoid,
			Date tagPrtDt, Date tagCrtDt, Boolean tagPosted, String tagCntUm,
			String tagRcntUm, Double tagRcntCnv, Double tagCntCnv,
			String tagRmks, Double tagQad01, String tagUser1, String tagUser2,
			String tagRef, Double oidTagMstr) {
		this.id = id;
		this.tagPart = tagPart;
		this.tagLoc = tagLoc;
		this.tagSerial = tagSerial;
		this.tagCntQty = tagCntQty;
		this.tagCntNam = tagCntNam;
		this.tagCntDt = tagCntDt;
		this.tagRcntQty = tagRcntQty;
		this.tagRcntNam = tagRcntNam;
		this.tagRcntDt = tagRcntDt;
		this.tagSite = tagSite;
		this.tagType = tagType;
		this.tagVoid = tagVoid;
		this.tagPrtDt = tagPrtDt;
		this.tagCrtDt = tagCrtDt;
		this.tagPosted = tagPosted;
		this.tagCntUm = tagCntUm;
		this.tagRcntUm = tagRcntUm;
		this.tagRcntCnv = tagRcntCnv;
		this.tagCntCnv = tagCntCnv;
		this.tagRmks = tagRmks;
		this.tagQad01 = tagQad01;
		this.tagUser1 = tagUser1;
		this.tagUser2 = tagUser2;
		this.tagRef = tagRef;
		this.oidTagMstr = oidTagMstr;
	}

	// Property accessors

	public TagMstrId getId() {
		return this.id;
	}

	public void setId(TagMstrId id) {
		this.id = id;
	}

	public String getTagPart() {
		return this.tagPart;
	}

	public void setTagPart(String tagPart) {
		this.tagPart = tagPart;
	}

	public String getTagLoc() {
		return this.tagLoc;
	}

	public void setTagLoc(String tagLoc) {
		this.tagLoc = tagLoc;
	}

	public String getTagSerial() {
		return this.tagSerial;
	}

	public void setTagSerial(String tagSerial) {
		this.tagSerial = tagSerial;
	}

	public Double getTagCntQty() {
		return this.tagCntQty;
	}

	public void setTagCntQty(Double tagCntQty) {
		this.tagCntQty = tagCntQty;
	}

	public String getTagCntNam() {
		return this.tagCntNam;
	}

	public void setTagCntNam(String tagCntNam) {
		this.tagCntNam = tagCntNam;
	}

	public Date getTagCntDt() {
		return this.tagCntDt;
	}

	public void setTagCntDt(Date tagCntDt) {
		this.tagCntDt = tagCntDt;
	}

	public Double getTagRcntQty() {
		return this.tagRcntQty;
	}

	public void setTagRcntQty(Double tagRcntQty) {
		this.tagRcntQty = tagRcntQty;
	}

	public String getTagRcntNam() {
		return this.tagRcntNam;
	}

	public void setTagRcntNam(String tagRcntNam) {
		this.tagRcntNam = tagRcntNam;
	}

	public Date getTagRcntDt() {
		return this.tagRcntDt;
	}

	public void setTagRcntDt(Date tagRcntDt) {
		this.tagRcntDt = tagRcntDt;
	}

	public String getTagSite() {
		return this.tagSite;
	}

	public void setTagSite(String tagSite) {
		this.tagSite = tagSite;
	}

	public String getTagType() {
		return this.tagType;
	}

	public void setTagType(String tagType) {
		this.tagType = tagType;
	}

	public Boolean getTagVoid() {
		return this.tagVoid;
	}

	public void setTagVoid(Boolean tagVoid) {
		this.tagVoid = tagVoid;
	}

	public Date getTagPrtDt() {
		return this.tagPrtDt;
	}

	public void setTagPrtDt(Date tagPrtDt) {
		this.tagPrtDt = tagPrtDt;
	}

	public Date getTagCrtDt() {
		return this.tagCrtDt;
	}

	public void setTagCrtDt(Date tagCrtDt) {
		this.tagCrtDt = tagCrtDt;
	}

	public Boolean getTagPosted() {
		return this.tagPosted;
	}

	public void setTagPosted(Boolean tagPosted) {
		this.tagPosted = tagPosted;
	}

	public String getTagCntUm() {
		return this.tagCntUm;
	}

	public void setTagCntUm(String tagCntUm) {
		this.tagCntUm = tagCntUm;
	}

	public String getTagRcntUm() {
		return this.tagRcntUm;
	}

	public void setTagRcntUm(String tagRcntUm) {
		this.tagRcntUm = tagRcntUm;
	}

	public Double getTagRcntCnv() {
		return this.tagRcntCnv;
	}

	public void setTagRcntCnv(Double tagRcntCnv) {
		this.tagRcntCnv = tagRcntCnv;
	}

	public Double getTagCntCnv() {
		return this.tagCntCnv;
	}

	public void setTagCntCnv(Double tagCntCnv) {
		this.tagCntCnv = tagCntCnv;
	}

	public String getTagRmks() {
		return this.tagRmks;
	}

	public void setTagRmks(String tagRmks) {
		this.tagRmks = tagRmks;
	}

	public Double getTagQad01() {
		return this.tagQad01;
	}

	public void setTagQad01(Double tagQad01) {
		this.tagQad01 = tagQad01;
	}

	public String getTagUser1() {
		return this.tagUser1;
	}

	public void setTagUser1(String tagUser1) {
		this.tagUser1 = tagUser1;
	}

	public String getTagUser2() {
		return this.tagUser2;
	}

	public void setTagUser2(String tagUser2) {
		this.tagUser2 = tagUser2;
	}

	public String getTagRef() {
		return this.tagRef;
	}

	public void setTagRef(String tagRef) {
		this.tagRef = tagRef;
	}

	public Double getOidTagMstr() {
		return this.oidTagMstr;
	}

	public void setOidTagMstr(Double oidTagMstr) {
		this.oidTagMstr = oidTagMstr;
	}

}