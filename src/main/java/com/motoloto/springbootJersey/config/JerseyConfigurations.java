package com.motoloto.springbootJersey.config;

import com.motoloto.springbootJersey.resources.Bookresources;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by motoloto on 2017/6/2.
 */

@Configuration
public class JerseyConfigurations extends ResourceConfig {

    public JerseyConfigurations() {
        register(Bookresources.class);
    }


}
