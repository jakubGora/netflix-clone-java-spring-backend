package com.netflix.netflix;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface NetflixRepository extends JpaRepository<Netflix, Long> {

    @Query(value = "select * from (select * from Netflix  where IMDB_VOTES>100000 and SERIES_OR_MOVIE='Movie' and  TMDB_TRAILER is not null and IMDB_SCORE is not null order by IMDB_SCORE DESC,IMDB_VOTES DESC) where rownum <=:nth ", nativeQuery=true)
    List<Netflix> findFirstNFilms(@Param("nth") Long nth);

    @Query(value = "select * from (select * from Netflix  where IMDB_VOTES>100000 and SERIES_OR_MOVIE='Series' and IMAGE is not null and IMDB_SCORE is not null order by IMDB_SCORE DESC, IMDB_VOTES DESC) where rownum <=:nth ", nativeQuery=true)
    List<Netflix> findFirstNSeries(@Param("nth") Long nth);

    @Query(value = "select * from (select * from Netflix  where IMDB_VOTES>100000 and SERIES_OR_MOVIE='Movie' and GENRE like '%'||:cat||'%' and TMDB_TRAILER is not null and IMDB_SCORE is not null order by IMDB_SCORE DESC, IMDB_VOTES DESC) where rownum <=:nth ", nativeQuery=true)
    List<Netflix> topInCat(@Param("nth") Long nth,@Param("cat") String cat);


    @Query(value = "select * from netflix where title like '%'||:param||'%' order by imdb_score desc",nativeQuery = true)
    List<Netflix> searchBy(@Param("param") String param);
}