package com.xzkj.baseservice.service;

import com.xzkj.baseservice.entity.TUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LinMengHao
 * @since 2022-10-13
 */
public interface TUserService extends IService<TUser> {

    List<TUser> findAll();
}
