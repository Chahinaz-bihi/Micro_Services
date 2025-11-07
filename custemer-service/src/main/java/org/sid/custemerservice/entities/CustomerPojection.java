package org.sid.custemerservice.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name ="all", types = Customer.class)
public interface CustomerPojection {
    String getName();
    String getEmail();
}
