package bai_thi_module_2.repository;

import bai_thi_module_2.common.ReadAndWriteFileCSV;
import bai_thi_module_2.entity.VipPatients;

import java.util.ArrayList;
import java.util.List;

public class VipRepository implements IVipRepository {
    private static final String VIP_FILE = "src/bai_thi_module_2/data/medical_vip.csv";

    @Override
    public List<VipPatients> findAll() {
        List<VipPatients> vipPatients = new ArrayList<>();
        List<String> stringList = ReadAndWriteFileCSV.readFileCSV(VIP_FILE);
        String[] array;
        for (int i = 0; i < stringList.size(); i++) {
            array = stringList.get(i).split(",");
            VipPatients patients = new VipPatients(Integer.parseInt(array[0]), array[1], array[2], array[3], array[4], array[5], Integer.parseInt(array[7]), array[8]);
            vipPatients.add(patients);

        }
        return vipPatients;
    }

    @Override
    public void add(VipPatients vipPatients) {

    }
}
