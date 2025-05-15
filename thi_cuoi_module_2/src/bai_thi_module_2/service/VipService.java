package bai_thi_module_2.service;

import bai_thi_module_2.entity.VipPatients;
import bai_thi_module_2.repository.IVipRepository;
import bai_thi_module_2.repository.VipRepository;

import java.util.List;

public class VipService implements IVipService{
    private IVipRepository vipRepository = new VipRepository();

    @Override
    public List<VipPatients> findAll() {
        return vipRepository.findAll();
    }

    @Override
    public void add(VipPatients vipPatients) {
        vipRepository.add(vipPatients);
    }
}
