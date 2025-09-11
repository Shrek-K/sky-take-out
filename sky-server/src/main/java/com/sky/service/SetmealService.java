package com.sky.service;

import com.sky.dto.SetmealDTO;

public interface SetmealService {
    /**
     * 新增套餐以及套餐里包含的菜品
     * @param setmealDTO
     */
    void setWithDishs(SetmealDTO setmealDTO);
}
