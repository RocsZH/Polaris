package com.nepxion.polaris.component.discovery.eureka.context;

import java.util.Map;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.StringUtils;

import com.nepxion.polaris.component.common.constant.PolarisConstant;

public class EurekaMetadataApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.getBeanFactory().addBeanPostProcessor(new InstantiationAwareBeanPostProcessorAdapter() {
            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                if (bean instanceof EurekaInstanceConfigBean) {
                    EurekaInstanceConfigBean eurekaInstanceConfig = (EurekaInstanceConfigBean) bean;
                    Map<String, String> metadata = eurekaInstanceConfig.getMetadataMap();

                    persistMetaInfo(metadata);
                }

                return bean;
            }
        });
    }

    private void persistMetaInfo(Map<String, String> metadata) {
        metadata.put(PolarisConstant.POLARIS_VERSION_NAME, PolarisConstant.POLARIS_VERSION_VALUE);

        metadata.put(PolarisConstant.EUREKA_VERSION_NAME, PolarisConstant.EUREKA_VERSION_VALUE);

        Properties properties = System.getProperties();

        for (String key : properties.stringPropertyNames()) {
            if (StringUtils.startsWithIgnoreCase(key, PolarisConstant.POLARIS_NAME.toLowerCase() + ".")) {
                String value = properties.getProperty(key);

                metadata.put(key, StringUtils.isEmpty(value) ? PolarisConstant.UNKNOWN : value);
            }
        }
    }
}