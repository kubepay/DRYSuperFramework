// Generated file
package com.github.rognoni.generated.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.github.rognoni.generated.entities.GroupTable;

@CrossOrigin
@RepositoryRestResource
public interface GroupTableRepository extends CrudRepository<GroupTable, Long> {

}