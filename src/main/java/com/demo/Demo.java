package com.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

/**
 * @author km185223
 */
//@SpringBootApplication
public class Demo {
    public static void main(String[] args) {

//        SpringApplication.run(Demo.class, args);

/*        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty Optional: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Empty Optional: " + Optional.ofNullable(answer2));

        // java.lang.NullPointerException
        System.out.println("ofNullable on Non-Empty Optional: " + Optional.of(answer2));*/

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl", null);
        List<String> filtered = strings.stream().filter(string -> !StringUtils.isEmpty(string)).collect(Collectors.toList());
        System.out.println(filtered);



//        callFunctionalIntefaces();
    }

    private static void callFunctionalIntefaces() {
        FuntionalInterfaces funtionalInterfaces = new FuntionalInterfaces();
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x == y;
        System.out.println(funtionalInterfaces.biPredicateMethod(biPredicate,5,5));

        Consumer<String> consumer = (x) -> System.out.println(x.toLowerCase()+" : "+ x.toUpperCase());
        funtionalInterfaces.consumerMethod(consumer, "APPLe");

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println(x+y +1000);
        funtionalInterfaces.biConsumerMethod(biConsumer, 23, 27);

        DoubleConsumer doubleConsumer = (x) -> System.out.println(x);
        funtionalInterfaces.doubleConsumerMethod(doubleConsumer, 2);

        BiFunction<Integer, Integer, String> biFunction = (x, y) -> {
            return "$ "+x + y;
        };

        final String string = funtionalInterfaces.biFunctionMethod(biFunction, 20, 30);
        System.out.println(string);

        QuadFunction<String, Double, Integer, String, String> quadFunction = (a, b, c, d) -> {
            return (a + (b + c) + d);
        };
        String s = funtionalInterfaces.quadFunctionMethod(quadFunction, "kiwi ", 2.3, 50, " dollars");
        System.out.println(s);

        LongPredicate longPredicate = (l) -> l > 0;
        System.out.println(longPredicate.test(1332323222));

        ToDoubleBiFunction<Integer, Long> toDoubleBiFunction = (x, y) -> Math.sin(x) + Math.sin(y);
        System.out.println(toDoubleBiFunction.applyAsDouble(Integer.MAX_VALUE, Long.MAX_VALUE));

        ObjIntConsumer<String> objIntConsumer = (object, integer) -> System.out.println(object + integer);
        objIntConsumer.accept("java2s.com ", 234);
    }
}

class FuntionalInterfaces {
    public boolean biPredicateMethod(BiPredicate<Integer, Integer> lambda, Integer i1, Integer i2) {
        return lambda.test(i1, i2);
    }

    public void consumerMethod(Consumer<String> lambda, String i1) {
        lambda.accept(i1);
    }

    public void biConsumerMethod(BiConsumer<Integer, Integer> lambda, Integer i1, Integer i2) {
        lambda.accept(i1, i2);
    }

    public void doubleConsumerMethod(DoubleConsumer lambda, Integer i1) {
        lambda.accept(i1);
    }

    public String biFunctionMethod(BiFunction<Integer, Integer, String> lambda, Integer i1, Integer i2) {
        return lambda.apply(i1, i2);
    }

    public String quadFunctionMethod(QuadFunction<String, Double, Integer, String, String> lambda, String s1 ,Double d, Integer i, String s2) {
        return lambda.apply(s1, d, i, s2);
    }
}

@FunctionalInterface
interface QuadFunction<T, U, V, W, R>{
    R apply(T t, U u ,V v ,W w);
}