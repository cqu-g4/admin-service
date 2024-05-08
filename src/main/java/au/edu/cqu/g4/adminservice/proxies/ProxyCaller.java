package au.edu.cqu.g4.adminservice.proxies;

import au.edu.cqu.g4.adminservice.proxies.dtos.CreateTherapyProviderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProxyCaller {

    private final TherapyProviderProxy therapyProviderProxy;

    public CreateTherapyProviderDto createTherapyProvider(CreateTherapyProviderDto dto) {
        return therapyProviderProxy.create(dto);
    }
}
