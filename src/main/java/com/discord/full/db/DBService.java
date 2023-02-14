/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.discord.full.db;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 *
 * @author zico
 */

@ApplicationScoped
public class DBService {
    
    
    private static List<Player> players = new LinkedList<>();
    
    
    @PostConstruct
    public void initDatabaseInService(){
        
        System.out.println("init data....");
        players.add(new Player(UUID.randomUUID().toString(), "Scott", "1/1/2005"));
        players.add(new Player(UUID.randomUUID().toString(), "Michel", "1/12/2022"));
        players.add(new Player(UUID.randomUUID().toString(), "Robinson", "1/12/2008"));
    }
    
    
    public List<Player> findAll(){
        return players;
    }
    
    public void add(Player player){
        players.add(player);
    }
    
    public Optional<Player> findByName(String name){
        return players.stream()
                        .filter( p -> p.getName().equalsIgnoreCase(name))
                        .findFirst();
    }
}
