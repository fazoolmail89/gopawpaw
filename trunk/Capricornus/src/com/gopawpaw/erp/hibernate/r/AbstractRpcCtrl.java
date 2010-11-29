package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRpcCtrl entity provides the base persistence definition of the
 * RpcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRpcCtrl implements java.io.Serializable {

	// Fields

	private String rpcDomain;
	private Integer rpcQadi01;
	private Integer rpcNbr;
	private String rpcNbrPre;
	private Integer rpcSchBck;
	private Integer rpcSchFwd;
	private Integer rpcWkStart;
	private String rpcUser1;
	private String rpcUser2;
	private Integer rpcEffDays;
	private String rpcEffDflt;
	private Boolean rpcIncYld;
	private Boolean rpcUsingNew;
	private String rpcWxferAcct;
	private String rpcWxferCc;
	private Boolean rpcXferWip;
	private String rpcQadc01;
	private String rpcWxferSub;
	private Double oidRpcCtrl;

	// Constructors

	/** default constructor */
	public AbstractRpcCtrl() {
	}

	/** minimal constructor */
	public AbstractRpcCtrl(Integer rpcQadi01, Double oidRpcCtrl) {
		this.rpcQadi01 = rpcQadi01;
		this.oidRpcCtrl = oidRpcCtrl;
	}

	/** full constructor */
	public AbstractRpcCtrl(Integer rpcQadi01, Integer rpcNbr, String rpcNbrPre,
			Integer rpcSchBck, Integer rpcSchFwd, Integer rpcWkStart,
			String rpcUser1, String rpcUser2, Integer rpcEffDays,
			String rpcEffDflt, Boolean rpcIncYld, Boolean rpcUsingNew,
			String rpcWxferAcct, String rpcWxferCc, Boolean rpcXferWip,
			String rpcQadc01, String rpcWxferSub, Double oidRpcCtrl) {
		this.rpcQadi01 = rpcQadi01;
		this.rpcNbr = rpcNbr;
		this.rpcNbrPre = rpcNbrPre;
		this.rpcSchBck = rpcSchBck;
		this.rpcSchFwd = rpcSchFwd;
		this.rpcWkStart = rpcWkStart;
		this.rpcUser1 = rpcUser1;
		this.rpcUser2 = rpcUser2;
		this.rpcEffDays = rpcEffDays;
		this.rpcEffDflt = rpcEffDflt;
		this.rpcIncYld = rpcIncYld;
		this.rpcUsingNew = rpcUsingNew;
		this.rpcWxferAcct = rpcWxferAcct;
		this.rpcWxferCc = rpcWxferCc;
		this.rpcXferWip = rpcXferWip;
		this.rpcQadc01 = rpcQadc01;
		this.rpcWxferSub = rpcWxferSub;
		this.oidRpcCtrl = oidRpcCtrl;
	}

	// Property accessors

	public String getRpcDomain() {
		return this.rpcDomain;
	}

	public void setRpcDomain(String rpcDomain) {
		this.rpcDomain = rpcDomain;
	}

	public Integer getRpcQadi01() {
		return this.rpcQadi01;
	}

	public void setRpcQadi01(Integer rpcQadi01) {
		this.rpcQadi01 = rpcQadi01;
	}

	public Integer getRpcNbr() {
		return this.rpcNbr;
	}

	public void setRpcNbr(Integer rpcNbr) {
		this.rpcNbr = rpcNbr;
	}

	public String getRpcNbrPre() {
		return this.rpcNbrPre;
	}

	public void setRpcNbrPre(String rpcNbrPre) {
		this.rpcNbrPre = rpcNbrPre;
	}

	public Integer getRpcSchBck() {
		return this.rpcSchBck;
	}

	public void setRpcSchBck(Integer rpcSchBck) {
		this.rpcSchBck = rpcSchBck;
	}

	public Integer getRpcSchFwd() {
		return this.rpcSchFwd;
	}

	public void setRpcSchFwd(Integer rpcSchFwd) {
		this.rpcSchFwd = rpcSchFwd;
	}

	public Integer getRpcWkStart() {
		return this.rpcWkStart;
	}

	public void setRpcWkStart(Integer rpcWkStart) {
		this.rpcWkStart = rpcWkStart;
	}

	public String getRpcUser1() {
		return this.rpcUser1;
	}

	public void setRpcUser1(String rpcUser1) {
		this.rpcUser1 = rpcUser1;
	}

	public String getRpcUser2() {
		return this.rpcUser2;
	}

	public void setRpcUser2(String rpcUser2) {
		this.rpcUser2 = rpcUser2;
	}

	public Integer getRpcEffDays() {
		return this.rpcEffDays;
	}

	public void setRpcEffDays(Integer rpcEffDays) {
		this.rpcEffDays = rpcEffDays;
	}

	public String getRpcEffDflt() {
		return this.rpcEffDflt;
	}

	public void setRpcEffDflt(String rpcEffDflt) {
		this.rpcEffDflt = rpcEffDflt;
	}

	public Boolean getRpcIncYld() {
		return this.rpcIncYld;
	}

	public void setRpcIncYld(Boolean rpcIncYld) {
		this.rpcIncYld = rpcIncYld;
	}

	public Boolean getRpcUsingNew() {
		return this.rpcUsingNew;
	}

	public void setRpcUsingNew(Boolean rpcUsingNew) {
		this.rpcUsingNew = rpcUsingNew;
	}

	public String getRpcWxferAcct() {
		return this.rpcWxferAcct;
	}

	public void setRpcWxferAcct(String rpcWxferAcct) {
		this.rpcWxferAcct = rpcWxferAcct;
	}

	public String getRpcWxferCc() {
		return this.rpcWxferCc;
	}

	public void setRpcWxferCc(String rpcWxferCc) {
		this.rpcWxferCc = rpcWxferCc;
	}

	public Boolean getRpcXferWip() {
		return this.rpcXferWip;
	}

	public void setRpcXferWip(Boolean rpcXferWip) {
		this.rpcXferWip = rpcXferWip;
	}

	public String getRpcQadc01() {
		return this.rpcQadc01;
	}

	public void setRpcQadc01(String rpcQadc01) {
		this.rpcQadc01 = rpcQadc01;
	}

	public String getRpcWxferSub() {
		return this.rpcWxferSub;
	}

	public void setRpcWxferSub(String rpcWxferSub) {
		this.rpcWxferSub = rpcWxferSub;
	}

	public Double getOidRpcCtrl() {
		return this.oidRpcCtrl;
	}

	public void setOidRpcCtrl(Double oidRpcCtrl) {
		this.oidRpcCtrl = oidRpcCtrl;
	}

}