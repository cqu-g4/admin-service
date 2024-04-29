package au.edu.cqu.g4.adminservice.insurance_companies;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InsuranceCompanyRepository extends MongoRepository<InsuranceCompany, String> {
}
