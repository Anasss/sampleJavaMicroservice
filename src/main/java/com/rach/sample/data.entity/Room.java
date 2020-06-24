package src.main.java.com.rach.sample.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name="ROOM")
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Setter(value = AccessLevel.PUBLIC)
@Getter
public class Room {
  @Id
  @Column(name="ROOM_ID")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long roomId;
  @Column(name="NAME")
  private String roomName;
  @Column(name="ROOM_NUMBER")
  private String roomNumber;
  @Column(name="BED_INFO")
  private String bedInfo;
}  