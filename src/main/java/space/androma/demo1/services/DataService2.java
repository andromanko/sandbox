package space.androma.demo1.services;

import org.springframework.stereotype.Service;
import space.androma.demo1.api.IDataService;


@Service
public class DataService2  implements IDataService {

    @Override
    public String getData() {
        return "DataService2 worked";
    }
}
