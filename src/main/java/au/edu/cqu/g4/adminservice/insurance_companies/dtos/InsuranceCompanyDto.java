package au.edu.cqu.g4.adminservice.insurance_companies.dtos;

import au.edu.cqu.g4.adminservice.shared_entities.Address;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InsuranceCompanyDto {
    private String id;

    private String name;

    private Address address;

    private String description;
}
