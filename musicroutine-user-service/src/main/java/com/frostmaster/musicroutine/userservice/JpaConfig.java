package com.frostmaster.musicroutine.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * Created by Igor_Usachev on 3/22/2017.
 */
public class JpaConfig implements TransactionManagementConfigurer {

    @Value("${dataSource.driverClassName}")
    private String driver;
    @Value("${dataSource.url}")
    private String url;
    @Value("${dataSource.username}")
    private String username;
    @Value("${dataSource.password}")
    private String password;
    @Value("${hibernate.dialect}")
    private String dialect;

    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return null;
    }
}
