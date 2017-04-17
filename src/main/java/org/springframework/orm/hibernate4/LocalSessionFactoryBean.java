package org.springframework.orm.hibernate4;

import org.apache.commons.dbcp.BasicDataSource;

import java.util.List;
import java.util.Properties;

/**
 * Created by user on 16.04.2017.
 */
public class LocalSessionFactoryBean {
    private BasicDataSource dataSource;
    private List annotatedClasses;
    private Properties hibernateProperties;

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

    public void setAnnotatedClasses(List annotatedClasses) {
        this.annotatedClasses = annotatedClasses;
    }

    public List getAnnotatedClasses() {
        return annotatedClasses;
    }

    public void setHibernateProperties(Properties hibernateProperties) {
        this.hibernateProperties = hibernateProperties;
    }

    public Properties getHibernateProperties() {
        return hibernateProperties;
    }
}
