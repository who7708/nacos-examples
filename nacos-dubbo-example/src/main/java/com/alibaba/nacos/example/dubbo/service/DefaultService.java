package com.alibaba.nacos.example.dubbo.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;

/**
 * Default {@link DemoService}
 * https://nacos.io/zh-cn/docs/use-nacos-with-dubbo.html
 *
 * @since 2.6.5
 */
@DubboService(version = "${demo.service.version}")
public class DefaultService implements DemoService {

    @Value("${demo.service.name}")
    private String serviceName;

    public String sayName(String name) {
        // RpcContext rpcContext = RpcContext.getContext();
        // RpcContext rpcContext = RpcContext.getServerContext();
        // RpcContext rpcContext = RpcContext.getServiceContext();
        RpcContext rpcContext = RpcContext.getCurrentServiceContext();
        // rpcContext.setAttachment("hello", "world");
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}