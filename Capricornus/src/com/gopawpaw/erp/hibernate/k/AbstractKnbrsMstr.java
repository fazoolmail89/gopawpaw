package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKnbrsMstr entity provides the base persistence definition of the
 * KnbrsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbrsMstr implements java.io.Serializable {

	// Fields

	private KnbrsMstrId id;
	private Date knbrsDispatchDate;
	private Integer knbrsDispatchTime;
	private Integer knbrsProcSess;
	private Integer knbrsExportBatch;
	private Date knbrsModDate;
	private String knbrsModUserid;
	private String knbrsUser1;
	private String knbrsUser2;
	private String knbrsQadc01;
	private String knbrsQadc02;
	private String knbrsQadc03;
	private String knbrsQadc04;
	private Boolean knbrsQadl01;
	private Boolean knbrsQadl02;
	private Double oidKnbrsMstr;

	// Constructors

	/** default constructor */
	public AbstractKnbrsMstr() {
	}

	/** minimal constructor */
	public AbstractKnbrsMstr(KnbrsMstrId id, Integer knbrsDispatchTime,
			Integer knbrsProcSess, Integer knbrsExportBatch,
			String knbrsModUserid, String knbrsUser1, String knbrsUser2,
			String knbrsQadc01, String knbrsQadc02, String knbrsQadc03,
			String knbrsQadc04, Boolean knbrsQadl01, Boolean knbrsQadl02,
			Double oidKnbrsMstr) {
		this.id = id;
		this.knbrsDispatchTime = knbrsDispatchTime;
		this.knbrsProcSess = knbrsProcSess;
		this.knbrsExportBatch = knbrsExportBatch;
		this.knbrsModUserid = knbrsModUserid;
		this.knbrsUser1 = knbrsUser1;
		this.knbrsUser2 = knbrsUser2;
		this.knbrsQadc01 = knbrsQadc01;
		this.knbrsQadc02 = knbrsQadc02;
		this.knbrsQadc03 = knbrsQadc03;
		this.knbrsQadc04 = knbrsQadc04;
		this.knbrsQadl01 = knbrsQadl01;
		this.knbrsQadl02 = knbrsQadl02;
		this.oidKnbrsMstr = oidKnbrsMstr;
	}

	/** full constructor */
	public AbstractKnbrsMstr(KnbrsMstrId id, Date knbrsDispatchDate,
			Integer knbrsDispatchTime, Integer knbrsProcSess,
			Integer knbrsExportBatch, Date knbrsModDate, String knbrsModUserid,
			String knbrsUser1, String knbrsUser2, String knbrsQadc01,
			String knbrsQadc02, String knbrsQadc03, String knbrsQadc04,
			Boolean knbrsQadl01, Boolean knbrsQadl02, Double oidKnbrsMstr) {
		this.id = id;
		this.knbrsDispatchDate = knbrsDispatchDate;
		this.knbrsDispatchTime = knbrsDispatchTime;
		this.knbrsProcSess = knbrsProcSess;
		this.knbrsExportBatch = knbrsExportBatch;
		this.knbrsModDate = knbrsModDate;
		this.knbrsModUserid = knbrsModUserid;
		this.knbrsUser1 = knbrsUser1;
		this.knbrsUser2 = knbrsUser2;
		this.knbrsQadc01 = knbrsQadc01;
		this.knbrsQadc02 = knbrsQadc02;
		this.knbrsQadc03 = knbrsQadc03;
		this.knbrsQadc04 = knbrsQadc04;
		this.knbrsQadl01 = knbrsQadl01;
		this.knbrsQadl02 = knbrsQadl02;
		this.oidKnbrsMstr = oidKnbrsMstr;
	}

	// Property accessors

	public KnbrsMstrId getId() {
		return this.id;
	}

	public void setId(KnbrsMstrId id) {
		this.id = id;
	}

	public Date getKnbrsDispatchDate() {
		return this.knbrsDispatchDate;
	}

	public void setKnbrsDispatchDate(Date knbrsDispatchDate) {
		this.knbrsDispatchDate = knbrsDispatchDate;
	}

	public Integer getKnbrsDispatchTime() {
		return this.knbrsDispatchTime;
	}

	public void setKnbrsDispatchTime(Integer knbrsDispatchTime) {
		this.knbrsDispatchTime = knbrsDispatchTime;
	}

	public Integer getKnbrsProcSess() {
		return this.knbrsProcSess;
	}

	public void setKnbrsProcSess(Integer knbrsProcSess) {
		this.knbrsProcSess = knbrsProcSess;
	}

	public Integer getKnbrsExportBatch() {
		return this.knbrsExportBatch;
	}

	public void setKnbrsExportBatch(Integer knbrsExportBatch) {
		this.knbrsExportBatch = knbrsExportBatch;
	}

	public Date getKnbrsModDate() {
		return this.knbrsModDate;
	}

	public void setKnbrsModDate(Date knbrsModDate) {
		this.knbrsModDate = knbrsModDate;
	}

	public String getKnbrsModUserid() {
		return this.knbrsModUserid;
	}

	public void setKnbrsModUserid(String knbrsModUserid) {
		this.knbrsModUserid = knbrsModUserid;
	}

	public String getKnbrsUser1() {
		return this.knbrsUser1;
	}

	public void setKnbrsUser1(String knbrsUser1) {
		this.knbrsUser1 = knbrsUser1;
	}

	public String getKnbrsUser2() {
		return this.knbrsUser2;
	}

	public void setKnbrsUser2(String knbrsUser2) {
		this.knbrsUser2 = knbrsUser2;
	}

	public String getKnbrsQadc01() {
		return this.knbrsQadc01;
	}

	public void setKnbrsQadc01(String knbrsQadc01) {
		this.knbrsQadc01 = knbrsQadc01;
	}

	public String getKnbrsQadc02() {
		return this.knbrsQadc02;
	}

	public void setKnbrsQadc02(String knbrsQadc02) {
		this.knbrsQadc02 = knbrsQadc02;
	}

	public String getKnbrsQadc03() {
		return this.knbrsQadc03;
	}

	public void setKnbrsQadc03(String knbrsQadc03) {
		this.knbrsQadc03 = knbrsQadc03;
	}

	public String getKnbrsQadc04() {
		return this.knbrsQadc04;
	}

	public void setKnbrsQadc04(String knbrsQadc04) {
		this.knbrsQadc04 = knbrsQadc04;
	}

	public Boolean getKnbrsQadl01() {
		return this.knbrsQadl01;
	}

	public void setKnbrsQadl01(Boolean knbrsQadl01) {
		this.knbrsQadl01 = knbrsQadl01;
	}

	public Boolean getKnbrsQadl02() {
		return this.knbrsQadl02;
	}

	public void setKnbrsQadl02(Boolean knbrsQadl02) {
		this.knbrsQadl02 = knbrsQadl02;
	}

	public Double getOidKnbrsMstr() {
		return this.oidKnbrsMstr;
	}

	public void setOidKnbrsMstr(Double oidKnbrsMstr) {
		this.oidKnbrsMstr = oidKnbrsMstr;
	}

}