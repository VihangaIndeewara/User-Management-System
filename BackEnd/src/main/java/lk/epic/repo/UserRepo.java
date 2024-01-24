package lk.epic.repo;

import lk.epic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,String> {



    @Query(value="SELECT userId FROM User ORDER BY userId DESC LIMIT 1",nativeQuery = true)
    String getLastUserId();


    User findByUserName(String username);

}
