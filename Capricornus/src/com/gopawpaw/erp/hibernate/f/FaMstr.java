package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FaMstr entity. @author MyEclipse Persistence Tools
 */
public class FaMstr extends AbstractFaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FaMstr() {
	}

	/** minimal constructor */
	public FaMstr(FaMstrId id, String faEntity, Boolean faPost, Boolean faDep,
			String faDesc1, String faReceiver, String faAuthNumber,
			Integer faQty, String faCode, Date faStartdt, String faDispRsn,
			Double faPuramt, Double faReplamt, Double faDispamt,
			Double faSalvamt, String faCustodian, String faFaclsId,
			String faParent, String faVendsrc, String faPo, String faFabchId,
			Integer faCmtindx, String faInsCo, String faInsNbr,
			Double faInsamt, Boolean faMigrate, String faModUserid,
			Date faModDate, String faUser1, String faUser2, String faChr01,
			String faChr02, String faChr03, String faChr04, Double faDec01,
			Double faDec02, Double faDec03, Double faDec04, Boolean faLog01,
			Boolean faLog02, Boolean faLog03, Boolean faLog04, Integer faInt01,
			Integer faInt02, Integer faInt03, Integer faInt04, String faQadc01,
			Double faQadd01, Boolean faQadl01, Integer faQadi01,
			String faSplitFrom, String faFalocId, Double oidFaMstr) {
		super(id, faEntity, faPost, faDep, faDesc1, faReceiver, faAuthNumber,
				faQty, faCode, faStartdt, faDispRsn, faPuramt, faReplamt,
				faDispamt, faSalvamt, faCustodian, faFaclsId, faParent,
				faVendsrc, faPo, faFabchId, faCmtindx, faInsCo, faInsNbr,
				faInsamt, faMigrate, faModUserid, faModDate, faUser1, faUser2,
				faChr01, faChr02, faChr03, faChr04, faDec01, faDec02, faDec03,
				faDec04, faLog01, faLog02, faLog03, faLog04, faInt01, faInt02,
				faInt03, faInt04, faQadc01, faQadd01, faQadl01, faQadi01,
				faSplitFrom, faFalocId, oidFaMstr);
	}

	/** full constructor */
	public FaMstr(FaMstrId id, String faEntity, Boolean faPost, Boolean faDep,
			String faDesc1, String faReceiver, String faAuthNumber,
			Integer faQty, String faCode, Date faStartdt, Date faWardt,
			Date faDispDt, String faDispRsn, Double faPuramt, Double faReplamt,
			Double faDispamt, Double faSalvamt, String faCustodian,
			String faFaclsId, String faParent, String faVendsrc, String faPo,
			String faFabchId, Integer faCmtindx, String faInsCo,
			Date faInsDate, String faInsNbr, Double faInsamt,
			Boolean faMigrate, String faModUserid, Date faModDate,
			String faUser1, String faUser2, String faChr01, String faChr02,
			String faChr03, String faChr04, Double faDec01, Double faDec02,
			Double faDec03, Double faDec04, Boolean faLog01, Boolean faLog02,
			Boolean faLog03, Boolean faLog04, Date faDte01, Date faDte02,
			Date faDte03, Date faDte04, Integer faInt01, Integer faInt02,
			Integer faInt03, Integer faInt04, String faQadc01, Double faQadd01,
			Boolean faQadl01, Integer faQadi01, Date faQadt01,
			String faSplitFrom, Date faSplitDate, String faFalocId,
			String faQadc02, Double oidFaMstr) {
		super(id, faEntity, faPost, faDep, faDesc1, faReceiver, faAuthNumber,
				faQty, faCode, faStartdt, faWardt, faDispDt, faDispRsn,
				faPuramt, faReplamt, faDispamt, faSalvamt, faCustodian,
				faFaclsId, faParent, faVendsrc, faPo, faFabchId, faCmtindx,
				faInsCo, faInsDate, faInsNbr, faInsamt, faMigrate, faModUserid,
				faModDate, faUser1, faUser2, faChr01, faChr02, faChr03,
				faChr04, faDec01, faDec02, faDec03, faDec04, faLog01, faLog02,
				faLog03, faLog04, faDte01, faDte02, faDte03, faDte04, faInt01,
				faInt02, faInt03, faInt04, faQadc01, faQadd01, faQadl01,
				faQadi01, faQadt01, faSplitFrom, faSplitDate, faFalocId,
				faQadc02, oidFaMstr);
	}

}
