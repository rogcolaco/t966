package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        Animal animal1 = new Animal(3.15,4,350);
        Animal animal2 = new Animal(0.03,8,0.05);
        Animal animal3 = new Animal(1.76,2,85);
        Animal animal4 = new Animal().builder()
                .altura(15)
                .peso(30)
                .qtd_patas(100)
                .build();

        List<Animal> animais = new ArrayList<>(List.of(animal1, animal2, animal3, animal4));

        List<Animal> animaisPequenos = animais.stream()
                .filter(animal -> animal.getAltura()<1)
                .collect(Collectors.toList());

        List<Animal> animaisPesados = animais.stream()
                .filter(animal -> animal.getPeso()>70)
                .collect(Collectors.toList());

        List<Animal> animaisPernudos = animais.stream()
                .filter(animal -> animal.getQtd_patas()>70)
                .collect(Collectors.toList());

        System.out.println(animaisPequenos);
        System.out.println(animaisPesados);
        System.out.println(animaisPernudos);
    }
}
