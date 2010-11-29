package com.gopawpaw.erp.hibernate.o;



/**
 * AbstractOpHistId entity provides the base persistence definition of the OpHistId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpHistId  implements java.io.Serializable {


    // Fields    

     private String opDomain;
     private Integer opTrnbr;


    // Constructors

    /** default constructor */
    public AbstractOpHistId() {
    }

    
    /** full constructor */
    public AbstractOpHistId(String opDomain, Integer opTrnbr) {
        this.opDomain = opDomain;
        this.opTrnbr = opTrnbr;
    }

   
    // Property accessors

    public String getOpDomain() {
        return this.opDomain;
    }
    
    public void setOpDomain(String opDomain) {
        this.opDomain = opDomain;
    }

    public Integer getOpTrnbr() {
        return this.opTrnbr;
    }
    
    public void setOpTrnbr(Integer opTrnbr) {
        this.opTrnbr = opTrnbr;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractOpHistId) ) return false;
		 AbstractOpHistId castOther = ( AbstractOpHistId ) other; 
         
		 return ( (this.getOpDomain()==castOther.getOpDomain()) || ( this.getOpDomain()!=null && castOther.getOpDomain()!=null && this.getOpDomain().equals(castOther.getOpDomain()) ) )
 && ( (this.getOpTrnbr()==castOther.getOpTrnbr()) || ( this.getOpTrnbr()!=null && castOther.getOpTrnbr()!=null && this.getOpTrnbr().equals(castOther.getOpTrnbr()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOpDomain() == null ? 0 : this.getOpDomain().hashCode() );
         result = 37 * result + ( getOpTrnbr() == null ? 0 : this.getOpTrnbr().hashCode() );
         return result;
   }   





}