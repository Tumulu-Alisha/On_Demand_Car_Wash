package com.carwash.service.admin_service.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.service.admin_service.model.Admin;

@RestController
@RequestMapping("/admin")
public class Admin_Resource {

    @RequestMapping("/{adminId}")
    public Admin getAdminInfo(@PathVariable("adminId")String adminId){
            return  new Admin(adminId,"tumulualisha45@gmail.com","hello Users");
    }
}
