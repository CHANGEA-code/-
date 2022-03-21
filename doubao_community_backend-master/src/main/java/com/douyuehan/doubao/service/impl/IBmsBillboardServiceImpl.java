package com.douyuehan.doubao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.douyuehan.doubao.mapper.BmsBillboardMapper;
import com.douyuehan.doubao.model.entity.BmsBillboard;
import com.douyuehan.doubao.service.IBmsBillboardService;
import org.springframework.stereotype.Service;

@Service    //注入容器中，表明这是某个接口的实例
public class IBmsBillboardServiceImpl extends ServiceImpl<BmsBillboardMapper
        , BmsBillboard> implements IBmsBillboardService {

}
