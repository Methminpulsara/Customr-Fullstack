package edu.icet.ecom.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name= "customer")
public class Customer_entity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer cusId;
    private String name;
    private String address;
    private Double salary;

}
