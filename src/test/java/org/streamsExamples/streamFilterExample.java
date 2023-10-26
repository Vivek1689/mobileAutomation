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
        long count = names.stream().filter(name->name.toLowerCase().startsWith("a")).count();
        System.out.println(count);
        names.stream().filter(name->name.toLowerCase().startsWith("a")).filter(name->name.length()>4)
                .forEach(name-> System.out.println(name));
        boolean flag=names.stream().anyMatch(name->name.equalsIgnoreCase("vivek"));
        Assert.assertTrue(flag);

        //printing unique number from array
        Integer[] numberArray = {3,2,2,7,9,1,9,5,7};
        List<Integer> numberList = Arrays.asList(numberArray);
        List<Integer> uniqueList = numberList.stream().distinct().collect(Collectors.toList());
        uniqueList.stream().forEach(s-> System.out.println(s));

    }
}
