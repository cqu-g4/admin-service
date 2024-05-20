package au.edu.cqu.g4.adminservice.insurance_companies.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InsuranceCompanyDto {
    private String id;

    private String name;

    private String address;

    private String description;
}
