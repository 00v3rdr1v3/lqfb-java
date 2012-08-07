package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * RenderedVotingComment generated by hbm2java
 */
@Entity
@Table(name="rendered_voting_comment"
    ,schema="public"
)
public class RenderedVotingComment  implements java.io.Serializable {


     private RenderedVotingCommentId id;
     private VotingComment votingComment;
     private String content;

    public RenderedVotingComment() {
    }

    public RenderedVotingComment(RenderedVotingCommentId id, VotingComment votingComment, String content) {
       this.id = id;
       this.votingComment = votingComment;
       this.content = content;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="issueId", column=@Column(name="issue_id", nullable=false) ), 
        @AttributeOverride(name="memberId", column=@Column(name="member_id", nullable=false) ), 
        @AttributeOverride(name="format", column=@Column(name="format", nullable=false) ) } )
    public RenderedVotingCommentId getId() {
        return this.id;
    }
    
    public void setId(RenderedVotingCommentId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumns( { 
        @JoinColumn(name="issue_id", referencedColumnName="issue_id", nullable=false, insertable=false, updatable=false), 
        @JoinColumn(name="member_id", referencedColumnName="member_id", nullable=false, insertable=false, updatable=false) } )
    public VotingComment getVotingComment() {
        return this.votingComment;
    }
    
    public void setVotingComment(VotingComment votingComment) {
        this.votingComment = votingComment;
    }
    
    @Column(name="content", nullable=false)
    public String getContent() {
        return this.content;
    }
    
    public void setContent(String content) {
        this.content = content;
    }




}


