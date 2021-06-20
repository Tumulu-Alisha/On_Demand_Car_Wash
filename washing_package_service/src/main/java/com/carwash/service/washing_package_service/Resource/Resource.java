package com.carwash.service.washing_package_service.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.service.washing_package_service.model.Washing_Packages;

@RestController
@RequestMapping("/Washing_Packages")
public class Resource {

	   @RequestMapping("/{Packagename}")
	    public Washing_Packages getPackages(@PathVariable("Packagename")String packageName){
	           return new Washing_Packages();
	    }
}
