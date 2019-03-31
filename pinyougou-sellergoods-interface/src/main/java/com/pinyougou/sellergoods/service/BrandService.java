package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * 品牌接口
 *
 */
public interface BrandService {
    public List<TbBrand> findAll();

    /**
     * 品牌分页
     * @param pageNum 当前页
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(int pageNum,int pageSize);
}
