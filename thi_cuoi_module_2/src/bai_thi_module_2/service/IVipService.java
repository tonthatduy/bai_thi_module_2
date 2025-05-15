package bai_thi_module_2.service;

import bai_thi_module_2.entity.VipPatients;

import java.util.List;

public interface IVipService {
    List<VipPatients> findAll();

    void add(VipPatients vipPatients);
}
