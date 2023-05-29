package com.example.demo.controller.operation.simple;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
@RequestMapping("/plus")
public class SimplePlusController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private final int maxSimpleOperation = 60;

    @GetMapping()
    public String getTest(){
        return "getTest";
    }
    @GetMapping("/ones")
    public Map<Integer, Integer> getWithLeadingOnes() {
        return generateLeadingOnes(maxSimpleOperation);
    }

    private Map<Integer, Integer> generateLeadingOnes(int maxGenerate) {
        Map<Integer, Integer> sumMap = new HashMap<>();
        Random random = new Random();

        logger.info("Size: " + sumMap.size());

        for (int operation = 0; operation < maxGenerate; operation++) {
            logger.info("Size: " + sumMap.size());
            int key = random.nextInt(9);
            int value = random.nextInt(9);
            sumMap.put(key, value);
//            sumMap.put(maxGenerate, maxGenerate);
        }

//        while (sumMap.size() < maxGenerate) {
//            int key = random.nextInt(9);
//            int value = random.nextInt(9);
//            logger.info("Size: " + sumMap.size());
//
//            sumMap.put(key, value);
//            sumMap.put(maxGenerate, maxGenerate);
//            if ((!sumMap.containsKey(key) || sumMap.containsKey(key)) && !sumMap.containsValue(value)) {
//                sumMap.put(key, value);
//            }
//        }

        return  sumMap;
    }
}

