package au.edu.cqu.g4.adminservice.therapy_providers;

import au.edu.cqu.g4.adminservice.shared_entities.Address;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
public class TherapyProviderDto {
    private String id;
    private String userId;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate establishedDate;
    private String userEmail;
    private Address address;
    private String contactNumber;
}
