package com.nepxion.polaris.component.common.constant;

import com.nepxion.discovery.common.constant.DiscoveryConstant;
import com.nepxion.polaris.component.common.version.PolarisVersion;

public class PolarisConstant extends DiscoveryConstant {
    public static final String POLARIS_NAME = "Polaris";

    public static final String POLARIS_VERSION_NAME = "polaris.version";
    public static final String POLARIS_VERSION_VALUE = "1.0.0";

    public static final String POLARIS_DOMAIN_NAME = "polaris.domain";
    public static final String POLARIS_REGION_NAME = "polaris.region";
    public static final String POLARIS_ENV_NAME = "polaris.env";

    public static final String APOLLO_CONFIG_NAME = "apollo-config";
    public static final String APOLLO_VERSION_NAME = "polaris.apollo.version";
    public static final String APOLLO_VERSION_VALUE = PolarisVersion.getVersion("com.ctrip.framework.apollo.ConfigService");

    public static final String NACOS_DISCOVERY_NAME = "nacos-discovery";
    public static final String NACOS_CONFIG_NAME = "nacos-config";
    public static final String NACOS_VERSION_NAME = "polaris.nacos.version";
    public static final String NACOS_VERSION_VALUE = PolarisVersion.getNacosVersion();

    public static final String EUREKA_DISCOVERY_NAME = "eureka-discovery";
    public static final String EUREKA_VERSION_NAME = "polaris.eureka.version";
    public static final String EUREKA_VERSION_VALUE = PolarisVersion.getVersion("org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean");

    public static final String CONSUL_DISCOVERY_NAME = "consul-discovery";
    public static final String CONSUL_VERSION_NAME = "polaris.consul.version";
    public static final String CONSUL_VERSION_VALUE = PolarisVersion.getVersion("org.springframework.cloud.consul.ConsulProperties");

    public static final String ZOOKEEPER_DISCOVERY_NAME = "zookeeper-discovery";
    public static final String ZOOKEEPER_VERSION_NAME = "polaris.zookeeper.version";
    public static final String ZOOKEEPER_VERSION_VALUE = PolarisVersion.getVersion("org.springframework.cloud.zookeeper.discovery.ZookeeperDiscoveryProperties");

    public static final String SENTINEL_NAME = "sentinel";
    public static final String SENTINEL_CONFIG_NAME = "sentinel-config";
    public static final String SENTINEL_VERSION_NAME = "polaris.sentinel.version";
    public static final String SENTINEL_VERSION_VALUE = PolarisVersion.getVersion("com.alibaba.csp.sentinel.SphU");
    public static final String SENTINEL_PROJECT_NAME = "project.name";

    public static final String SKY_WALKING_AGENT_VERSION_NAME = "polaris.skywalking.agent.version";

    public static final String SKYWALKING_NAME = "skywalking";
    public static final String SKYWALKING_SENTINEL_NAME = "skywalking-sentinel";

    public static final String JAEGER_NAME = "jaeger";
    public static final String JAEGER_VERSION_NAME = "polaris.jaeger.version";
    public static final String JAEGER_VERSION_VALUE = PolarisVersion.getVersion("io.jaegertracing.internal.JaegerTracer");
    public static final String JAEGER_SENTINEL_NAME = "jaeger-sentinel";

    public static final String MICROMETER_NAME = "micrometer";
    public static final String MANAGEMENT_METRICS_TAGS_APPLICATION_NAME = "management.metrics.tags.application";

    public static final String SPRING_BOOT_ADMIN_NAME = "spring-boot-admin";

    public static final String CONSOLE_NAME = "console";

    public static final String TEST_AUTOMATION = "test-automation";

    public static final String POLARIS_SERVICE_NAME = "polaris-service";
    public static final String POLARIS_GATEWAY_NAME = "polaris-gateway";
    public static final String POLARIS_ZUUL_NAME = "polaris-zuul";
    public static final String POLARIS_CONSOLE_NAME = "polaris-console";
    public static final String POLARIS_TEST_NAME = "polaris-test";

    public static final String CODES_NAME = "polaris.codes";
    public static final String CODES_VALUE = "https://github.com/Nepxion/Polaris";

    public static final String DOCS_NAME = "polaris.docs";
    public static final String DOCS_VALUE = "http://www.nepxion.com";

    public static final String COMMON = "common";

    public static final String BIZ_TRACE_ID = "biz-trace-id";
}