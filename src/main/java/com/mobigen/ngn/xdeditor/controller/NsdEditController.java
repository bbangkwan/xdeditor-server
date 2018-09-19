package com.mobigen.ngn.xdeditor.controller;

import com.mobigen.ngn.xdeditor.model.ResponseModel;
import com.mobigen.ngn.xdeditor.model.test.param.TestParamModel;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Bae B K on 2018. 9. 18.
 */
@RestController
@RequestMapping("/edit")
@Slf4j
@Api(description = "NSD 편집 API")
public class NsdEditController {
    @GetMapping(value = "/{id}")
    @ResponseBody
    public ResponseModel getNsdItemDetail(@PathVariable("id") final String id){
        ResponseModel.ResponseModelBuilder resModelBuilder = ResponseModel.builder();
        
        log.info("test id : " + id);
        
        return resModelBuilder.build();
    }
    
    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseModel createNsd(@RequestBody TestParamModel testParamModel){
        ResponseModel.ResponseModelBuilder resModelBuiler = ResponseModel.builder();
    
        log.info("test post testParamModel.toString : "+ testParamModel.toString());
        
        return resModelBuiler.build();
    }
    
    @PutMapping(value = "/{id}")
    @ResponseBody
    public ResponseModel updateNsd(@PathVariable("id") final String id, @RequestBody TestParamModel testParamModel){
        ResponseModel.ResponseModelBuilder resModelBuiler = ResponseModel.builder();
    
        log.info("test put id : " + id);
        log.info("test put testParamModel.toString : " + testParamModel.toString());
    
        return resModelBuiler.build();
    }
    
    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public ResponseModel deleteNsd(@PathVariable("id") final String id, @RequestBody TestParamModel testParamModel){
        ResponseModel.ResponseModelBuilder resModelBuiler = ResponseModel.builder();
    
        log.info("test delete id : " + id);
        log.info("test delete testParamModel.toString : " + testParamModel.toString());
    
        return resModelBuiler.build();
    }
}
