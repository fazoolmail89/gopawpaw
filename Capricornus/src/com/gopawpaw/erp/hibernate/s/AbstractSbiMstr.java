package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSbiMstr entity provides the base persistence definition of the
 * SbiMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbiMstr implements java.io.Serializable {

	// Fields

	private SbiMstrId id;
	private String sbiXmission;
	private Date sbiRespDate;
	private Double sbiAmt;
	private String sbiCurr;
	private Integer sbiLines;
	private Double sbiCtrlAmt;
	private String sbiCheck;
	private String sbiModUserid;
	private Date sbiModDate;
	private String sbiUser1;
	private String sbiUser2;
	private String sbiUser3;
	private String sbiUser4;
	private String sbiUser5;
	private String sbiQadc01;
	private String sbiQadc02;
	private String sbiQadc03;
	private String sbiQadc04;
	private String sbiQadc05;
	private String sbiQadc06;
	private String sbiQadc07;
	private String sbiQadc08;
	private String sbiQadc09;
	private String sbiQadc10;
	private Integer sbiQadi01;
	private Integer sbiQadi02;
	private Integer sbiQadi03;
	private Integer sbiQadi04;
	private Integer sbiQadi05;
	private Double sbiQadd01;
	private Double sbiQadd02;
	private Double sbiQadd03;
	private Double sbiQadd04;
	private Double sbiQadd05;
	private Boolean sbiQadl01;
	private Boolean sbiQadl02;
	private Boolean sbiQadl03;
	private Boolean sbiQadl04;
	private Boolean sbiQadl05;
	private Date sbiQadt01;
	private Date sbiQadt02;
	private Date sbiQadt03;
	private Date sbiQadt04;
	private Date sbiQadt05;
	private Double oidSbiMstr;

	// Constructors

	/** default constructor */
	public AbstractSbiMstr() {
	}

	/** minimal constructor */
	public AbstractSbiMstr(SbiMstrId id, String sbiXmission, Double oidSbiMstr) {
		this.id = id;
		this.sbiXmission = sbiXmission;
		this.oidSbiMstr = oidSbiMstr;
	}

	/** full constructor */
	public AbstractSbiMstr(SbiMstrId id, String sbiXmission, Date sbiRespDate,
			Double sbiAmt, String sbiCurr, Integer sbiLines, Double sbiCtrlAmt,
			String sbiCheck, String sbiModUserid, Date sbiModDate,
			String sbiUser1, String sbiUser2, String sbiUser3, String sbiUser4,
			String sbiUser5, String sbiQadc01, String sbiQadc02,
			String sbiQadc03, String sbiQadc04, String sbiQadc05,
			String sbiQadc06, String sbiQadc07, String sbiQadc08,
			String sbiQadc09, String sbiQadc10, Integer sbiQadi01,
			Integer sbiQadi02, Integer sbiQadi03, Integer sbiQadi04,
			Integer sbiQadi05, Double sbiQadd01, Double sbiQadd02,
			Double sbiQadd03, Double sbiQadd04, Double sbiQadd05,
			Boolean sbiQadl01, Boolean sbiQadl02, Boolean sbiQadl03,
			Boolean sbiQadl04, Boolean sbiQadl05, Date sbiQadt01,
			Date sbiQadt02, Date sbiQadt03, Date sbiQadt04, Date sbiQadt05,
			Double oidSbiMstr) {
		this.id = id;
		this.sbiXmission = sbiXmission;
		this.sbiRespDate = sbiRespDate;
		this.sbiAmt = sbiAmt;
		this.sbiCurr = sbiCurr;
		this.sbiLines = sbiLines;
		this.sbiCtrlAmt = sbiCtrlAmt;
		this.sbiCheck = sbiCheck;
		this.sbiModUserid = sbiModUserid;
		this.sbiModDate = sbiModDate;
		this.sbiUser1 = sbiUser1;
		this.sbiUser2 = sbiUser2;
		this.sbiUser3 = sbiUser3;
		this.sbiUser4 = sbiUser4;
		this.sbiUser5 = sbiUser5;
		this.sbiQadc01 = sbiQadc01;
		this.sbiQadc02 = sbiQadc02;
		this.sbiQadc03 = sbiQadc03;
		this.sbiQadc04 = sbiQadc04;
		this.sbiQadc05 = sbiQadc05;
		this.sbiQadc06 = sbiQadc06;
		this.sbiQadc07 = sbiQadc07;
		this.sbiQadc08 = sbiQadc08;
		this.sbiQadc09 = sbiQadc09;
		this.sbiQadc10 = sbiQadc10;
		this.sbiQadi01 = sbiQadi01;
		this.sbiQadi02 = sbiQadi02;
		this.sbiQadi03 = sbiQadi03;
		this.sbiQadi04 = sbiQadi04;
		this.sbiQadi05 = sbiQadi05;
		this.sbiQadd01 = sbiQadd01;
		this.sbiQadd02 = sbiQadd02;
		this.sbiQadd03 = sbiQadd03;
		this.sbiQadd04 = sbiQadd04;
		this.sbiQadd05 = sbiQadd05;
		this.sbiQadl01 = sbiQadl01;
		this.sbiQadl02 = sbiQadl02;
		this.sbiQadl03 = sbiQadl03;
		this.sbiQadl04 = sbiQadl04;
		this.sbiQadl05 = sbiQadl05;
		this.sbiQadt01 = sbiQadt01;
		this.sbiQadt02 = sbiQadt02;
		this.sbiQadt03 = sbiQadt03;
		this.sbiQadt04 = sbiQadt04;
		this.sbiQadt05 = sbiQadt05;
		this.oidSbiMstr = oidSbiMstr;
	}

	// Property accessors

	public SbiMstrId getId() {
		return this.id;
	}

	public void setId(SbiMstrId id) {
		this.id = id;
	}

	public String getSbiXmission() {
		return this.sbiXmission;
	}

	public void setSbiXmission(String sbiXmission) {
		this.sbiXmission = sbiXmission;
	}

	public Date getSbiRespDate() {
		return this.sbiRespDate;
	}

	public void setSbiRespDate(Date sbiRespDate) {
		this.sbiRespDate = sbiRespDate;
	}

	public Double getSbiAmt() {
		return this.sbiAmt;
	}

	public void setSbiAmt(Double sbiAmt) {
		this.sbiAmt = sbiAmt;
	}

	public String getSbiCurr() {
		return this.sbiCurr;
	}

	public void setSbiCurr(String sbiCurr) {
		this.sbiCurr = sbiCurr;
	}

	public Integer getSbiLines() {
		return this.sbiLines;
	}

	public void setSbiLines(Integer sbiLines) {
		this.sbiLines = sbiLines;
	}

	public Double getSbiCtrlAmt() {
		return this.sbiCtrlAmt;
	}

	public void setSbiCtrlAmt(Double sbiCtrlAmt) {
		this.sbiCtrlAmt = sbiCtrlAmt;
	}

	public String getSbiCheck() {
		return this.sbiCheck;
	}

	public void setSbiCheck(String sbiCheck) {
		this.sbiCheck = sbiCheck;
	}

	public String getSbiModUserid() {
		return this.sbiModUserid;
	}

	public void setSbiModUserid(String sbiModUserid) {
		this.sbiModUserid = sbiModUserid;
	}

	public Date getSbiModDate() {
		return this.sbiModDate;
	}

	public void setSbiModDate(Date sbiModDate) {
		this.sbiModDate = sbiModDate;
	}

	public String getSbiUser1() {
		return this.sbiUser1;
	}

	public void setSbiUser1(String sbiUser1) {
		this.sbiUser1 = sbiUser1;
	}

	public String getSbiUser2() {
		return this.sbiUser2;
	}

	public void setSbiUser2(String sbiUser2) {
		this.sbiUser2 = sbiUser2;
	}

	public String getSbiUser3() {
		return this.sbiUser3;
	}

	public void setSbiUser3(String sbiUser3) {
		this.sbiUser3 = sbiUser3;
	}

	public String getSbiUser4() {
		return this.sbiUser4;
	}

	public void setSbiUser4(String sbiUser4) {
		this.sbiUser4 = sbiUser4;
	}

	public String getSbiUser5() {
		return this.sbiUser5;
	}

	public void setSbiUser5(String sbiUser5) {
		this.sbiUser5 = sbiUser5;
	}

	public String getSbiQadc01() {
		return this.sbiQadc01;
	}

	public void setSbiQadc01(String sbiQadc01) {
		this.sbiQadc01 = sbiQadc01;
	}

	public String getSbiQadc02() {
		return this.sbiQadc02;
	}

	public void setSbiQadc02(String sbiQadc02) {
		this.sbiQadc02 = sbiQadc02;
	}

	public String getSbiQadc03() {
		return this.sbiQadc03;
	}

	public void setSbiQadc03(String sbiQadc03) {
		this.sbiQadc03 = sbiQadc03;
	}

	public String getSbiQadc04() {
		return this.sbiQadc04;
	}

	public void setSbiQadc04(String sbiQadc04) {
		this.sbiQadc04 = sbiQadc04;
	}

	public String getSbiQadc05() {
		return this.sbiQadc05;
	}

	public void setSbiQadc05(String sbiQadc05) {
		this.sbiQadc05 = sbiQadc05;
	}

	public String getSbiQadc06() {
		return this.sbiQadc06;
	}

	public void setSbiQadc06(String sbiQadc06) {
		this.sbiQadc06 = sbiQadc06;
	}

	public String getSbiQadc07() {
		return this.sbiQadc07;
	}

	public void setSbiQadc07(String sbiQadc07) {
		this.sbiQadc07 = sbiQadc07;
	}

	public String getSbiQadc08() {
		return this.sbiQadc08;
	}

	public void setSbiQadc08(String sbiQadc08) {
		this.sbiQadc08 = sbiQadc08;
	}

	public String getSbiQadc09() {
		return this.sbiQadc09;
	}

	public void setSbiQadc09(String sbiQadc09) {
		this.sbiQadc09 = sbiQadc09;
	}

	public String getSbiQadc10() {
		return this.sbiQadc10;
	}

	public void setSbiQadc10(String sbiQadc10) {
		this.sbiQadc10 = sbiQadc10;
	}

	public Integer getSbiQadi01() {
		return this.sbiQadi01;
	}

	public void setSbiQadi01(Integer sbiQadi01) {
		this.sbiQadi01 = sbiQadi01;
	}

	public Integer getSbiQadi02() {
		return this.sbiQadi02;
	}

	public void setSbiQadi02(Integer sbiQadi02) {
		this.sbiQadi02 = sbiQadi02;
	}

	public Integer getSbiQadi03() {
		return this.sbiQadi03;
	}

	public void setSbiQadi03(Integer sbiQadi03) {
		this.sbiQadi03 = sbiQadi03;
	}

	public Integer getSbiQadi04() {
		return this.sbiQadi04;
	}

	public void setSbiQadi04(Integer sbiQadi04) {
		this.sbiQadi04 = sbiQadi04;
	}

	public Integer getSbiQadi05() {
		return this.sbiQadi05;
	}

	public void setSbiQadi05(Integer sbiQadi05) {
		this.sbiQadi05 = sbiQadi05;
	}

	public Double getSbiQadd01() {
		return this.sbiQadd01;
	}

	public void setSbiQadd01(Double sbiQadd01) {
		this.sbiQadd01 = sbiQadd01;
	}

	public Double getSbiQadd02() {
		return this.sbiQadd02;
	}

	public void setSbiQadd02(Double sbiQadd02) {
		this.sbiQadd02 = sbiQadd02;
	}

	public Double getSbiQadd03() {
		return this.sbiQadd03;
	}

	public void setSbiQadd03(Double sbiQadd03) {
		this.sbiQadd03 = sbiQadd03;
	}

	public Double getSbiQadd04() {
		return this.sbiQadd04;
	}

	public void setSbiQadd04(Double sbiQadd04) {
		this.sbiQadd04 = sbiQadd04;
	}

	public Double getSbiQadd05() {
		return this.sbiQadd05;
	}

	public void setSbiQadd05(Double sbiQadd05) {
		this.sbiQadd05 = sbiQadd05;
	}

	public Boolean getSbiQadl01() {
		return this.sbiQadl01;
	}

	public void setSbiQadl01(Boolean sbiQadl01) {
		this.sbiQadl01 = sbiQadl01;
	}

	public Boolean getSbiQadl02() {
		return this.sbiQadl02;
	}

	public void setSbiQadl02(Boolean sbiQadl02) {
		this.sbiQadl02 = sbiQadl02;
	}

	public Boolean getSbiQadl03() {
		return this.sbiQadl03;
	}

	public void setSbiQadl03(Boolean sbiQadl03) {
		this.sbiQadl03 = sbiQadl03;
	}

	public Boolean getSbiQadl04() {
		return this.sbiQadl04;
	}

	public void setSbiQadl04(Boolean sbiQadl04) {
		this.sbiQadl04 = sbiQadl04;
	}

	public Boolean getSbiQadl05() {
		return this.sbiQadl05;
	}

	public void setSbiQadl05(Boolean sbiQadl05) {
		this.sbiQadl05 = sbiQadl05;
	}

	public Date getSbiQadt01() {
		return this.sbiQadt01;
	}

	public void setSbiQadt01(Date sbiQadt01) {
		this.sbiQadt01 = sbiQadt01;
	}

	public Date getSbiQadt02() {
		return this.sbiQadt02;
	}

	public void setSbiQadt02(Date sbiQadt02) {
		this.sbiQadt02 = sbiQadt02;
	}

	public Date getSbiQadt03() {
		return this.sbiQadt03;
	}

	public void setSbiQadt03(Date sbiQadt03) {
		this.sbiQadt03 = sbiQadt03;
	}

	public Date getSbiQadt04() {
		return this.sbiQadt04;
	}

	public void setSbiQadt04(Date sbiQadt04) {
		this.sbiQadt04 = sbiQadt04;
	}

	public Date getSbiQadt05() {
		return this.sbiQadt05;
	}

	public void setSbiQadt05(Date sbiQadt05) {
		this.sbiQadt05 = sbiQadt05;
	}

	public Double getOidSbiMstr() {
		return this.oidSbiMstr;
	}

	public void setOidSbiMstr(Double oidSbiMstr) {
		this.oidSbiMstr = oidSbiMstr;
	}

}