package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * CriticalOpinionId generated by hbm2java
 */
@Embeddable
public class CriticalOpinionId  implements java.io.Serializable {


     private Integer initiativeId;
     private Long suggestionId;
     private Integer memberId;
     private Short degree;
     private Boolean fulfilled;

    public CriticalOpinionId() {
    }

    public CriticalOpinionId(Integer initiativeId, Long suggestionId, Integer memberId, Short degree, Boolean fulfilled) {
       this.initiativeId = initiativeId;
       this.suggestionId = suggestionId;
       this.memberId = memberId;
       this.degree = degree;
       this.fulfilled = fulfilled;
    }
   

    @Column(name="initiative_id")
    public Integer getInitiativeId() {
        return this.initiativeId;
    }
    
    public void setInitiativeId(Integer initiativeId) {
        this.initiativeId = initiativeId;
    }

    @Column(name="suggestion_id")
    public Long getSuggestionId() {
        return this.suggestionId;
    }
    
    public void setSuggestionId(Long suggestionId) {
        this.suggestionId = suggestionId;
    }

    @Column(name="member_id")
    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Column(name="degree")
    public Short getDegree() {
        return this.degree;
    }
    
    public void setDegree(Short degree) {
        this.degree = degree;
    }

    @Column(name="fulfilled")
    public Boolean getFulfilled() {
        return this.fulfilled;
    }
    
    public void setFulfilled(Boolean fulfilled) {
        this.fulfilled = fulfilled;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CriticalOpinionId) ) return false;
		 CriticalOpinionId castOther = ( CriticalOpinionId ) other; 
         
		 return ( (this.getInitiativeId()==castOther.getInitiativeId()) || ( this.getInitiativeId()!=null && castOther.getInitiativeId()!=null && this.getInitiativeId().equals(castOther.getInitiativeId()) ) )
 && ( (this.getSuggestionId()==castOther.getSuggestionId()) || ( this.getSuggestionId()!=null && castOther.getSuggestionId()!=null && this.getSuggestionId().equals(castOther.getSuggestionId()) ) )
 && ( (this.getMemberId()==castOther.getMemberId()) || ( this.getMemberId()!=null && castOther.getMemberId()!=null && this.getMemberId().equals(castOther.getMemberId()) ) )
 && ( (this.getDegree()==castOther.getDegree()) || ( this.getDegree()!=null && castOther.getDegree()!=null && this.getDegree().equals(castOther.getDegree()) ) )
 && ( (this.getFulfilled()==castOther.getFulfilled()) || ( this.getFulfilled()!=null && castOther.getFulfilled()!=null && this.getFulfilled().equals(castOther.getFulfilled()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getInitiativeId() == null ? 0 : this.getInitiativeId().hashCode() );
         result = 37 * result + ( getSuggestionId() == null ? 0 : this.getSuggestionId().hashCode() );
         result = 37 * result + ( getMemberId() == null ? 0 : this.getMemberId().hashCode() );
         result = 37 * result + ( getDegree() == null ? 0 : this.getDegree().hashCode() );
         result = 37 * result + ( getFulfilled() == null ? 0 : this.getFulfilled().hashCode() );
         return result;
   }   


}

