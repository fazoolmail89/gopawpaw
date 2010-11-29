package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTeMstr entity provides the base persistence definition of the TeMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTeMstr implements java.io.Serializable {

	// Fields

	private TeMstrId id;
	private String teExpType;
	private String teUpdt;
	private String teDest;
	private String tePgm;
	private String teUserid;
	private Date teDate;
	private String teTime;
	private Date teDateExp;
	private String teTimeExp;
	private Date teDateDeliv;
	private String teTimeDeliv;
	private Integer tePgmErrs;
	private Integer tePgmWarn;
	private String tePgmMsgs;
	private String teData;
	private String teUser1;
	private String teUser2;
	private String teQadc01;
	private String teQadc02;
	private String teQadc03;
	private String teQadc04;
	private Integer teQadi05;
	private Integer teQadi06;
	private Double teQadd07;
	private Double teQadd08;
	private Date teQadt09;
	private Date teQadt10;
	private Boolean teQadl11;
	private Boolean teQadl12;
	private String teChr01;
	private String teChr02;
	private Double teDec01;
	private Double teDec02;
	private Date teDte01;
	private Date teDte02;
	private Boolean teLog01;
	private Boolean teLog02;
	private Double oidTeMstr;

	// Constructors

	/** default constructor */
	public AbstractTeMstr() {
	}

	/** minimal constructor */
	public AbstractTeMstr(TeMstrId id, Double oidTeMstr) {
		this.id = id;
		this.oidTeMstr = oidTeMstr;
	}

	/** full constructor */
	public AbstractTeMstr(TeMstrId id, String teExpType, String teUpdt,
			String teDest, String tePgm, String teUserid, Date teDate,
			String teTime, Date teDateExp, String teTimeExp, Date teDateDeliv,
			String teTimeDeliv, Integer tePgmErrs, Integer tePgmWarn,
			String tePgmMsgs, String teData, String teUser1, String teUser2,
			String teQadc01, String teQadc02, String teQadc03, String teQadc04,
			Integer teQadi05, Integer teQadi06, Double teQadd07,
			Double teQadd08, Date teQadt09, Date teQadt10, Boolean teQadl11,
			Boolean teQadl12, String teChr01, String teChr02, Double teDec01,
			Double teDec02, Date teDte01, Date teDte02, Boolean teLog01,
			Boolean teLog02, Double oidTeMstr) {
		this.id = id;
		this.teExpType = teExpType;
		this.teUpdt = teUpdt;
		this.teDest = teDest;
		this.tePgm = tePgm;
		this.teUserid = teUserid;
		this.teDate = teDate;
		this.teTime = teTime;
		this.teDateExp = teDateExp;
		this.teTimeExp = teTimeExp;
		this.teDateDeliv = teDateDeliv;
		this.teTimeDeliv = teTimeDeliv;
		this.tePgmErrs = tePgmErrs;
		this.tePgmWarn = tePgmWarn;
		this.tePgmMsgs = tePgmMsgs;
		this.teData = teData;
		this.teUser1 = teUser1;
		this.teUser2 = teUser2;
		this.teQadc01 = teQadc01;
		this.teQadc02 = teQadc02;
		this.teQadc03 = teQadc03;
		this.teQadc04 = teQadc04;
		this.teQadi05 = teQadi05;
		this.teQadi06 = teQadi06;
		this.teQadd07 = teQadd07;
		this.teQadd08 = teQadd08;
		this.teQadt09 = teQadt09;
		this.teQadt10 = teQadt10;
		this.teQadl11 = teQadl11;
		this.teQadl12 = teQadl12;
		this.teChr01 = teChr01;
		this.teChr02 = teChr02;
		this.teDec01 = teDec01;
		this.teDec02 = teDec02;
		this.teDte01 = teDte01;
		this.teDte02 = teDte02;
		this.teLog01 = teLog01;
		this.teLog02 = teLog02;
		this.oidTeMstr = oidTeMstr;
	}

	// Property accessors

	public TeMstrId getId() {
		return this.id;
	}

	public void setId(TeMstrId id) {
		this.id = id;
	}

	public String getTeExpType() {
		return this.teExpType;
	}

	public void setTeExpType(String teExpType) {
		this.teExpType = teExpType;
	}

	public String getTeUpdt() {
		return this.teUpdt;
	}

	public void setTeUpdt(String teUpdt) {
		this.teUpdt = teUpdt;
	}

	public String getTeDest() {
		return this.teDest;
	}

	public void setTeDest(String teDest) {
		this.teDest = teDest;
	}

	public String getTePgm() {
		return this.tePgm;
	}

	public void setTePgm(String tePgm) {
		this.tePgm = tePgm;
	}

	public String getTeUserid() {
		return this.teUserid;
	}

	public void setTeUserid(String teUserid) {
		this.teUserid = teUserid;
	}

	public Date getTeDate() {
		return this.teDate;
	}

	public void setTeDate(Date teDate) {
		this.teDate = teDate;
	}

	public String getTeTime() {
		return this.teTime;
	}

	public void setTeTime(String teTime) {
		this.teTime = teTime;
	}

	public Date getTeDateExp() {
		return this.teDateExp;
	}

	public void setTeDateExp(Date teDateExp) {
		this.teDateExp = teDateExp;
	}

	public String getTeTimeExp() {
		return this.teTimeExp;
	}

	public void setTeTimeExp(String teTimeExp) {
		this.teTimeExp = teTimeExp;
	}

	public Date getTeDateDeliv() {
		return this.teDateDeliv;
	}

	public void setTeDateDeliv(Date teDateDeliv) {
		this.teDateDeliv = teDateDeliv;
	}

	public String getTeTimeDeliv() {
		return this.teTimeDeliv;
	}

	public void setTeTimeDeliv(String teTimeDeliv) {
		this.teTimeDeliv = teTimeDeliv;
	}

	public Integer getTePgmErrs() {
		return this.tePgmErrs;
	}

	public void setTePgmErrs(Integer tePgmErrs) {
		this.tePgmErrs = tePgmErrs;
	}

	public Integer getTePgmWarn() {
		return this.tePgmWarn;
	}

	public void setTePgmWarn(Integer tePgmWarn) {
		this.tePgmWarn = tePgmWarn;
	}

	public String getTePgmMsgs() {
		return this.tePgmMsgs;
	}

	public void setTePgmMsgs(String tePgmMsgs) {
		this.tePgmMsgs = tePgmMsgs;
	}

	public String getTeData() {
		return this.teData;
	}

	public void setTeData(String teData) {
		this.teData = teData;
	}

	public String getTeUser1() {
		return this.teUser1;
	}

	public void setTeUser1(String teUser1) {
		this.teUser1 = teUser1;
	}

	public String getTeUser2() {
		return this.teUser2;
	}

	public void setTeUser2(String teUser2) {
		this.teUser2 = teUser2;
	}

	public String getTeQadc01() {
		return this.teQadc01;
	}

	public void setTeQadc01(String teQadc01) {
		this.teQadc01 = teQadc01;
	}

	public String getTeQadc02() {
		return this.teQadc02;
	}

	public void setTeQadc02(String teQadc02) {
		this.teQadc02 = teQadc02;
	}

	public String getTeQadc03() {
		return this.teQadc03;
	}

	public void setTeQadc03(String teQadc03) {
		this.teQadc03 = teQadc03;
	}

	public String getTeQadc04() {
		return this.teQadc04;
	}

	public void setTeQadc04(String teQadc04) {
		this.teQadc04 = teQadc04;
	}

	public Integer getTeQadi05() {
		return this.teQadi05;
	}

	public void setTeQadi05(Integer teQadi05) {
		this.teQadi05 = teQadi05;
	}

	public Integer getTeQadi06() {
		return this.teQadi06;
	}

	public void setTeQadi06(Integer teQadi06) {
		this.teQadi06 = teQadi06;
	}

	public Double getTeQadd07() {
		return this.teQadd07;
	}

	public void setTeQadd07(Double teQadd07) {
		this.teQadd07 = teQadd07;
	}

	public Double getTeQadd08() {
		return this.teQadd08;
	}

	public void setTeQadd08(Double teQadd08) {
		this.teQadd08 = teQadd08;
	}

	public Date getTeQadt09() {
		return this.teQadt09;
	}

	public void setTeQadt09(Date teQadt09) {
		this.teQadt09 = teQadt09;
	}

	public Date getTeQadt10() {
		return this.teQadt10;
	}

	public void setTeQadt10(Date teQadt10) {
		this.teQadt10 = teQadt10;
	}

	public Boolean getTeQadl11() {
		return this.teQadl11;
	}

	public void setTeQadl11(Boolean teQadl11) {
		this.teQadl11 = teQadl11;
	}

	public Boolean getTeQadl12() {
		return this.teQadl12;
	}

	public void setTeQadl12(Boolean teQadl12) {
		this.teQadl12 = teQadl12;
	}

	public String getTeChr01() {
		return this.teChr01;
	}

	public void setTeChr01(String teChr01) {
		this.teChr01 = teChr01;
	}

	public String getTeChr02() {
		return this.teChr02;
	}

	public void setTeChr02(String teChr02) {
		this.teChr02 = teChr02;
	}

	public Double getTeDec01() {
		return this.teDec01;
	}

	public void setTeDec01(Double teDec01) {
		this.teDec01 = teDec01;
	}

	public Double getTeDec02() {
		return this.teDec02;
	}

	public void setTeDec02(Double teDec02) {
		this.teDec02 = teDec02;
	}

	public Date getTeDte01() {
		return this.teDte01;
	}

	public void setTeDte01(Date teDte01) {
		this.teDte01 = teDte01;
	}

	public Date getTeDte02() {
		return this.teDte02;
	}

	public void setTeDte02(Date teDte02) {
		this.teDte02 = teDte02;
	}

	public Boolean getTeLog01() {
		return this.teLog01;
	}

	public void setTeLog01(Boolean teLog01) {
		this.teLog01 = teLog01;
	}

	public Boolean getTeLog02() {
		return this.teLog02;
	}

	public void setTeLog02(Boolean teLog02) {
		this.teLog02 = teLog02;
	}

	public Double getOidTeMstr() {
		return this.oidTeMstr;
	}

	public void setOidTeMstr(Double oidTeMstr) {
		this.oidTeMstr = oidTeMstr;
	}

}