package kz.runtime.spring_without_boot.item;

import lombok.Data;

@Data
public class Item {
    private Long id;
    private Long userId;
    private String url;
}
