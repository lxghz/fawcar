package com.fawcar.afterservice.controller;
import com.alibaba.fastjson.JSONObject;
import com.fawcar.afterservice.entity.DeputeBillForm;
import com.fawcar.afterservice.entity.DeputeBillLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import com.fawcar.afterservice.entity.DeputeBill;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping(value = "/depute")
@ComponentScan(basePackages={"com.fawcar.afterservice.service.impl.DeputeBillServiceImpl"})
public class DeputeBillController {
    @Autowired
    private DeputeBillService deputeBillService;

    //@ResponseBody

    @RequestMapping(value="/saveMain",produces = {"application/json;charset=UTF-8"},method= POST)
    public String saveMain(@RequestBody String data){
        DeputeBillForm deputeBillForm = JSONObject.parseObject(data,DeputeBillForm.class);
        DeputeBill deputeBill = new DeputeBill();
        deputeBill.setId((int)((Math.random()*9+1)*100000) + "");
        deputeBill.setNdealerid(deputeBillForm.getNdealerid());
        deputeBill.setNbranchid(deputeBillForm.getNbranchid());
        deputeBill.setCservicerequisitionno(deputeBillForm.getCservicerequisitionno());
        deputeBill.setNvehicleid(deputeBillForm.getNvehicleid());
        deputeBill.setCrepairstatus(deputeBillForm.getCrepairstatus());
        deputeBill.setCmalfunctiondescription(deputeBillForm.getCmalfunctiondescription());
        return deputeBillService.saveMain(deputeBill);
    }


    //@ResponseBody
    @RequestMapping(value="/getAllBill",produces = {"application/json;charset=UTF-8"})
    public List<DeputeBill> getAllBill(){
        return deputeBillService.getAllBill();
    }
    //@ResponseBody
    @RequestMapping(value="/getLineById/{id}",produces = {"application/json;charset=UTF-8"})
    public List<DeputeBillLine> getLineById(@PathVariable("id") String id){
        return deputeBillService.getLineById(id);
    }

    //@ResponseBody
    @RequestMapping(value="/deleteLineById/{id}",produces = {"application/json;charset=UTF-8"})
    public int deleteLineById(@PathVariable("id") String id){
        return deputeBillService.deleteLineById(id);
    }

    //@ResponseBody
    @RequestMapping(value="/deleteById/{id}",produces = {"application/json;charset=UTF-8"})
    public int deleteById(@PathVariable("id") String id){
        return deputeBillService.deleteById(id);
    }

} 