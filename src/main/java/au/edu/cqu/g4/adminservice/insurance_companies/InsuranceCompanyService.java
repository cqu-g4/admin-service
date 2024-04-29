package au.edu.cqu.g4.adminservice.insurance_companies;

import java.util.List;
import java.util.Optional;

public interface InsuranceCompanyService {
    InsuranceCompany save(InsuranceCompany insuranceCompany);
    List<InsuranceCompany> getAll();
    Optional<InsuranceCompany> findById(String id);
    InsuranceCompany delete(String id);
}
