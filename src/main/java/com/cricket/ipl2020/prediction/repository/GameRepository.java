package com.cricket.ipl2020.prediction.repository;
import com.cricket.ipl2020.prediction.entity.Game;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends  CrudRepository<Game, Integer> {

    @Query(value = "Select * from games where date =:date", nativeQuery = true)
     List<Game> findGamesByDate(@Param("date") LocalDate date);

}