package com.fawcar.afterservice.dao;

import com.fawcar.afterservice.entity.DeputeBill;
import com.fawcar.afterservice.entity.DeputeBillLine;

import java.util.List;

public interface DeputeBillMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DeputeBill record);

    int insertSelective(DeputeBill record);

    DeputeBill selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeputeBill record);

    int updateByPrimaryKey(DeputeBill record);

    List<DeputeBill> getAllBill();
    int deleteById(String id);

    void saveMain(DeputeBill deputeBill);
}