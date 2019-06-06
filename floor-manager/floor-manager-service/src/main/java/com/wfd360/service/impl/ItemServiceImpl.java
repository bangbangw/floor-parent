package com.wfd360.service.impl;

import com.wfd360.mapper.TbItemMapper;
import com.wfd360.pojo.TbItem;
import com.wfd360.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    public TbItem getItemById(long id) {
        TbItem item = itemMapper.selectByPrimaryKey(id);
        return item;
    }
}
