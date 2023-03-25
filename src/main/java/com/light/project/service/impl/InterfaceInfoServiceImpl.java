package com.light.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.light.project.common.ErrorCode;
import com.light.project.exception.BusinessException;
import com.light.project.model.entity.Post;
import com.light.project.model.enums.PostGenderEnum;
import com.light.project.model.enums.PostReviewStatusEnum;
import com.light.project.service.InterfaceInfoService;
import com.light.project.model.entity.InterfaceInfo;
import com.light.project.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author 86550
* @description 针对表【interface_info(接口表信息)】的数据库操作Service实现
* @createDate 2023-03-11 10:57:35
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService {
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name)) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isAnyBlank(name)&&name.length()>50){
            throw new BusinessException(ErrorCode.PARAMS_ERROR,"名字太长！");
        }

    }
}




