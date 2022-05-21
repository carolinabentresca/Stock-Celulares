package com.example.controller;

import com.example.model.Producto;
import com.example.model.Producto1;
import com.example.model.Producto2;
import com.example.service.Producto1Service;
import com.example.service.Producto2Service;
import com.example.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class ProductoController {

    @Autowired
    ProductoService service;
    @Autowired
    Producto1Service service1;
    @Autowired
    Producto2Service service2;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/menu")
    public String menu() {
        return "menu";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        model.addAttribute("list", service.list());
        return "list";
    }

    @RequestMapping("/showProducto")
    public String show(Model model) {
        Producto producto = new Producto();
        model.addAttribute("producto", producto);
        return "save";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("producto") Producto producto) {
        service.save(producto);
        return "redirect:/menu";
    }

    @RequestMapping("/list1")
    public String list1(Model model) {
        model.addAttribute("list1", service1.list());
        return "list1";
    }

    @RequestMapping("/showProducto1")
    public String show1(Model model) {
        Producto1 producto1 = new Producto1();
        model.addAttribute("producto1", producto1);
        return "save1";
    }

    @RequestMapping(value = "/save1", method = RequestMethod.POST)
    public String save1(@ModelAttribute("producto1") Producto1 producto1) {
        service1.save(producto1);
        return "redirect:/menu";
    }

    @RequestMapping("/list2")
    public String list2(Model model) {
        model.addAttribute("list2", service2.list());
        return "list2";
    }

    @RequestMapping("/showProducto2")
    public String show2(Model model) {
        Producto2 producto2 = new Producto2();
        model.addAttribute("producto2", producto2);
        return "save2";
    }

    @RequestMapping(value = "/save2", method = RequestMethod.POST)
    public String save2(@ModelAttribute("producto2") Producto2 producto2) {
        service2.save(producto2);
        return "redirect:/menu";
    }
}
