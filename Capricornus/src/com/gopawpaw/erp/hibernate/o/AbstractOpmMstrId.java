package com.gopawpaw.erp.hibernate.o;



/**
 * AbstractOpmMstrId entity provides the base persistence definition of the OpmMstrId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpmMstrId  implements java.io.Serializable {


    // Fields    

     private String opmDomain;
     private String opmStdOp;


    // Constructors

    /** default constructor */
    public AbstractOpmMstrId() {
    }

	/** minimal constructor */
    public AbstractOpmMstrId(String opmDomain) {
        this.opmDomain = opmDomain;
    }
    
    /** full constructor */
    public AbstractOpmMstrId(String opmDomain, String opmStdOp) {
        this.opmDomain = opmDomain;
        this.opmStdOp = opmStdOp;
    }

   
    // Property accessors

    public String getOpmDomain() {
        return this.opmDomain;
    }
    
    public void setOpmDomain(String opmDomain) {
        this.opmDomain = opmDomain;
    }

    public String getOpmStdOp() {
        return this.opmStdOp;
    }
    
    public void setOpmStdOp(String opmStdOp) {
        this.opmStdOp = opmStdOp;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractOpmMstrId) ) return false;
		 AbstractOpmMstrId castOther = ( AbstractOpmMstrId ) other; 
         
		 return ( (this.getOpmDomain()==castOther.getOpmDomain()) || ( this.getOpmDomain()!=null && castOther.getOpmDomain()!=null && this.getOpmDomain().equals(castOther.getOpmDomain()) ) )
 && ( (this.getOpmStdOp()==castOther.getOpmStdOp()) || ( this.getOpmStdOp()!=null && castOther.getOpmStdOp()!=null && this.getOpmStdOp().equals(castOther.getOpmStdOp()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOpmDomain() == null ? 0 : this.getOpmDomain().hashCode() );
         result = 37 * result + ( getOpmStdOp() == null ? 0 : this.getOpmStdOp().hashCode() );
         return result;
   }   





}