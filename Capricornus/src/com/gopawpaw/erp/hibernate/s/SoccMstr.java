package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SoccMstr entity. @author MyEclipse Persistence Tools
 */
public class SoccMstr extends AbstractSoccMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SoccMstr() {
	}

	/** minimal constructor */
	public SoccMstr(SoccMstrId id, String soccCcNbrTail, Date soccCcExpireDate,
			String soccCardType, Date soccAuthDate, String soccAuthNbr,
			Double soccAuthAmt, Date soccAuthExpireDate,
			String soccBillingName, String soccBillingAddr1,
			String soccBillingAddr2, String soccBillingAddr3,
			String soccBillingCity, String soccBillingZip,
			String soccBillingState, String soccBillingCountry,
			String soccModUserid, Date soccModDate, Double oidSoccMstr) {
		super(id, soccCcNbrTail, soccCcExpireDate, soccCardType, soccAuthDate,
				soccAuthNbr, soccAuthAmt, soccAuthExpireDate, soccBillingName,
				soccBillingAddr1, soccBillingAddr2, soccBillingAddr3,
				soccBillingCity, soccBillingZip, soccBillingState,
				soccBillingCountry, soccModUserid, soccModDate, oidSoccMstr);
	}

	/** full constructor */
	public SoccMstr(SoccMstrId id, String soccCcNbrTail, Date soccCcExpireDate,
			String soccCardType, Date soccAuthDate, String soccAuthNbr,
			Double soccAuthAmt, Date soccAuthExpireDate,
			String soccBillingName, String soccBillingAddr1,
			String soccBillingAddr2, String soccBillingAddr3,
			String soccBillingCity, String soccBillingZip,
			String soccBillingState, String soccBillingCountry,
			String soccBillingCtry, String soccModUserid, Date soccModDate,
			String soccUser1, String soccUser2, String soccQadc01,
			Integer soccQadi01, Double soccQadd01, Boolean soccQadl01,
			Date soccQadt01, Double oidSoccMstr) {
		super(id, soccCcNbrTail, soccCcExpireDate, soccCardType, soccAuthDate,
				soccAuthNbr, soccAuthAmt, soccAuthExpireDate, soccBillingName,
				soccBillingAddr1, soccBillingAddr2, soccBillingAddr3,
				soccBillingCity, soccBillingZip, soccBillingState,
				soccBillingCountry, soccBillingCtry, soccModUserid,
				soccModDate, soccUser1, soccUser2, soccQadc01, soccQadi01,
				soccQadd01, soccQadl01, soccQadt01, oidSoccMstr);
	}

}
