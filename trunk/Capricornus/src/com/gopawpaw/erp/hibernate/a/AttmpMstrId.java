package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AttmpMstrId entity. @author MyEclipse Persistence Tools
 */
public class AttmpMstrId extends AbstractAttmpMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AttmpMstrId() {
	}

	/** minimal constructor */
	public AttmpMstrId(Double attmpEventId, String attmpTableName,
			Double oidErecord, Double oidAtapMstr, Date attmpDate,
			Integer attmpTime, String attmpTimezone, String attmpEventType,
			String attmpSource, String attmpUserid, String attmpUserName,
			String attmpPgmiExec, String attmpQadc03, Integer attmpRecordOrder,
			Double attmpQadd01, String attmpQadc01, String attmpQadc02,
			String attmpExcludeFields) {
		super(attmpEventId, attmpTableName, oidErecord, oidAtapMstr, attmpDate,
				attmpTime, attmpTimezone, attmpEventType, attmpSource,
				attmpUserid, attmpUserName, attmpPgmiExec, attmpQadc03,
				attmpRecordOrder, attmpQadd01, attmpQadc01, attmpQadc02,
				attmpExcludeFields);
	}

	/** full constructor */
	public AttmpMstrId(Double attmpEventId, String attmpTableName,
			Double oidErecord, Double oidAtapMstr, Date attmpDate,
			Integer attmpTime, String attmpTimezone, String attmpEventType,
			String attmpSource, String attmpUserid, String attmpUserName,
			String attmpPgmiExec, String attmpQadc03, Integer attmpRecordOrder,
			Double attmpQadd01, String attmpQadc01, String attmpQadc02,
			String attmpRawImage, String attmpExcludeFields) {
		super(attmpEventId, attmpTableName, oidErecord, oidAtapMstr, attmpDate,
				attmpTime, attmpTimezone, attmpEventType, attmpSource,
				attmpUserid, attmpUserName, attmpPgmiExec, attmpQadc03,
				attmpRecordOrder, attmpQadd01, attmpQadc01, attmpQadc02,
				attmpRawImage, attmpExcludeFields);
	}

}
