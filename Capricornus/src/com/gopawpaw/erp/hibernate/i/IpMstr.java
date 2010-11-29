package com.gopawpaw.erp.hibernate.i;

/**
 * IpMstr entity. @author MyEclipse Persistence Tools
 */
public class IpMstr extends AbstractIpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IpMstr() {
	}

	/** minimal constructor */
	public IpMstr(IpMstrId id, Double oidIpMstr) {
		super(id, oidIpMstr);
	}

	/** full constructor */
	public IpMstr(IpMstrId id, String ipNbr, String ipUser1, String ipUser2,
			String ipChr01, String ipChr02, String ipChr03, String ipChr04,
			String ipChr05, Double ipDec01, Double ipDec02, Double oidIpMstr) {
		super(id, ipNbr, ipUser1, ipUser2, ipChr01, ipChr02, ipChr03, ipChr04,
				ipChr05, ipDec01, ipDec02, oidIpMstr);
	}

}
