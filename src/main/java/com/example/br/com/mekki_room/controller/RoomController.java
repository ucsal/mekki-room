package com.example.br.com.mekki_room.controller;

import com.example.br.com.mekki_room.entity.Room;
import com.example.br.com.mekki_room.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService service;


    @PostMapping("/save")
    public void createRoom(@RequestBody Room room){
        service.save(room);
    }

    @PostMapping("/update")
    public Room updateRoom(@RequestBody Room room){
        return service.updateRoom(room);
    }


    @GetMapping("/list")
    public List<Room> findAll() {
        return service.roomList();
    }

    @GetMapping("/{id}")
    public Boolean isAvailable(@PathVariable Integer id){
        return  service.roomIsAvailable(id);
    }


    @GetMapping("/list/available")
    public List<Room> findAllAvaliable() {
        return service.roomListAvailable();
    }

}
