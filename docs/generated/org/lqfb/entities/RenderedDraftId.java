package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * RenderedDraftId generated by hbm2java
 */
@Embeddable
public class RenderedDraftId  implements java.io.Serializable {


     private long draftId;
     private String format;

    public RenderedDraftId() {
    }

    public RenderedDraftId(long draftId, String format) {
       this.draftId = draftId;
       this.format = format;
    }
   

    @Column(name="draft_id", nullable=false)
    public long getDraftId() {
        return this.draftId;
    }
    
    public void setDraftId(long draftId) {
        this.draftId = draftId;
    }

    @Column(name="format", nullable=false)
    public String getFormat() {
        return this.format;
    }
    
    public void setFormat(String format) {
        this.format = format;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RenderedDraftId) ) return false;
		 RenderedDraftId castOther = ( RenderedDraftId ) other; 
         
		 return (this.getDraftId()==castOther.getDraftId())
 && ( (this.getFormat()==castOther.getFormat()) || ( this.getFormat()!=null && castOther.getFormat()!=null && this.getFormat().equals(castOther.getFormat()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getDraftId();
         result = 37 * result + ( getFormat() == null ? 0 : this.getFormat().hashCode() );
         return result;
   }   


}


