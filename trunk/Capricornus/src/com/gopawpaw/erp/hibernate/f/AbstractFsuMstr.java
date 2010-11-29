package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFsuMstr entity provides the base persistence definition of the
 * FsuMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsuMstr implements java.io.Serializable {

	// Fields

	private FsuMstrId id;
	private Boolean fsuCaTimeWnd;
	private Boolean fsuCaWoWnd;
	private Integer fsuDfltPri;
	private String fsuDfltQue;
	private String fsuEscDflt;
	private Integer fsuQueProg;
	private String fsuQuoteQue;
	private String fsuTimezone;
	private String fsuQadc02;
	private String fsuQadc03;
	private String fsuQadc04;
	private String fsuQadc05;
	private Boolean fsuQadl01;
	private Boolean fsuQadl02;
	private Boolean fsuQadl03;
	private Boolean fsuQadl04;
	private Boolean fsuQadl05;
	private Integer fsuQadi01;
	private Integer fsuQadi02;
	private Integer fsuQadi03;
	private Integer fsuQadi04;
	private Integer fsuQadi05;
	private String fsuUser1;
	private String fsuUser2;
	private String fsuQadc06;
	private Date fsuQadt01;
	private Date fsuQadt02;
	private Double oidFsuMstr;

	// Constructors

	/** default constructor */
	public AbstractFsuMstr() {
	}

	/** minimal constructor */
	public AbstractFsuMstr(FsuMstrId id, Double oidFsuMstr) {
		this.id = id;
		this.oidFsuMstr = oidFsuMstr;
	}

	/** full constructor */
	public AbstractFsuMstr(FsuMstrId id, Boolean fsuCaTimeWnd,
			Boolean fsuCaWoWnd, Integer fsuDfltPri, String fsuDfltQue,
			String fsuEscDflt, Integer fsuQueProg, String fsuQuoteQue,
			String fsuTimezone, String fsuQadc02, String fsuQadc03,
			String fsuQadc04, String fsuQadc05, Boolean fsuQadl01,
			Boolean fsuQadl02, Boolean fsuQadl03, Boolean fsuQadl04,
			Boolean fsuQadl05, Integer fsuQadi01, Integer fsuQadi02,
			Integer fsuQadi03, Integer fsuQadi04, Integer fsuQadi05,
			String fsuUser1, String fsuUser2, String fsuQadc06, Date fsuQadt01,
			Date fsuQadt02, Double oidFsuMstr) {
		this.id = id;
		this.fsuCaTimeWnd = fsuCaTimeWnd;
		this.fsuCaWoWnd = fsuCaWoWnd;
		this.fsuDfltPri = fsuDfltPri;
		this.fsuDfltQue = fsuDfltQue;
		this.fsuEscDflt = fsuEscDflt;
		this.fsuQueProg = fsuQueProg;
		this.fsuQuoteQue = fsuQuoteQue;
		this.fsuTimezone = fsuTimezone;
		this.fsuQadc02 = fsuQadc02;
		this.fsuQadc03 = fsuQadc03;
		this.fsuQadc04 = fsuQadc04;
		this.fsuQadc05 = fsuQadc05;
		this.fsuQadl01 = fsuQadl01;
		this.fsuQadl02 = fsuQadl02;
		this.fsuQadl03 = fsuQadl03;
		this.fsuQadl04 = fsuQadl04;
		this.fsuQadl05 = fsuQadl05;
		this.fsuQadi01 = fsuQadi01;
		this.fsuQadi02 = fsuQadi02;
		this.fsuQadi03 = fsuQadi03;
		this.fsuQadi04 = fsuQadi04;
		this.fsuQadi05 = fsuQadi05;
		this.fsuUser1 = fsuUser1;
		this.fsuUser2 = fsuUser2;
		this.fsuQadc06 = fsuQadc06;
		this.fsuQadt01 = fsuQadt01;
		this.fsuQadt02 = fsuQadt02;
		this.oidFsuMstr = oidFsuMstr;
	}

	// Property accessors

	public FsuMstrId getId() {
		return this.id;
	}

	public void setId(FsuMstrId id) {
		this.id = id;
	}

	public Boolean getFsuCaTimeWnd() {
		return this.fsuCaTimeWnd;
	}

	public void setFsuCaTimeWnd(Boolean fsuCaTimeWnd) {
		this.fsuCaTimeWnd = fsuCaTimeWnd;
	}

	public Boolean getFsuCaWoWnd() {
		return this.fsuCaWoWnd;
	}

	public void setFsuCaWoWnd(Boolean fsuCaWoWnd) {
		this.fsuCaWoWnd = fsuCaWoWnd;
	}

	public Integer getFsuDfltPri() {
		return this.fsuDfltPri;
	}

	public void setFsuDfltPri(Integer fsuDfltPri) {
		this.fsuDfltPri = fsuDfltPri;
	}

	public String getFsuDfltQue() {
		return this.fsuDfltQue;
	}

	public void setFsuDfltQue(String fsuDfltQue) {
		this.fsuDfltQue = fsuDfltQue;
	}

	public String getFsuEscDflt() {
		return this.fsuEscDflt;
	}

	public void setFsuEscDflt(String fsuEscDflt) {
		this.fsuEscDflt = fsuEscDflt;
	}

	public Integer getFsuQueProg() {
		return this.fsuQueProg;
	}

	public void setFsuQueProg(Integer fsuQueProg) {
		this.fsuQueProg = fsuQueProg;
	}

	public String getFsuQuoteQue() {
		return this.fsuQuoteQue;
	}

	public void setFsuQuoteQue(String fsuQuoteQue) {
		this.fsuQuoteQue = fsuQuoteQue;
	}

	public String getFsuTimezone() {
		return this.fsuTimezone;
	}

	public void setFsuTimezone(String fsuTimezone) {
		this.fsuTimezone = fsuTimezone;
	}

	public String getFsuQadc02() {
		return this.fsuQadc02;
	}

	public void setFsuQadc02(String fsuQadc02) {
		this.fsuQadc02 = fsuQadc02;
	}

	public String getFsuQadc03() {
		return this.fsuQadc03;
	}

	public void setFsuQadc03(String fsuQadc03) {
		this.fsuQadc03 = fsuQadc03;
	}

	public String getFsuQadc04() {
		return this.fsuQadc04;
	}

	public void setFsuQadc04(String fsuQadc04) {
		this.fsuQadc04 = fsuQadc04;
	}

	public String getFsuQadc05() {
		return this.fsuQadc05;
	}

	public void setFsuQadc05(String fsuQadc05) {
		this.fsuQadc05 = fsuQadc05;
	}

	public Boolean getFsuQadl01() {
		return this.fsuQadl01;
	}

	public void setFsuQadl01(Boolean fsuQadl01) {
		this.fsuQadl01 = fsuQadl01;
	}

	public Boolean getFsuQadl02() {
		return this.fsuQadl02;
	}

	public void setFsuQadl02(Boolean fsuQadl02) {
		this.fsuQadl02 = fsuQadl02;
	}

	public Boolean getFsuQadl03() {
		return this.fsuQadl03;
	}

	public void setFsuQadl03(Boolean fsuQadl03) {
		this.fsuQadl03 = fsuQadl03;
	}

	public Boolean getFsuQadl04() {
		return this.fsuQadl04;
	}

	public void setFsuQadl04(Boolean fsuQadl04) {
		this.fsuQadl04 = fsuQadl04;
	}

	public Boolean getFsuQadl05() {
		return this.fsuQadl05;
	}

	public void setFsuQadl05(Boolean fsuQadl05) {
		this.fsuQadl05 = fsuQadl05;
	}

	public Integer getFsuQadi01() {
		return this.fsuQadi01;
	}

	public void setFsuQadi01(Integer fsuQadi01) {
		this.fsuQadi01 = fsuQadi01;
	}

	public Integer getFsuQadi02() {
		return this.fsuQadi02;
	}

	public void setFsuQadi02(Integer fsuQadi02) {
		this.fsuQadi02 = fsuQadi02;
	}

	public Integer getFsuQadi03() {
		return this.fsuQadi03;
	}

	public void setFsuQadi03(Integer fsuQadi03) {
		this.fsuQadi03 = fsuQadi03;
	}

	public Integer getFsuQadi04() {
		return this.fsuQadi04;
	}

	public void setFsuQadi04(Integer fsuQadi04) {
		this.fsuQadi04 = fsuQadi04;
	}

	public Integer getFsuQadi05() {
		return this.fsuQadi05;
	}

	public void setFsuQadi05(Integer fsuQadi05) {
		this.fsuQadi05 = fsuQadi05;
	}

	public String getFsuUser1() {
		return this.fsuUser1;
	}

	public void setFsuUser1(String fsuUser1) {
		this.fsuUser1 = fsuUser1;
	}

	public String getFsuUser2() {
		return this.fsuUser2;
	}

	public void setFsuUser2(String fsuUser2) {
		this.fsuUser2 = fsuUser2;
	}

	public String getFsuQadc06() {
		return this.fsuQadc06;
	}

	public void setFsuQadc06(String fsuQadc06) {
		this.fsuQadc06 = fsuQadc06;
	}

	public Date getFsuQadt01() {
		return this.fsuQadt01;
	}

	public void setFsuQadt01(Date fsuQadt01) {
		this.fsuQadt01 = fsuQadt01;
	}

	public Date getFsuQadt02() {
		return this.fsuQadt02;
	}

	public void setFsuQadt02(Date fsuQadt02) {
		this.fsuQadt02 = fsuQadt02;
	}

	public Double getOidFsuMstr() {
		return this.oidFsuMstr;
	}

	public void setOidFsuMstr(Double oidFsuMstr) {
		this.oidFsuMstr = oidFsuMstr;
	}

}