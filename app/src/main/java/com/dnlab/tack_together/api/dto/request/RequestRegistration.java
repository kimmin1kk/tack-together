package com.dnlab.tack_together.api.dto.request;

import com.google.gson.annotations.SerializedName;

public class RequestRegistration {
    @SerializedName("username")
    private final String username;
    @SerializedName("password")
    private final String password;
    @SerializedName("name")
    private final String name;

    public RequestRegistration(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
