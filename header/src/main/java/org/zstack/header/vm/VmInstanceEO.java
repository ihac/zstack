package org.zstack.header.vm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 */
@Entity
@Table
public class VmInstanceEO extends VmInstanceAO {
    @Column
    private String deleted;

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
