package bai_thi_module_2.repository;

import bai_thi_module_2.entity.NormalPatients;
import bai_thi_module_2.entity.Person;

import java.util.List;

public interface INormalRepository {
    List<NormalPatients> findAll();

    void add(NormalPatients normalPatients);
}
