package au.edu.cqu.g4.adminservice.proxies.dtos;

import au.edu.cqu.g4.adminservice.shared_entities.Address;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
public class CreateTherapyProviderDto {
    private String id;
    private String userId;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate establishedDate;
    private String email;
    private String password;
    private Address address;
    private String contactNumber;
}
