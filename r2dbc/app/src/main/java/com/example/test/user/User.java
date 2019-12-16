package com.example.test.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(value = "users")
@NoArgsConstructor
@RequiredArgsConstructor
public class User {
    @Id
    private Long id;
    @NonNull
    private String username;
}
