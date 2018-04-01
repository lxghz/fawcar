package com.fawcar.afterservice.controller;

import com.fawcar.afterservice.entity.DeputeBill;
import com.fawcar.afterservice.entity.DeputeBillLine;

import java.util.List;

public interface DeputeBillService {

    List<DeputeBill> getAllBill();
    List<DeputeBillLine> getLineById(String Id);
    int deleteLineById(String id);
    int deleteById(String id);

    String saveMain(DeputeBill deputeBill);
} 