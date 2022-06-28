package com.company.accountingofficeexpenses.entity;

import io.jmix.core.FileRef;
import io.jmix.core.annotation.DeletedBy;
import io.jmix.core.annotation.DeletedDate;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "EXPENSE", indexes = {
        @Index(name = "IDX_EXPENSE", columnList = "EMPLOYEE_EXPENSE_ID"),
        @Index(name = "IDX_EXPENSE", columnList = "TYPE_OF_EXPENSE_ID")
})
@Entity
public class Expense {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @DeletedBy
    @Column(name = "DELETED_BY")
    private String deletedBy;

    @DeletedDate
    @Column(name = "DELETED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedDate;

    @Column(name = "DATE_OF_EXPENSE")
    private LocalDateTime dateOfExpense;

    @InstanceName
    @Column(name = "SUM_EXPENSE", nullable = false, precision = 19, scale = 2)
    @NotNull
    private BigDecimal sumExpense;

    @Column(name = "DOCUMENT_OF_EXPENSE", length = 1024)
    private FileRef documentOfExpense;

    @JoinColumn(name = "EMPLOYEE_EXPENSE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Employee employeeExpense;

    @JoinColumn(name = "TYPE_OF_EXPENSE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TypeOfExpense typeOfExpense;

    public TypeOfExpense getTypeOfExpense() {
        return typeOfExpense;
    }

    public void setTypeOfExpense(TypeOfExpense typeOfExpense) {
        this.typeOfExpense = typeOfExpense;
    }

    public Employee getEmployeeExpense() {
        return employeeExpense;
    }

    public void setEmployeeExpense(Employee employeeExpense) {
        this.employeeExpense = employeeExpense;
    }

    public FileRef getDocumentOfExpense() {
        return documentOfExpense;
    }

    public void setDocumentOfExpense(FileRef documentOfExpense) {
        this.documentOfExpense = documentOfExpense;
    }

    public BigDecimal getSumExpense() {
        return sumExpense;
    }

    public void setSumExpense(BigDecimal sumExpense) {
        this.sumExpense = sumExpense;
    }

    public LocalDateTime getDateOfExpense() {
        return dateOfExpense;
    }

    public void setDateOfExpense(LocalDateTime dateOfExpense) {
        this.dateOfExpense = dateOfExpense;
    }

    public Date getDeletedDate() {
        return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
        this.deletedDate = deletedDate;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}