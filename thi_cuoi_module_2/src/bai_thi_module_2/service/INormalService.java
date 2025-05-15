package bai_thi_module_2.service;

import bai_thi_module_2.entity.NormalPatients;

import java.util.List;

public interface INormalService {
    List<NormalPatients> findAll();

    void add(NormalPatients normalPatients);
}
