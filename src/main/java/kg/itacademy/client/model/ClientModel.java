package kg.itacademy.client.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
public class ClientModel {
    private Long clientId;
    private String firstname;
    private String lastname;
    private Integer age;
    private String email;
    private String phoneNumber;
    private List<VisitedCountryModel> visitedCountryModels;
    private List<String> test1;
    private List<Integer> test2;
}
