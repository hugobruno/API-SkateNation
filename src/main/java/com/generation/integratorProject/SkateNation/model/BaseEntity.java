package com.generation.integratorProject.SkateNation.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long index;

    @Column(name = "deleted", columnDefinition = "Bit(1) default false")
    private boolean deleted = false;

    @Column(name = "DataChange_CreatedBy", nullable = false)
    private String dataChangeCreatedBy;

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getDataChangeCreatedBy() {
        return dataChangeCreatedBy;
    }

    public void setDataChangeCreatedBy(String dataChangeCreatedBy) {
        this.dataChangeCreatedBy = dataChangeCreatedBy;
    }

    public Date getDataChangeCreatedTime() {
        return dataChangeCreatedTime;
    }

    public void setDataChangeCreatedTime(Date dataChangeCreatedTime) {
        this.dataChangeCreatedTime = dataChangeCreatedTime;
    }

    public String getDataChangeLastModifiedBy() {
        return dataChangeLastModifiedBy;
    }

    public void setDataChangeLastModifiedBy(String dataChangeLastModifiedBy) {
        this.dataChangeLastModifiedBy = dataChangeLastModifiedBy;
    }

    public Date getDataChangeLastModifiedTime() {
        return dataChangeLastModifiedTime;
    }

    public void setDataChangeLastModifiedTime(Date dataChangeLastModifiedTime) {
        this.dataChangeLastModifiedTime = dataChangeLastModifiedTime;
    }

    @Column(name = "DataChange_CreatedTime", nullable = false)
    private Date dataChangeCreatedTime;

    @Column(name = "DataChange_LastModifiedBy")
    private String dataChangeLastModifiedBy;

    @Column(name = "DataChange_LastTime")
    private Date dataChangeLastModifiedTime;

    @PrePersist
    protected void prePersist() {
        if (this.dataChangeCreatedTime == null) dataChangeCreatedTime = new Date();
        if (this.dataChangeLastModifiedTime == null) dataChangeLastModifiedTime = new Date();
    }

    @PreUpdate
    protected void preUpdate() {
        this.dataChangeLastModifiedTime = new Date();
    }

    @PreRemove
    protected void preRemove() {
        this.dataChangeLastModifiedTime = new Date();
    }
}