package com.myshow4all.student_internship_program.utils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Utils
{

//    public static <T> List<T> filterList(List<T> list, Predicate<T> predicate)
//    {
//        return list.stream().filter(predicate).collect(Collectors.toList());
//    }


      public static <T> List<T> filterList(List<T> listOfElements, Predicate<T> predicate)
      {
         return listOfElements.stream().filter(predicate).collect(Collectors.toList());
      }

}
