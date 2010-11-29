package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * AbstractVdfMstr entity provides the base persistence definition of the
 * VdfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVdfMstr implements java.io.Serializable {

	// Fields

	private VdfMstrId id;
	private String vdfBirthcity;
	private Date vdfBirthday;
	private String vdfFiscalCode;
	private String vdfForFiscalCode;
	private String vdfRsnCode;
	private Boolean vdfWithholdtax;
	private String vdfModUserid;
	private Date vdfModDate;
	private String vdfUser1;
	private String vdfUser2;
	private String vdfUserc03;
	private String vdfUserc04;
	private String vdfUserc05;
	private Double vdfUserd01;
	private Double vdfUserd02;
	private Integer vdfUseri01;
	private Integer vdfUseri02;
	private Boolean vdfUserl01;
	private Boolean vdfUserl02;
	private Date vdfUsert01;
	private Date vdfUsert02;
	private String vdfQadc01;
	private String vdfQadc02;
	private String vdfQadc03;
	private String vdfQadc04;
	private String vdfQadc05;
	private Double vdfQadd01;
	private Double vdfQadd02;
	private Integer vdfQadi01;
	private Integer vdfQadi02;
	private Boolean vdfQadl01;
	private Boolean vdfQadl02;
	private Date vdfQadt01;
	private Date vdfQadt02;
	private Double oidVdfMstr;

	// Constructors

	/** default constructor */
	public AbstractVdfMstr() {
	}

	/** minimal constructor */
	public AbstractVdfMstr(VdfMstrId id, String vdfBirthcity,
			String vdfFiscalCode, String vdfForFiscalCode, String vdfRsnCode,
			Boolean vdfWithholdtax, String vdfModUserid, Date vdfModDate,
			String vdfUser1, String vdfUser2, String vdfUserc03,
			String vdfUserc04, String vdfUserc05, Double vdfUserd01,
			Double vdfUserd02, Integer vdfUseri01, Integer vdfUseri02,
			Boolean vdfUserl01, Boolean vdfUserl02, String vdfQadc01,
			String vdfQadc02, String vdfQadc03, String vdfQadc04,
			String vdfQadc05, Double vdfQadd01, Double vdfQadd02,
			Integer vdfQadi01, Integer vdfQadi02, Boolean vdfQadl01,
			Boolean vdfQadl02, Double oidVdfMstr) {
		this.id = id;
		this.vdfBirthcity = vdfBirthcity;
		this.vdfFiscalCode = vdfFiscalCode;
		this.vdfForFiscalCode = vdfForFiscalCode;
		this.vdfRsnCode = vdfRsnCode;
		this.vdfWithholdtax = vdfWithholdtax;
		this.vdfModUserid = vdfModUserid;
		this.vdfModDate = vdfModDate;
		this.vdfUser1 = vdfUser1;
		this.vdfUser2 = vdfUser2;
		this.vdfUserc03 = vdfUserc03;
		this.vdfUserc04 = vdfUserc04;
		this.vdfUserc05 = vdfUserc05;
		this.vdfUserd01 = vdfUserd01;
		this.vdfUserd02 = vdfUserd02;
		this.vdfUseri01 = vdfUseri01;
		this.vdfUseri02 = vdfUseri02;
		this.vdfUserl01 = vdfUserl01;
		this.vdfUserl02 = vdfUserl02;
		this.vdfQadc01 = vdfQadc01;
		this.vdfQadc02 = vdfQadc02;
		this.vdfQadc03 = vdfQadc03;
		this.vdfQadc04 = vdfQadc04;
		this.vdfQadc05 = vdfQadc05;
		this.vdfQadd01 = vdfQadd01;
		this.vdfQadd02 = vdfQadd02;
		this.vdfQadi01 = vdfQadi01;
		this.vdfQadi02 = vdfQadi02;
		this.vdfQadl01 = vdfQadl01;
		this.vdfQadl02 = vdfQadl02;
		this.oidVdfMstr = oidVdfMstr;
	}

	/** full constructor */
	public AbstractVdfMstr(VdfMstrId id, String vdfBirthcity, Date vdfBirthday,
			String vdfFiscalCode, String vdfForFiscalCode, String vdfRsnCode,
			Boolean vdfWithholdtax, String vdfModUserid, Date vdfModDate,
			String vdfUser1, String vdfUser2, String vdfUserc03,
			String vdfUserc04, String vdfUserc05, Double vdfUserd01,
			Double vdfUserd02, Integer vdfUseri01, Integer vdfUseri02,
			Boolean vdfUserl01, Boolean vdfUserl02, Date vdfUsert01,
			Date vdfUsert02, String vdfQadc01, String vdfQadc02,
			String vdfQadc03, String vdfQadc04, String vdfQadc05,
			Double vdfQadd01, Double vdfQadd02, Integer vdfQadi01,
			Integer vdfQadi02, Boolean vdfQadl01, Boolean vdfQadl02,
			Date vdfQadt01, Date vdfQadt02, Double oidVdfMstr) {
		this.id = id;
		this.vdfBirthcity = vdfBirthcity;
		this.vdfBirthday = vdfBirthday;
		this.vdfFiscalCode = vdfFiscalCode;
		this.vdfForFiscalCode = vdfForFiscalCode;
		this.vdfRsnCode = vdfRsnCode;
		this.vdfWithholdtax = vdfWithholdtax;
		this.vdfModUserid = vdfModUserid;
		this.vdfModDate = vdfModDate;
		this.vdfUser1 = vdfUser1;
		this.vdfUser2 = vdfUser2;
		this.vdfUserc03 = vdfUserc03;
		this.vdfUserc04 = vdfUserc04;
		this.vdfUserc05 = vdfUserc05;
		this.vdfUserd01 = vdfUserd01;
		this.vdfUserd02 = vdfUserd02;
		this.vdfUseri01 = vdfUseri01;
		this.vdfUseri02 = vdfUseri02;
		this.vdfUserl01 = vdfUserl01;
		this.vdfUserl02 = vdfUserl02;
		this.vdfUsert01 = vdfUsert01;
		this.vdfUsert02 = vdfUsert02;
		this.vdfQadc01 = vdfQadc01;
		this.vdfQadc02 = vdfQadc02;
		this.vdfQadc03 = vdfQadc03;
		this.vdfQadc04 = vdfQadc04;
		this.vdfQadc05 = vdfQadc05;
		this.vdfQadd01 = vdfQadd01;
		this.vdfQadd02 = vdfQadd02;
		this.vdfQadi01 = vdfQadi01;
		this.vdfQadi02 = vdfQadi02;
		this.vdfQadl01 = vdfQadl01;
		this.vdfQadl02 = vdfQadl02;
		this.vdfQadt01 = vdfQadt01;
		this.vdfQadt02 = vdfQadt02;
		this.oidVdfMstr = oidVdfMstr;
	}

	// Property accessors

	public VdfMstrId getId() {
		return this.id;
	}

	public void setId(VdfMstrId id) {
		this.id = id;
	}

	public String getVdfBirthcity() {
		return this.vdfBirthcity;
	}

	public void setVdfBirthcity(String vdfBirthcity) {
		this.vdfBirthcity = vdfBirthcity;
	}

	public Date getVdfBirthday() {
		return this.vdfBirthday;
	}

	public void setVdfBirthday(Date vdfBirthday) {
		this.vdfBirthday = vdfBirthday;
	}

	public String getVdfFiscalCode() {
		return this.vdfFiscalCode;
	}

	public void setVdfFiscalCode(String vdfFiscalCode) {
		this.vdfFiscalCode = vdfFiscalCode;
	}

	public String getVdfForFiscalCode() {
		return this.vdfForFiscalCode;
	}

	public void setVdfForFiscalCode(String vdfForFiscalCode) {
		this.vdfForFiscalCode = vdfForFiscalCode;
	}

	public String getVdfRsnCode() {
		return this.vdfRsnCode;
	}

	public void setVdfRsnCode(String vdfRsnCode) {
		this.vdfRsnCode = vdfRsnCode;
	}

	public Boolean getVdfWithholdtax() {
		return this.vdfWithholdtax;
	}

	public void setVdfWithholdtax(Boolean vdfWithholdtax) {
		this.vdfWithholdtax = vdfWithholdtax;
	}

	public String getVdfModUserid() {
		return this.vdfModUserid;
	}

	public void setVdfModUserid(String vdfModUserid) {
		this.vdfModUserid = vdfModUserid;
	}

	public Date getVdfModDate() {
		return this.vdfModDate;
	}

	public void setVdfModDate(Date vdfModDate) {
		this.vdfModDate = vdfModDate;
	}

	public String getVdfUser1() {
		return this.vdfUser1;
	}

	public void setVdfUser1(String vdfUser1) {
		this.vdfUser1 = vdfUser1;
	}

	public String getVdfUser2() {
		return this.vdfUser2;
	}

	public void setVdfUser2(String vdfUser2) {
		this.vdfUser2 = vdfUser2;
	}

	public String getVdfUserc03() {
		return this.vdfUserc03;
	}

	public void setVdfUserc03(String vdfUserc03) {
		this.vdfUserc03 = vdfUserc03;
	}

	public String getVdfUserc04() {
		return this.vdfUserc04;
	}

	public void setVdfUserc04(String vdfUserc04) {
		this.vdfUserc04 = vdfUserc04;
	}

	public String getVdfUserc05() {
		return this.vdfUserc05;
	}

	public void setVdfUserc05(String vdfUserc05) {
		this.vdfUserc05 = vdfUserc05;
	}

	public Double getVdfUserd01() {
		return this.vdfUserd01;
	}

	public void setVdfUserd01(Double vdfUserd01) {
		this.vdfUserd01 = vdfUserd01;
	}

	public Double getVdfUserd02() {
		return this.vdfUserd02;
	}

	public void setVdfUserd02(Double vdfUserd02) {
		this.vdfUserd02 = vdfUserd02;
	}

	public Integer getVdfUseri01() {
		return this.vdfUseri01;
	}

	public void setVdfUseri01(Integer vdfUseri01) {
		this.vdfUseri01 = vdfUseri01;
	}

	public Integer getVdfUseri02() {
		return this.vdfUseri02;
	}

	public void setVdfUseri02(Integer vdfUseri02) {
		this.vdfUseri02 = vdfUseri02;
	}

	public Boolean getVdfUserl01() {
		return this.vdfUserl01;
	}

	public void setVdfUserl01(Boolean vdfUserl01) {
		this.vdfUserl01 = vdfUserl01;
	}

	public Boolean getVdfUserl02() {
		return this.vdfUserl02;
	}

	public void setVdfUserl02(Boolean vdfUserl02) {
		this.vdfUserl02 = vdfUserl02;
	}

	public Date getVdfUsert01() {
		return this.vdfUsert01;
	}

	public void setVdfUsert01(Date vdfUsert01) {
		this.vdfUsert01 = vdfUsert01;
	}

	public Date getVdfUsert02() {
		return this.vdfUsert02;
	}

	public void setVdfUsert02(Date vdfUsert02) {
		this.vdfUsert02 = vdfUsert02;
	}

	public String getVdfQadc01() {
		return this.vdfQadc01;
	}

	public void setVdfQadc01(String vdfQadc01) {
		this.vdfQadc01 = vdfQadc01;
	}

	public String getVdfQadc02() {
		return this.vdfQadc02;
	}

	public void setVdfQadc02(String vdfQadc02) {
		this.vdfQadc02 = vdfQadc02;
	}

	public String getVdfQadc03() {
		return this.vdfQadc03;
	}

	public void setVdfQadc03(String vdfQadc03) {
		this.vdfQadc03 = vdfQadc03;
	}

	public String getVdfQadc04() {
		return this.vdfQadc04;
	}

	public void setVdfQadc04(String vdfQadc04) {
		this.vdfQadc04 = vdfQadc04;
	}

	public String getVdfQadc05() {
		return this.vdfQadc05;
	}

	public void setVdfQadc05(String vdfQadc05) {
		this.vdfQadc05 = vdfQadc05;
	}

	public Double getVdfQadd01() {
		return this.vdfQadd01;
	}

	public void setVdfQadd01(Double vdfQadd01) {
		this.vdfQadd01 = vdfQadd01;
	}

	public Double getVdfQadd02() {
		return this.vdfQadd02;
	}

	public void setVdfQadd02(Double vdfQadd02) {
		this.vdfQadd02 = vdfQadd02;
	}

	public Integer getVdfQadi01() {
		return this.vdfQadi01;
	}

	public void setVdfQadi01(Integer vdfQadi01) {
		this.vdfQadi01 = vdfQadi01;
	}

	public Integer getVdfQadi02() {
		return this.vdfQadi02;
	}

	public void setVdfQadi02(Integer vdfQadi02) {
		this.vdfQadi02 = vdfQadi02;
	}

	public Boolean getVdfQadl01() {
		return this.vdfQadl01;
	}

	public void setVdfQadl01(Boolean vdfQadl01) {
		this.vdfQadl01 = vdfQadl01;
	}

	public Boolean getVdfQadl02() {
		return this.vdfQadl02;
	}

	public void setVdfQadl02(Boolean vdfQadl02) {
		this.vdfQadl02 = vdfQadl02;
	}

	public Date getVdfQadt01() {
		return this.vdfQadt01;
	}

	public void setVdfQadt01(Date vdfQadt01) {
		this.vdfQadt01 = vdfQadt01;
	}

	public Date getVdfQadt02() {
		return this.vdfQadt02;
	}

	public void setVdfQadt02(Date vdfQadt02) {
		this.vdfQadt02 = vdfQadt02;
	}

	public Double getOidVdfMstr() {
		return this.oidVdfMstr;
	}

	public void setOidVdfMstr(Double oidVdfMstr) {
		this.oidVdfMstr = oidVdfMstr;
	}

}