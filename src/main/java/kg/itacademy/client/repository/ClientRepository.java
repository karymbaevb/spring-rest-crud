package kg.itacademy.client.repository;

import kg.itacademy.client.entity.ClientEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    //SELECT count(firstname) FROM client WHERE firstname = ?1;
    int countAllByFirstname(String firstname);

    @Query(value = "SELECT count(*) FROM client c WHERE c.firstname = ?1", nativeQuery = true)
    int customCountByFirstname(String firstname);

    @Query("SELECT COUNT(c) FROM ClientEntity c WHERE c.firstname = :first_name")
    int customHqlCountByFirstname(@Param("first_name") String firstname);

}
