package edu.icet.ecom.model;

import lombok.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    private Integer cusid;
    private String  name;
    private String address;
    private Double salary;

}
