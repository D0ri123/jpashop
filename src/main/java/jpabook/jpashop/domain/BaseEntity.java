package jpabook.jpashop.domain;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@MappedSuperclass
public class BaseEntity {

    private String createdBy;
    private LocalDate createdDate;
    private String lastModifiedBy;
    private String getLastModifiedDate;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getGetLastModifiedDate() {
        return getLastModifiedDate;
    }

    public void setGetLastModifiedDate(String getLastModifiedDate) {
        this.getLastModifiedDate = getLastModifiedDate;
    }
}
