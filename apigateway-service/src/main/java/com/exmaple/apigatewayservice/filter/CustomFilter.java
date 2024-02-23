package com.exmaple.apigatewayservice.filter;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class CustomFilter extends AbstractGatewayFilterFactory<CustomFilter.Config>{

    public static class Config{

    }

    public CustomFilter(){
        super(Config.class);
    }


    @Override
    public GatewayFilter apply(Config config){
        return (exchange, chain)->{
            //custom prefilter  적용
            ServerHttpRequest request = exchange.getRequest();
            ServerHttpResponse response = exchange.getResponse();

            log.info("{}", request.getId());

            //custom post filter 적용
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
                log.info("{}", response.getStatusCode());
            }));
        } ;
    }


}
