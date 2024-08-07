package com.anil.discount.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "discounts")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private BigDecimal discountPrice;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Category category;

}
