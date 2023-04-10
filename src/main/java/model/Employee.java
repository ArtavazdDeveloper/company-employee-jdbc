package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor



public class Employee {
    private  int id;
    private  String name;
    private  String surname;
    private  String email;
    private  int companyId;

}
