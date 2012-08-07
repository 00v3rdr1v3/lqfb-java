package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MemberContingentLeft generated by hbm2java
 */
@Entity
@Table(name="member_contingent_left"
    ,schema="public"
)
public class MemberContingentLeft  implements java.io.Serializable {


     private MemberContingentLeftId id;

    public MemberContingentLeft() {
    }

    public MemberContingentLeft(MemberContingentLeftId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="memberId", column=@Column(name="member_id") ), 
        @AttributeOverride(name="textEntriesLeft", column=@Column(name="text_entries_left") ), 
        @AttributeOverride(name="initiativesLeft", column=@Column(name="initiatives_left") ) } )
    public MemberContingentLeftId getId() {
        return this.id;
    }
    
    public void setId(MemberContingentLeftId id) {
        this.id = id;
    }




}

