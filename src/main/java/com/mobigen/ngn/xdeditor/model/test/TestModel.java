package com.mobigen.ngn.xdeditor.model.test;

import io.swagger.annotations.ApiModel;
import lombok.Data;

/**
 * Created by Bae B K on 2018. 9. 11.
 */
@Data
@ApiModel(value = "TestModel", description = "test!!!!!!!!")
public class TestModel {
    private String id;
    private String name;
    private Integer age;
    private String status;
}
