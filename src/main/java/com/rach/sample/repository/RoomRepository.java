package src.main.java.com.rach.sample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import src.main.java.com.rach.sample.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}