package com.ohgiraffers.model.dto;

public class MenuDTO {

    private String code;
    private String name;
    private String price;
    private String number;
    private String status;

    public MenuDTO() {}

    public MenuDTO(String code, String name, String price, String categoryCode, String orderableStatus) {}
     {
        this.code = code;
        this.name = name;
        this.price = price;
        this.number = number;
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", status=" + status +
                '}';
    }
}