package com.yp.factory;


import com.yp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;

@Component
public class FilterChainsMapFactory {

    @Autowired
    private UserService userService;

    public LinkedHashMap<String,String> instance(){
        LinkedHashMap<String,String> filterChainsMap = userService.findFilterChainsMap();
        return filterChainsMap;
    }

}
