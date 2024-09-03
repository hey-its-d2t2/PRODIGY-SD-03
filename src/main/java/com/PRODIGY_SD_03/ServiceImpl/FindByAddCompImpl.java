package com.PRODIGY_SD_03.ServiceImpl;

import com.PRODIGY_SD_03.Entity.Contact;
import com.PRODIGY_SD_03.Repository.FindByAddCompRepository;
import com.PRODIGY_SD_03.Service.FindByAddComp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindByAddCompImpl implements FindByAddComp {

   @Autowired
   private final FindByAddCompRepository findByAddCompRepository;
    private String jobTitle;

    public FindByAddCompImpl(FindByAddCompRepository findByAddCompRepository) {
        this.findByAddCompRepository = findByAddCompRepository;
    }

    @Override
    public List<Contact> findContactByAddress(String address) {
        return findByAddCompRepository.findContactByAddress(address);
    }

    @Override
    public List<Contact> findContactsByCompany(String company) {
        return findByAddCompRepository.findContactsByCompany(company);
    }

    @Override
    public List<Contact> findContactsByJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return findByAddCompRepository.findContactsByJobTitle(jobTitle);
    }

    @Override
    public List<Contact> findContactsByLabel(String label) {
        return findByAddCompRepository.findContactsByLabel(label);
    }

    @Override
    public List<Contact> findContactsByDepartment(String department) {
        return findByAddCompRepository.findContactsByDepartment(department);
    }

    @Override
    public List<Contact> findContactsByOfficeLocation(String officeLocation) {
        return findByAddCompRepository.findContactsByOfficeLocation(officeLocation);
    }

    @Override
    public List<Contact> findContactsByLanguage(String language) {
        return findByAddCompRepository.findContactsByLanguage(language);
    }
}
