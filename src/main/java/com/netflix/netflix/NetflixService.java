package com.netflix.netflix;

import com.netflix.netflix.Netflix;
import com.netflix.netflix.NetflixRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NetflixService {

    private NetflixRepository netflixRepository;

    public NetflixService(NetflixRepository netflixRepository) {
        this.netflixRepository = netflixRepository;
    }
    public Optional<Netflix> getProductionById(Long id){
        return netflixRepository.findById(id);
    }

    public List<Netflix> getTopNthFilms(Long nth){
       return netflixRepository.findFirstNFilms(nth);
    }

    public List<Netflix> getTopNthSeries(Long nth){
        return netflixRepository.findFirstNSeries(nth);
    }

    public List<Netflix> getTopNthCategory(Long nth,String cat){
        return netflixRepository.topInCat(nth,cat);
    }

    public List<Netflix> searchBy(String param){ return netflixRepository.searchBy(param);}

}
