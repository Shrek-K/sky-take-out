package com.sky.mapper;

import com.sky.annotaion.AutoFill;
import com.sky.entity.Setmeal;
import com.sky.entity.SetmealDish;
import com.sky.enumeration.OperationType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询对应的套餐id
      * @param dishIds
     * @return
     */
    //@Select("select setmeal_id from setmeal_dish where ")
    List<Long> getSetmealDishIdsByDishIds(List<Long> dishIds);

    /**
     * 更新套餐起售、停售
     * @param setmeal
     */
    @AutoFill(OperationType.UPDATE)
    void update(Setmeal setmeal);

    /**
     * 批量保存套餐与菜品的关系
     * @param setmealDishes
     */
    void insertBatch(List<SetmealDish> setmealDishes);
}
