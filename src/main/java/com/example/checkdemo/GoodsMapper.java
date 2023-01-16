package com.example.checkdemo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface GoodsMapper {
    @Select("SELECT * FROM goods")
    List<Good> findAll();

    @Select("SELECT * FROM goods WHERE id = #{id}")
    Optional<Good> findById(int id);
}
