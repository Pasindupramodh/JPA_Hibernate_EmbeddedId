package org.example.entity.keys;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

import java.io.Serializable;
import java.util.Objects;


public class ProductKey implements Serializable {
    private String code;
    private Long number;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductKey that)) return false;
        return Objects.equals(getCode(), that.getCode()) && Objects.equals(getNumber(), that.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getNumber());
    }
}
