package au.edu.cqu.g4.adminservice.insurance_companies;

import au.edu.cqu.g4.adminservice.insurance_companies.dtos.InsuranceCompanyDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InsuranceCompanyMapper {
    public InsuranceCompany toEntity(InsuranceCompanyDto dto) {
        return InsuranceCompany.builder()
                .id(dto.getId())
                .name(dto.getName())
                .address(dto.getAddress())
                .description(dto.getDescription())
                .build();
    }

    public InsuranceCompanyDto toDto(InsuranceCompany ic) {
        return InsuranceCompanyDto.builder()
                .id(ic.getId())
                .name(ic.getName())
                .address(ic.getAddress())
                .description(ic.getDescription())
                .build();
    }

    public List<InsuranceCompanyDto> toDto(List<InsuranceCompany> icList) {
        return icList.stream().map(this::toDto).toList();
    }

    public List<InsuranceCompany> toEntity(List<InsuranceCompanyDto> icDtoList) {
        return icDtoList.stream().map(this::toEntity).toList();
    }
}
