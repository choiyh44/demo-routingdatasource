package com.example.demoroutingdatasource.app.rodemo.service;

import com.example.demoroutingdatasource.app.rodemo.dto.RoDemo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
public class RoDemoServiceTest {
    @Autowired
    private RoDemoService roDemoService;

    @Test
    void getAllRoDemoList() {
        List<RoDemo> result = roDemoService.getAllRoDemoList();

        log.info("result: {}", result);
    }

    @Test
    void getAllRoDemoListFromRoDb() {
        List<RoDemo> result = roDemoService.getAllRoDemoListFromRoDb();

        log.info("result: {}", result);
    }

}
