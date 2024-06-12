package com.eazybytes.accounts.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import lombok.*;
import org.apache.tomcat.util.codec.binary.StringUtils;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor // @All @no constructer means in future if we wan tt o use customer constructer automticaly we can use
public class Customer extends  BaseEntity { // both class name and table name should match if not use @Table(name="abc") for diffrenct name purpose
 @Id
 @GeneratedValue(strategy= GenerationType.AUTO, generator = "native")
 @GenericGenerator(name="native", strategy = "native")
@Column(name = "customer_id")
 private  Long customerId;
 private String name;
 private String email;
 private String mobileNumber;

}
