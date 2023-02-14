/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.discord.full.controller;

import com.discord.full.db.DBService;
import com.discord.full.db.Player;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author zico
 */


@WebServlet("/players")
public class PlayersController extends HttpServlet {
    
    
    @Inject
    private DBService dbService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        
        List<Player> players = dbService.findAll();
        
        req.setAttribute("players", players);
        req.getRequestDispatcher("/views/players.jsp").forward(req, resp);

    }
    

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String playerName = req.getParameter("nombre");
        String joiningDate = req.getParameter("fecha");
        
        
        System.out.println(playerName);
        System.out.println(joiningDate);
        
        
        Player newPlayer = new Player(UUID.randomUUID().toString(),playerName,joiningDate);
        dbService.add(newPlayer);
        req.setAttribute("newPlayer", newPlayer);
        
        req.getRequestDispatcher("/views/newPlayer.jsp").forward(req, resp);
    } 
}
