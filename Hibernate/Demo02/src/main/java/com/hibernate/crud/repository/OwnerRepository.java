package com.hibernate.crud.repository;

import com.hibernate.crud.entity.Owner;

public interface OwnerRepository {
	
	void saveOwner(Owner owner);

	Owner findOwner(int ownerId);

	void updatePetDetails(int ownerId, String petName);

	void deleteOwner(int ownerId);

}
