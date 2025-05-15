package bai_thi_module_2.repository;

import bai_thi_module_2.common.ReadAndWriteFileCSV;
import bai_thi_module_2.entity.NormalPatients;
import bai_thi_module_2.entity.Person;
import bai_thi_module_2.entity.VipPatients;

import java.util.ArrayList;
import java.util.List;

public class PatientsRepository implements IPatientsRepository {
    private static final String PATH = "src/bai_thi_module_2/data/medical_records.csv";

    @Override
    public List<Person> findAll() {
        List<String> stringList = ReadAndWriteFileCSV.readFileCSV(PATH);
        List<Person> personList = new ArrayList<>();
        for (String s : stringList) {
            String[] array = s.split("\\s*,\\s*");
            if (array[1].contains("BA")) {
                personList.add(new NormalPatients(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], Long.parseLong(array[6])));
            } else if (array[1].contains("BA")) {
                personList.add(new VipPatients(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], Integer.parseInt(array[7]), array[8]));

            }
        }
        return personList;
    }

    @Override
    public void add(Person person) {
        List<String> stringList = new ArrayList<>();
        if (person instanceof NormalPatients) {
            stringList.add(((NormalPatients) person).getToFileCSVNormalPatients());
        } else if (person instanceof VipPatients) {
            stringList.add(((VipPatients) person).getToFileCSVVipPatients());
        }
        ReadAndWriteFileCSV.writeFileCSV(PATH, stringList, true);
    }

    @Override
    public List<Person> findByIDPerson() {
        return List.of();
    }

    @Override
    public void delete(Person person) {

    }
}

