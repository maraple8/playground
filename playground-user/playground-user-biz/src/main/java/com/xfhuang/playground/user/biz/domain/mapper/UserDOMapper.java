package com.xfhuang.playground.user.biz.domain.mapper;

import com.xfhuang.playground.user.biz.domain.dataobject.UserDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Long id);

    
    UserDO selectByPhone(String phone);

    
    List<UserDO> selectByIds(@Param("ids") List<Long> ids);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}