package com.qf.wly.mapper;

import com.qf.wly.entity.Cate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CateMapper {
    int insert(@Param("cate")Cate cate);
    List<Cate> selectList();

}
