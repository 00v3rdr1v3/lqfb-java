package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MemberCount generated by hbm2java
 */
@Entity
@Table(name="member_count"
    ,schema="public"
)
public class MemberCount  implements java.io.Serializable {


     private MemberCountId id;

    public MemberCount() {
    }

    public MemberCount(MemberCountId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="calculated", column=@Column(name="calculated", nullable=false, length=35) ), 
        @AttributeOverride(name="totalCount", column=@Column(name="total_count", nullable=false) ) } )
    public MemberCountId getId() {
        return this.id;
    }
    
    public void setId(MemberCountId id) {
        this.id = id;
    }




}


