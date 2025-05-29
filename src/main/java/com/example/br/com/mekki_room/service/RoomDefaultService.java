package com.example.br.com.mekki_room.service;

import com.example.br.com.mekki_room.entity.Room;
import com.example.br.com.mekki_room.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomDefaultService implements  RoomService{

    @Autowired
    private RoomRepository repository;

    @Override
    public void save(Room room) {
        System.out.println(room);
        repository.save(room);
    }

    @Override
    public Room updateRoom(Room room) {
        return repository.save(room);
    }

    @Override
    public List<Room> roomList() {
        return repository.findAll();
    }

    @Override
    public List<Room> roomListAvailable() {
        return repository.findAll();
    }
}
