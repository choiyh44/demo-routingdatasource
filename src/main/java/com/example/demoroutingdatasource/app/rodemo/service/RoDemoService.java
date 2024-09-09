package com.example.demoroutingdatasource.app.rodemo.service;

import com.example.demoroutingdatasource.app.rodemo.dto.RoDemo;
import com.example.demoroutingdatasource.app.rodemo.repository.RoDemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoDemoService {
    @Autowired
    private RoDemoMapper roDemoMapper;

    List<RoDemo> getAllRoDemoList() {
        return roDemoMapper.selectAllRoDemoList();
    }

    @Transactional(readOnly = true)
    List<RoDemo> getAllRoDemoListFromRoDb() {
        return roDemoMapper.selectAllRoDemoList();
    }

}
