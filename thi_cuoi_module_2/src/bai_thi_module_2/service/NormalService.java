package bai_thi_module_2.service;

import bai_thi_module_2.entity.NormalPatients;
import bai_thi_module_2.repository.INormalRepository;
import bai_thi_module_2.repository.NormalRepository;

import java.util.List;

public class NormalService  implements INormalService {
    private INormalRepository normalRepository =new NormalRepository();

    @Override
    public List<NormalPatients> findAll() {
        return normalRepository.findAll();
    }

    @Override
    public void add(NormalPatients normalPatients) {
        normalRepository.add(normalPatients);

    }
}
