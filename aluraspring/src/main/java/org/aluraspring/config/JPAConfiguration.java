package org.aluraspring.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration {
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean managerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();		
		managerFactoryBean.setJpaVendorAdapter(vendorAdapter);		
		managerFactoryBean.setDataSource(this.configurateDataSource());		
		managerFactoryBean.setJpaProperties(this.configurateProperties());		
		managerFactoryBean.setPackagesToScan("org.aluraspring.models");
		
		return managerFactoryBean;		
	}
	
	@Bean
	public JpaTransactionManager transacionManager(EntityManagerFactory managerFactory) {
		return new JpaTransactionManager(managerFactory);
	}
	
	private DriverManagerDataSource configurateDataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("SA");
		dataSource.setPassword("");
		dataSource.setUrl("jdbc:hsqldb:file:C:/hsqldb/demo/aluraspring");
		dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
		
		return dataSource;
	}
	
	private Properties configurateProperties(){
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		
		return props;
	}
}
