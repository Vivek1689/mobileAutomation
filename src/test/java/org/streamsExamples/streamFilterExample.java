package org.streamsExamples;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamFilterExample {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhay");
        names.add("Abhi");
        names.add("chubby");
        names.add("Arun");
        names.add("vivek");
        names.add("ahan");
        //filter usage
        long count = names.stream().filter(name->name.toLowerCase().startsWith("a")).count();
        System.out.println(count);
        names.stream().filter(name->name.toLowerCase().startsWith("a")).filter(name->name.length()>4)
                .forEach(System.out::println);
        //any match usage
        boolean flag=names.stream().anyMatch(name->name.equalsIgnoreCase("vivek"));
        Assert.assertTrue(flag);

        //printing unique number from array
        Integer[] numberArray = {3,2,2,7,9,1,9,5,7};
        List<Integer> numberList = Arrays.asList(numberArray);
        List<Integer> uniqueList = numberList.stream().distinct().collect(Collectors.toList());
        uniqueList.forEach(System.out::println);
        List<Integer> sortedList=numberList.stream().distinct().sorted().collect(Collectors.toList());
        sortedList.stream().forEach(s-> System.out.println(s));

    }
}
