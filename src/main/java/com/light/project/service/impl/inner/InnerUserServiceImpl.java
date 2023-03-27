package com.light.project.service.impl.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.light.apicommon.model.entity.User;
import com.light.apicommon.service.InnerUserService;
import com.light.project.common.ErrorCode;
import com.light.project.exception.BusinessException;
import com.light.project.mapper.UserMapper;
import com.light.project.service.UserInterfaceInfoService;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

/**
 * @author light
 * @version 1.0
 * @project api-backend
 * @description
 * @data 2023/3/26 15 : 39 : 48
 */
@DubboService
public class InnerUserServiceImpl implements InnerUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("accessKey",accessKey);
        User user = userMapper.selectOne(queryWrapper);
        return user;
    }
}
