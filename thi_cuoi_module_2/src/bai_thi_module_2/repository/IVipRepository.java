package bai_thi_module_2.repository;

import bai_thi_module_2.entity.NormalPatients;
import bai_thi_module_2.entity.VipPatients;

import java.util.List;

public interface IVipRepository {
    List<VipPatients> findAll();

    void add(VipPatients vipPatients);
}
