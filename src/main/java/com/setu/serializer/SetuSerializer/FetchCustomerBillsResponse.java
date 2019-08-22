package com.setu.serializer.SetuSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class FetchCustomerBillsResponse {
    FetchBillsDataObject data;
    int status = 200;
    boolean success = true;


    public FetchCustomerBillsResponse(FetchBillsDataObject data) {
        this.data = data;
    }

    public FetchBillsDataObject getData() {
        return data;
    }

    public void setData(FetchBillsDataObject data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public String convertToJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return  mapper.writeValueAsString(this);
    }
}
