package com.itheima.web.controller;


import com.itheima.service.ItemsService;
import com.itheima.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showItems")
    private String showItems(Integer id, Model model){
        Items items = itemsService.findById(id);
        model.addAttribute("item",items);
        return "viewItem";
    }
}
