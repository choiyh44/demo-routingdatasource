package com.example.demoroutingdatasource.app.rodemo.repository;

import com.example.demoroutingdatasource.app.rodemo.dto.RoDemo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoDemoMapper {

    List<RoDemo> selectAllRoDemoList();

}
