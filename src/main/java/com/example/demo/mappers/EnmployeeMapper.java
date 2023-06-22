package com.example.demo.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.beans.EmployeeBean;
import com.example.demo.entities.EmployeeEntity;

@Mapper
public interface EnmployeeMapper {

    EnmployeeMapper INSTANCE = Mappers.getMapper(EnmployeeMapper.class);

    EmployeeBean entityToBean(EmployeeEntity entity);
    List<EmployeeBean> entitiesToBeans(List<EmployeeEntity> entities);

    // EmployeeEntity beanToEntity(EmployeeBean bean);
    // List<EmployeeEntity> beansToEntities(List<EmployeeBean> beans);
    
}
