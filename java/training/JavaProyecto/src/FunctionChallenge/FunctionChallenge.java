/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionChallenge;

/**
 *
 * @author feder
 */
// importar librerias.



import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

@SuppressWarnings(value = "all")
public class FunctionChallenge {

    public static void main(String... doYourBest) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        Function<Integer, Integer> sub = (a) -> a - 2;
        Function<Integer, Integer> mult = (a) -> a * 3;

        BiConsumer<Integer, Integer> consumer = (a, b)
                -> System.out.println(a + 2 + b + 2);

        Function<Integer, Integer> func =
        sub.andThen(sub).andThen(sub);
int firstResult = func.apply(2);

int secondResult = mult.apply(2);

        consumer.accept(firstResult, secondResult);
    }

}
