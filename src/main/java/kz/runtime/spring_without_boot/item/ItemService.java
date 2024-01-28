package kz.runtime.spring_without_boot.item;

import java.util.List;

public interface ItemService {
    List<Item> getItems(long userId);

    Item addNewItem(long userId, Item item);

    void deleteItem(long userId, long itemId);
}
