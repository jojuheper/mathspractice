package com.example.demo.controller.operation.simple;

import com.example.demo.util.common.CustomMapper;
import com.example.demo.util.helper.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
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
        CustomMapper customMapper = new CustomMapper();
        List<CustomMapper> customMapperList = new ArrayList<>();

        for (int operation = 0; operation < maxGenerate; operation++) {
            logger.debug("Size List: " + customMapperList.size());
            int key = random.nextInt(9);
            int value = random.nextInt(9);

            customMapperList.add(new CustomMapper(operation + 1, key, value, Constant.Symbol.PLUS));

        }

        return customMapper.toJson(customMapperList);
    }
}

