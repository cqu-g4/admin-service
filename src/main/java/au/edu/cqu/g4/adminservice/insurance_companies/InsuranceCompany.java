package au.edu.cqu.g4.adminservice.insurance_companies;

import au.edu.cqu.g4.adminservice.shared_entities.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("insurance_companies")
public class InsuranceCompany {

    @Id
    private String id;

    private String name;

    private Address address;

    private String description;
}
