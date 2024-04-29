package au.edu.cqu.g4.adminservice.insurance_companies;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class InsuranceCompanyServiceImpl implements InsuranceCompanyService {

    private final InsuranceCompanyRepository insuranceCompanyRepository;

    @Override
    public InsuranceCompany save(InsuranceCompany insuranceCompany) {
        return insuranceCompanyRepository.save(insuranceCompany);
    }

    @Override
    public List<InsuranceCompany> getAll() {
        return insuranceCompanyRepository.findAll();
    }

    @Override
    public Optional<InsuranceCompany> findById(String id) {
        return insuranceCompanyRepository.findById(id);
    }

    @Override
    public InsuranceCompany delete(String id) {
        InsuranceCompany ic = findById(id)
                .orElseThrow(() -> new RuntimeException("Company with id " + id + " not found."));
        insuranceCompanyRepository.deleteById(id);
        return ic;
    }
}
