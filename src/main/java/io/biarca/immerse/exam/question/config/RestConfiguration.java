/**
 *
 */
package io.biarca.immerse.exam.question.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import io.biarca.immerse.exam.question.model.Question;


@Configuration
public class RestConfiguration extends RepositoryRestConfigurerAdapter {

   @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Question.class);
    }

}
