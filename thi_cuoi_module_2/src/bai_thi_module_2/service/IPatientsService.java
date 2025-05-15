package bai_thi_module_2.service;

import bai_thi_module_2.entity.Person;

import java.util.List;

public interface IPatientsService {
    List<Person> findAll();

    void add(Person person);

    List<Person> findByIDPerson();

    void delete(Person person);
}
