package com.example.br.com.mekki_room.service;

import com.example.br.com.mekki_room.entity.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    void save(Room room);

    Room updateRoom(Room room);

    List<Room> roomList();

    List<Room> roomListAvailable();

    Boolean roomIsAvailable(Integer id);
}
