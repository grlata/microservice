package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.NamedQuery;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@ToString
@NamedQuery()
public class BaseEntity {
    @Column(updatable = false)
    private LocalDateTime createdAt;
    String createdBy;
    private LocalDateTime updatedAt;
    @Column(insertable = false)
    private String updatedBy;

}
