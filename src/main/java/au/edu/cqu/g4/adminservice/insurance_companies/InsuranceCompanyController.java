package au.edu.cqu.g4.adminservice.insurance_companies;

import au.edu.cqu.g4.adminservice.insurance_companies.dtos.InsuranceCompanyDto;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/insurance_companies")
@RequiredArgsConstructor
public class InsuranceCompanyController {

    private final InsuranceCompanyService insuranceCompanyService;
    private final InsuranceCompanyMapper insuranceCompanyMapper;

    @PostMapping
    public ResponseEntity<InsuranceCompanyDto> create(@RequestBody InsuranceCompanyDto dto) {
        InsuranceCompany ic = insuranceCompanyService.save(insuranceCompanyMapper.toEntity(dto));
        return new ResponseEntity<>(
                insuranceCompanyMapper.toDto(ic),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    public ResponseEntity<List<InsuranceCompanyDto>> getAll() {
        List<InsuranceCompany> icList = insuranceCompanyService.getAll();
        return new ResponseEntity<>(
          insuranceCompanyMapper.toDto(icList), HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<InsuranceCompanyDto> getById(@PathVariable String id) {
        InsuranceCompany icList = insuranceCompanyService.findById(id)
                .orElseThrow(() -> new RuntimeException("Insurance Company with id " + id + " not Found"));
        return new ResponseEntity<>(
                insuranceCompanyMapper.toDto(icList), HttpStatus.OK
        );
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<InsuranceCompanyDto> update(@PathVariable String id, @RequestBody InsuranceCompanyDto dto) {
        if(!StringUtils.equals(id, dto.getId())) {
            throw new RuntimeException("Bad Request, Id not matched");
        }
        InsuranceCompany ic = insuranceCompanyService.save(insuranceCompanyMapper.toEntity(dto));
        return new ResponseEntity<>(
                insuranceCompanyMapper.toDto(ic),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<InsuranceCompanyDto> update(@PathVariable String id) {
        InsuranceCompany ic = insuranceCompanyService.delete(id);
        return new ResponseEntity<>(
                insuranceCompanyMapper.toDto(ic),
                HttpStatus.OK
        );
    }

}
