package au.edu.cqu.g4.adminservice.therapy_providers;

import au.edu.cqu.g4.adminservice.proxies.ProxyCaller;
import au.edu.cqu.g4.adminservice.proxies.dtos.CreateTherapyProviderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/therapy_providers")
public class TherapyProviderController {

    private final ProxyCaller caller;

    @PostMapping
    public ResponseEntity<TherapyProviderDto> create(@RequestBody CreateTherapyProviderDto dto) {
        dto = caller.createTherapyProvider(dto);
        return new ResponseEntity<>(
                TherapyProviderDto.builder()
                        .id(dto.getId())
                        .name(dto.getName())
                        .userId(dto.getUserId())
                        .userEmail(dto.getEmail())
                        .address(dto.getAddress())
                        .contactNumber(dto.getContactNumber())
                        .establishedDate(dto.getEstablishedDate())
                        .build()
                , HttpStatus.CREATED
        );
    }
}