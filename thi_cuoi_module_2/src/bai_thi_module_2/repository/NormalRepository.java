package bai_thi_module_2.repository;

import bai_thi_module_2.common.ReadAndWriteFileCSV;
import bai_thi_module_2.entity.NormalPatients;

import java.util.ArrayList;
import java.util.List;

public class NormalRepository implements INormalRepository {
    private static final String NORMAL_FILE = "src/bai_thi_module_2/data/medical_normal.csv";

    @Override
    public List<NormalPatients> findAll() {
        List<NormalPatients> normalPatientscustomers = new ArrayList<>();
        List<String> stringList = ReadAndWriteFileCSV.readFileCSV(NORMAL_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            NormalPatients customer = new NormalPatients(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], Long.parseLong(array[6]));
            normalPatientscustomers.add(customer);
        }

        return normalPatientscustomers;
    }

    @Override
    public void add(NormalPatients normalPatients) {

    }
}
