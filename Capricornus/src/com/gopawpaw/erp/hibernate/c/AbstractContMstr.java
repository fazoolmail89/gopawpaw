package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractContMstr entity provides the base persistence definition of the
 * ContMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractContMstr implements java.io.Serializable {

	// Fields

	private ContMstrId id;
	private String contDesc;
	private Integer contCmtindx;
	private Double contHeight;
	private Double contWidth;
	private Double contLength;
	private String contHwlUm;
	private Double contTareWeight;
	private Double contMaxLoadWeight;
	private String contWeightUm;
	private Double contVolume;
	private String contVolumeUm;
	private String contSize;
	private String contColor;
	private String contClass;
	private String contComposition;
	private Boolean contReusable;
	private Boolean contReturnable;
	private String contReference1;
	private String contReference2;
	private String contReference3;
	private String contReference4;
	private String contReference5;
	private Date contModDate;
	private String contModUserid;
	private String contUser1;
	private String contUser2;
	private String contQadc01;
	private String contQadc02;
	private Double contThickness;
	private String contThicknessUm;
	private Integer contOwner;
	private String contIdMethod;
	private Boolean contSpecialReqmnts;
	private Double oidContMstr;

	// Constructors

	/** default constructor */
	public AbstractContMstr() {
	}

	/** full constructor */
	public AbstractContMstr(ContMstrId id, String contDesc,
			Integer contCmtindx, Double contHeight, Double contWidth,
			Double contLength, String contHwlUm, Double contTareWeight,
			Double contMaxLoadWeight, String contWeightUm, Double contVolume,
			String contVolumeUm, String contSize, String contColor,
			String contClass, String contComposition, Boolean contReusable,
			Boolean contReturnable, String contReference1,
			String contReference2, String contReference3,
			String contReference4, String contReference5, Date contModDate,
			String contModUserid, String contUser1, String contUser2,
			String contQadc01, String contQadc02, Double contThickness,
			String contThicknessUm, Integer contOwner, String contIdMethod,
			Boolean contSpecialReqmnts, Double oidContMstr) {
		this.id = id;
		this.contDesc = contDesc;
		this.contCmtindx = contCmtindx;
		this.contHeight = contHeight;
		this.contWidth = contWidth;
		this.contLength = contLength;
		this.contHwlUm = contHwlUm;
		this.contTareWeight = contTareWeight;
		this.contMaxLoadWeight = contMaxLoadWeight;
		this.contWeightUm = contWeightUm;
		this.contVolume = contVolume;
		this.contVolumeUm = contVolumeUm;
		this.contSize = contSize;
		this.contColor = contColor;
		this.contClass = contClass;
		this.contComposition = contComposition;
		this.contReusable = contReusable;
		this.contReturnable = contReturnable;
		this.contReference1 = contReference1;
		this.contReference2 = contReference2;
		this.contReference3 = contReference3;
		this.contReference4 = contReference4;
		this.contReference5 = contReference5;
		this.contModDate = contModDate;
		this.contModUserid = contModUserid;
		this.contUser1 = contUser1;
		this.contUser2 = contUser2;
		this.contQadc01 = contQadc01;
		this.contQadc02 = contQadc02;
		this.contThickness = contThickness;
		this.contThicknessUm = contThicknessUm;
		this.contOwner = contOwner;
		this.contIdMethod = contIdMethod;
		this.contSpecialReqmnts = contSpecialReqmnts;
		this.oidContMstr = oidContMstr;
	}

	// Property accessors

	public ContMstrId getId() {
		return this.id;
	}

	public void setId(ContMstrId id) {
		this.id = id;
	}

	public String getContDesc() {
		return this.contDesc;
	}

	public void setContDesc(String contDesc) {
		this.contDesc = contDesc;
	}

	public Integer getContCmtindx() {
		return this.contCmtindx;
	}

	public void setContCmtindx(Integer contCmtindx) {
		this.contCmtindx = contCmtindx;
	}

	public Double getContHeight() {
		return this.contHeight;
	}

	public void setContHeight(Double contHeight) {
		this.contHeight = contHeight;
	}

	public Double getContWidth() {
		return this.contWidth;
	}

	public void setContWidth(Double contWidth) {
		this.contWidth = contWidth;
	}

	public Double getContLength() {
		return this.contLength;
	}

	public void setContLength(Double contLength) {
		this.contLength = contLength;
	}

	public String getContHwlUm() {
		return this.contHwlUm;
	}

	public void setContHwlUm(String contHwlUm) {
		this.contHwlUm = contHwlUm;
	}

	public Double getContTareWeight() {
		return this.contTareWeight;
	}

	public void setContTareWeight(Double contTareWeight) {
		this.contTareWeight = contTareWeight;
	}

	public Double getContMaxLoadWeight() {
		return this.contMaxLoadWeight;
	}

	public void setContMaxLoadWeight(Double contMaxLoadWeight) {
		this.contMaxLoadWeight = contMaxLoadWeight;
	}

	public String getContWeightUm() {
		return this.contWeightUm;
	}

	public void setContWeightUm(String contWeightUm) {
		this.contWeightUm = contWeightUm;
	}

	public Double getContVolume() {
		return this.contVolume;
	}

	public void setContVolume(Double contVolume) {
		this.contVolume = contVolume;
	}

	public String getContVolumeUm() {
		return this.contVolumeUm;
	}

	public void setContVolumeUm(String contVolumeUm) {
		this.contVolumeUm = contVolumeUm;
	}

	public String getContSize() {
		return this.contSize;
	}

	public void setContSize(String contSize) {
		this.contSize = contSize;
	}

	public String getContColor() {
		return this.contColor;
	}

	public void setContColor(String contColor) {
		this.contColor = contColor;
	}

	public String getContClass() {
		return this.contClass;
	}

	public void setContClass(String contClass) {
		this.contClass = contClass;
	}

	public String getContComposition() {
		return this.contComposition;
	}

	public void setContComposition(String contComposition) {
		this.contComposition = contComposition;
	}

	public Boolean getContReusable() {
		return this.contReusable;
	}

	public void setContReusable(Boolean contReusable) {
		this.contReusable = contReusable;
	}

	public Boolean getContReturnable() {
		return this.contReturnable;
	}

	public void setContReturnable(Boolean contReturnable) {
		this.contReturnable = contReturnable;
	}

	public String getContReference1() {
		return this.contReference1;
	}

	public void setContReference1(String contReference1) {
		this.contReference1 = contReference1;
	}

	public String getContReference2() {
		return this.contReference2;
	}

	public void setContReference2(String contReference2) {
		this.contReference2 = contReference2;
	}

	public String getContReference3() {
		return this.contReference3;
	}

	public void setContReference3(String contReference3) {
		this.contReference3 = contReference3;
	}

	public String getContReference4() {
		return this.contReference4;
	}

	public void setContReference4(String contReference4) {
		this.contReference4 = contReference4;
	}

	public String getContReference5() {
		return this.contReference5;
	}

	public void setContReference5(String contReference5) {
		this.contReference5 = contReference5;
	}

	public Date getContModDate() {
		return this.contModDate;
	}

	public void setContModDate(Date contModDate) {
		this.contModDate = contModDate;
	}

	public String getContModUserid() {
		return this.contModUserid;
	}

	public void setContModUserid(String contModUserid) {
		this.contModUserid = contModUserid;
	}

	public String getContUser1() {
		return this.contUser1;
	}

	public void setContUser1(String contUser1) {
		this.contUser1 = contUser1;
	}

	public String getContUser2() {
		return this.contUser2;
	}

	public void setContUser2(String contUser2) {
		this.contUser2 = contUser2;
	}

	public String getContQadc01() {
		return this.contQadc01;
	}

	public void setContQadc01(String contQadc01) {
		this.contQadc01 = contQadc01;
	}

	public String getContQadc02() {
		return this.contQadc02;
	}

	public void setContQadc02(String contQadc02) {
		this.contQadc02 = contQadc02;
	}

	public Double getContThickness() {
		return this.contThickness;
	}

	public void setContThickness(Double contThickness) {
		this.contThickness = contThickness;
	}

	public String getContThicknessUm() {
		return this.contThicknessUm;
	}

	public void setContThicknessUm(String contThicknessUm) {
		this.contThicknessUm = contThicknessUm;
	}

	public Integer getContOwner() {
		return this.contOwner;
	}

	public void setContOwner(Integer contOwner) {
		this.contOwner = contOwner;
	}

	public String getContIdMethod() {
		return this.contIdMethod;
	}

	public void setContIdMethod(String contIdMethod) {
		this.contIdMethod = contIdMethod;
	}

	public Boolean getContSpecialReqmnts() {
		return this.contSpecialReqmnts;
	}

	public void setContSpecialReqmnts(Boolean contSpecialReqmnts) {
		this.contSpecialReqmnts = contSpecialReqmnts;
	}

	public Double getOidContMstr() {
		return this.oidContMstr;
	}

	public void setOidContMstr(Double oidContMstr) {
		this.oidContMstr = oidContMstr;
	}

}