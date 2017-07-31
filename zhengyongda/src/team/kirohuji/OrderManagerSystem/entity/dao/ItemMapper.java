package team.kirohuji.OrderManagerSystem.entity.dao;

import team.kirohuji.OrderManagerSystem.entity.Item;

public interface ItemMapper {
    int deleteById(Integer id);

    int insert(Item record);

    Item selectById(Integer id);
    
    int updateById(Item record);
}