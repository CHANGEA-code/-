package com.douyuehan.doubao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.douyuehan.doubao.model.entity.BmsBillboard;
import org.springframework.stereotype.Repository;

@Repository //相当于在容器new了一个Mapper实例对象
public interface BmsBillboardMapper extends BaseMapper<BmsBillboard> {
}
