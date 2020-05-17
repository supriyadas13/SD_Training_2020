
package com.MyMaven.HelloController;

import org.springframework.data.repository.CrudRepository;

public interface NameRepo extends CrudRepository<Name, Long> {
    
}