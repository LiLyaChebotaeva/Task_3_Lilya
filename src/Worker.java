import java.util.ArrayList;
import java.util.List;

class Worker extends Person {

    class worker extends Person
    {
        int salary;
    }

    class Manager extends worker
    {
        List<worker> workers = new ArrayList<>();
    }
}

