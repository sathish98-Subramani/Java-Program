package com.hibernate.crud.service;


import com.hibernate.dto.OwnerDTO;
import com.hibernate.crud.exception.DuplicateOwnerException;
import com.hibernate.crud.exception.OwnerNotFoundException;

public interface OwnerService {
    void saveOwner(OwnerDTO ownerDTO) throws DuplicateOwnerException;

    OwnerDTO findOwner(int ownerId) throws OwnerNotFoundException;

    void updatePetDetails(int ownerId, String petName) throws OwnerNotFoundException;

    void deleteOwner(int ownerId) throws OwnerNotFoundException;

}