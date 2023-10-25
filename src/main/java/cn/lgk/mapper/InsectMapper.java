package cn.lgk.mapper;

import cn.lgk.entity.Insect;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface InsectMapper {
    List<Insect> selectAll(@Param("name")String name, @Param("cid")Integer cid);
    @Insert("insert into insect(cid,name,life,area,discovery_time) values (#{cid},#{name},#{life},#{area},#{discovery_time})")
    int addinsect(Insect insect);
    @Delete("delete from insect where id=#{id}")
    int deleteinsect(Insect id);
}
