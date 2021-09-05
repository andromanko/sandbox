package space.androma.demo1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import space.androma.demo1.api.IDataService;
import space.androma.demo1.entity.TestIn1;

import java.security.Principal;
import java.util.List;

@RestController
public class main {

    //@Qualifier("DataService2")
    @Autowired
    List<IDataService> dataServiceList;

    @GetMapping("/")
    public String rooter() {

        String s="";
        for (IDataService ds: dataServiceList)
            s+=ds.getData();
        return s;
    }

    @PostMapping("/camel")
    public String camelPost(@RequestBody TestIn1 inVal, Principal principal) {

        String s="";
        for (IDataService ds: dataServiceList)
            s+=ds.getData();
        return s;
    }
}
