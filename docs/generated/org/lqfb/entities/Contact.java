package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Contact generated by hbm2java
 */
@Entity
@Table(name="contact"
    ,schema="public"
)
public class Contact  implements java.io.Serializable {


     private ContactId id;
     private Member memberByOtherMemberId;
     private Member memberByMemberId;
     private boolean public_;

    public Contact() {
    }

    public Contact(ContactId id, Member memberByOtherMemberId, Member memberByMemberId, boolean public_) {
       this.id = id;
       this.memberByOtherMemberId = memberByOtherMemberId;
       this.memberByMemberId = memberByMemberId;
       this.public_ = public_;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="memberId", column=@Column(name="member_id", nullable=false) ), 
        @AttributeOverride(name="otherMemberId", column=@Column(name="other_member_id", nullable=false) ) } )
    public ContactId getId() {
        return this.id;
    }
    
    public void setId(ContactId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="other_member_id", nullable=false, insertable=false, updatable=false)
    public Member getMemberByOtherMemberId() {
        return this.memberByOtherMemberId;
    }
    
    public void setMemberByOtherMemberId(Member memberByOtherMemberId) {
        this.memberByOtherMemberId = memberByOtherMemberId;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member_id", nullable=false, insertable=false, updatable=false)
    public Member getMemberByMemberId() {
        return this.memberByMemberId;
    }
    
    public void setMemberByMemberId(Member memberByMemberId) {
        this.memberByMemberId = memberByMemberId;
    }
    
    @Column(name="public", nullable=false)
    public boolean isPublic_() {
        return this.public_;
    }
    
    public void setPublic_(boolean public_) {
        this.public_ = public_;
    }




}


