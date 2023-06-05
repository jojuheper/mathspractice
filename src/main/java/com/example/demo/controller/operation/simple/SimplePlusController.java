package com.example.demo.controller.operation.simple;

import com.example.demo.util.common.CustomMapper;
import com.example.demo.util.helper.Constant;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/plus")
public class SimplePlusController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final int maxSimpleOperation = 60;

    @GetMapping()
    public String getTest() {
        return "getTest";
    }

    @GetMapping("/simple")
    public String getWithLeadingOnes() {
        return generateLeadingOnes(maxSimpleOperation);
    }

    private String generateLeadingOnes(int maxGenerate) {

        Random random = new Random();
        DataWrapper dataWrapper = new DataWrapper();
        List<CustomMapper> customMapperList = new ArrayList<>();

        for (int operation = 0; operation < maxGenerate; operation++) {
            logger.debug("Size List: " + customMapperList.size());
            int key = random.nextInt(9);
            int value = random.nextInt(9);

            dataWrapper.addData(new CustomMapper(key, value, Constant.Symbol.PLUS));

        }

        return dataWrapper.toJson();
    }
}

