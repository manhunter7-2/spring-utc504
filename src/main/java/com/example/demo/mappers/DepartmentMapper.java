package com.example.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.beans.DepartmentBean;
import com.example.demo.entities.DepartmentEntity;

@Mapper
public interface DepartmentMapper {
    
    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentBean entityToBean(DepartmentEntity entity);
    List<DepartmentBean> entitiesToBeans(List<DepartmentEntity> entities);
}
