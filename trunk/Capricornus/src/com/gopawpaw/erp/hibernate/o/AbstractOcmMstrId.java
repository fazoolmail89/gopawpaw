package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * AbstractOcmMstrId entity provides the base persistence definition of the OcmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOcmMstrId  implements java.io.Serializable {


    // Fields    

     private String ocmDomain;
     private String ocmArea;
     private String ocmEngCode;
     private Date ocmStartEff;


    // Constructors

    /** default constructor */
    public AbstractOcmMstrId() {
    }

	/** minimal constructor */
    public AbstractOcmMstrId(String ocmDomain) {
        this.ocmDomain = ocmDomain;
    }
    
    /** full constructor */
    public AbstractOcmMstrId(String ocmDomain, String ocmArea, String ocmEngCode, Date ocmStartEff) {
        this.ocmDomain = ocmDomain;
        this.ocmArea = ocmArea;
        this.ocmEngCode = ocmEngCode;
        this.ocmStartEff = ocmStartEff;
    }

   
    // Property accessors

    public String getOcmDomain() {
        return this.ocmDomain;
    }
    
    public void setOcmDomain(String ocmDomain) {
        this.ocmDomain = ocmDomain;
    }

    public String getOcmArea() {
        return this.ocmArea;
    }
    
    public void setOcmArea(String ocmArea) {
        this.ocmArea = ocmArea;
    }

    public String getOcmEngCode() {
        return this.ocmEngCode;
    }
    
    public void setOcmEngCode(String ocmEngCode) {
        this.ocmEngCode = ocmEngCode;
    }

    public Date getOcmStartEff() {
        return this.ocmStartEff;
    }
    
    public void setOcmStartEff(Date ocmStartEff) {
        this.ocmStartEff = ocmStartEff;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractOcmMstrId) ) return false;
		 AbstractOcmMstrId castOther = ( AbstractOcmMstrId ) other; 
         
		 return ( (this.getOcmDomain()==castOther.getOcmDomain()) || ( this.getOcmDomain()!=null && castOther.getOcmDomain()!=null && this.getOcmDomain().equals(castOther.getOcmDomain()) ) )
 && ( (this.getOcmArea()==castOther.getOcmArea()) || ( this.getOcmArea()!=null && castOther.getOcmArea()!=null && this.getOcmArea().equals(castOther.getOcmArea()) ) )
 && ( (this.getOcmEngCode()==castOther.getOcmEngCode()) || ( this.getOcmEngCode()!=null && castOther.getOcmEngCode()!=null && this.getOcmEngCode().equals(castOther.getOcmEngCode()) ) )
 && ( (this.getOcmStartEff()==castOther.getOcmStartEff()) || ( this.getOcmStartEff()!=null && castOther.getOcmStartEff()!=null && this.getOcmStartEff().equals(castOther.getOcmStartEff()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOcmDomain() == null ? 0 : this.getOcmDomain().hashCode() );
         result = 37 * result + ( getOcmArea() == null ? 0 : this.getOcmArea().hashCode() );
         result = 37 * result + ( getOcmEngCode() == null ? 0 : this.getOcmEngCode().hashCode() );
         result = 37 * result + ( getOcmStartEff() == null ? 0 : this.getOcmStartEff().hashCode() );
         return result;
   }   





}