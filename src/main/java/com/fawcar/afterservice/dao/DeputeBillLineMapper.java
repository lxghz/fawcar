package com.fawcar.afterservice.dao;

import com.fawcar.afterservice.entity.DeputeBillLine;

import java.util.List;

public interface DeputeBillLineMapper {
    int deleteByPrimaryKey(String id);

    int insert(DeputeBillLine record);

    int insertSelective(DeputeBillLine record);

    DeputeBillLine selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DeputeBillLine record);

    int updateByPrimaryKey(DeputeBillLine record);
    List<DeputeBillLine> getLineById(String id);
    int deleteLineById(String id);
}