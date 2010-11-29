package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBkMstr entity provides the base persistence definition of the BkMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBkMstr implements java.io.Serializable {

	// Fields

	private BkMstrId id;
	private String bkAcct;
	private String bkCc;
	private Integer bkCheck;
	private String bkDesc;
	private String bkCurr;
	private String bkQadc10;
	private String bkQadc12;
	private String bkUser1;
	private String bkUser2;
	private String bkEntity;
	private String bkPipAcct;
	private String bkPipCc;
	private String bkBkAcct1;
	private String bkBkAcct2;
	private String bkUserid;
	private Date bkModDate;
	private String bkQadc02;
	private String bkQadc03;
	private String bkQadc04;
	private String bkQadc05;
	private Double bkMinDrft;
	private Double bkMaxDrft;
	private Double bkDrftChg;
	private Double bkDrftChgPct;
	private String bkDftarAcct;
	private String bkDftarCc;
	private String bkBkchgAcct;
	private String bkBkchgCc;
	private String bkDiscAcct;
	private String bkDiscCc;
	private String bkDdftAcct;
	private String bkDdftCc;
	private String bkDftapAcct;
	private String bkDftapCc;
	private String bkBktxAcct;
	private String bkBktxCc;
	private String bkCdftAcct;
	private String bkCdftCc;
	private String bkEdftAcct;
	private String bkEdftCc;
	private String bkQadc01;
	private String bkQadc06;
	private String bkQadc07;
	private String bkQadc08;
	private String bkQadc09;
	private String bkSub;
	private String bkBkchgSub;
	private String bkBktxSub;
	private String bkCdftSub;
	private String bkDdftSub;
	private String bkDftapSub;
	private String bkDftarSub;
	private String bkDiscSub;
	private String bkEdftSub;
	private String bkPipSub;
	private String bkQadc11;
	private String bkValidation;
	private Double oidBkMstr;

	// Constructors

	/** default constructor */
	public AbstractBkMstr() {
	}

	/** minimal constructor */
	public AbstractBkMstr(BkMstrId id, String bkDftarAcct, String bkDftarCc,
			String bkBkchgAcct, String bkBkchgCc, String bkDiscAcct,
			String bkDiscCc, String bkDdftAcct, String bkDdftCc,
			String bkDftapAcct, String bkDftapCc, String bkBktxAcct,
			String bkBktxCc, String bkCdftAcct, String bkCdftCc,
			String bkEdftAcct, String bkEdftCc, String bkQadc06,
			String bkQadc07, String bkQadc08, String bkQadc09,
			String bkValidation, Double oidBkMstr) {
		this.id = id;
		this.bkDftarAcct = bkDftarAcct;
		this.bkDftarCc = bkDftarCc;
		this.bkBkchgAcct = bkBkchgAcct;
		this.bkBkchgCc = bkBkchgCc;
		this.bkDiscAcct = bkDiscAcct;
		this.bkDiscCc = bkDiscCc;
		this.bkDdftAcct = bkDdftAcct;
		this.bkDdftCc = bkDdftCc;
		this.bkDftapAcct = bkDftapAcct;
		this.bkDftapCc = bkDftapCc;
		this.bkBktxAcct = bkBktxAcct;
		this.bkBktxCc = bkBktxCc;
		this.bkCdftAcct = bkCdftAcct;
		this.bkCdftCc = bkCdftCc;
		this.bkEdftAcct = bkEdftAcct;
		this.bkEdftCc = bkEdftCc;
		this.bkQadc06 = bkQadc06;
		this.bkQadc07 = bkQadc07;
		this.bkQadc08 = bkQadc08;
		this.bkQadc09 = bkQadc09;
		this.bkValidation = bkValidation;
		this.oidBkMstr = oidBkMstr;
	}

	/** full constructor */
	public AbstractBkMstr(BkMstrId id, String bkAcct, String bkCc,
			Integer bkCheck, String bkDesc, String bkCurr, String bkQadc10,
			String bkQadc12, String bkUser1, String bkUser2, String bkEntity,
			String bkPipAcct, String bkPipCc, String bkBkAcct1,
			String bkBkAcct2, String bkUserid, Date bkModDate, String bkQadc02,
			String bkQadc03, String bkQadc04, String bkQadc05,
			Double bkMinDrft, Double bkMaxDrft, Double bkDrftChg,
			Double bkDrftChgPct, String bkDftarAcct, String bkDftarCc,
			String bkBkchgAcct, String bkBkchgCc, String bkDiscAcct,
			String bkDiscCc, String bkDdftAcct, String bkDdftCc,
			String bkDftapAcct, String bkDftapCc, String bkBktxAcct,
			String bkBktxCc, String bkCdftAcct, String bkCdftCc,
			String bkEdftAcct, String bkEdftCc, String bkQadc01,
			String bkQadc06, String bkQadc07, String bkQadc08, String bkQadc09,
			String bkSub, String bkBkchgSub, String bkBktxSub,
			String bkCdftSub, String bkDdftSub, String bkDftapSub,
			String bkDftarSub, String bkDiscSub, String bkEdftSub,
			String bkPipSub, String bkQadc11, String bkValidation,
			Double oidBkMstr) {
		this.id = id;
		this.bkAcct = bkAcct;
		this.bkCc = bkCc;
		this.bkCheck = bkCheck;
		this.bkDesc = bkDesc;
		this.bkCurr = bkCurr;
		this.bkQadc10 = bkQadc10;
		this.bkQadc12 = bkQadc12;
		this.bkUser1 = bkUser1;
		this.bkUser2 = bkUser2;
		this.bkEntity = bkEntity;
		this.bkPipAcct = bkPipAcct;
		this.bkPipCc = bkPipCc;
		this.bkBkAcct1 = bkBkAcct1;
		this.bkBkAcct2 = bkBkAcct2;
		this.bkUserid = bkUserid;
		this.bkModDate = bkModDate;
		this.bkQadc02 = bkQadc02;
		this.bkQadc03 = bkQadc03;
		this.bkQadc04 = bkQadc04;
		this.bkQadc05 = bkQadc05;
		this.bkMinDrft = bkMinDrft;
		this.bkMaxDrft = bkMaxDrft;
		this.bkDrftChg = bkDrftChg;
		this.bkDrftChgPct = bkDrftChgPct;
		this.bkDftarAcct = bkDftarAcct;
		this.bkDftarCc = bkDftarCc;
		this.bkBkchgAcct = bkBkchgAcct;
		this.bkBkchgCc = bkBkchgCc;
		this.bkDiscAcct = bkDiscAcct;
		this.bkDiscCc = bkDiscCc;
		this.bkDdftAcct = bkDdftAcct;
		this.bkDdftCc = bkDdftCc;
		this.bkDftapAcct = bkDftapAcct;
		this.bkDftapCc = bkDftapCc;
		this.bkBktxAcct = bkBktxAcct;
		this.bkBktxCc = bkBktxCc;
		this.bkCdftAcct = bkCdftAcct;
		this.bkCdftCc = bkCdftCc;
		this.bkEdftAcct = bkEdftAcct;
		this.bkEdftCc = bkEdftCc;
		this.bkQadc01 = bkQadc01;
		this.bkQadc06 = bkQadc06;
		this.bkQadc07 = bkQadc07;
		this.bkQadc08 = bkQadc08;
		this.bkQadc09 = bkQadc09;
		this.bkSub = bkSub;
		this.bkBkchgSub = bkBkchgSub;
		this.bkBktxSub = bkBktxSub;
		this.bkCdftSub = bkCdftSub;
		this.bkDdftSub = bkDdftSub;
		this.bkDftapSub = bkDftapSub;
		this.bkDftarSub = bkDftarSub;
		this.bkDiscSub = bkDiscSub;
		this.bkEdftSub = bkEdftSub;
		this.bkPipSub = bkPipSub;
		this.bkQadc11 = bkQadc11;
		this.bkValidation = bkValidation;
		this.oidBkMstr = oidBkMstr;
	}

	// Property accessors

	public BkMstrId getId() {
		return this.id;
	}

	public void setId(BkMstrId id) {
		this.id = id;
	}

	public String getBkAcct() {
		return this.bkAcct;
	}

	public void setBkAcct(String bkAcct) {
		this.bkAcct = bkAcct;
	}

	public String getBkCc() {
		return this.bkCc;
	}

	public void setBkCc(String bkCc) {
		this.bkCc = bkCc;
	}

	public Integer getBkCheck() {
		return this.bkCheck;
	}

	public void setBkCheck(Integer bkCheck) {
		this.bkCheck = bkCheck;
	}

	public String getBkDesc() {
		return this.bkDesc;
	}

	public void setBkDesc(String bkDesc) {
		this.bkDesc = bkDesc;
	}

	public String getBkCurr() {
		return this.bkCurr;
	}

	public void setBkCurr(String bkCurr) {
		this.bkCurr = bkCurr;
	}

	public String getBkQadc10() {
		return this.bkQadc10;
	}

	public void setBkQadc10(String bkQadc10) {
		this.bkQadc10 = bkQadc10;
	}

	public String getBkQadc12() {
		return this.bkQadc12;
	}

	public void setBkQadc12(String bkQadc12) {
		this.bkQadc12 = bkQadc12;
	}

	public String getBkUser1() {
		return this.bkUser1;
	}

	public void setBkUser1(String bkUser1) {
		this.bkUser1 = bkUser1;
	}

	public String getBkUser2() {
		return this.bkUser2;
	}

	public void setBkUser2(String bkUser2) {
		this.bkUser2 = bkUser2;
	}

	public String getBkEntity() {
		return this.bkEntity;
	}

	public void setBkEntity(String bkEntity) {
		this.bkEntity = bkEntity;
	}

	public String getBkPipAcct() {
		return this.bkPipAcct;
	}

	public void setBkPipAcct(String bkPipAcct) {
		this.bkPipAcct = bkPipAcct;
	}

	public String getBkPipCc() {
		return this.bkPipCc;
	}

	public void setBkPipCc(String bkPipCc) {
		this.bkPipCc = bkPipCc;
	}

	public String getBkBkAcct1() {
		return this.bkBkAcct1;
	}

	public void setBkBkAcct1(String bkBkAcct1) {
		this.bkBkAcct1 = bkBkAcct1;
	}

	public String getBkBkAcct2() {
		return this.bkBkAcct2;
	}

	public void setBkBkAcct2(String bkBkAcct2) {
		this.bkBkAcct2 = bkBkAcct2;
	}

	public String getBkUserid() {
		return this.bkUserid;
	}

	public void setBkUserid(String bkUserid) {
		this.bkUserid = bkUserid;
	}

	public Date getBkModDate() {
		return this.bkModDate;
	}

	public void setBkModDate(Date bkModDate) {
		this.bkModDate = bkModDate;
	}

	public String getBkQadc02() {
		return this.bkQadc02;
	}

	public void setBkQadc02(String bkQadc02) {
		this.bkQadc02 = bkQadc02;
	}

	public String getBkQadc03() {
		return this.bkQadc03;
	}

	public void setBkQadc03(String bkQadc03) {
		this.bkQadc03 = bkQadc03;
	}

	public String getBkQadc04() {
		return this.bkQadc04;
	}

	public void setBkQadc04(String bkQadc04) {
		this.bkQadc04 = bkQadc04;
	}

	public String getBkQadc05() {
		return this.bkQadc05;
	}

	public void setBkQadc05(String bkQadc05) {
		this.bkQadc05 = bkQadc05;
	}

	public Double getBkMinDrft() {
		return this.bkMinDrft;
	}

	public void setBkMinDrft(Double bkMinDrft) {
		this.bkMinDrft = bkMinDrft;
	}

	public Double getBkMaxDrft() {
		return this.bkMaxDrft;
	}

	public void setBkMaxDrft(Double bkMaxDrft) {
		this.bkMaxDrft = bkMaxDrft;
	}

	public Double getBkDrftChg() {
		return this.bkDrftChg;
	}

	public void setBkDrftChg(Double bkDrftChg) {
		this.bkDrftChg = bkDrftChg;
	}

	public Double getBkDrftChgPct() {
		return this.bkDrftChgPct;
	}

	public void setBkDrftChgPct(Double bkDrftChgPct) {
		this.bkDrftChgPct = bkDrftChgPct;
	}

	public String getBkDftarAcct() {
		return this.bkDftarAcct;
	}

	public void setBkDftarAcct(String bkDftarAcct) {
		this.bkDftarAcct = bkDftarAcct;
	}

	public String getBkDftarCc() {
		return this.bkDftarCc;
	}

	public void setBkDftarCc(String bkDftarCc) {
		this.bkDftarCc = bkDftarCc;
	}

	public String getBkBkchgAcct() {
		return this.bkBkchgAcct;
	}

	public void setBkBkchgAcct(String bkBkchgAcct) {
		this.bkBkchgAcct = bkBkchgAcct;
	}

	public String getBkBkchgCc() {
		return this.bkBkchgCc;
	}

	public void setBkBkchgCc(String bkBkchgCc) {
		this.bkBkchgCc = bkBkchgCc;
	}

	public String getBkDiscAcct() {
		return this.bkDiscAcct;
	}

	public void setBkDiscAcct(String bkDiscAcct) {
		this.bkDiscAcct = bkDiscAcct;
	}

	public String getBkDiscCc() {
		return this.bkDiscCc;
	}

	public void setBkDiscCc(String bkDiscCc) {
		this.bkDiscCc = bkDiscCc;
	}

	public String getBkDdftAcct() {
		return this.bkDdftAcct;
	}

	public void setBkDdftAcct(String bkDdftAcct) {
		this.bkDdftAcct = bkDdftAcct;
	}

	public String getBkDdftCc() {
		return this.bkDdftCc;
	}

	public void setBkDdftCc(String bkDdftCc) {
		this.bkDdftCc = bkDdftCc;
	}

	public String getBkDftapAcct() {
		return this.bkDftapAcct;
	}

	public void setBkDftapAcct(String bkDftapAcct) {
		this.bkDftapAcct = bkDftapAcct;
	}

	public String getBkDftapCc() {
		return this.bkDftapCc;
	}

	public void setBkDftapCc(String bkDftapCc) {
		this.bkDftapCc = bkDftapCc;
	}

	public String getBkBktxAcct() {
		return this.bkBktxAcct;
	}

	public void setBkBktxAcct(String bkBktxAcct) {
		this.bkBktxAcct = bkBktxAcct;
	}

	public String getBkBktxCc() {
		return this.bkBktxCc;
	}

	public void setBkBktxCc(String bkBktxCc) {
		this.bkBktxCc = bkBktxCc;
	}

	public String getBkCdftAcct() {
		return this.bkCdftAcct;
	}

	public void setBkCdftAcct(String bkCdftAcct) {
		this.bkCdftAcct = bkCdftAcct;
	}

	public String getBkCdftCc() {
		return this.bkCdftCc;
	}

	public void setBkCdftCc(String bkCdftCc) {
		this.bkCdftCc = bkCdftCc;
	}

	public String getBkEdftAcct() {
		return this.bkEdftAcct;
	}

	public void setBkEdftAcct(String bkEdftAcct) {
		this.bkEdftAcct = bkEdftAcct;
	}

	public String getBkEdftCc() {
		return this.bkEdftCc;
	}

	public void setBkEdftCc(String bkEdftCc) {
		this.bkEdftCc = bkEdftCc;
	}

	public String getBkQadc01() {
		return this.bkQadc01;
	}

	public void setBkQadc01(String bkQadc01) {
		this.bkQadc01 = bkQadc01;
	}

	public String getBkQadc06() {
		return this.bkQadc06;
	}

	public void setBkQadc06(String bkQadc06) {
		this.bkQadc06 = bkQadc06;
	}

	public String getBkQadc07() {
		return this.bkQadc07;
	}

	public void setBkQadc07(String bkQadc07) {
		this.bkQadc07 = bkQadc07;
	}

	public String getBkQadc08() {
		return this.bkQadc08;
	}

	public void setBkQadc08(String bkQadc08) {
		this.bkQadc08 = bkQadc08;
	}

	public String getBkQadc09() {
		return this.bkQadc09;
	}

	public void setBkQadc09(String bkQadc09) {
		this.bkQadc09 = bkQadc09;
	}

	public String getBkSub() {
		return this.bkSub;
	}

	public void setBkSub(String bkSub) {
		this.bkSub = bkSub;
	}

	public String getBkBkchgSub() {
		return this.bkBkchgSub;
	}

	public void setBkBkchgSub(String bkBkchgSub) {
		this.bkBkchgSub = bkBkchgSub;
	}

	public String getBkBktxSub() {
		return this.bkBktxSub;
	}

	public void setBkBktxSub(String bkBktxSub) {
		this.bkBktxSub = bkBktxSub;
	}

	public String getBkCdftSub() {
		return this.bkCdftSub;
	}

	public void setBkCdftSub(String bkCdftSub) {
		this.bkCdftSub = bkCdftSub;
	}

	public String getBkDdftSub() {
		return this.bkDdftSub;
	}

	public void setBkDdftSub(String bkDdftSub) {
		this.bkDdftSub = bkDdftSub;
	}

	public String getBkDftapSub() {
		return this.bkDftapSub;
	}

	public void setBkDftapSub(String bkDftapSub) {
		this.bkDftapSub = bkDftapSub;
	}

	public String getBkDftarSub() {
		return this.bkDftarSub;
	}

	public void setBkDftarSub(String bkDftarSub) {
		this.bkDftarSub = bkDftarSub;
	}

	public String getBkDiscSub() {
		return this.bkDiscSub;
	}

	public void setBkDiscSub(String bkDiscSub) {
		this.bkDiscSub = bkDiscSub;
	}

	public String getBkEdftSub() {
		return this.bkEdftSub;
	}

	public void setBkEdftSub(String bkEdftSub) {
		this.bkEdftSub = bkEdftSub;
	}

	public String getBkPipSub() {
		return this.bkPipSub;
	}

	public void setBkPipSub(String bkPipSub) {
		this.bkPipSub = bkPipSub;
	}

	public String getBkQadc11() {
		return this.bkQadc11;
	}

	public void setBkQadc11(String bkQadc11) {
		this.bkQadc11 = bkQadc11;
	}

	public String getBkValidation() {
		return this.bkValidation;
	}

	public void setBkValidation(String bkValidation) {
		this.bkValidation = bkValidation;
	}

	public Double getOidBkMstr() {
		return this.oidBkMstr;
	}

	public void setOidBkMstr(Double oidBkMstr) {
		this.oidBkMstr = oidBkMstr;
	}

}