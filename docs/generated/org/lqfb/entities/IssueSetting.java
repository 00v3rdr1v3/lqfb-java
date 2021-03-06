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
 * IssueSetting generated by hbm2java
 */
@Entity
@Table(name="issue_setting"
    ,schema="public"
)
public class IssueSetting  implements java.io.Serializable {


     private IssueSettingId id;
     private Issue issue;
     private Member member;
     private String value;

    public IssueSetting() {
    }

    public IssueSetting(IssueSettingId id, Issue issue, Member member, String value) {
       this.id = id;
       this.issue = issue;
       this.member = member;
       this.value = value;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="memberId", column=@Column(name="member_id", nullable=false) ), 
        @AttributeOverride(name="key", column=@Column(name="key", nullable=false) ), 
        @AttributeOverride(name="issueId", column=@Column(name="issue_id", nullable=false) ) } )
    public IssueSettingId getId() {
        return this.id;
    }
    
    public void setId(IssueSettingId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="issue_id", nullable=false, insertable=false, updatable=false)
    public Issue getIssue() {
        return this.issue;
    }
    
    public void setIssue(Issue issue) {
        this.issue = issue;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member_id", nullable=false, insertable=false, updatable=false)
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(Member member) {
        this.member = member;
    }
    
    @Column(name="value", nullable=false)
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }




}


