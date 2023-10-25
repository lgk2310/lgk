package cn.lgk.mapper;

import cn.lgk.entity.insect_category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CategoryMapper {
@Select("select * from insect_category")
    List<insect_category> getAllclubs();
}
