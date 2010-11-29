package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * ContMstr entity. @author MyEclipse Persistence Tools
 */
public class ContMstr extends AbstractContMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ContMstr() {
	}

	/** full constructor */
	public ContMstr(ContMstrId id, String contDesc, Integer contCmtindx,
			Double contHeight, Double contWidth, Double contLength,
			String contHwlUm, Double contTareWeight, Double contMaxLoadWeight,
			String contWeightUm, Double contVolume, String contVolumeUm,
			String contSize, String contColor, String contClass,
			String contComposition, Boolean contReusable,
			Boolean contReturnable, String contReference1,
			String contReference2, String contReference3,
			String contReference4, String contReference5, Date contModDate,
			String contModUserid, String contUser1, String contUser2,
			String contQadc01, String contQadc02, Double contThickness,
			String contThicknessUm, Integer contOwner, String contIdMethod,
			Boolean contSpecialReqmnts, Double oidContMstr) {
		super(id, contDesc, contCmtindx, contHeight, contWidth, contLength,
				contHwlUm, contTareWeight, contMaxLoadWeight, contWeightUm,
				contVolume, contVolumeUm, contSize, contColor, contClass,
				contComposition, contReusable, contReturnable, contReference1,
				contReference2, contReference3, contReference4, contReference5,
				contModDate, contModUserid, contUser1, contUser2, contQadc01,
				contQadc02, contThickness, contThicknessUm, contOwner,
				contIdMethod, contSpecialReqmnts, oidContMstr);
	}

}
