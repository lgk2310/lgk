package cn.lgk.service.Impl;

import cn.lgk.entity.Insect;
import cn.lgk.mapper.InsectMapper;
import cn.lgk.service.InsectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class InsectServiceImpl implements InsectService {
    @Resource
    private InsectMapper insectMapper;
    @Override
    public List<Insect> selectAll(String name, Integer cid) {
        return insectMapper.selectAll(name,cid);
    }

    @Override
    public int addinsect(Insect insect) {
        return insectMapper.addinsect(insect);
    }

    @Override
    public int deleteinsect(Insect id) {
        return insectMapper.deleteinsect(id);
    }
}
