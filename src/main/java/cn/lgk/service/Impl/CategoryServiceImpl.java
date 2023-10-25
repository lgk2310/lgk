package cn.lgk.service.Impl;

import cn.lgk.entity.insect_category;
import cn.lgk.mapper.CategoryMapper;
import cn.lgk.service.CategoryService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Cacheable("kunchong")
    @Override
    public List<insect_category> getAllClubs() {
        return categoryMapper.getAllclubs();
    }
}
