package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Animal animal1 = new Animal(3.15,4,350);
        Animal animal2 = new Animal(0.03,8,0.05);
        Animal animal3 = new Animal(1.76,2,85);

        List<Animal> animais = new ArrayList<>(List.of(animal1, animal2, animal3));

        List<Animal> animaisPequenos = animais.stream()
                .filter(animal -> animal.getAltura()<1)
                .collect(Collectors.toList());

        System.out.println(animaisPequenos);
    }
}
