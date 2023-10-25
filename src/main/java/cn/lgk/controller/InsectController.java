package cn.lgk.controller;

import cn.lgk.entity.insect_category;
import cn.lgk.entity.Insect;
import cn.lgk.service.CategoryService;
import cn.lgk.service.InsectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/Insect")
public class InsectController {
    @Autowired
    private InsectService insectService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping("select")
    public String select(@RequestParam(value = "name",required = false)String name, @RequestParam(value = "cid",required = false)Integer cid, Model model){
        List<Insect> insectslist = insectService.selectAll(name,cid);
        model.addAttribute("insectslist",insectslist);
        List<insect_category> categoryList = categoryService.getAllClubs();
        model.addAttribute("categoryList",categoryList);
        return "list";
    }
    @RequestMapping("toadd")
    public String toadd(Model model){
        List<insect_category> categoryList =categoryService.getAllClubs();
        model.addAttribute("categoryList",categoryList);
        return "add";
    }
    @RequestMapping("add")
    @ResponseBody
    public String add(Insect insect){
        int count=insectService.addinsect(insect);
        if (count==1){
            return "true";
        }else {
            return "false";
        }

    }
    @RequestMapping("delete")
    @ResponseBody
    public String delete(Insect id){
        int i=insectService.deleteinsect(id);
        if (i>0){
            return "true";
        }else {
            return "false";
        }

    }
}
