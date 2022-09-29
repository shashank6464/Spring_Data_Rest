package com.spring.data.rest.Spring.Data.Rest.Repository;


import com.spring.data.rest.Spring.Data.Rest.Entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {


}