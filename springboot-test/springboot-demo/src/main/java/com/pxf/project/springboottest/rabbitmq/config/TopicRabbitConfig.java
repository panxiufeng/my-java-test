package com.pxf.project.springboottest.rabbitmq.config;//package com.pxf.project.springboottest.rabbitmq.config;
//
//import org.springframework.amqp.core.Binding;
//import org.springframework.amqp.core.BindingBuilder;
//import org.springframework.amqp.core.Queue;
//import org.springframework.amqp.core.TopicExchange;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @ClassName: TopicRabbitConfig
// * @Description: TODO
// * @Author panxiufeng
// * @Date 2018/8/11下午10:31
// */
//@Configuration
//public class TopicRabbitConfig {
//
//    final static String message = "topic.message";
//    final static String messages = "topic.messages";
//
//
//    @Bean
//    public Queue queueMessage() {
//        return new Queue(TopicRabbitConfig.message);
//    }
//
//    @Bean
//    public Queue queueMessages() {
//        return new Queue(TopicRabbitConfig.messages);
//    }
//
//    @Bean
//    TopicExchange exchange() {
//        return new TopicExchange("topicExchange");
//    }
//
//    @Bean
//    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
//        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
//    }
//
//    @Bean
//    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
//        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
//    }
//
//}
