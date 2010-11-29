package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbcdDet entity. @author MyEclipse Persistence Tools
 */
public class KnbcdDet extends AbstractKnbcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbcdDet() {
	}

	/** minimal constructor */
	public KnbcdDet(KnbcdDetId id, String knbcdPart, Boolean knbcdClosed,
			Integer knbcdDueTime, Integer knbcdDeliveryTime,
			Boolean knbcdProcessEdi, Integer knbcdShipTime,
			Integer knbcdFillTime, Integer knbcdKbtrTransNbr,
			String knbcdSourceType, String knbcdRef1, String knbcdRef2,
			String knbcdRef3, String knbcdRef4, String knbcdRef5,
			String knbcdPoNbr, Integer knbcdPodLine, String knbcdPodBlanket,
			Integer knbcdPodBlnktLn, Integer knbcdMfdSeq,
			String knbcdSourceFax, String knbcdSourceFax2,
			String knbcdSourceEmail, String knbcdModUserid, Date knbcdModDate,
			String knbcdUser1, String knbcdUser2, String knbcdQadc01,
			String knbcdQadc02, String knbcdQadc03, String knbcdQadc04,
			Boolean knbcdQadl01, Boolean knbcdQadl02, Double oidKnbcdDet) {
		super(id, knbcdPart, knbcdClosed, knbcdDueTime, knbcdDeliveryTime,
				knbcdProcessEdi, knbcdShipTime, knbcdFillTime,
				knbcdKbtrTransNbr, knbcdSourceType, knbcdRef1, knbcdRef2,
				knbcdRef3, knbcdRef4, knbcdRef5, knbcdPoNbr, knbcdPodLine,
				knbcdPodBlanket, knbcdPodBlnktLn, knbcdMfdSeq, knbcdSourceFax,
				knbcdSourceFax2, knbcdSourceEmail, knbcdModUserid,
				knbcdModDate, knbcdUser1, knbcdUser2, knbcdQadc01, knbcdQadc02,
				knbcdQadc03, knbcdQadc04, knbcdQadl01, knbcdQadl02, oidKnbcdDet);
	}

	/** full constructor */
	public KnbcdDet(KnbcdDetId id, String knbcdPart, Boolean knbcdClosed,
			Date knbcdDueDate, Integer knbcdDueTime, Date knbcdDeliveryDate,
			Integer knbcdDeliveryTime, Boolean knbcdProcessEdi,
			Date knbcdShipDate, Integer knbcdShipTime, Date knbcdFillDate,
			Integer knbcdFillTime, Integer knbcdKbtrTransNbr,
			String knbcdSourceType, String knbcdRef1, String knbcdRef2,
			String knbcdRef3, String knbcdRef4, String knbcdRef5,
			String knbcdPoNbr, Integer knbcdPodLine, String knbcdPodBlanket,
			Integer knbcdPodBlnktLn, Integer knbcdMfdSeq,
			String knbcdSourceFax, String knbcdSourceFax2,
			String knbcdSourceEmail, String knbcdModUserid, Date knbcdModDate,
			String knbcdUser1, String knbcdUser2, String knbcdQadc01,
			String knbcdQadc02, String knbcdQadc03, String knbcdQadc04,
			Boolean knbcdQadl01, Boolean knbcdQadl02, Double oidKnbcdDet) {
		super(id, knbcdPart, knbcdClosed, knbcdDueDate, knbcdDueTime,
				knbcdDeliveryDate, knbcdDeliveryTime, knbcdProcessEdi,
				knbcdShipDate, knbcdShipTime, knbcdFillDate, knbcdFillTime,
				knbcdKbtrTransNbr, knbcdSourceType, knbcdRef1, knbcdRef2,
				knbcdRef3, knbcdRef4, knbcdRef5, knbcdPoNbr, knbcdPodLine,
				knbcdPodBlanket, knbcdPodBlnktLn, knbcdMfdSeq, knbcdSourceFax,
				knbcdSourceFax2, knbcdSourceEmail, knbcdModUserid,
				knbcdModDate, knbcdUser1, knbcdUser2, knbcdQadc01, knbcdQadc02,
				knbcdQadc03, knbcdQadc04, knbcdQadl01, knbcdQadl02, oidKnbcdDet);
	}

}
