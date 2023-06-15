package entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class CartItem {
    private int userId;
    private int productId;
    private int quantity;

    public CartItem(int userId, int productId, int quantity) {
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
