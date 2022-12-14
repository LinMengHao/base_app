package com.xzkj.baseservice.controller;


import com.xzkj.baseservice.entity.TUser;
import com.xzkj.baseservice.service.TUserService;
import com.xzkj.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LinMengHao
 * @since 2022-10-13
 */
@Slf4j
@RestController
@RequestMapping("/baseservice/t-user")
public class TUserController {
    @Autowired
    TUserService service;

    @PostMapping(value = "findAll",consumes = {MediaType.APPLICATION_JSON_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public R test(){
        List<TUser> list= service.findAll();
        log.info(list.toString());
        return R.ok();
    }
}

