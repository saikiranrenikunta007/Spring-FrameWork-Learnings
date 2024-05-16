package com.in28minutes.spring.learnspringframework.enterprise.business;

import com.in28minutes.spring.learnspringframework.enterprise.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
@Component
public class Business {

    @Autowired
    private Data d;
    /*public void set(Data d)
    {
        System.out.println("constructor");
        this.d=d;
    }*/
    public long getCalculate()
    {
        List<Integer>list = d.getData();
        return list.stream().reduce(0,(ans,i)->ans+i);
    }

}
