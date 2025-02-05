package com.desafio_componentes.Injecao.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Integer code;
    private double basic;
    private double discount;

}
