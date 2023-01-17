package com.fzt.ktzq.controller;

import com.fzt.ktzq.dao.RecordDay;
import com.fzt.ktzq.mapper.RecordDayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 每日考勤服务类
 * @author 黄弋峰 2023/1/17
 */
@Service
public class RecordDayService {

    @Autowired(required = false)
    RecordDayMapper recordDayMapper;

    /**'
     * 查询考勤
     * @param recordDay
     * @return
     */
    public List<RecordDay> selectRecordDay(RecordDay recordDay){
        return recordDayMapper.select(recordDay);
    }

    /**
     * 新增考勤
     * @param recordDay
     * @return
     */
    public boolean addRecordDay(RecordDay recordDay){
        boolean flag = false;
        try {
            recordDayMapper.insertSelective(recordDay);
        } catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 修改考勤
     * @param recordDay
     * @return
     */
    public boolean updateRecordDay(RecordDay recordDay){
        boolean flag = false;
        try {
            recordDayMapper.updateByPrimaryKeySelective(recordDay);
        } catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    /**
     * 删除考勤
     * @param recordDay
     * @return
     */
    public boolean deleteRecordDay(RecordDay recordDay){
        boolean flag = false;
        try {
            recordDayMapper.deleteByPrimaryKey(recordDay);
        } catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
