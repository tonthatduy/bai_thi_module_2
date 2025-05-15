package bai_thi_module_2.repository;

import bai_thi_module_2.entity.Person;

import java.util.List;

public interface IPatientsRepository {
    List<Person> findAll();

    void add(Person person);

    List<Person> findByIDPerson();

    void delete(Person person);
}
