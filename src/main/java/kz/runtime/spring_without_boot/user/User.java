package kz.runtime.spring_without_boot.user;

import lombok.Data;

import java.util.Set;

@Data
public class User {
    private Long id;
    private String email;
    private String name;
    private Set<Long> itemIds;
}
