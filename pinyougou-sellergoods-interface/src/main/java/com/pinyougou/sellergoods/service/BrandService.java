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
     * 增加
     * @param brand
     */
    public void add(TbBrand brand);

    /**
     * 根据id查询实体
     * @param id
     * @return
     */
    public TbBrand findOne(Long id);

    /**
     * 修改
     * @param brand
     */
    public void update(TbBrand brand);

    /**
     * 删除
     * @param ids
     */
    public void delete(Long[] ids);

    /**
     * 分页
     * @param pageNum 当前页码
     * @param pageSize 每页记录数
     * @return
     */
    public PageResult findPage(TbBrand brand, int pageNum,int pageSize);
}
