package org.example;

import lombok.*;

import java.util.stream.Stream;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Animal {
    private double altura;
    private int qtd_patas;
    private double peso;

}
