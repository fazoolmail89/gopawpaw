package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AterrMstrId entity. @author MyEclipse Persistence Tools
 */
public class AterrMstrId extends AbstractAterrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AterrMstrId() {
	}

	/** minimal constructor */
	public AterrMstrId(Double aterrEventId, String aterrStatus,
			String aterrTableName, Double oidErecord, Double oidAtapMstr,
			Date aterrDate, Integer aterrTime, String aterrTimezone,
			String aterrEventType, String aterrSource, String aterrUserid,
			String aterrUserName, String aterrPgmiExec, String aterrErrorCode,
			Integer aterrRecordOrder, Double aterrQadd01, String aterrQadc01,
			String aterrQadc02, String aterrExcludeFields) {
		super(aterrEventId, aterrStatus, aterrTableName, oidErecord,
				oidAtapMstr, aterrDate, aterrTime, aterrTimezone,
				aterrEventType, aterrSource, aterrUserid, aterrUserName,
				aterrPgmiExec, aterrErrorCode, aterrRecordOrder, aterrQadd01,
				aterrQadc01, aterrQadc02, aterrExcludeFields);
	}

	/** full constructor */
	public AterrMstrId(Double aterrEventId, String aterrStatus,
			String aterrTableName, Double oidErecord, Double oidAtapMstr,
			Date aterrDate, Integer aterrTime, String aterrTimezone,
			String aterrEventType, String aterrSource, String aterrUserid,
			String aterrUserName, String aterrPgmiExec, String aterrErrorCode,
			Integer aterrRecordOrder, Double aterrQadd01, String aterrQadc01,
			String aterrQadc02, String aterrRawImage, String aterrExcludeFields) {
		super(aterrEventId, aterrStatus, aterrTableName, oidErecord,
				oidAtapMstr, aterrDate, aterrTime, aterrTimezone,
				aterrEventType, aterrSource, aterrUserid, aterrUserName,
				aterrPgmiExec, aterrErrorCode, aterrRecordOrder, aterrQadd01,
				aterrQadc01, aterrQadc02, aterrRawImage, aterrExcludeFields);
	}

}
