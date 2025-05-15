package bai_thi_module_2.service;

import bai_thi_module_2.entity.Person;
import bai_thi_module_2.repository.IPatientsRepository;
import bai_thi_module_2.repository.PatientsRepository;

import java.util.List;

public class PaitientsService implements IPatientsService {
    private IPatientsRepository patientsRepository = new PatientsRepository();

    @Override
    public List<Person> findAll() {
        return patientsRepository.findAll();
    }

    @Override
    public void add(Person person) {
        patientsRepository.add(person);
    }

    @Override
    public List<Person> findByIDPerson() {
        return List.of();
    }

    @Override
    public void delete(Person person) {

    }
}
