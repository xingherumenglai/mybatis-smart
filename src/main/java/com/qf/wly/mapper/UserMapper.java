package com.qf.wly.mapper;

import com.qf.wly.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int insert(@Param("user") User user);

    User selectById(@Param("userId") int userId);
}
