package com.hibernate.crud.service;

import com.hibernate.crud.dto.OwnerDTO;
import com.hibernate.crud.exception.DuplicateOwnerFoundException;
import com.hibernate.crud.exception.OwnerNotFoundException;

import java.util.List;


public interface OwnerSerrvice {
    void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerFoundException;

    OwnerDTO findOwner(int OwnerID) throws DuplicateOwnerFoundException;

    void updatePetDetails(int ownerID,String petName);

    void deleteOwner(int ownerID) throws OwnerNotFoundException;

    List<OwnerDTO> findAllOwners();
}
