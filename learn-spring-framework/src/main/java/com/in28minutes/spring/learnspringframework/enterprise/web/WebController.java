package com.in28minutes.spring.learnspringframework.enterprise.web;

import com.in28minutes.spring.learnspringframework.enterprise.business.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WebController {
    @Autowired
    private Business business;
    /*@Autowired
    WebController(Business business)
    {
        this.business=business;
    }*/
    public long getFromBusiness()
    {
        return business.getCalculate();
    }
}
