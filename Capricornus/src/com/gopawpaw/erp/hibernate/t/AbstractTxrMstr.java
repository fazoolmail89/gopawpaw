package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTxrMstr entity provides the base persistence definition of the
 * TxrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTxrMstr implements java.io.Serializable {

	// Fields

	private TxrMstrId id;
	private Boolean txrActive;
	private Integer txrApPageNum;
	private Integer txrArPageNum;
	private String txrCoSeqid;
	private String txrCrSeqid;
	private Boolean txrEcReport;
	private String txrInvSeqid;
	private Date txrModDate;
	private String txrModUserid;
	private String txrVoSeqid;
	private String txrUser1;
	private String txrUser2;
	private Double txrUserd01;
	private Integer txrUseri01;
	private Boolean txrUserl01;
	private Date txrUsert01;
	private String txrQadc01;
	private String txrQadc02;
	private Double txrQadd01;
	private Integer txrQadi01;
	private Boolean txrQadl01;
	private Date txrQadt01;
	private Double oidTxrMstr;

	// Constructors

	/** default constructor */
	public AbstractTxrMstr() {
	}

	/** minimal constructor */
	public AbstractTxrMstr(TxrMstrId id, Boolean txrActive,
			Integer txrApPageNum, Integer txrArPageNum, String txrCoSeqid,
			String txrCrSeqid, Boolean txrEcReport, String txrInvSeqid,
			Date txrModDate, String txrModUserid, String txrVoSeqid,
			String txrUser1, String txrUser2, Double txrUserd01,
			Integer txrUseri01, Boolean txrUserl01, String txrQadc01,
			String txrQadc02, Double txrQadd01, Integer txrQadi01,
			Boolean txrQadl01, Double oidTxrMstr) {
		this.id = id;
		this.txrActive = txrActive;
		this.txrApPageNum = txrApPageNum;
		this.txrArPageNum = txrArPageNum;
		this.txrCoSeqid = txrCoSeqid;
		this.txrCrSeqid = txrCrSeqid;
		this.txrEcReport = txrEcReport;
		this.txrInvSeqid = txrInvSeqid;
		this.txrModDate = txrModDate;
		this.txrModUserid = txrModUserid;
		this.txrVoSeqid = txrVoSeqid;
		this.txrUser1 = txrUser1;
		this.txrUser2 = txrUser2;
		this.txrUserd01 = txrUserd01;
		this.txrUseri01 = txrUseri01;
		this.txrUserl01 = txrUserl01;
		this.txrQadc01 = txrQadc01;
		this.txrQadc02 = txrQadc02;
		this.txrQadd01 = txrQadd01;
		this.txrQadi01 = txrQadi01;
		this.txrQadl01 = txrQadl01;
		this.oidTxrMstr = oidTxrMstr;
	}

	/** full constructor */
	public AbstractTxrMstr(TxrMstrId id, Boolean txrActive,
			Integer txrApPageNum, Integer txrArPageNum, String txrCoSeqid,
			String txrCrSeqid, Boolean txrEcReport, String txrInvSeqid,
			Date txrModDate, String txrModUserid, String txrVoSeqid,
			String txrUser1, String txrUser2, Double txrUserd01,
			Integer txrUseri01, Boolean txrUserl01, Date txrUsert01,
			String txrQadc01, String txrQadc02, Double txrQadd01,
			Integer txrQadi01, Boolean txrQadl01, Date txrQadt01,
			Double oidTxrMstr) {
		this.id = id;
		this.txrActive = txrActive;
		this.txrApPageNum = txrApPageNum;
		this.txrArPageNum = txrArPageNum;
		this.txrCoSeqid = txrCoSeqid;
		this.txrCrSeqid = txrCrSeqid;
		this.txrEcReport = txrEcReport;
		this.txrInvSeqid = txrInvSeqid;
		this.txrModDate = txrModDate;
		this.txrModUserid = txrModUserid;
		this.txrVoSeqid = txrVoSeqid;
		this.txrUser1 = txrUser1;
		this.txrUser2 = txrUser2;
		this.txrUserd01 = txrUserd01;
		this.txrUseri01 = txrUseri01;
		this.txrUserl01 = txrUserl01;
		this.txrUsert01 = txrUsert01;
		this.txrQadc01 = txrQadc01;
		this.txrQadc02 = txrQadc02;
		this.txrQadd01 = txrQadd01;
		this.txrQadi01 = txrQadi01;
		this.txrQadl01 = txrQadl01;
		this.txrQadt01 = txrQadt01;
		this.oidTxrMstr = oidTxrMstr;
	}

	// Property accessors

	public TxrMstrId getId() {
		return this.id;
	}

	public void setId(TxrMstrId id) {
		this.id = id;
	}

	public Boolean getTxrActive() {
		return this.txrActive;
	}

	public void setTxrActive(Boolean txrActive) {
		this.txrActive = txrActive;
	}

	public Integer getTxrApPageNum() {
		return this.txrApPageNum;
	}

	public void setTxrApPageNum(Integer txrApPageNum) {
		this.txrApPageNum = txrApPageNum;
	}

	public Integer getTxrArPageNum() {
		return this.txrArPageNum;
	}

	public void setTxrArPageNum(Integer txrArPageNum) {
		this.txrArPageNum = txrArPageNum;
	}

	public String getTxrCoSeqid() {
		return this.txrCoSeqid;
	}

	public void setTxrCoSeqid(String txrCoSeqid) {
		this.txrCoSeqid = txrCoSeqid;
	}

	public String getTxrCrSeqid() {
		return this.txrCrSeqid;
	}

	public void setTxrCrSeqid(String txrCrSeqid) {
		this.txrCrSeqid = txrCrSeqid;
	}

	public Boolean getTxrEcReport() {
		return this.txrEcReport;
	}

	public void setTxrEcReport(Boolean txrEcReport) {
		this.txrEcReport = txrEcReport;
	}

	public String getTxrInvSeqid() {
		return this.txrInvSeqid;
	}

	public void setTxrInvSeqid(String txrInvSeqid) {
		this.txrInvSeqid = txrInvSeqid;
	}

	public Date getTxrModDate() {
		return this.txrModDate;
	}

	public void setTxrModDate(Date txrModDate) {
		this.txrModDate = txrModDate;
	}

	public String getTxrModUserid() {
		return this.txrModUserid;
	}

	public void setTxrModUserid(String txrModUserid) {
		this.txrModUserid = txrModUserid;
	}

	public String getTxrVoSeqid() {
		return this.txrVoSeqid;
	}

	public void setTxrVoSeqid(String txrVoSeqid) {
		this.txrVoSeqid = txrVoSeqid;
	}

	public String getTxrUser1() {
		return this.txrUser1;
	}

	public void setTxrUser1(String txrUser1) {
		this.txrUser1 = txrUser1;
	}

	public String getTxrUser2() {
		return this.txrUser2;
	}

	public void setTxrUser2(String txrUser2) {
		this.txrUser2 = txrUser2;
	}

	public Double getTxrUserd01() {
		return this.txrUserd01;
	}

	public void setTxrUserd01(Double txrUserd01) {
		this.txrUserd01 = txrUserd01;
	}

	public Integer getTxrUseri01() {
		return this.txrUseri01;
	}

	public void setTxrUseri01(Integer txrUseri01) {
		this.txrUseri01 = txrUseri01;
	}

	public Boolean getTxrUserl01() {
		return this.txrUserl01;
	}

	public void setTxrUserl01(Boolean txrUserl01) {
		this.txrUserl01 = txrUserl01;
	}

	public Date getTxrUsert01() {
		return this.txrUsert01;
	}

	public void setTxrUsert01(Date txrUsert01) {
		this.txrUsert01 = txrUsert01;
	}

	public String getTxrQadc01() {
		return this.txrQadc01;
	}

	public void setTxrQadc01(String txrQadc01) {
		this.txrQadc01 = txrQadc01;
	}

	public String getTxrQadc02() {
		return this.txrQadc02;
	}

	public void setTxrQadc02(String txrQadc02) {
		this.txrQadc02 = txrQadc02;
	}

	public Double getTxrQadd01() {
		return this.txrQadd01;
	}

	public void setTxrQadd01(Double txrQadd01) {
		this.txrQadd01 = txrQadd01;
	}

	public Integer getTxrQadi01() {
		return this.txrQadi01;
	}

	public void setTxrQadi01(Integer txrQadi01) {
		this.txrQadi01 = txrQadi01;
	}

	public Boolean getTxrQadl01() {
		return this.txrQadl01;
	}

	public void setTxrQadl01(Boolean txrQadl01) {
		this.txrQadl01 = txrQadl01;
	}

	public Date getTxrQadt01() {
		return this.txrQadt01;
	}

	public void setTxrQadt01(Date txrQadt01) {
		this.txrQadt01 = txrQadt01;
	}

	public Double getOidTxrMstr() {
		return this.oidTxrMstr;
	}

	public void setOidTxrMstr(Double oidTxrMstr) {
		this.oidTxrMstr = oidTxrMstr;
	}

}