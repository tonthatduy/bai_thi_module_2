package bai_thi_module_2.common;

import bai_thi_module_2.entity.Person;
import bai_thi_module_2.service.PaitientsService;

import java.util.List;

public class UpdateID {
    private UpdateID() {
    }

    private static int getCurrentId() {
        PaitientsService service = new PaitientsService();
        List<Person> people = service.findAll();
        if (!people.isEmpty()) {
            return people.get(people.size() - 1).getId();
        } else {
            return 0;
        }
    }

    public static int currentId = getCurrentId();
}
