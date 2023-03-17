package com.salesreport.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sales.manager.dto.OrderDto;
import org.apache.kafka.common.serialization.Deserializer;

public class CustomDeserializer implements Deserializer<OrderDto> {
    @Override
    public OrderDto deserialize(String topic, byte[] data) {
        ObjectMapper mapper = new ObjectMapper();
        OrderDto order = null;
        try {
            order = mapper.readValue(data, OrderDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return order;
    }
}
