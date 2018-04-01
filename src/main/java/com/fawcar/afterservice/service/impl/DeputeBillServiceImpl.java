package com.fawcar.afterservice.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fawcar.afterservice.dao.DeputeBillLineMapper;
import com.fawcar.afterservice.dao.DeputeBillMapper;
import com.fawcar.afterservice.controller.DeputeBillService;
import com.fawcar.afterservice.entity.DeputeBillLine;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.fawcar.afterservice.entity.DeputeBill;
import java.util.List;
@Component
@Service(value = "DeputeBillService")
public class DeputeBillServiceImpl implements DeputeBillService {
    @Autowired
    private DeputeBillMapper deputeBillMapper;//这里会报错，但是并不会影响
    @Autowired
    private DeputeBillLineMapper deputeBillLineMapper;

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    @Override
    public List<DeputeBill> getAllBill() {
        return deputeBillMapper.getAllBill();
    }
    public List<DeputeBillLine> getLineById(String Id) {
        return deputeBillLineMapper.getLineById(Id);
    }

    public int deleteLineById(String id) {
        deputeBillLineMapper.deleteLineById(id);
        return 0;
    }
    public int deleteById(String id) {
        deputeBillLineMapper.deleteLineById(id);
        deputeBillMapper.deleteById(id);
        return 0;
    }

    @Override
    public String saveMain(DeputeBill deputeBill) {
        JSONObject result = new JSONObject();
        deputeBillMapper.saveMain(deputeBill);
        result.put("msg", "保存成功");
        return JSON.toJSONString(result);
    }
} 