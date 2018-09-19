package com.mobigen.ngn.xdeditor.controller;

import com.mobigen.ngn.xdeditor.model.test.TestModel;
import com.mobigen.ngn.xdeditor.model.test.param.TestParamModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Bae B K on 2018. 9. 11.
 */
@RestController
@RequestMapping("/test")
@Slf4j
@Api(description = "test controller 입니다.")
public class TestController {
    
    @ApiOperation(value = "메인 첫번째", notes = "<pre>test 입니다.</pre>")
    @RequestMapping(value = "/init/{id}", method = RequestMethod.GET)
    public TestModel test(HttpServletRequest request, HttpServletResponse response, @PathVariable("id") final String id){
        TestModel testModel = new TestModel();
        
        testModel.setAge(10);
        testModel.setName("bbk");
        testModel.setStatus("get");
        
        return testModel;
    }
    
    @ApiOperation(value = "메인 첫번째", notes = "<pre>test 입니다.</pre>")
    @RequestMapping(value = "/init", method = RequestMethod.POST)
    public TestModel testPost(HttpServletRequest request, HttpServletResponse response, TestParamModel testParamModel){
        log.info(testParamModel.toString());
        
        TestModel testModel = new TestModel();
        
        testModel.setAge(1111);
        testModel.setName("bbk");
        testModel.setStatus("post");
        
        return testModel;
    }
}
