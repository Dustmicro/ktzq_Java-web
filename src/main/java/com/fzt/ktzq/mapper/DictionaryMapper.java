package com.fzt.ktzq.mapper;

import com.fzt.ktzq.dao.Dictionary;
import com.github.pagehelper.Page;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface DictionaryMapper extends Mapper<Dictionary> {
    int deleteByPrimaryKey(Integer dicId);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Integer dicId);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);

    Dictionary find(Dictionary record);

    List<Dictionary> list(Dictionary record);

    Page<Dictionary> pageList(Dictionary record);
}