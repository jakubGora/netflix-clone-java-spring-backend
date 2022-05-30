package com.netflix.netflix;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/netflix")
public class NetflixController {

    private final NetflixService netflixService;

    public NetflixController(NetflixService netflixService) {
        this.netflixService = netflixService;
    }



    @GetMapping(value = "/{id}"
            //,headers = "X-API-VERSION=1"
    )
    public Optional<Netflix> getSurnameByName(@PathVariable("id") Long id){
        return netflixService.getProductionById(id);
    }

    @GetMapping(value = "/cat/{cat}"
            //,headers = "X-API-VERSION=1"
    )
    public List<Netflix> getByCat(@PathVariable("cat") String cat){
        return netflixService.getTopNthCategory(10l,cat);
    }


    @GetMapping(value = "/Movie")
    public List<Netflix> getTopFilms(){
        return netflixService.getTopNthFilms(10L);
    }


    @GetMapping(value = "/Series")
    public List<Netflix> getTopSeries(){
        return netflixService.getTopNthSeries(10L);
    }

    @GetMapping(value = "Search/{param}")
    public List<Netflix> searchVideo(@PathVariable("param") String param) {return netflixService.searchBy(param);}

}
