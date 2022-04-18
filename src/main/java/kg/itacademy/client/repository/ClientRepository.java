package kg.itacademy.client.repository;

import kg.itacademy.client.entity.ClientEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    //SELECT count(firstname) FROM client WHERE firstname = ?1;
    int countAllByFirstname(String firstname);

    @Query(value = "SELECT count(*) FROM client c WHERE c.firstname = ?1", nativeQuery = true)
    int customCountByFirstname(String firstname);

    @Query("SELECT COUNT(c) FROM ClientEntity c WHERE c.firstname = ?1")
    int customHqlCountByFirstname(String firstname);
}
