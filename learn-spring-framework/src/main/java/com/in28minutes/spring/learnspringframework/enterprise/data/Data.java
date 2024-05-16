package com.in28minutes.spring.learnspringframework.enterprise.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Arrays;
@Component
public class Data {
   // @Autowired
    public List<Integer> getData()
    {
        return Arrays.asList(1,2,3);
    }
}
