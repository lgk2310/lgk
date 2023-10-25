package cn.lgk.service;

import cn.lgk.entity.Insect;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InsectService {
    List<Insect> selectAll(String name, Integer cid);

    int addinsect(Insect insect);

    int deleteinsect(Insect id);
}
