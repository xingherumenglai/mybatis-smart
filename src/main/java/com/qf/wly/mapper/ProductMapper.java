package com.qf.wly.mapper;

import com.qf.wly.entity.Product;
import com.qf.wly.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int insert(@Param("product") Product product);
    List<Product> selectListByCateId(@Param("cateId") int cateId);
}
