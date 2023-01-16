package com.example.checkdemo;

import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodServiceImpl implements GoodService {
    private final GoodsMapper goodsMapper;

    public GoodServiceImpl(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }

    @Override
    public List<Good> findAll() {
        return goodsMapper.findAll();
    }

    @Override
    public Good findById(int id) throws Exception {
        Good goodResponse = goodsMapper.findById(id).orElseThrow(() -> {
            return new NotFoundException("Employee not found with id" + id);
        });
        return goodResponse;
    }

/*    @Override
    public void create(String name) {

    }

    @Override
    public void update(int id, String name) throws Exception {

}*/
}
