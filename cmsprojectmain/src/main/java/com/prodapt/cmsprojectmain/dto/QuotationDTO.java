package com.prodapt.cmsprojectmain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QuotationDTO {

    private Long id;
    private Integer userId; 
    private Long productId;
    private Double totalAmount;
    private Integer quantity;
}

