package com.gopawpaw.erp.hibernate.r;

/**
 * RpcCtrl entity. @author MyEclipse Persistence Tools
 */
public class RpcCtrl extends AbstractRpcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RpcCtrl() {
	}

	/** minimal constructor */
	public RpcCtrl(Integer rpcQadi01, Double oidRpcCtrl) {
		super(rpcQadi01, oidRpcCtrl);
	}

	/** full constructor */
	public RpcCtrl(Integer rpcQadi01, Integer rpcNbr, String rpcNbrPre,
			Integer rpcSchBck, Integer rpcSchFwd, Integer rpcWkStart,
			String rpcUser1, String rpcUser2, Integer rpcEffDays,
			String rpcEffDflt, Boolean rpcIncYld, Boolean rpcUsingNew,
			String rpcWxferAcct, String rpcWxferCc, Boolean rpcXferWip,
			String rpcQadc01, String rpcWxferSub, Double oidRpcCtrl) {
		super(rpcQadi01, rpcNbr, rpcNbrPre, rpcSchBck, rpcSchFwd, rpcWkStart,
				rpcUser1, rpcUser2, rpcEffDays, rpcEffDflt, rpcIncYld,
				rpcUsingNew, rpcWxferAcct, rpcWxferCc, rpcXferWip, rpcQadc01,
				rpcWxferSub, oidRpcCtrl);
	}

}
