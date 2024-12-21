package org.example.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static org.example.model.dto.UserDTO.EMAIL_PROPERTY;
import static org.example.model.dto.UserDTO.PASSWORD_PROPERTY;
import static org.example.model.dto.UserDTO.USERNAME_PROPERTY;


@ToString
@EqualsAndHashCode
@AllArgsConstructor
@Builder
@NoArgsConstructor
@JsonTypeName("UserDTO")
@JsonPropertyOrder({
        USERNAME_PROPERTY, EMAIL_PROPERTY, PASSWORD_PROPERTY
})
public class UserDTO {

    public static final String USERNAME_PROPERTY = "username";
    private String username;

    public static final String EMAIL_PROPERTY = "email";
    private String email;

    public static final String PASSWORD_PROPERTY = "password";
    private String password;

    @JsonProperty(USERNAME_PROPERTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getUsername() {
        return username;
    }

    @JsonProperty(USERNAME_PROPERTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty(EMAIL_PROPERTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getEmail() {
        return email;
    }

    @JsonProperty(EMAIL_PROPERTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty(PASSWORD_PROPERTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getPassword() {
        return password;
    }

    @JsonProperty(PASSWORD_PROPERTY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPassword(String password) {
        this.password = password;
    }
}
