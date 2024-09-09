package com.example.demoroutingdatasource.app.rodemo.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@ToString
@Alias("RoDemo")
public class RoDemo {
    private Integer id;
    private String name;
    private String description;
}
